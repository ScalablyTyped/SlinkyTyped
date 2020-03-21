package typingsSlinky.sipJs.apiMod

import typingsSlinky.sipJs.inviteMod.IncomingInviteRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Invitation")
@js.native
class Invitation protected ()
  extends typingsSlinky.sipJs.invitationMod.Invitation {
  /** @internal */
  def this(
    userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent,
    incomingInviteRequest: IncomingInviteRequest
  ) = this()
}

