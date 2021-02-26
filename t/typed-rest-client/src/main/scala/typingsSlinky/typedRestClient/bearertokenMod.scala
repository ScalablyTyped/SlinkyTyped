package typingsSlinky.typedRestClient

import typingsSlinky.typedRestClient.interfacesMod.IRequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bearertokenMod {
  
  @JSImport("typed-rest-client/handlers/bearertoken", "BearerCredentialHandler")
  @js.native
  class BearerCredentialHandler protected () extends IRequestHandler {
    def this(token: String) = this()
    def this(token: String, allowCrossOriginAuthentication: Boolean) = this()
    
    var allowCrossOriginAuthentication: Boolean = js.native
    
    var origin: String = js.native
    
    def prepareRequest(options: js.Any): Unit = js.native
    
    var token: String = js.native
  }
}
