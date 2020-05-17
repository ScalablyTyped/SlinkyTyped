package typingsSlinky.swaggerSchemaOfficial.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.swaggerSchemaOfficial.mod.BasicAuthenticationSecurity
  - typingsSlinky.swaggerSchemaOfficial.mod.OAuth2AccessCodeSecurity
  - typingsSlinky.swaggerSchemaOfficial.mod.OAuth2ApplicationSecurity
  - typingsSlinky.swaggerSchemaOfficial.mod.OAuth2ImplicitSecurity
  - typingsSlinky.swaggerSchemaOfficial.mod.OAuth2PasswordSecurity
  - typingsSlinky.swaggerSchemaOfficial.mod.ApiKeySecurity
*/
trait Security extends js.Object

object Security {
  @scala.inline
  implicit def apply(value: ApiKeySecurity): Security = value.asInstanceOf[Security]
  @scala.inline
  implicit def apply(value: BasicAuthenticationSecurity): Security = value.asInstanceOf[Security]
  @scala.inline
  implicit def apply(value: OAuth2AccessCodeSecurity): Security = value.asInstanceOf[Security]
  @scala.inline
  implicit def apply(value: OAuth2ApplicationSecurity): Security = value.asInstanceOf[Security]
  @scala.inline
  implicit def apply(value: OAuth2ImplicitSecurity): Security = value.asInstanceOf[Security]
  @scala.inline
  implicit def apply(value: OAuth2PasswordSecurity): Security = value.asInstanceOf[Security]
}

