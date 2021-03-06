// Generated by ScalaBuff, the Scala Protocol Buffers compiler. DO NOT EDIT!
// source: riak.proto

package com.basho.riak.protobuf

final case class RpbErrorResp(
  `errmsg`: com.google.protobuf.ByteString = com.google.protobuf.ByteString.EMPTY,
  `errcode`: Int = 0) extends com.google.protobuf.GeneratedMessageLite
    with com.google.protobuf.MessageLite.Builder
    with Message[RpbErrorResp] {

  def writeTo(output: com.google.protobuf.CodedOutputStream) {
    output.writeBytes(1, `errmsg`)
    output.writeUInt32(2, `errcode`)
  }

  lazy val getSerializedSize = {
    import com.google.protobuf.CodedOutputStream._
    var size = 0
    size += computeBytesSize(1, `errmsg`)
    size += computeUInt32Size(2, `errcode`)

    size
  }

  def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): RpbErrorResp = {
    import com.google.protobuf.ExtensionRegistryLite.{ getEmptyRegistry ⇒ _emptyRegistry }
    var __errmsg: com.google.protobuf.ByteString = com.google.protobuf.ByteString.EMPTY
    var __errcode: Int = 0

      def __newMerged = RpbErrorResp(
        __errmsg,
        __errcode)
    while (true) in.readTag match {
      case 0       ⇒ return __newMerged
      case 10      ⇒ __errmsg = in.readBytes()
      case 16      ⇒ __errcode = in.readUInt32()
      case default ⇒ if (!in.skipField(default)) return __newMerged
    }
    null
  }

  def mergeFrom(m: RpbErrorResp) = {
    RpbErrorResp(
      m.`errmsg`,
      m.`errcode`)
  }

  def getDefaultInstanceForType = RpbErrorResp.defaultInstance
  def clear = getDefaultInstanceForType
  def isInitialized = true
  def build = this
  def buildPartial = this
  def newBuilderForType = this
  def toBuilder = this
}

object RpbErrorResp {
  @reflect.BeanProperty val defaultInstance = new RpbErrorResp()

  val ERRMSG_FIELD_NUMBER = 1
  val ERRCODE_FIELD_NUMBER = 2

}
final case class RpbGetServerInfoResp(
  `node`: Option[com.google.protobuf.ByteString] = None,
  `serverVersion`: Option[com.google.protobuf.ByteString] = None) extends com.google.protobuf.GeneratedMessageLite
    with com.google.protobuf.MessageLite.Builder
    with Message[RpbGetServerInfoResp] {

  def setNode(_f: com.google.protobuf.ByteString) = copy(`node` = _f)
  def setServerVersion(_f: com.google.protobuf.ByteString) = copy(`serverVersion` = _f)

  def clearNode = copy(`node` = None)
  def clearServerVersion = copy(`serverVersion` = None)

  def writeTo(output: com.google.protobuf.CodedOutputStream) {
    if (`node`.isDefined) output.writeBytes(1, `node`.get)
    if (`serverVersion`.isDefined) output.writeBytes(2, `serverVersion`.get)
  }

  lazy val getSerializedSize = {
    import com.google.protobuf.CodedOutputStream._
    var size = 0
    if (`node`.isDefined) size += computeBytesSize(1, `node`.get)
    if (`serverVersion`.isDefined) size += computeBytesSize(2, `serverVersion`.get)

    size
  }

  def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): RpbGetServerInfoResp = {
    import com.google.protobuf.ExtensionRegistryLite.{ getEmptyRegistry ⇒ _emptyRegistry }
    var __node: Option[com.google.protobuf.ByteString] = `node`
    var __serverVersion: Option[com.google.protobuf.ByteString] = `serverVersion`

      def __newMerged = RpbGetServerInfoResp(
        __node,
        __serverVersion)
    while (true) in.readTag match {
      case 0       ⇒ return __newMerged
      case 10      ⇒ __node = in.readBytes()
      case 18      ⇒ __serverVersion = in.readBytes()
      case default ⇒ if (!in.skipField(default)) return __newMerged
    }
    null
  }

  def mergeFrom(m: RpbGetServerInfoResp) = {
    RpbGetServerInfoResp(
      m.`node`.orElse(`node`),
      m.`serverVersion`.orElse(`serverVersion`))
  }

  def getDefaultInstanceForType = RpbGetServerInfoResp.defaultInstance
  def clear = getDefaultInstanceForType
  def isInitialized = true
  def build = this
  def buildPartial = this
  def newBuilderForType = this
  def toBuilder = this
}

