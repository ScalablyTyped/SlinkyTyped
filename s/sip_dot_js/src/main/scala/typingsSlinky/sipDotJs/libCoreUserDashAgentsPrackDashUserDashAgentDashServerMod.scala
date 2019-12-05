package typingsSlinky.sipDotJs

import typingsSlinky.sipDotJs.libCoreDialogsMod.SessionDialog
import typingsSlinky.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate
import typingsSlinky.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
import typingsSlinky.sipDotJs.libCoreUserDashAgentsUserDashAgentDashServerMod.UserAgentServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents/prack-user-agent-server", JSImport.Namespace)
@js.native
object libCoreUserDashAgentsPrackDashUserDashAgentDashServerMod extends js.Object {
  @js.native
  class PrackUserAgentServer protected () extends UserAgentServer {
    def this(dialog: SessionDialog, message: IncomingRequestMessage) = this()
    def this(dialog: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
    var dialog: js.Any = js.native
  }
  
}

