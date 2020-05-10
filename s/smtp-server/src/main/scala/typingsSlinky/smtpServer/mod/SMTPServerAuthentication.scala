package typingsSlinky.smtpServer.mod

import typingsSlinky.smtpServer.smtpServerStrings.LOGIN
import typingsSlinky.smtpServer.smtpServerStrings.PLAIN
import typingsSlinky.smtpServer.smtpServerStrings.XOAUTH2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMTPServerAuthentication extends js.Object {
  /**
    *  the OAuth2 bearer access token if 'XOAUTH2' was used as the authentication method
    */
  var accessToken: js.UndefOr[String] = js.native
  /**
    * indicates the authentication method used, 'PLAIN', 'LOGIN' or 'XOAUTH2'
    */
  var method: PLAIN | LOGIN | XOAUTH2 = js.native
  /**
    * the password if LOGIN or PLAIN was used
    */
  var password: js.UndefOr[String] = js.native
  /**
    * the username of the user
    */
  var username: js.UndefOr[String] = js.native
  /**
    * a function for validating CRAM-MD5 challenge responses.
    * Takes the password of the user as an argument and returns true if the response matches the password
    */
  def validatePassword(password: String): Boolean = js.native
}

object SMTPServerAuthentication {
  @scala.inline
  def apply(method: PLAIN | LOGIN | XOAUTH2, validatePassword: String => Boolean): SMTPServerAuthentication = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], validatePassword = js.Any.fromFunction1(validatePassword))
    __obj.asInstanceOf[SMTPServerAuthentication]
  }
  @scala.inline
  implicit class SMTPServerAuthenticationOps[Self <: SMTPServerAuthentication] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethod(value: PLAIN | LOGIN | XOAUTH2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidatePassword(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatePassword")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAccessToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
  }
  
}

