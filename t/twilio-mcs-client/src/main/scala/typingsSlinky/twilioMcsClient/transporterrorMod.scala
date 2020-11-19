package typingsSlinky.twilioMcsClient

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-mcs-client/lib/services/transporterror", JSImport.Namespace)
@js.native
object transporterrorMod extends js.Object {
  
  @js.native
  class TransportError protected () extends Error {
    def this(message: String, code: Double, body: js.Any, status: String, headers: js.Any) = this()
    
    val body: js.Any = js.native
    
    val code: Double = js.native
    
    val headers: js.Any = js.native
    
    val status: String = js.native
  }
}
