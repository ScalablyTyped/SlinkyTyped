package typingsSlinky.zetapushJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractAuthData extends js.Object {
  var authType: String = js.native
  var deploymentId: String = js.native
  var login: String = js.native
  var password: js.UndefOr[String] = js.native
}

object AbstractAuthData {
  @scala.inline
  def apply(authType: String, deploymentId: String, login: String): AbstractAuthData = {
    val __obj = js.Dynamic.literal(authType = authType.asInstanceOf[js.Any], deploymentId = deploymentId.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractAuthData]
  }
  @scala.inline
  implicit class AbstractAuthDataOps[Self <: AbstractAuthData] (val x: Self) extends AnyVal {
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
    def withLogin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
  }
  
}

