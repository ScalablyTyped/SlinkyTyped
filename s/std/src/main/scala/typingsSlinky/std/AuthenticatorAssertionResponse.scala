package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticatorAssertionResponse extends AuthenticatorResponse {
  val authenticatorData: js.typedarray.ArrayBuffer
  val signature: js.typedarray.ArrayBuffer
  val userHandle: js.typedarray.ArrayBuffer | Null
}

object AuthenticatorAssertionResponse {
  @scala.inline
  def apply(
    authenticatorData: js.typedarray.ArrayBuffer,
    clientDataJSON: js.typedarray.ArrayBuffer,
    signature: js.typedarray.ArrayBuffer,
    userHandle: js.typedarray.ArrayBuffer = null
  ): AuthenticatorAssertionResponse = {
    val __obj = js.Dynamic.literal(authenticatorData = authenticatorData.asInstanceOf[js.Any], clientDataJSON = clientDataJSON.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], userHandle = userHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticatorAssertionResponse]
  }
}

