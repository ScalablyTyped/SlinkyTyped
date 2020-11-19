package typingsSlinky.sipJs

import typingsSlinky.sipJs.coreMod.IncomingRequestMessage
import typingsSlinky.sipJs.methodsInfoMod.IncomingInfoRequest
import typingsSlinky.sipJs.outgoingResponseMod.ResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/api/info", JSImport.Namespace)
@js.native
object infoMod extends js.Object {
  
  @js.native
  class Info protected () extends js.Object {
    /** @internal */
    def this(incomingInfoRequest: IncomingInfoRequest) = this()
    
    /** Accept the request. */
    def accept(): js.Promise[Unit] = js.native
    def accept(options: ResponseOptions): js.Promise[Unit] = js.native
    
    var incomingInfoRequest: js.Any = js.native
    
    /** Reject the request. */
    def reject(): js.Promise[Unit] = js.native
    def reject(options: ResponseOptions): js.Promise[Unit] = js.native
    
    /** Incoming MESSAGE request message. */
    def request: IncomingRequestMessage = js.native
  }
}
