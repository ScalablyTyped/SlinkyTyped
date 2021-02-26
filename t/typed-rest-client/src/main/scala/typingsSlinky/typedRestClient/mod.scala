package typingsSlinky.typedRestClient

import typingsSlinky.typedRestClient.interfacesMod.IRequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("typed-rest-client/handlers/basiccreds", "BasicCredentialHandler")
  @js.native
  class BasicCredentialHandler protected () extends IRequestHandler {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, allowCrossOriginAuthentication: Boolean) = this()
    
    var allowCrossOriginAuthentication: Boolean = js.native
    
    var origin: String = js.native
    
    var password: String = js.native
    
    def prepareRequest(options: js.Any): Unit = js.native
    
    var username: String = js.native
  }
}
