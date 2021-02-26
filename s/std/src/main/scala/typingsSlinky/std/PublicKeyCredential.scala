package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKeyCredential extends Credential {
  
  def getClientExtensionResults(): AuthenticationExtensionsClientOutputs = js.native
  
  val rawId: js.typedarray.ArrayBuffer = js.native
  
  val response: AuthenticatorResponse = js.native
}
object PublicKeyCredential {
  
  @scala.inline
  def apply(
    getClientExtensionResults: () => AuthenticationExtensionsClientOutputs,
    id: java.lang.String,
    rawId: js.typedarray.ArrayBuffer,
    response: AuthenticatorResponse,
    `type`: java.lang.String
  ): PublicKeyCredential = {
    val __obj = js.Dynamic.literal(getClientExtensionResults = js.Any.fromFunction0(getClientExtensionResults), id = id.asInstanceOf[js.Any], rawId = rawId.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredential]
  }
  
  @scala.inline
  implicit class PublicKeyCredentialMutableBuilder[Self <: PublicKeyCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetClientExtensionResults(value: () => AuthenticationExtensionsClientOutputs): Self = StObject.set(x, "getClientExtensionResults", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRawId(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "rawId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: AuthenticatorResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
