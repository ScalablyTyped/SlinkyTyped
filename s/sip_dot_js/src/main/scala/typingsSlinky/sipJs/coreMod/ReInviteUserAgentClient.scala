package typingsSlinky.sipJs.coreMod

import typingsSlinky.sipJs.inviteMod.OutgoingInviteRequestDelegate
import typingsSlinky.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "ReInviteUserAgentClient")
@js.native
class ReInviteUserAgentClient protected ()
  extends typingsSlinky.sipJs.userAgentsMod.ReInviteUserAgentClient {
  def this(dialog: typingsSlinky.sipJs.dialogsMod.SessionDialog) = this()
  def this(dialog: typingsSlinky.sipJs.dialogsMod.SessionDialog, delegate: OutgoingInviteRequestDelegate) = this()
  def this(
    dialog: typingsSlinky.sipJs.dialogsMod.SessionDialog,
    delegate: OutgoingInviteRequestDelegate,
    options: RequestOptions
  ) = this()
}

