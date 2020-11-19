package typingsSlinky.sipJs.userAgentsMod

import typingsSlinky.sipJs.dialogsMod.SessionDialog
import typingsSlinky.sipJs.inviteMod.OutgoingInviteRequestDelegate
import typingsSlinky.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core/user-agents", "ReInviteUserAgentClient")
@js.native
class ReInviteUserAgentClient protected ()
  extends typingsSlinky.sipJs.reInviteUserAgentClientMod.ReInviteUserAgentClient {
  def this(dialog: SessionDialog) = this()
  def this(dialog: SessionDialog, delegate: OutgoingInviteRequestDelegate) = this()
  def this(dialog: SessionDialog, delegate: js.UndefOr[scala.Nothing], options: RequestOptions) = this()
  def this(dialog: SessionDialog, delegate: OutgoingInviteRequestDelegate, options: RequestOptions) = this()
}
