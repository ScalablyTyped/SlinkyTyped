package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CMsgClientLogonResponse extends StObject {
  
  /**
    * The logon was successful if equal to EResult.OK
    */
  var eresult: EResult = js.native
  
  /**
    * "loginkey" to be used with WebAPI's AuthenticateUser."
    */
  var webapi_authenticate_user_nonce: String = js.native
}
object CMsgClientLogonResponse {
  
  @scala.inline
  def apply(eresult: EResult, webapi_authenticate_user_nonce: String): CMsgClientLogonResponse = {
    val __obj = js.Dynamic.literal(eresult = eresult.asInstanceOf[js.Any], webapi_authenticate_user_nonce = webapi_authenticate_user_nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMsgClientLogonResponse]
  }
  
  @scala.inline
  implicit class CMsgClientLogonResponseMutableBuilder[Self <: CMsgClientLogonResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEresult(value: EResult): Self = StObject.set(x, "eresult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebapi_authenticate_user_nonce(value: String): Self = StObject.set(x, "webapi_authenticate_user_nonce", value.asInstanceOf[js.Any])
  }
}
