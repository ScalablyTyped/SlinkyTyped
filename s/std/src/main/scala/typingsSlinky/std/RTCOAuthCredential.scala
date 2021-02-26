package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCOAuthCredential extends StObject {
  
  var accessToken: java.lang.String = js.native
  
  var macKey: java.lang.String = js.native
}
object RTCOAuthCredential {
  
  @scala.inline
  def apply(accessToken: java.lang.String, macKey: java.lang.String): RTCOAuthCredential = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], macKey = macKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCOAuthCredential]
  }
  
  @scala.inline
  implicit class RTCOAuthCredentialMutableBuilder[Self <: RTCOAuthCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: java.lang.String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacKey(value: java.lang.String): Self = StObject.set(x, "macKey", value.asInstanceOf[js.Any])
  }
}
