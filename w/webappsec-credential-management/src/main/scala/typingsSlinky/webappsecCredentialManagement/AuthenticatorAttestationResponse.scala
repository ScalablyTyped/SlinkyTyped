package typingsSlinky.webappsecCredentialManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#authenticatorattestationresponse}
  */
trait AuthenticatorAttestationResponse extends AuthenticatorResponse {
  val attestationObject: scala.scalajs.js.typedarray.ArrayBuffer
}

object AuthenticatorAttestationResponse {
  @scala.inline
  def apply(
    attestationObject: scala.scalajs.js.typedarray.ArrayBuffer,
    clientDataJSON: scala.scalajs.js.typedarray.ArrayBuffer
  ): AuthenticatorAttestationResponse = {
    val __obj = js.Dynamic.literal(attestationObject = attestationObject.asInstanceOf[js.Any], clientDataJSON = clientDataJSON.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthenticatorAttestationResponse]
  }
}

