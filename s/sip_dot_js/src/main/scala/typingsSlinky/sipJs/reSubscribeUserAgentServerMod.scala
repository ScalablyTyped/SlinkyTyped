package typingsSlinky.sipJs

import typingsSlinky.sipJs.dialogsMod.Dialog
import typingsSlinky.sipJs.incomingRequestMod.IncomingRequestDelegate
import typingsSlinky.sipJs.messagesMod.IncomingRequestMessage
import typingsSlinky.sipJs.userAgentServerMod.UserAgentServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reSubscribeUserAgentServerMod {
  
  @JSImport("sip.js/lib/core/user-agents/re-subscribe-user-agent-server", "ReSubscribeUserAgentServer")
  @js.native
  class ReSubscribeUserAgentServer protected () extends UserAgentServer {
    def this(dialog: Dialog, message: IncomingRequestMessage) = this()
    def this(dialog: Dialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
}
