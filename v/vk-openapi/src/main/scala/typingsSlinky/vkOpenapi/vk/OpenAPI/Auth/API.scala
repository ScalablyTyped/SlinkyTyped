package typingsSlinky.vkOpenapi.vk.OpenAPI.Auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait API extends js.Object {
  def getLoginStatus(cb: js.Function1[/* status */ LoginStatus, Unit]): Unit = js.native
  def getSession(cb: js.Function1[/* session */ Session, Unit]): Unit = js.native
  def login(cb: js.Function1[/* status */ LoginStatus, Unit], settings: Double): Unit = js.native
  def logout(cb: js.Function1[/* status */ EmptyLoginStatus, Unit]): Unit = js.native
  def revokeGrants(cb: js.Function1[/* status */ EmptyLoginStatus, Unit]): Unit = js.native
}

object API {
  @scala.inline
  def apply(
    getLoginStatus: js.Function1[/* status */ LoginStatus, Unit] => Unit,
    getSession: js.Function1[/* session */ Session, Unit] => Unit,
    login: (js.Function1[/* status */ LoginStatus, Unit], Double) => Unit,
    logout: js.Function1[/* status */ EmptyLoginStatus, Unit] => Unit,
    revokeGrants: js.Function1[/* status */ EmptyLoginStatus, Unit] => Unit
  ): API = {
    val __obj = js.Dynamic.literal(getLoginStatus = js.Any.fromFunction1(getLoginStatus), getSession = js.Any.fromFunction1(getSession), login = js.Any.fromFunction2(login), logout = js.Any.fromFunction1(logout), revokeGrants = js.Any.fromFunction1(revokeGrants))
    __obj.asInstanceOf[API]
  }
  @scala.inline
  implicit class APIOps[Self <: API] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetLoginStatus(value: js.Function1[/* status */ LoginStatus, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLoginStatus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSession(value: js.Function1[/* session */ Session, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSession")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLogin(value: (js.Function1[/* status */ LoginStatus, Unit], Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLogout(value: js.Function1[/* status */ EmptyLoginStatus, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRevokeGrants(value: js.Function1[/* status */ EmptyLoginStatus, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revokeGrants")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

