package typingsSlinky.sipJs

import typingsSlinky.sipJs.coreMod.IncomingRequestMessage
import typingsSlinky.sipJs.methodsMessageMod.IncomingMessageRequest
import typingsSlinky.sipJs.outgoingResponseMod.ResponseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMod {
  
  @JSImport("sip.js/lib/api/message", "Message")
  @js.native
  class Message protected () extends StObject {
    /** @internal */
    def this(incomingMessageRequest: IncomingMessageRequest) = this()
    
    /** Accept the request. */
    def accept(): js.Promise[Unit] = js.native
    def accept(options: ResponseOptions): js.Promise[Unit] = js.native
    
    var incomingMessageRequest: js.Any = js.native
    
    /** Reject the request. */
    def reject(): js.Promise[Unit] = js.native
    def reject(options: ResponseOptions): js.Promise[Unit] = js.native
    
    /** Incoming MESSAGE request message. */
    def request: IncomingRequestMessage = js.native
  }
}
