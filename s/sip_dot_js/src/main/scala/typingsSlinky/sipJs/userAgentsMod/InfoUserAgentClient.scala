package typingsSlinky.sipJs.userAgentsMod

import typingsSlinky.sipJs.dialogsMod.SessionDialog
import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "InfoUserAgentClient")
@js.native
class InfoUserAgentClient protected ()
  extends typingsSlinky.sipJs.infoUserAgentClientMod.InfoUserAgentClient {
  def this(dialog: SessionDialog) = this()
  def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
}

