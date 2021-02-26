package typingsSlinky.socketclusterClient.clientsocketMod

import typingsSlinky.socketclusterClient.authMod.AuthToken
import typingsSlinky.socketclusterClient.authMod.SignedAuthToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticateData extends StObject {
  
  var authToken: AuthToken = js.native
  
  var signedAuthToken: SignedAuthToken = js.native
}
object AuthenticateData {
  
  @scala.inline
  def apply(authToken: AuthToken, signedAuthToken: SignedAuthToken): AuthenticateData = {
    val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], signedAuthToken = signedAuthToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateData]
  }
  
  @scala.inline
  implicit class AuthenticateDataMutableBuilder[Self <: AuthenticateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthToken(value: AuthToken): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedAuthToken(value: SignedAuthToken): Self = StObject.set(x, "signedAuthToken", value.asInstanceOf[js.Any])
  }
}