object RpbGetServerInfoResp {
  @reflect.BeanProperty val defaultInstance = new RpbGetServerInfoResp()

  val NODE_FIELD_NUMBER = 1
  val SERVER_VERSION_FIELD_NUMBER = 2

}
final case class RpbPair(
  `key`: com.google.protobuf.ByteString = com.google.protobuf.ByteString.EMPTY,
  `value`: Option[com.google.protobuf.ByteString] = None) extends com.google.protobuf.GeneratedMessageLite
    with com.google.protobuf.MessageLite.Builder
    with Message[RpbPair] {

  def setValue(_f: com.google.protobuf.ByteString) = copy(`value` = _f)

  def clearValue = copy(`value` = None)

  def writeTo(output: com.google.protobuf.CodedOutputStream) {
    output.writeBytes(1, `key`)
    if (`value`.isDefined) output.writeBytes(2, `value`.get)
  }

  lazy val getSerializedSize = {
    import com.google.protobuf.CodedOutputStream._
    var size = 0
    size += computeBytesSize(1, `key`)
    if (`value`.isDefined) size += computeBytesSize(2, `value`.get)

    size
  }

  def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): RpbPair = {
    import com.google.protobuf.ExtensionRegistryLite.{ getEmptyRegistry ⇒ _emptyRegistry }
    var __key: com.google.protobuf.ByteString = com.google.protobuf.ByteString.EMPTY
    var __value: Option[com.google.protobuf.ByteString] = `value`

      def __newMerged = RpbPair(
        __key,
        __value)
    while (true) in.readTag match {
      case 0       ⇒ return __newMerged
      case 10      ⇒ __key = in.readBytes()
      case 18      ⇒ __value = in.readBytes()
      case default ⇒ if (!in.skipField(default)) return __newMerged
    }
    null
  }

  def mergeFrom(m: RpbPair) = {
    RpbPair(
      m.`key`,
      m.`value`.orElse(`value`))
  }

  def getDefaultInstanceForType = RpbPair.defaultInstance
  def clear = getDefaultInstanceForType
  def isInitialized = true
  def build = this
  def buildPartial = this
  def newBuilderForType = this
  def toBuilder = this
}

object RpbPair {
  @reflect.BeanProperty val defaultInstance = new RpbPair()

  val KEY_FIELD_NUMBER = 1
  val VALUE_FIELD_NUMBER = 2

}
final case class RpbGetBucketReq(
  `bucket`: com.google.protobuf.ByteString = com.google.protobuf.ByteString.EMPTY) extends com.google.protobuf.GeneratedMessageLite
    with com.google.protobuf.MessageLite.Builder
    with Message[RpbGetBucketReq] {

  def writeTo(output: com.google.protobuf.CodedOutputStream) {
    output.writeBytes(1, `bucket`)
  }

  lazy val getSerializedSize = {
    import com.google.protobuf.CodedOutputStream._
    var size = 0
    size += computeBytesSize(1, `bucket`)

    size
  }

  def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): RpbGetBucketReq = {
    import com.google.protobuf.ExtensionRegistryLite.{ getEmptyRegistry ⇒ _emptyRegistry }
    var __bucket: com.google.protobuf.ByteString = com.google.protobuf.ByteString.EMPTY

      def __newMerged = RpbGetBucketReq(
        __bucket)
    while (true) in.readTag match {
      case 0       ⇒ return __newMerged
      case 10      ⇒ __bucket = in.readBytes()
      case default ⇒ if (!in.skipField(default)) return __newMerged
    }
    null
  }

  def mergeFrom(m: RpbGetBucketReq) = {
    RpbGetBucketReq(
      m.`bucket`)
  }

  def getDefaultInstanceForType = RpbGetBucketReq.defaultInstance
  def clear = getDefaultInstanceForType
  def isInitialized = true
  def build = this
  def buildPartial = this
  def newBuilderForType = this
  def toBuilder = this
}

object RpbGetBucketReq {
  @reflect.BeanProperty val defaultInstance = new RpbGetBucketReq()

