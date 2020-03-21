package typingsSlinky.sipJs.userAgentsMod

import typingsSlinky.sipJs.dialogsMod.SessionDialog
import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "PrackUserAgentClient")
@js.native
class PrackUserAgentClient protected ()
  extends typingsSlinky.sipJs.prackUserAgentClientMod.PrackUserAgentClient {
  def this(dialog: SessionDialog) = this()
  def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
}

