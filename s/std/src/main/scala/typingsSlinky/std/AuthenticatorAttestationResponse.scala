package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class AuthenticatorAttestationResponseMutableBuilder[Self <: AuthenticatorAttestationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttestationObject(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "attestationObject", value.asInstanceOf[js.Any])
  }
}
