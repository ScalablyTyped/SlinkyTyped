package typingsSlinky.sipJs.mod

import typingsSlinky.sipJs.inviteMod.IncomingInviteRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "InviteServerContext")
@js.native
class InviteServerContext protected ()
  extends typingsSlinky.sipJs.libSessionMod.InviteServerContext {
  def this(ua: typingsSlinky.sipJs.uAMod.UA, incomingInviteRequest: IncomingInviteRequest) = this()
}

