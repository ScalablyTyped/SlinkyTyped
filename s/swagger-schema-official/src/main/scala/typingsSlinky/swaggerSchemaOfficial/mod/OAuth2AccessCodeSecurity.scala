package typingsSlinky.swaggerSchemaOfficial.mod

import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.accessCode
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.oauth2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuth2AccessCodeSecurity
  extends BaseOAuthSecurity
     with Security {
  var authorizationUrl: String = js.native
  @JSName("flow")
  var flow_OAuth2AccessCodeSecurity: accessCode = js.native
  var tokenUrl: String = js.native
}

object OAuth2AccessCodeSecurity {
  @scala.inline
  def apply(authorizationUrl: String, flow: accessCode, tokenUrl: String, `type`: oauth2): OAuth2AccessCodeSecurity = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2AccessCodeSecurity]
  }
  @scala.inline
  implicit class OAuth2AccessCodeSecurityOps[Self <: OAuth2AccessCodeSecurity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlow(value: accessCode): Self = {
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

