package typingsSlinky.swaggerSchemaOfficial.mod

import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.`implicit`
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.accessCode
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.apiKey
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.application
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.basic
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.header
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.oauth2
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.password
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.swaggerSchemaOfficial.mod.BasicAuthenticationSecurity
  - typingsSlinky.swaggerSchemaOfficial.mod.OAuth2AccessCodeSecurity
  - typingsSlinky.swaggerSchemaOfficial.mod.OAuth2ApplicationSecurity
  - typingsSlinky.swaggerSchemaOfficial.mod.OAuth2ImplicitSecurity
  - typingsSlinky.swaggerSchemaOfficial.mod.OAuth2PasswordSecurity
  - typingsSlinky.swaggerSchemaOfficial.mod.ApiKeySecurity
*/
trait Security extends StObject
object Security {
  
  @scala.inline
  def ApiKeySecurity(in: query | header, name: String, `type`: apiKey): typingsSlinky.swaggerSchemaOfficial.mod.ApiKeySecurity = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.swaggerSchemaOfficial.mod.ApiKeySecurity]
  }
  
  @scala.inline
  def BasicAuthenticationSecurity(`type`: basic): typingsSlinky.swaggerSchemaOfficial.mod.BasicAuthenticationSecurity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.swaggerSchemaOfficial.mod.BasicAuthenticationSecurity]
  }
  
  @scala.inline
  def OAuth2AccessCodeSecurity(authorizationUrl: String, flow: accessCode, tokenUrl: String, `type`: oauth2): typingsSlinky.swaggerSchemaOfficial.mod.OAuth2AccessCodeSecurity = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.swaggerSchemaOfficial.mod.OAuth2AccessCodeSecurity]
  }
  
  @scala.inline
  def OAuth2ApplicationSecurity(flow: application, tokenUrl: String, `type`: oauth2): typingsSlinky.swaggerSchemaOfficial.mod.OAuth2ApplicationSecurity = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.swaggerSchemaOfficial.mod.OAuth2ApplicationSecurity]
  }
  
  @scala.inline
  def OAuth2ImplicitSecurity(authorizationUrl: String, flow: `implicit`, `type`: oauth2): typingsSlinky.swaggerSchemaOfficial.mod.OAuth2ImplicitSecurity = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.swaggerSchemaOfficial.mod.OAuth2ImplicitSecurity]
  }
  
  @scala.inline
  def OAuth2PasswordSecurity(flow: password, tokenUrl: String, `type`: oauth2): typingsSlinky.swaggerSchemaOfficial.mod.OAuth2PasswordSecurity = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.swaggerSchemaOfficial.mod.OAuth2PasswordSecurity]
  }
}
