package typingsSlinky.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod

import typingsSlinky.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.`implicit`
import typingsSlinky.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.accessCode
import typingsSlinky.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.application
import typingsSlinky.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.oauth2
import typingsSlinky.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOAuthSecurity extends BaseSecurity {
  var flow: accessCode | application | `implicit` | password
  var scopes: js.UndefOr[OAuthScope] = js.undefined
  @JSName("type")
  var type_BaseOAuthSecurity: oauth2
}

object BaseOAuthSecurity {
  @scala.inline
  def apply(
    flow: accessCode | application | `implicit` | password,
    `type`: oauth2,
    description: String = null,
    scopes: OAuthScope = null
  ): BaseOAuthSecurity = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOAuthSecurity]
  }
}

