package typingsSlinky.sipJs.userAgentsMod

import typingsSlinky.sipJs.dialogsMod.SessionDialog
import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core/user-agents", "ByeUserAgentClient")
@js.native
class ByeUserAgentClient protected ()
  extends typingsSlinky.sipJs.byeUserAgentClientMod.ByeUserAgentClient {
  def this(dialog: SessionDialog) = this()
  def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(dialog: SessionDialog, delegate: js.UndefOr[scala.Nothing], options: RequestOptions) = this()
  def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
}
