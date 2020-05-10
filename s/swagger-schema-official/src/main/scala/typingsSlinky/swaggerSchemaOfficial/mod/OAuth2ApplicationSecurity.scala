package typingsSlinky.swaggerSchemaOfficial.mod

import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.application
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.oauth2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuth2ApplicationSecurity
  extends BaseOAuthSecurity
     with Security {
  @JSName("flow")
  var flow_OAuth2ApplicationSecurity: application = js.native
  var tokenUrl: String = js.native
}

object OAuth2ApplicationSecurity {
  @scala.inline
  def apply(flow: application, tokenUrl: String, `type`: oauth2): OAuth2ApplicationSecurity = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2ApplicationSecurity]
  }
  @scala.inline
  implicit class OAuth2ApplicationSecurityOps[Self <: OAuth2ApplicationSecurity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlow(value: application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokenUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

