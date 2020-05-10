package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFreshLogin extends js.Object {
  var freshLogin: Double = js.native
  var login: Double = js.native
  var noOption: Double = js.native
  var selectAccount: Double = js.native
}

object AnonFreshLogin {
  @scala.inline
  def apply(freshLogin: Double, login: Double, noOption: Double, selectAccount: Double): AnonFreshLogin = {
    val __obj = js.Dynamic.literal(freshLogin = freshLogin.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], noOption = noOption.asInstanceOf[js.Any], selectAccount = selectAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFreshLogin]
  }
  @scala.inline
  implicit class AnonFreshLoginOps[Self <: AnonFreshLogin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFreshLogin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freshLogin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoOption(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectAccount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAccount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