  val BUCKET_FIELD_NUMBER = 1

}
final case class RpbGetBucketResp(
  `props`: RpbBucketProps = RpbBucketProps.defaultInstance) extends com.google.protobuf.GeneratedMessageLite
    with com.google.protobuf.MessageLite.Builder
    with Message[RpbGetBucketResp] {

  def writeTo(output: com.google.protobuf.CodedOutputStream) {
    output.writeMessage(1, `props`)
  }

  lazy val getSerializedSize = {
    import com.google.protobuf.CodedOutputStream._
    var size = 0
    size += computeMessageSize(1, `props`)

    size
  }

  def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): RpbGetBucketResp = {
    import com.google.protobuf.ExtensionRegistryLite.{ getEmptyRegistry ⇒ _emptyRegistry }
    var __props: RpbBucketProps = RpbBucketProps.defaultInstance

      def __newMerged = RpbGetBucketResp(
        __props)
    while (true) in.readTag match {
      case 0       ⇒ return __newMerged
      case 10      ⇒ __props = readMessage[RpbBucketProps](in, __props, _emptyRegistry)
      case default ⇒ if (!in.skipField(default)) return __newMerged
    }
    null
  }

  def mergeFrom(m: RpbGetBucketResp) = {
    RpbGetBucketResp(
      m.`props`)
  }

  def getDefaultInstanceForType = RpbGetBucketResp.defaultInstance
  def clear = getDefaultInstanceForType
  def isInitialized = true
  def build = this
  def buildPartial = this
  def newBuilderForType = this
  def toBuilder = this
}

object RpbGetBucketResp {
  @reflect.BeanProperty val defaultInstance = new RpbGetBucketResp()

  val PROPS_FIELD_NUMBER = 1

}
final case class RpbSetBucketReq(
  `bucket`: com.google.protobuf.ByteString = com.google.protobuf.ByteString.EMPTY,
  `props`: RpbBucketProps = RpbBucketProps.defaultInstance) extends com.google.protobuf.GeneratedMessageLite
    with com.google.protobuf.MessageLite.Builder
    with Message[RpbSetBucketReq] {

  def writeTo(output: com.google.protobuf.CodedOutputStream) {
    output.writeBytes(1, `bucket`)
    output.writeMessage(2, `props`)
  }

  lazy val getSerializedSize = {
    import com.google.protobuf.CodedOutputStream._
    var size = 0
    size += computeBytesSize(1, `bucket`)
    size += computeMessageSize(2, `props`)

    size
  }

  def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): RpbSetBucketReq = {
    import com.google.protobuf.ExtensionRegistryLite.{ getEmptyRegistry ⇒ _emptyRegistry }
    var __bucket: com.google.protobuf.ByteString = com.google.protobuf.ByteString.EMPTY
    var __props: RpbBucketProps = RpbBucketProps.defaultInstance

      def __newMerged = RpbSetBucketReq(
        __bucket,
        __props)
    while (true) in.readTag match {
      case 0       ⇒ return __newMerged
      case 10      ⇒ __bucket = in.readBytes()
      case 18      ⇒ __props = readMessage[RpbBucketProps](in, __props, _emptyRegistry)
      case default ⇒ if (!in.skipField(default)) return __newMerged
    }
    null
  }

  def mergeFrom(m: RpbSetBucketReq) = {
    RpbSetBucketReq(
      m.`bucket`,
      m.`props`)
  }

  def getDefaultInstanceForType = RpbSetBucketReq.defaultInstance
  def clear = getDefaultInstanceForType
  def isInitialized = true
  def build = this
  def buildPartial = this
  def newBuilderForType = this
  def toBuilder = this
}

object RpbSetBucketReq {
  @reflect.BeanProperty val defaultInstance = new RpbSetBucketReq()

