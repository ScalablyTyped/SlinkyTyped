package typingsSlinky.swaggerSchemaOfficial.mod

import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.`implicit`
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.accessCode
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.application
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.oauth2
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseOAuthSecurity extends BaseSecurity {
  var flow: accessCode | application | `implicit` | password = js.native
  var scopes: js.UndefOr[OAuthScope] = js.native
  @JSName("type")
  var type_BaseOAuthSecurity: oauth2 = js.native
}

object BaseOAuthSecurity {
  @scala.inline
  def apply(flow: accessCode | application | `implicit` | password, `type`: oauth2): BaseOAuthSecurity = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOAuthSecurity]
  }
  @scala.inline
  implicit class BaseOAuthSecurityOps[Self <: BaseOAuthSecurity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlow(value: accessCode | application | `implicit` | password): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: oauth2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopes(value: OAuthScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(js.undefined)
        ret
    }
  }
  
}

