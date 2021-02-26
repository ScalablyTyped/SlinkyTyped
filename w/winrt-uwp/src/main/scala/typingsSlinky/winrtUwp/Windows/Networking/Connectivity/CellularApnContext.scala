package typingsSlinky.winrtUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This class contains properties used to specify an Access Point Name (APN) for a 3GPP based cellular Data Connection (PDP context). A CellularApnContext object is passed with a AcquireConnectionAsync call to establish a connection to a specific access point. */
@js.native
trait CellularApnContext extends StObject {
  
  /** Indicates the name of the access point to establish a connection with. */
  var accessPointName: String = js.native
  
  /** Indicates the authentication method, as defined by CellularApnAuthenticationType , that is used by the access point. */
  var authenticationType: CellularApnAuthenticationType = js.native
  
  /** Indicates if data compression will be used at the data link for header and data transfer. */
  var isCompressionEnabled: Boolean = js.native
  
  /** Indicates the password used to authenticate when connecting to the access point. */
  var password: String = js.native
  
  /** Indicates the provider ID associated with the access point. */
  var providerId: String = js.native
  
  /** Indicates the user name used to authenticate when connecting to the access point. */
  var userName: String = js.native
}
object CellularApnContext {
  
  @scala.inline
  def apply(
    accessPointName: String,
    authenticationType: CellularApnAuthenticationType,
    isCompressionEnabled: Boolean,
    password: String,
    providerId: String,
    userName: String
  ): CellularApnContext = {
    val __obj = js.Dynamic.literal(accessPointName = accessPointName.asInstanceOf[js.Any], authenticationType = authenticationType.asInstanceOf[js.Any], isCompressionEnabled = isCompressionEnabled.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], providerId = providerId.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellularApnContext]
  }
  
  @scala.inline
  implicit class CellularApnContextMutableBuilder[Self <: CellularApnContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessPointName(value: String): Self = StObject.set(x, "accessPointName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationType(value: CellularApnAuthenticationType): Self = StObject.set(x, "authenticationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCompressionEnabled(value: Boolean): Self = StObject.set(x, "isCompressionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
  }
}
