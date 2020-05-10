package typingsSlinky.speakeasy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HotpVerifyOptions extends SharedOptions {
  /**
    * Counter value. This should be stored by
    * the application and must be incremented for each request.
    */
  var counter: Double = js.native
  /**
    * The number of digits for the one-time passcode, defaults to 6
    */
  var digits: js.UndefOr[Double] = js.native
  /**
    * Shared secret key
    */
  var secret: String = js.native
  /**
    * Passcode to validate
    */
  var token: String = js.native
  /**
    * The allowable margin for the counter.
    * The function will check "W" codes in the future against the provided
    * passcode, e.g. if W = 10, and C = 5, this function will check the
    * passcode against all One Time Passcodes between 5 and 15, inclusive,
    * defaults to 0
    */
  var window: js.UndefOr[Double] = js.native
}

object HotpVerifyOptions {
  @scala.inline
  def apply(counter: Double, secret: String, token: String): HotpVerifyOptions = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[HotpVerifyOptions]
  }
  @scala.inline
  implicit class HotpVerifyOptionsOps[Self <: HotpVerifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCounter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digits")(js.undefined)
        ret
    }
    @scala.inline
    def withWindow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(js.undefined)
        ret
    }
  }
  
}

