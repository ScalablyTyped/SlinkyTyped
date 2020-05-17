package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebAuthnAssertion extends js.Object {
  val authenticatorData: js.typedarray.ArrayBuffer = js.native
  val clientData: js.typedarray.ArrayBuffer = js.native
  val credential: ScopedCredential = js.native
  val signature: js.typedarray.ArrayBuffer = js.native
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
  @scala.inline
  implicit class WebAuthnAssertionOps[Self <: WebAuthnAssertion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticatorData(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticatorData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientData(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCredential(value: ScopedCredential): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignature(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

