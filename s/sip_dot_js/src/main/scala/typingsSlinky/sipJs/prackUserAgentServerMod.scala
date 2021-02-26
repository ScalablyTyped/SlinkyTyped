package typingsSlinky.sipJs

import typingsSlinky.sipJs.dialogsMod.SessionDialog
import typingsSlinky.sipJs.incomingRequestMod.IncomingRequestDelegate
import typingsSlinky.sipJs.messagesMod.IncomingRequestMessage
import typingsSlinky.sipJs.userAgentServerMod.UserAgentServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prackUserAgentServerMod {
  
  @JSImport("sip.js/lib/core/user-agents/prack-user-agent-server", "PrackUserAgentServer")
  @js.native
  class PrackUserAgentServer protected () extends UserAgentServer {
    def this(dialog: SessionDialog, message: IncomingRequestMessage) = this()
    def this(dialog: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
    
    var dialog: js.Any = js.native
  }
}
