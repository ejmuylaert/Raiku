package nl.gideondk.raiku.actors

import java.net.InetSocketAddress

import akka.actor._
import akka.util.ByteString
import akka.event.Logging

import scala.concurrent.Promise

import akka.routing.RandomRouter
import akka.actor.SupervisorStrategy._
import akka.actor.OneForOneStrategy

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import nl.gideondk.raiku.commands.RiakOperation

case class RaikuHost(host: String, port: Int)

case class RaikuConfig(host: RaikuHost, connections: Int, reconnectDelay: FiniteDuration = 5 seconds)

object RaikuActor {
  val supervisorStrategy =
    OneForOneStrategy(maxNrOfRetries = 2) {
      case _ ⇒ Restart
    }
}

private[raiku] class RaikuActor(config: RaikuConfig) extends Actor {
  val log = Logging(context.system, this)
  val address = new InetSocketAddress(config.host.host, config.host.port)
  var router: Option[ActorRef] = None

  def initialize {
    router = Some(context.system.actorOf(Props(new RaikuWorkerActor(address))
      .withRouter(RandomRouter(nrOfInstances = config.connections, supervisorStrategy = RaikuActor.supervisorStrategy))
      .withDispatcher("akka.actor.raiku-dispatcher")))
    context.watch(router.get)
  }

  def receive = {
    case InitializeRouter ⇒
      log.debug("Raiku router initializing")
      initialize

    case ReconnectRouter ⇒
      if (router.isEmpty) initialize

    case Terminated(name) ⇒
      router = None
      log.debug("Raiku router died, restarting in: "+config.reconnectDelay.toString())
      context.system.scheduler.scheduleOnce(config.reconnectDelay, self, ReconnectRouter)

    case req @ RiakOperation(promise, command) ⇒
      router match {
        case Some(r) ⇒ r forward req
        case None    ⇒ promise.failure(NoConnectionException())
      }
  }
}

trait WorkerDisconnectedException extends Exception

case class WorkerDisconnectedUnexpectedlyException extends WorkerDisconnectedException

case class WorkerDisconnectedExpectedly extends WorkerDisconnectedException

case class NoConnectionException extends Exception

case object InitializeRouter

case object ReconnectRouter
