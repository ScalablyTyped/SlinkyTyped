package typingsSlinky.socketclusterClient.clientsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthStateChangeData extends js.Object {
  var authToken: js.UndefOr[js.Object] = js.native
  var newAuthState: AuthStates = js.native
  var oldAuthState: AuthStates = js.native
  var signedAuthToken: js.UndefOr[String] = js.native
}

object AuthStateChangeData {
  @scala.inline
  def apply(newAuthState: AuthStates, oldAuthState: AuthStates): AuthStateChangeData = {
    val __obj = js.Dynamic.literal(newAuthState = newAuthState.asInstanceOf[js.Any], oldAuthState = oldAuthState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthStateChangeData]
  }
  @scala.inline
  implicit class AuthStateChangeDataOps[Self <: AuthStateChangeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewAuthState(value: AuthStates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAuthState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldAuthState(value: AuthStates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldAuthState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthToken(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSignedAuthToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedAuthToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignedAuthToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedAuthToken")(js.undefined)
        ret
    }
  }
  
}

