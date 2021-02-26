package typingsSlinky.sipJs

import typingsSlinky.sipJs.coreMod.IncomingRequestMessage
import typingsSlinky.sipJs.notifyMod.IncomingNotifyRequest
import typingsSlinky.sipJs.outgoingResponseMod.ResponseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationMod {
  
  @JSImport("sip.js/lib/api/notification", "Notification")
  @js.native
  class Notification protected () extends StObject {
    /** @internal */
    def this(incomingNotifyRequest: IncomingNotifyRequest) = this()
    
    /** Accept the request. */
    def accept(): js.Promise[Unit] = js.native
    def accept(options: ResponseOptions): js.Promise[Unit] = js.native
    
    var incomingNotifyRequest: js.Any = js.native
    
    /** Reject the request. */
    def reject(): js.Promise[Unit] = js.native
    def reject(options: ResponseOptions): js.Promise[Unit] = js.native
    
    /** Incoming NOTIFY request message. */
    def request: IncomingRequestMessage = js.native
  }
}
