package typingsSlinky.zetapushJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenHandshakeOptions extends js.Object {
  var authType: String = js.native
  var deploymentId: String = js.native
  var token: String = js.native
}

object TokenHandshakeOptions {
  @scala.inline
  def apply(authType: String, deploymentId: String, token: String): TokenHandshakeOptions = {
    val __obj = js.Dynamic.literal(authType = authType.asInstanceOf[js.Any], deploymentId = deploymentId.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenHandshakeOptions]
  }
  @scala.inline
  implicit class TokenHandshakeOptionsOps[Self <: TokenHandshakeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeploymentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

