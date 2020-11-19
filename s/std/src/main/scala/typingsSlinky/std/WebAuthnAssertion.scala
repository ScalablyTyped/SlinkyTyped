package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthenticatorData(value: js.typedarray.ArrayBuffer): Self = this.set("authenticatorData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientData(value: js.typedarray.ArrayBuffer): Self = this.set("clientData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredential(value: ScopedCredential): Self = this.set("credential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: js.typedarray.ArrayBuffer): Self = this.set("signature", value.asInstanceOf[js.Any])
  }
}
