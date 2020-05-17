package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FreshLogin extends js.Object {
  var freshLogin: scala.Double = js.native
  var login: scala.Double = js.native
  var noOption: scala.Double = js.native
  var selectAccount: scala.Double = js.native
}

object FreshLogin {
  @scala.inline
  def apply(freshLogin: scala.Double, login: scala.Double, noOption: scala.Double, selectAccount: scala.Double): FreshLogin = {
    val __obj = js.Dynamic.literal(freshLogin = freshLogin.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], noOption = noOption.asInstanceOf[js.Any], selectAccount = selectAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreshLogin]
  }
  @scala.inline
  implicit class FreshLoginOps[Self <: FreshLogin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFreshLogin(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freshLogin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogin(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoOption(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectAccount(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAccount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

