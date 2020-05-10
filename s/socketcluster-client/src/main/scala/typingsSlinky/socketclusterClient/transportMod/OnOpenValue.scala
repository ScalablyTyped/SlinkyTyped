package typingsSlinky.socketclusterClient.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnOpenValue extends js.Object {
  var authToken: js.Object | Null = js.native
  var id: String = js.native
  var isAuthenticated: Boolean = js.native
  var pingTimeout: Double = js.native
}

object OnOpenValue {
  @scala.inline
  def apply(id: String, isAuthenticated: Boolean, pingTimeout: Double): OnOpenValue = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isAuthenticated = isAuthenticated.asInstanceOf[js.Any], pingTimeout = pingTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnOpenValue]
  }
  @scala.inline
  implicit class OnOpenValueOps[Self <: OnOpenValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAuthenticated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAuthenticated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPingTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthToken(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthTokenNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authToken")(null)
        ret
    }
  }
  
}

