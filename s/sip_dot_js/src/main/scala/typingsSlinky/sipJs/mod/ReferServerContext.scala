package typingsSlinky.sipJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "ReferServerContext")
@js.native
class ReferServerContext protected ()
  extends typingsSlinky.sipJs.referContextMod.ReferServerContext {
  def this(
    ua: typingsSlinky.sipJs.uAMod.UA,
    incomingRequest: typingsSlinky.sipJs.incomingRequestMod.IncomingRequest
  ) = this()
  def this(
    ua: typingsSlinky.sipJs.uAMod.UA,
    incomingRequest: typingsSlinky.sipJs.incomingRequestMod.IncomingRequest,
    session: typingsSlinky.sipJs.sessionSessionMod.Session
  ) = this()
}

