package typingsSlinky.swaggerSchemaOfficial.mod

import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.`implicit`
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.oauth2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuth2ImplicitSecurity
  extends BaseOAuthSecurity
     with Security {
  
  var authorizationUrl: String = js.native
  
  @JSName("flow")
  var flow_OAuth2ImplicitSecurity: `implicit` = js.native
}
object OAuth2ImplicitSecurity {
  
  @scala.inline
  def apply(authorizationUrl: String, flow: `implicit`, `type`: oauth2): OAuth2ImplicitSecurity = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2ImplicitSecurity]
  }
  
  @scala.inline
  implicit class OAuth2ImplicitSecurityMutableBuilder[Self <: OAuth2ImplicitSecurity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationUrl(value: String): Self = StObject.set(x, "authorizationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlow(value: `implicit`): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
  }
}
