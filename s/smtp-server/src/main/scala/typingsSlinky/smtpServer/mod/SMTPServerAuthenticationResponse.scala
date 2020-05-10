package typingsSlinky.smtpServer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMTPServerAuthenticationResponse extends js.Object {
  /**
    * an object to return if XOAUTH2 authentication failed (do not set the error object in this case).
    * This value is serialized to JSON and base64 encoded automatically, so you can just return the object
    */
  var data: js.UndefOr[js.Object] = js.native
  /**
    * can be any value - if this is set then the user is considered logged in
    * and this value is used later with the session data to identify the user.
    * If this value is empty, then the authentication is considered failed
    */
  var user: js.Any = js.native
}

object SMTPServerAuthenticationResponse {
  @scala.inline
  def apply(user: js.Any): SMTPServerAuthenticationResponse = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SMTPServerAuthenticationResponse]
  }
  @scala.inline
  implicit class SMTPServerAuthenticationResponseOps[Self <: SMTPServerAuthenticationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUser(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
  }
  
}

