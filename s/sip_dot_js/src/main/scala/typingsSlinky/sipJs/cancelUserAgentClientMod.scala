package typingsSlinky.sipJs

import typingsSlinky.sipJs.messagesMod.OutgoingRequestMessage
import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipJs.userAgentClientMod.UserAgentClient
import typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cancelUserAgentClientMod {
  
  @JSImport("sip.js/lib/core/user-agents/cancel-user-agent-client", "CancelUserAgentClient")
  @js.native
  class CancelUserAgentClient protected () extends UserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingRequestDelegate) = this()
  }
}