  val BUCKET_FIELD_NUMBER = 1
  val PROPS_FIELD_NUMBER = 2

}
final case class RpbResetBucketReq(
  `bucket`: com.google.protobuf.ByteString = com.google.protobuf.ByteString.EMPTY) extends com.google.protobuf.GeneratedMessageLite
    with com.google.protobuf.MessageLite.Builder
    with Message[RpbResetBucketReq] {

  def writeTo(output: com.google.protobuf.CodedOutputStream) {
    output.writeBytes(1, `bucket`)
  }

  lazy val getSerializedSize = {
    import com.google.protobuf.CodedOutputStream._
    var size = 0
    size += computeBytesSize(1, `bucket`)

    size
  }

  def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): RpbResetBucketReq = {
    import com.google.protobuf.ExtensionRegistryLite.{ getEmptyRegistry ⇒ _emptyRegistry }
    var __bucket: com.google.protobuf.ByteString = com.google.protobuf.ByteString.EMPTY

      def __newMerged = RpbResetBucketReq(
        __bucket)
    while (true) in.readTag match {
      case 0       ⇒ return __newMerged
      case 10      ⇒ __bucket = in.readBytes()
      case default ⇒ if (!in.skipField(default)) return __newMerged
    }
    null
  }

  def mergeFrom(m: RpbResetBucketReq) = {
    RpbResetBucketReq(
      m.`bucket`)
  }

  def getDefaultInstanceForType = RpbResetBucketReq.defaultInstance
  def clear = getDefaultInstanceForType
  def isInitialized = true
  def build = this
  def buildPartial = this
  def newBuilderForType = this
  def toBuilder = this
}

object RpbResetBucketReq {
  @reflect.BeanProperty val defaultInstance = new RpbResetBucketReq()

  val BUCKET_FIELD_NUMBER = 1

}
final case class RpbModFun(
  `module`: com.google.protobuf.ByteString = com.google.protobuf.ByteString.EMPTY,
  `function`: com.google.protobuf.ByteString = com.google.protobuf.ByteString.EMPTY) extends com.google.protobuf.GeneratedMessageLite
    with com.google.protobuf.MessageLite.Builder
    with Message[RpbModFun] {

  def writeTo(output: com.google.protobuf.CodedOutputStream) {
    output.writeBytes(1, `module`)
    output.writeBytes(2, `function`)
  }

  lazy val getSerializedSize = {
    import com.google.protobuf.CodedOutputStream._
    var size = 0
    size += computeBytesSize(1, `module`)
    size += computeBytesSize(2, `function`)

    size
  }

  def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): RpbModFun = {
    import com.google.protobuf.ExtensionRegistryLite.{ getEmptyRegistry ⇒ _emptyRegistry }
    var __module: com.google.protobuf.ByteString = com.google.protobuf.ByteString.EMPTY
    var __function: com.google.protobuf.ByteString = com.google.protobuf.ByteString.EMPTY

      def __newMerged = RpbModFun(
        __module,
        __function)
    while (true) in.readTag match {
      case 0       ⇒ return __newMerged
      case 10      ⇒ __module = in.readBytes()
      case 18      ⇒ __function = in.readBytes()
      case default ⇒ if (!in.skipField(default)) return __newMerged
    }
    null
  }

  def mergeFrom(m: RpbModFun) = {
    RpbModFun(
      m.`module`,
      m.`function`)
  }

  def getDefaultInstanceForType = RpbModFun.defaultInstance
  def clear = getDefaultInstanceForType
  def isInitialized = true
  def build = this
  def buildPartial = this
  def newBuilderForType = this
  def toBuilder = this
}

object RpbModFun {
  @reflect.BeanProperty val defaultInstance = new RpbModFun()

  val MODULE_FIELD_NUMBER = 1
  val FUNCTION_FIELD_NUMBER = 2

}
final case class RpbCommitHook(
  `modfun`: Option[RpbModFun] = None,
  `name`: Option[com.google.protobuf.ByteString] = None) extends com.google.protobuf.GeneratedMessageLite
    with com.google.protobuf.MessageLite.Builder
    with Message[RpbCommitHook] {

  def setModfun(_f: RpbModFun) = copy(`modfun` = _f)
  def setName(_f: com.google.protobuf.ByteString) = copy(`name` = _f)

  def clearModfun = copy(`modfun` = None)
  def clearName = copy(`name` = None)

  def writeTo(output: com.google.protobuf.CodedOutputStream) {
    if (`modfun`.isDefined) output.writeMessage(1, `modfun`.get)
    if (`name`.isDefined) output.writeBytes(2, `name`.get)
  }

  lazy val getSerializedSize = {
    import com.google.protobuf.CodedOutputStream._
    var size = 0
    if (`modfun`.isDefined) size += computeMessageSize(1, `modfun`.get)
    if (`name`.isDefined) size += computeBytesSize(2, `name`.get)

    size
  }

  def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): RpbCommitHook = {
    import com.google.protobuf.ExtensionRegistryLite.{ getEmptyRegistry ⇒ _emptyRegistry }
    var __modfun: Option[RpbModFun] = `modfun`
    var __name: Option[com.google.protobuf.ByteString] = `name`

      def __newMerged = RpbCommitHook(
        __modfun,
        __name)
    while (true) in.readTag match {
      case 0 ⇒ return __newMerged
      case 10 ⇒ __modfun = readMessage[RpbModFun](in, __modfun.orElse({
        __modfun = RpbModFun.defaultInstance
        __modfun
      }).get, _emptyRegistry)
      case 18      ⇒ __name = in.readBytes()
      case default ⇒ if (!in.skipField(default)) return __newMerged
    }
    null
  }

  def mergeFrom(m: RpbCommitHook) = {
    RpbCommitHook(
      m.`modfun`.orElse(`modfun`),
      m.`name`.orElse(`name`))
  }

  def getDefaultInstanceForType = RpbCommitHook.defaultInstance
  def clear = getDefaultInstanceForType
  def isInitialized = true
  def build = this
  def buildPartial = this
  def newBuilderForType = this
  def toBuilder = this
}

