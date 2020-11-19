package typingsSlinky.sipJs.coreMod

import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "NotifyUserAgentClient")
@js.native
class NotifyUserAgentClient protected ()
  extends typingsSlinky.sipJs.userAgentsMod.NotifyUserAgentClient {
  def this(dialog: typingsSlinky.sipJs.dialogsMod.SessionDialog) = this()
  def this(dialog: typingsSlinky.sipJs.dialogsMod.SessionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(
    dialog: typingsSlinky.sipJs.dialogsMod.SessionDialog,
    delegate: js.UndefOr[scala.Nothing],
    options: RequestOptions
  ) = this()
  def this(
    dialog: typingsSlinky.sipJs.dialogsMod.SessionDialog,
    delegate: OutgoingRequestDelegate,
    options: RequestOptions
  ) = this()
}
