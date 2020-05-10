package typingsSlinky.speakeasy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TotpVerifyOptions extends SharedOptions {
  /**
    * The counter value, calculated from time by default
    */
  var counter: js.UndefOr[Double] = js.native
  /**
    * The number of digits for the one-time passcode, defaults to 6
    */
  var digits: js.UndefOr[Double] = js.native
  /**
    * Initial time since the UNIX epoch from which to calculate the counter value,
    * defaults to 0 (no offset).
    */
  var epoch: js.UndefOr[Double] = js.native
  /**
    * Shared secret key
    */
  var secret: String = js.native
  /**
    * Time step in seconds, defaults to 30
    */
  var step: js.UndefOr[Double] = js.native
  /**
    * Time in seconds with which to calculate
    * counter value, defaults to `Date.now() / 1000`.
    */
  var time: js.UndefOr[Double] = js.native
  /**
    * Passcode to validate
    */
  var token: String = js.native
  /**
    * The allowable margin for the counter.
    * The function will check "W" codes in the future and the past against the
    * provided passcode, e.g. if W = 5, and C = 1000, this function will check
    * the passcode against all One Time Passcodes between 995 and 1005, inclusive
    * defaults to 0
    */
  var window: js.UndefOr[Double] = js.native
}

object TotpVerifyOptions {
  @scala.inline
  def apply(secret: String, token: String): TotpVerifyOptions = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TotpVerifyOptions]
  }
  @scala.inline
  implicit class TotpVerifyOptionsOps[Self <: TotpVerifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCounter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counter")(js.undefined)
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
    def withEpoch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epoch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEpoch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epoch")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
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

