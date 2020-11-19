package typingsSlinky.sipJs

import typingsSlinky.sipJs.dialogsMod.SessionDialog
import typingsSlinky.sipJs.incomingRequestMod.IncomingRequestDelegate
import typingsSlinky.sipJs.messagesMod.IncomingRequestMessage
import typingsSlinky.sipJs.userAgentServerMod.UserAgentServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core/user-agents/bye-user-agent-server", JSImport.Namespace)
@js.native
object byeUserAgentServerMod extends js.Object {
  
  @js.native
  class ByeUserAgentServer protected () extends UserAgentServer {
    def this(dialog: SessionDialog, message: IncomingRequestMessage) = this()
    def this(dialog: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
}
