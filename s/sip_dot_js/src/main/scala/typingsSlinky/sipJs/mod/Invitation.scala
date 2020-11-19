package typingsSlinky.sipJs.mod

import typingsSlinky.sipJs.inviteMod.IncomingInviteRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Invitation")
@js.native
class Invitation protected ()
  extends typingsSlinky.sipJs.apiMod.Invitation {
  /** @internal */
  def this(
    userAgent: typingsSlinky.sipJs.userAgentMod.UserAgent,
    incomingInviteRequest: IncomingInviteRequest
  ) = this()
}
