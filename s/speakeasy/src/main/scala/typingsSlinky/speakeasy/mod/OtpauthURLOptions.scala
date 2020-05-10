package typingsSlinky.speakeasy.mod

import typingsSlinky.speakeasy.speakeasyStrings.htop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OtpauthURLOptions extends SharedOptions {
  /**
    * The initial counter value, required for HOTP.
    */
  var counter: js.UndefOr[Double] = js.native
  /**
    * The number of digits for the one-time passcode. Currently ignored
    * by Google Authenticator, defaults to 6
    */
  var digits: js.UndefOr[Double] = js.native
  /**
    * The provider or service with which the secret key is associated.
    */
  var issuer: js.UndefOr[String] = js.native
  /**
    * Used to identify the account with which the secret key is associated,
    * e.g. the user's email address.
    */
  var label: String = js.native
  /**
    * The length of time for which a TOTP code will be valid, in seconds.
    * Currently ignored by Google Authenticator, defaults to 30
    */
  var period: js.UndefOr[Double] = js.native
  /**
    * Shared secret key
    */
  var secret: String = js.native
  /**
    * Either 'hotp' or 'totp', defaults to 'totp'
    */
  var `type`: js.UndefOr[htop | typingsSlinky.speakeasy.speakeasyStrings.totp] = js.native
}

object OtpauthURLOptions {
  @scala.inline
  def apply(label: String, secret: String): OtpauthURLOptions = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtpauthURLOptions]
  }
  @scala.inline
  implicit class OtpauthURLOptionsOps[Self <: OtpauthURLOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
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
    def withIssuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: htop | typingsSlinky.speakeasy.speakeasyStrings.totp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

