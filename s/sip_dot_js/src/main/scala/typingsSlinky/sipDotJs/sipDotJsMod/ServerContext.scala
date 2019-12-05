package typingsSlinky.sipDotJs.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "ServerContext")
@js.native
class ServerContext protected ()
  extends typingsSlinky.sipDotJs.libServerContextMod.ServerContext {
  def this(
    ua: typingsSlinky.sipDotJs.libUAMod.UA,
    incomingRequest: typingsSlinky.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequest
  ) = this()
}

/* static members */
@JSImport("sip.js", "ServerContext")
@js.native
object ServerContext extends js.Object {
  def initializer(
    objectToConstruct: typingsSlinky.sipDotJs.libServerContextMod.ServerContext,
    ua: typingsSlinky.sipDotJs.libUAMod.UA,
    incomingRequest: typingsSlinky.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequest
  ): Unit = js.native
}

