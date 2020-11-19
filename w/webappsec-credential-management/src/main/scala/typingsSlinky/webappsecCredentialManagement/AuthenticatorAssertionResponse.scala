package typingsSlinky.webappsecCredentialManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://w3c.github.io/webauthn/#iface-authenticatorassertionresponse}
  */
@js.native
trait AuthenticatorAssertionResponse extends AuthenticatorResponse {
  
  val authenticatorData: js.typedarray.ArrayBuffer = js.native
  
  val signature: js.typedarray.ArrayBuffer = js.native
  
  val userHandle: js.typedarray.ArrayBuffer | Null = js.native
}
object AuthenticatorAssertionResponse {
  
  @scala.inline
  def apply(
    authenticatorData: js.typedarray.ArrayBuffer,
    clientDataJSON: js.typedarray.ArrayBuffer,
    signature: js.typedarray.ArrayBuffer
  ): AuthenticatorAssertionResponse = {
    val __obj = js.Dynamic.literal(authenticatorData = authenticatorData.asInstanceOf[js.Any], clientDataJSON = clientDataJSON.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticatorAssertionResponse]
  }
  
  @scala.inline
  implicit class AuthenticatorAssertionResponseOps[Self <: AuthenticatorAssertionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthenticatorData(value: js.typedarray.ArrayBuffer): Self = this.set("authenticatorData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: js.typedarray.ArrayBuffer): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserHandle(value: js.typedarray.ArrayBuffer): Self = this.set("userHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserHandleNull: Self = this.set("userHandle", null)
  }
}
