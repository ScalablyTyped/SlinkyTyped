package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticatorAttestationResponse extends AuthenticatorResponse {
  val attestationObject: js.typedarray.ArrayBuffer
}

object AuthenticatorAttestationResponse {
  @scala.inline
  def apply(attestationObject: js.typedarray.ArrayBuffer, clientDataJSON: js.typedarray.ArrayBuffer): AuthenticatorAttestationResponse = {
    val __obj = js.Dynamic.literal(attestationObject = attestationObject.asInstanceOf[js.Any], clientDataJSON = clientDataJSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticatorAttestationResponse]
  }
}

