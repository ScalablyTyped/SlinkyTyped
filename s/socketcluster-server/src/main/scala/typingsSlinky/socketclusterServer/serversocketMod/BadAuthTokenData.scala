package typingsSlinky.socketclusterServer.serversocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BadAuthTokenData extends js.Object {
  var authError: js.Error = js.native
  var signedAuthToken: String = js.native
}

object BadAuthTokenData {
  @scala.inline
  def apply(authError: js.Error, signedAuthToken: String): BadAuthTokenData = {
    val __obj = js.Dynamic.literal(authError = authError.asInstanceOf[js.Any], signedAuthToken = signedAuthToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadAuthTokenData]
  }
  @scala.inline
  implicit class BadAuthTokenDataOps[Self <: BadAuthTokenData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthError(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authError")(value.asInstanceOf[js.Any])
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

