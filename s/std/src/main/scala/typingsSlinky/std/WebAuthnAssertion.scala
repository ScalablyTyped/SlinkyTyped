package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAuthnAssertion extends js.Object {
  val authenticatorData: js.typedarray.ArrayBuffer
  val clientData: js.typedarray.ArrayBuffer
  val credential: ScopedCredential
  val signature: js.typedarray.ArrayBuffer
}

object WebAuthnAssertion {
  @scala.inline
  def apply(
    authenticatorData: js.typedarray.ArrayBuffer,
    clientData: js.typedarray.ArrayBuffer,
    credential: ScopedCredential,
    signature: js.typedarray.ArrayBuffer
  ): WebAuthnAssertion = {
    val __obj = js.Dynamic.literal(authenticatorData = authenticatorData.asInstanceOf[js.Any], clientData = clientData.asInstanceOf[js.Any], credential = credential.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAuthnAssertion]
  }
}

