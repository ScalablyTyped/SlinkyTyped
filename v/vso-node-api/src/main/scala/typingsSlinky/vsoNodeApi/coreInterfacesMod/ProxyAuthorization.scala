package typingsSlinky.vsoNodeApi.coreInterfacesMod

import typingsSlinky.vsoNodeApi.identitiesInterfacesMod.IdentityDescriptor
import typingsSlinky.vsoNodeApi.vssinterfacesMod.PublicKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyAuthorization extends StObject {
  
  /**
    * Gets or sets the endpoint used to obtain access tokens from the configured token service.
    */
  var authorizationUrl: String = js.native
  
  /**
    * Gets or sets the client identifier for this proxy.
    */
  var clientId: String = js.native
  
  /**
    * Gets or sets the user identity to authorize for on-prem.
    */
  var identity: IdentityDescriptor = js.native
  
  /**
    * Gets or sets the public key used to verify the identity of this proxy. Only specify on hosted.
    */
  var publicKey: PublicKey = js.native
}
object ProxyAuthorization {
  
  @scala.inline
  def apply(authorizationUrl: String, clientId: String, identity: IdentityDescriptor, publicKey: PublicKey): ProxyAuthorization = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyAuthorization]
  }
  
  @scala.inline
  implicit class ProxyAuthorizationMutableBuilder[Self <: ProxyAuthorization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationUrl(value: String): Self = StObject.set(x, "authorizationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentity(value: IdentityDescriptor): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKey(value: PublicKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
