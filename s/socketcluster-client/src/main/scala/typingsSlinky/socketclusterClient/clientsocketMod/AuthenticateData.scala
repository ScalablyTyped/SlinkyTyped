package typingsSlinky.socketclusterClient.clientsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticateData extends js.Object {
  var authToken: js.Object = js.native
  var signedAuthToken: String = js.native
}

object AuthenticateData {
  @scala.inline
  def apply(authToken: js.Object, signedAuthToken: String): AuthenticateData = {
    val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], signedAuthToken = signedAuthToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateData]
  }
  @scala.inline
  implicit class AuthenticateDataOps[Self <: AuthenticateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthToken(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignedAuthToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedAuthToken")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

