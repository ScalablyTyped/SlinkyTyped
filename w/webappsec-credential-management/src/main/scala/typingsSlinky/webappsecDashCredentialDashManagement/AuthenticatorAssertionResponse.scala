package typingsSlinky.webappsecDashCredentialDashManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#iface-authenticatorassertionresponse}
  */
trait AuthenticatorAssertionResponse extends AuthenticatorResponse {
  val authenticatorData: scala.scalajs.js.typedarray.ArrayBuffer
  val signature: scala.scalajs.js.typedarray.ArrayBuffer
  val userHandle: scala.scalajs.js.typedarray.ArrayBuffer | Null
}

object AuthenticatorAssertionResponse {
  @scala.inline
  def apply(
    authenticatorData: scala.scalajs.js.typedarray.ArrayBuffer,
    clientDataJSON: scala.scalajs.js.typedarray.ArrayBuffer,
    signature: scala.scalajs.js.typedarray.ArrayBuffer,
    userHandle: scala.scalajs.js.typedarray.ArrayBuffer = null
  ): AuthenticatorAssertionResponse = {
    val __obj = js.Dynamic.literal(authenticatorData = authenticatorData.asInstanceOf[js.Any], clientDataJSON = clientDataJSON.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    if (userHandle != null) __obj.updateDynamic("userHandle")(userHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticatorAssertionResponse]
  }
}

