package typingsSlinky.sipJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "ServerContext")
@js.native
class ServerContext protected ()
  extends typingsSlinky.sipJs.serverContextMod.ServerContext {
  def this(
    ua: typingsSlinky.sipJs.uAMod.UA,
    incomingRequest: typingsSlinky.sipJs.incomingRequestMod.IncomingRequest
  ) = this()
}

/* static members */
@JSImport("sip.js", "ServerContext")
@js.native
object ServerContext extends js.Object {
  def initializer(
    objectToConstruct: typingsSlinky.sipJs.serverContextMod.ServerContext,
    ua: typingsSlinky.sipJs.uAMod.UA,
    incomingRequest: typingsSlinky.sipJs.incomingRequestMod.IncomingRequest
  ): Unit = js.native
}

