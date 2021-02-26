package typingsSlinky.winrt.Windows.Networking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEndpointPair extends StObject {
  
  var localHostName: HostName = js.native
  
  var localServiceName: String = js.native
  
  var remoteHostName: HostName = js.native
  
  var remoteServiceName: String = js.native
}
object IEndpointPair {
  
  @scala.inline
  def apply(
    localHostName: HostName,
    localServiceName: String,
    remoteHostName: HostName,
    remoteServiceName: String
  ): IEndpointPair = {
    val __obj = js.Dynamic.literal(localHostName = localHostName.asInstanceOf[js.Any], localServiceName = localServiceName.asInstanceOf[js.Any], remoteHostName = remoteHostName.asInstanceOf[js.Any], remoteServiceName = remoteServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEndpointPair]
  }
  
  @scala.inline
  implicit class IEndpointPairMutableBuilder[Self <: IEndpointPair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalHostName(value: HostName): Self = StObject.set(x, "localHostName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalServiceName(value: String): Self = StObject.set(x, "localServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteHostName(value: HostName): Self = StObject.set(x, "remoteHostName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteServiceName(value: String): Self = StObject.set(x, "remoteServiceName", value.asInstanceOf[js.Any])
  }
}
