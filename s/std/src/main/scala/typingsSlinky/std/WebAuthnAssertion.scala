package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAuthnAssertion extends StObject {
  
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
  implicit class WebAuthnAssertionMutableBuilder[Self <: WebAuthnAssertion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticatorData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "authenticatorData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "clientData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredential(value: ScopedCredential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
