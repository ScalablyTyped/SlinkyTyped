package typingsSlinky.socketclusterServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSignedAuthToken extends js.Object {
  var signedAuthToken: String = js.native
}

object AnonSignedAuthToken {
  @scala.inline
  def apply(signedAuthToken: String): AnonSignedAuthToken = {
    val __obj = js.Dynamic.literal(signedAuthToken = signedAuthToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSignedAuthToken]
  }
  @scala.inline
  implicit class AnonSignedAuthTokenOps[Self <: AnonSignedAuthToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSignedAuthToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedAuthToken")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