object RpbCommitHook {
  @reflect.BeanProperty val defaultInstance = new RpbCommitHook()

  val MODFUN_FIELD_NUMBER = 1
  val NAME_FIELD_NUMBER = 2

}
final case class RpbBucketProps(
  `nVal`: Option[Int] = None,
  `allowMult`: Option[Boolean] = None,
  `lastWriteWins`: Option[Boolean] = None,
  `precommit`: Vector[RpbCommitHook] = Vector.empty[RpbCommitHook],
  `hasPrecommit`: Option[Boolean] = Some(false),
  `postcommit`: Vector[RpbCommitHook] = Vector.empty[RpbCommitHook],
  `hasPostcommit`: Option[Boolean] = Some(false),
  `chashKeyfun`: Option[RpbModFun] = None,
  `linkfun`: Option[RpbModFun] = None,
  `oldVclock`: Option[Int] = None,
  `youngVclock`: Option[Int] = None,
  `bigVclock`: Option[Int] = None,
  `smallVclock`: Option[Int] = None,
  `pr`: Option[Int] = None,
  `r`: Option[Int] = None,
  `w`: Option[Int] = None,
  `pw`: Option[Int] = None,
  `dw`: Option[Int] = None,
  `rw`: Option[Int] = None,
  `basicQuorum`: Option[Boolean] = None,
  `notfoundOk`: Option[Boolean] = None) extends com.google.protobuf.GeneratedMessageLite
    with com.google.protobuf.MessageLite.Builder
    with Message[RpbBucketProps] {

  def setNVal(_f: Int) = copy(`nVal` = _f)
  def setAllowMult(_f: Boolean) = copy(`allowMult` = _f)
  def setLastWriteWins(_f: Boolean) = copy(`lastWriteWins` = _f)
  def setPrecommit(_i: Int, _v: RpbCommitHook) = copy(`precommit` = `precommit`.updated(_i, _v))
  def addPrecommit(_f: RpbCommitHook) = copy(`precommit` = `precommit` :+ _f)
  def addAllPrecommit(_f: RpbCommitHook*) = copy(`precommit` = `precommit` ++ _f)
  def addAllPrecommit(_f: TraversableOnce[RpbCommitHook]) = copy(`precommit` = `precommit` ++ _f)
  def setHasPrecommit(_f: Boolean) = copy(`hasPrecommit` = _f)
  def setPostcommit(_i: Int, _v: RpbCommitHook) = copy(`postcommit` = `postcommit`.updated(_i, _v))
  def addPostcommit(_f: RpbCommitHook) = copy(`postcommit` = `postcommit` :+ _f)
  def addAllPostcommit(_f: RpbCommitHook*) = copy(`postcommit` = `postcommit` ++ _f)
  def addAllPostcommit(_f: TraversableOnce[RpbCommitHook]) = copy(`postcommit` = `postcommit` ++ _f)
  def setHasPostcommit(_f: Boolean) = copy(`hasPostcommit` = _f)
  def setChashKeyfun(_f: RpbModFun) = copy(`chashKeyfun` = _f)
  def setLinkfun(_f: RpbModFun) = copy(`linkfun` = _f)
  def setOldVclock(_f: Int) = copy(`oldVclock` = _f)
  def setYoungVclock(_f: Int) = copy(`youngVclock` = _f)
  def setBigVclock(_f: Int) = copy(`bigVclock` = _f)
  def setSmallVclock(_f: Int) = copy(`smallVclock` = _f)
  def setPr(_f: Int) = copy(`pr` = _f)
  def setR(_f: Int) = copy(`r` = _f)
  def setW(_f: Int) = copy(`w` = _f)
  def setPw(_f: Int) = copy(`pw` = _f)
  def setDw(_f: Int) = copy(`dw` = _f)
  def setRw(_f: Int) = copy(`rw` = _f)
  def setBasicQuorum(_f: Boolean) = copy(`basicQuorum` = _f)
  def setNotfoundOk(_f: Boolean) = copy(`notfoundOk` = _f)

  def clearNVal = copy(`nVal` = None)
  def clearAllowMult = copy(`allowMult` = None)
  def clearLastWriteWins = copy(`lastWriteWins` = None)
  def clearPrecommit = copy(`precommit` = Vector.empty[RpbCommitHook])
  def clearHasPrecommit = copy(`hasPrecommit` = None)
  def clearPostcommit = copy(`postcommit` = Vector.empty[RpbCommitHook])
  def clearHasPostcommit = copy(`hasPostcommit` = None)
  def clearChashKeyfun = copy(`chashKeyfun` = None)
  def clearLinkfun = copy(`linkfun` = None)
  def clearOldVclock = copy(`oldVclock` = None)
  def clearYoungVclock = copy(`youngVclock` = None)
  def clearBigVclock = copy(`bigVclock` = None)
  def clearSmallVclock = copy(`smallVclock` = None)
  def clearPr = copy(`pr` = None)
  def clearR = copy(`r` = None)
  def clearW = copy(`w` = None)
  def clearPw = copy(`pw` = None)
  def clearDw = copy(`dw` = None)
  def clearRw = copy(`rw` = None)
  def clearBasicQuorum = copy(`basicQuorum` = None)
  def clearNotfoundOk = copy(`notfoundOk` = None)

  def writeTo(output: com.google.protobuf.CodedOutputStream) {
    if (`nVal`.isDefined) output.writeUInt32(1, `nVal`.get)
    if (`allowMult`.isDefined) output.writeBool(2, `allowMult`.get)
    if (`lastWriteWins`.isDefined) output.writeBool(3, `lastWriteWins`.get)
    for (_v ← `precommit`) output.writeMessage(4, _v)
    if (`hasPrecommit`.isDefined) output.writeBool(5, `hasPrecommit`.get)
    for (_v ← `postcommit`) output.writeMessage(6, _v)
    if (`hasPostcommit`.isDefined) output.writeBool(7, `hasPostcommit`.get)
    if (`chashKeyfun`.isDefined) output.writeMessage(8, `chashKeyfun`.get)
    if (`linkfun`.isDefined) output.writeMessage(9, `linkfun`.get)
    if (`oldVclock`.isDefined) output.writeUInt32(10, `oldVclock`.get)
    if (`youngVclock`.isDefined) output.writeUInt32(11, `youngVclock`.get)
    if (`bigVclock`.isDefined) output.writeUInt32(12, `bigVclock`.get)
    if (`smallVclock`.isDefined) output.writeUInt32(13, `smallVclock`.get)
    if (`pr`.isDefined) output.writeUInt32(14, `pr`.get)
    if (`r`.isDefined) output.writeUInt32(15, `r`.get)
    if (`w`.isDefined) output.writeUInt32(16, `w`.get)
    if (`pw`.isDefined) output.writeUInt32(17, `pw`.get)
    if (`dw`.isDefined) output.writeUInt32(18, `dw`.get)
    if (`rw`.isDefined) output.writeUInt32(19, `rw`.get)
    if (`basicQuorum`.isDefined) output.writeBool(20, `basicQuorum`.get)
    if (`notfoundOk`.isDefined) output.writeBool(21, `notfoundOk`.get)
  }

  lazy val getSerializedSize = {
    import com.google.protobuf.CodedOutputStream._
    var size = 0
    if (`nVal`.isDefined) size += computeUInt32Size(1, `nVal`.get)
    if (`allowMult`.isDefined) size += computeBoolSize(2, `allowMult`.get)
    if (`lastWriteWins`.isDefined) size += computeBoolSize(3, `lastWriteWins`.get)
    for (_v ← `precommit`) size += computeMessageSize(4, _v)
    if (`hasPrecommit`.isDefined) size += computeBoolSize(5, `hasPrecommit`.get)
    for (_v ← `postcommit`) size += computeMessageSize(6, _v)
    if (`hasPostcommit`.isDefined) size += computeBoolSize(7, `hasPostcommit`.get)
    if (`chashKeyfun`.isDefined) size += computeMessageSize(8, `chashKeyfun`.get)
    if (`linkfun`.isDefined) size += computeMessageSize(9, `linkfun`.get)
    if (`oldVclock`.isDefined) size += computeUInt32Size(10, `oldVclock`.get)
    if (`youngVclock`.isDefined) size += computeUInt32Size(11, `youngVclock`.get)
    if (`bigVclock`.isDefined) size += computeUInt32Size(12, `bigVclock`.get)
    if (`smallVclock`.isDefined) size += computeUInt32Size(13, `smallVclock`.get)
    if (`pr`.isDefined) size += computeUInt32Size(14, `pr`.get)
    if (`r`.isDefined) size += computeUInt32Size(15, `r`.get)
    if (`w`.isDefined) size += computeUInt32Size(16, `w`.get)
    if (`pw`.isDefined) size += computeUInt32Size(17, `pw`.get)
    if (`dw`.isDefined) size += computeUInt32Size(18, `dw`.get)
    if (`rw`.isDefined) size += computeUInt32Size(19, `rw`.get)
    if (`basicQuorum`.isDefined) size += computeBoolSize(20, `basicQuorum`.get)
    if (`notfoundOk`.isDefined) size += computeBoolSize(21, `notfoundOk`.get)

    size
  }

  def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): RpbBucketProps = {
    import com.google.protobuf.ExtensionRegistryLite.{ getEmptyRegistry ⇒ _emptyRegistry }
    var __nVal: Option[Int] = `nVal`
    var __allowMult: Option[Boolean] = `allowMult`
    var __lastWriteWins: Option[Boolean] = `lastWriteWins`
    val __precommit: collection.mutable.Buffer[RpbCommitHook] = `precommit`.toBuffer
    var __hasPrecommit: Option[Boolean] = `hasPrecommit`
    val __postcommit: collection.mutable.Buffer[RpbCommitHook] = `postcommit`.toBuffer
    var __hasPostcommit: Option[Boolean] = `hasPostcommit`
    var __chashKeyfun: Option[RpbModFun] = `chashKeyfun`
    var __linkfun: Option[RpbModFun] = `linkfun`
    var __oldVclock: Option[Int] = `oldVclock`
    var __youngVclock: Option[Int] = `youngVclock`
    var __bigVclock: Option[Int] = `bigVclock`
    var __smallVclock: Option[Int] = `smallVclock`
    var __pr: Option[Int] = `pr`
    var __r: Option[Int] = `r`
    var __w: Option[Int] = `w`
    var __pw: Option[Int] = `pw`
    var __dw: Option[Int] = `dw`
    var __rw: Option[Int] = `rw`
    var __basicQuorum: Option[Boolean] = `basicQuorum`
    var __notfoundOk: Option[Boolean] = `notfoundOk`

      def __newMerged = RpbBucketProps(
        __nVal,
        __allowMult,
        __lastWriteWins,
        Vector(__precommit: _*),
        __hasPrecommit,
        Vector(__postcommit: _*),
        __hasPostcommit,
        __chashKeyfun,
        __linkfun,
        __oldVclock,
        __youngVclock,
        __bigVclock,
        __smallVclock,
        __pr,
        __r,
        __w,
        __pw,
        __dw,
        __rw,
        __basicQuorum,
        __notfoundOk)
    while (true) in.readTag match {
      case 0  ⇒ return __newMerged
      case 8  ⇒ __nVal = in.readUInt32()
      case 16 ⇒ __allowMult = in.readBool()
      case 24 ⇒ __lastWriteWins = in.readBool()
      case 34 ⇒ __precommit += readMessage[RpbCommitHook](in, RpbCommitHook.defaultInstance, _emptyRegistry)
      case 40 ⇒ __hasPrecommit = in.readBool()
      case 50 ⇒ __postcommit += readMessage[RpbCommitHook](in, RpbCommitHook.defaultInstance, _emptyRegistry)
      case 56 ⇒ __hasPostcommit = in.readBool()
      case 66 ⇒ __chashKeyfun = readMessage[RpbModFun](in, __chashKeyfun.orElse({
        __chashKeyfun = RpbModFun.defaultInstance
        __chashKeyfun
      }).get, _emptyRegistry)
      case 74 ⇒ __linkfun = readMessage[RpbModFun](in, __linkfun.orElse({
        __linkfun = RpbModFun.defaultInstance
        __linkfun
      }).get, _emptyRegistry)
      case 80      ⇒ __oldVclock = in.readUInt32()
      case 88      ⇒ __youngVclock = in.readUInt32()
      case 96      ⇒ __bigVclock = in.readUInt32()
      case 104     ⇒ __smallVclock = in.readUInt32()
      case 112     ⇒ __pr = in.readUInt32()
      case 120     ⇒ __r = in.readUInt32()
      case 128     ⇒ __w = in.readUInt32()
      case 136     ⇒ __pw = in.readUInt32()
      case 144     ⇒ __dw = in.readUInt32()
      case 152     ⇒ __rw = in.readUInt32()
      case 160     ⇒ __basicQuorum = in.readBool()
      case 168     ⇒ __notfoundOk = in.readBool()
      case default ⇒ if (!in.skipField(default)) return __newMerged
    }
    null
  }

  def mergeFrom(m: RpbBucketProps) = {
    RpbBucketProps(
      m.`nVal`.orElse(`nVal`),
      m.`allowMult`.orElse(`allowMult`),
      m.`lastWriteWins`.orElse(`lastWriteWins`),
      `precommit` ++ m.`precommit`,
      m.`hasPrecommit`.orElse(`hasPrecommit`),
      `postcommit` ++ m.`postcommit`,
      m.`hasPostcommit`.orElse(`hasPostcommit`),
      m.`chashKeyfun`.orElse(`chashKeyfun`),
      m.`linkfun`.orElse(`linkfun`),
      m.`oldVclock`.orElse(`oldVclock`),
      m.`youngVclock`.orElse(`youngVclock`),
      m.`bigVclock`.orElse(`bigVclock`),
      m.`smallVclock`.orElse(`smallVclock`),
      m.`pr`.orElse(`pr`),
      m.`r`.orElse(`r`),
      m.`w`.orElse(`w`),
      m.`pw`.orElse(`pw`),
      m.`dw`.orElse(`dw`),
      m.`rw`.orElse(`rw`),
      m.`basicQuorum`.orElse(`basicQuorum`),
      m.`notfoundOk`.orElse(`notfoundOk`))
  }

  def getDefaultInstanceForType = RpbBucketProps.defaultInstance
  def clear = getDefaultInstanceForType
  def isInitialized = true
  def build = this
  def buildPartial = this
  def newBuilderForType = this
  def toBuilder = this
}

