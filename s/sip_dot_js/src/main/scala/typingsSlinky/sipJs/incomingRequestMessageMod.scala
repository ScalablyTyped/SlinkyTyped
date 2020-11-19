package typingsSlinky.sipJs

import typingsSlinky.sipJs.incomingMessageMod.IncomingMessage
import typingsSlinky.sipJs.messagesMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core/messages/incoming-request-message", JSImport.Namespace)
@js.native
object incomingRequestMessageMod extends js.Object {
  
  @js.native
  class IncomingRequestMessage () extends IncomingMessage {
    
    var ruri: js.UndefOr[URI] = js.native
  }
}
