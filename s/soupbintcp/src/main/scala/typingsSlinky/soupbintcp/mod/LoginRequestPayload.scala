package typingsSlinky.soupbintcp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginRequestPayload extends js.Object {
  var password: String = js.native
  var requestedSequenceNumber: Double = js.native
  var requestedSession: String = js.native
  var username: String = js.native
}

object LoginRequestPayload {
  @scala.inline
  def apply(password: String, requestedSequenceNumber: Double, requestedSession: String, username: String): LoginRequestPayload = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], requestedSequenceNumber = requestedSequenceNumber.asInstanceOf[js.Any], requestedSession = requestedSession.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginRequestPayload]
  }
  @scala.inline
  implicit class LoginRequestPayloadOps[Self <: LoginRequestPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestedSequenceNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedSequenceNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestedSession(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

