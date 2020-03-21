package typingsSlinky.sipJs.userAgentsMod

import typingsSlinky.sipJs.dialogsMod.Dialog
import typingsSlinky.sipJs.incomingRequestMod.IncomingRequestDelegate
import typingsSlinky.sipJs.messagesMod.IncomingRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "ReSubscribeUserAgentServer")
@js.native
class ReSubscribeUserAgentServer protected ()
  extends typingsSlinky.sipJs.reSubscribeUserAgentServerMod.ReSubscribeUserAgentServer {
  def this(dialog: Dialog, message: IncomingRequestMessage) = this()
  def this(dialog: Dialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
}

