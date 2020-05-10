package typingsSlinky.speakeasy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneratedSecret extends js.Object {
  /**
    * ASCII representation of the secret
    */
  var ascii: String = js.native
  /**
    * Base32 representation of the secret
    */
  var base32: String = js.native
  /**
    * URL for the Google Authenticator otpauth
    * URL's QR code.
    *
    * @deprecated use a separate QR code library
    */
  var google_auth_qr: String = js.native
  /**
    * Hex representation of the secret
    */
  var hex: String = js.native
  /**
    * Google Authenticator-compatible otpauth URL.
    */
  var otpauth_url: js.UndefOr[String] = js.native
  /**
    * URL for the QR code for the ASCII secret.
    *
    * @deprecated use a separate QR code library
    */
  var qr_code_ascii: js.UndefOr[String] = js.native
  /**
    * URL for the QR code for the base32 secret.
    *
    * @deprecated use a separate QR code library
    */
  var qr_code_base32: js.UndefOr[String] = js.native
  /**
    * URL for the QR code for the hex secret.
    *
    * @deprecated use a separate QR code library
    */
  var qr_code_hex: js.UndefOr[String] = js.native
}

object GeneratedSecret {
  @scala.inline
  def apply(ascii: String, base32: String, google_auth_qr: String, hex: String): GeneratedSecret = {
    val __obj = js.Dynamic.literal(ascii = ascii.asInstanceOf[js.Any], base32 = base32.asInstanceOf[js.Any], google_auth_qr = google_auth_qr.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratedSecret]
  }
  @scala.inline
  implicit class GeneratedSecretOps[Self <: GeneratedSecret] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAscii(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascii")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase32(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoogle_auth_qr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("google_auth_qr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOtpauth_url(value: String): Self = {
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
    def withQr_code_ascii(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qr_code_ascii")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQr_code_ascii: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qr_code_ascii")(js.undefined)
        ret
    }
    @scala.inline
    def withQr_code_base32(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qr_code_base32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQr_code_base32: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qr_code_base32")(js.undefined)
        ret
    }
    @scala.inline
    def withQr_code_hex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qr_code_hex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQr_code_hex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qr_code_hex")(js.undefined)
        ret
    }
  }
  
}