object RpbBucketProps {
  @reflect.BeanProperty val defaultInstance = new RpbBucketProps()

  val N_VAL_FIELD_NUMBER = 1
  val ALLOW_MULT_FIELD_NUMBER = 2
  val LAST_WRITE_WINS_FIELD_NUMBER = 3
  val PRECOMMIT_FIELD_NUMBER = 4
  val HAS_PRECOMMIT_FIELD_NUMBER = 5
  val POSTCOMMIT_FIELD_NUMBER = 6
  val HAS_POSTCOMMIT_FIELD_NUMBER = 7
  val CHASH_KEYFUN_FIELD_NUMBER = 8
  val LINKFUN_FIELD_NUMBER = 9
  val OLD_VCLOCK_FIELD_NUMBER = 10
  val YOUNG_VCLOCK_FIELD_NUMBER = 11
  val BIG_VCLOCK_FIELD_NUMBER = 12
  val SMALL_VCLOCK_FIELD_NUMBER = 13
  val PR_FIELD_NUMBER = 14
  val R_FIELD_NUMBER = 15
  val W_FIELD_NUMBER = 16
  val PW_FIELD_NUMBER = 17
  val DW_FIELD_NUMBER = 18
  val RW_FIELD_NUMBER = 19
  val BASIC_QUORUM_FIELD_NUMBER = 20
  val NOTFOUND_OK_FIELD_NUMBER = 21

}

object RiakPB {
  def registerAllExtensions(registry: com.google.protobuf.ExtensionRegistryLite) {
  }

}
