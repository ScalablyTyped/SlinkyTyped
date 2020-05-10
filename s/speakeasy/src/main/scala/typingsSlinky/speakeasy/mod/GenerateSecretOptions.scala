package typingsSlinky.speakeasy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateSecretOptions extends js.Object {
  /**
    * Output a Google Authenticator otpauth:// QR code URL.
    *
    * @deprecated use your own QR code implementation to prevent
    *   leaking of secret to a third party.
    */
  var google_auth_qr: js.UndefOr[Boolean] = js.native
  /**
    * The provider or service with which the
    * secret key is associated, defaults to ''
    */
  var issuer: js.UndefOr[String] = js.native
  /**
    * Length of the secret, defaults to 32
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * The name to use with Google Authenticator, deaults to 'SecretKey'
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Whether to output a Google Authenticator-compatible otpauth:// URL
    * (only returns otpauth:// URL, no QR code), defaults to false
    */
  var otpauth_url: js.UndefOr[Boolean] = js.native
  /**
    * Output QR code URLs for the token.
    *
    * @deprecated use your own QR code implementation to prevent
    *   leaking of secret to a third party.
    */
  var qr_codes: js.UndefOr[Boolean] = js.native
  /**
    * Whether to include symbols, defaults to false
    */
  var symbols: js.UndefOr[Boolean] = js.native
}

object GenerateSecretOptions {
  @scala.inline
  def apply(): GenerateSecretOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateSecretOptions]
  }
  @scala.inline
  implicit class GenerateSecretOptionsOps[Self <: GenerateSecretOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGoogle_auth_qr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("google_auth_qr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogle_auth_qr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("google_auth_qr")(js.undefined)
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
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOtpauth_url(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otpauth_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtpauth_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otpauth_url")(js.undefined)
        ret
    }
    @scala.inline
    def withQr_codes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qr_codes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQr_codes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qr_codes")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbols(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbols")(js.undefined)
        ret
    }
  }
  
}

