package typingsSlinky.typedRestClient

import typingsSlinky.typedRestClient.interfacesMod.IRequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typed-rest-client/handlers/bearertoken", JSImport.Namespace)
@js.native
object bearertokenMod extends js.Object {
  
  @js.native
  class BearerCredentialHandler protected () extends IRequestHandler {
    def this(token: String) = this()
    
    def prepareRequest(options: js.Any): Unit = js.native
    
    var token: String = js.native
  }
}
