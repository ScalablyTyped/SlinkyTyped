package typingsSlinky.sipJs

import typingsSlinky.sipJs.messagesMod.OutgoingRequestMessage
import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipJs.userAgentClientMod.UserAgentClient
import typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core/user-agents/message-user-agent-client", JSImport.Namespace)
@js.native
object messageUserAgentClientMod extends js.Object {
  
  @js.native
  class MessageUserAgentClient protected () extends UserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingRequestDelegate) = this()
  }
}
