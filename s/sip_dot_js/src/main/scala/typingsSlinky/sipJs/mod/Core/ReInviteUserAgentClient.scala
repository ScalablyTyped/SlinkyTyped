package typingsSlinky.sipJs.mod.Core

import typingsSlinky.sipJs.inviteMod.OutgoingInviteRequestDelegate
import typingsSlinky.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.ReInviteUserAgentClient")
@js.native
class ReInviteUserAgentClient protected ()
  extends typingsSlinky.sipJs.coreMod.ReInviteUserAgentClient {
  def this(dialog: typingsSlinky.sipJs.dialogsMod.SessionDialog) = this()
  def this(dialog: typingsSlinky.sipJs.dialogsMod.SessionDialog, delegate: OutgoingInviteRequestDelegate) = this()
  def this(
    dialog: typingsSlinky.sipJs.dialogsMod.SessionDialog,
    delegate: js.UndefOr[scala.Nothing],
    options: RequestOptions
  ) = this()
  def this(
    dialog: typingsSlinky.sipJs.dialogsMod.SessionDialog,
    delegate: OutgoingInviteRequestDelegate,
    options: RequestOptions
  ) = this()
}
