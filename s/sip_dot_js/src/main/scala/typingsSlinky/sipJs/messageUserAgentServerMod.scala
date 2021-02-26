package typingsSlinky.sipJs

import typingsSlinky.sipJs.incomingRequestMod.IncomingRequestDelegate
import typingsSlinky.sipJs.messagesMod.IncomingRequestMessage
import typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore
import typingsSlinky.sipJs.userAgentServerMod.UserAgentServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageUserAgentServerMod {
  
  @JSImport("sip.js/lib/core/user-agents/message-user-agent-server", "MessageUserAgentServer")
  @js.native
  class MessageUserAgentServer protected () extends UserAgentServer {
    def this(core: UserAgentCore, message: IncomingRequestMessage) = this()
    def this(core: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
}
