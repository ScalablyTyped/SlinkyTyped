package typingsSlinky.speakeasy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateSecretOptions extends StObject {
  
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
  implicit class GenerateSecretOptionsMutableBuilder[Self <: GenerateSecretOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGoogle_auth_qr(value: Boolean): Self = StObject.set(x, "google_auth_qr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogle_auth_qrUndefined: Self = StObject.set(x, "google_auth_qr", js.undefined)
    
    @scala.inline
    def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOtpauth_url(value: Boolean): Self = StObject.set(x, "otpauth_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtpauth_urlUndefined: Self = StObject.set(x, "otpauth_url", js.undefined)
    
    @scala.inline
    def setQr_codes(value: Boolean): Self = StObject.set(x, "qr_codes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQr_codesUndefined: Self = StObject.set(x, "qr_codes", js.undefined)
    
    @scala.inline
    def setSymbols(value: Boolean): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
  }
}
