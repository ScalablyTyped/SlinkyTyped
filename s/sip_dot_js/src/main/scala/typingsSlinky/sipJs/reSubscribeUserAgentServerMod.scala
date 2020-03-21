package typingsSlinky.sipJs

import typingsSlinky.sipJs.dialogsMod.Dialog
import typingsSlinky.sipJs.incomingRequestMod.IncomingRequestDelegate
import typingsSlinky.sipJs.messagesMod.IncomingRequestMessage
import typingsSlinky.sipJs.userAgentServerMod.UserAgentServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents/re-subscribe-user-agent-server", JSImport.Namespace)
@js.native
object reSubscribeUserAgentServerMod extends js.Object {
  @js.native
  class ReSubscribeUserAgentServer protected () extends UserAgentServer {
    def this(dialog: Dialog, message: IncomingRequestMessage) = this()
    def this(dialog: Dialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
}

