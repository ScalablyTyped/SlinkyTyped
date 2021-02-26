package typingsSlinky.webappsecCredentialManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://w3c.github.io/webauthn/#authenticatorresponse}
  */
@js.native
trait AuthenticatorResponse extends StObject {
  
  val clientDataJSON: js.typedarray.ArrayBuffer = js.native
}
object AuthenticatorResponse {
  
  @scala.inline
  def apply(clientDataJSON: js.typedarray.ArrayBuffer): AuthenticatorResponse = {
    val __obj = js.Dynamic.literal(clientDataJSON = clientDataJSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticatorResponse]
  }
  
  @scala.inline
  implicit class AuthenticatorResponseMutableBuilder[Self <: AuthenticatorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientDataJSON(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "clientDataJSON", value.asInstanceOf[js.Any])
  }
}
