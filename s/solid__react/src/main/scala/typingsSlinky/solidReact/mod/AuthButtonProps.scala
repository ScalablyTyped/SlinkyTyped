package typingsSlinky.solidReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthButtonProps extends LoginButtonProps {
  var login: String = js.native
  var logout: String = js.native
}

object AuthButtonProps {
  @scala.inline
  def apply(login: String, logout: String, popup: String): AuthButtonProps = {
    val __obj = js.Dynamic.literal(login = login.asInstanceOf[js.Any], logout = logout.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthButtonProps]
  }
  @scala.inline
  implicit class AuthButtonPropsOps[Self <: AuthButtonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

