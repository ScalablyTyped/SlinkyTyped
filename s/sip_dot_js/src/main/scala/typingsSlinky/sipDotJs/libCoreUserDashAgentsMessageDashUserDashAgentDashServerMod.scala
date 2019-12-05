package typingsSlinky.sipDotJs

import typingsSlinky.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate
import typingsSlinky.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
import typingsSlinky.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore
import typingsSlinky.sipDotJs.libCoreUserDashAgentsUserDashAgentDashServerMod.UserAgentServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents/message-user-agent-server", JSImport.Namespace)
@js.native
object libCoreUserDashAgentsMessageDashUserDashAgentDashServerMod extends js.Object {
  @js.native
  class MessageUserAgentServer protected () extends UserAgentServer {
    def this(core: UserAgentCore, message: IncomingRequestMessage) = this()
    def this(core: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
}

