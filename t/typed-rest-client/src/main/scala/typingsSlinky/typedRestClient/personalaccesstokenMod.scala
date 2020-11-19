package typingsSlinky.typedRestClient

import typingsSlinky.typedRestClient.interfacesMod.IRequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typed-rest-client/handlers/personalaccesstoken", JSImport.Namespace)
@js.native
object personalaccesstokenMod extends js.Object {
  
  @js.native
  class PersonalAccessTokenCredentialHandler protected () extends IRequestHandler {
    def this(token: String) = this()
    
    def prepareRequest(options: js.Any): Unit = js.native
    
    var token: String = js.native
  }
}
