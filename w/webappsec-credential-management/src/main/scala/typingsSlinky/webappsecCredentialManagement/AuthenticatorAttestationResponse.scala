package typingsSlinky.webappsecCredentialManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#authenticatorattestationresponse}
  */
@js.native
trait AuthenticatorAttestationResponse extends AuthenticatorResponse {
  val attestationObject: js.typedarray.ArrayBuffer = js.native
}

object AuthenticatorAttestationResponse {
  @scala.inline
  def apply(attestationObject: js.typedarray.ArrayBuffer, clientDataJSON: js.typedarray.ArrayBuffer): AuthenticatorAttestationResponse = {
    val __obj = js.Dynamic.literal(attestationObject = attestationObject.asInstanceOf[js.Any], clientDataJSON = clientDataJSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticatorAttestationResponse]
  }
  @scala.inline
  implicit class AuthenticatorAttestationResponseOps[Self <: AuthenticatorAttestationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttestationObject(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attestationObject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

