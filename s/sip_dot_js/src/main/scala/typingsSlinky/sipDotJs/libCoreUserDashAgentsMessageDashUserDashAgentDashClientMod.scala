package typingsSlinky.sipDotJs

import typingsSlinky.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
import typingsSlinky.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore
import typingsSlinky.sipDotJs.libCoreUserDashAgentsUserDashAgentDashClientMod.UserAgentClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents/message-user-agent-client", JSImport.Namespace)
@js.native
object libCoreUserDashAgentsMessageDashUserDashAgentDashClientMod extends js.Object {
  @js.native
  class MessageUserAgentClient protected () extends UserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingRequestDelegate) = this()
  }
  
}

