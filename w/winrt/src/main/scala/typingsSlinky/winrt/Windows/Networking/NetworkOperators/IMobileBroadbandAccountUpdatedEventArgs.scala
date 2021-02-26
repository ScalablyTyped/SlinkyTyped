package typingsSlinky.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMobileBroadbandAccountUpdatedEventArgs extends StObject {
  
  var hasDeviceInformationChanged: Boolean = js.native
  
  var hasNetworkChanged: Boolean = js.native
  
  var networkAccountId: String = js.native
}
object IMobileBroadbandAccountUpdatedEventArgs {
  
  @scala.inline
  def apply(hasDeviceInformationChanged: Boolean, hasNetworkChanged: Boolean, networkAccountId: String): IMobileBroadbandAccountUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(hasDeviceInformationChanged = hasDeviceInformationChanged.asInstanceOf[js.Any], hasNetworkChanged = hasNetworkChanged.asInstanceOf[js.Any], networkAccountId = networkAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMobileBroadbandAccountUpdatedEventArgs]
  }
  
  @scala.inline
  implicit class IMobileBroadbandAccountUpdatedEventArgsMutableBuilder[Self <: IMobileBroadbandAccountUpdatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasDeviceInformationChanged(value: Boolean): Self = StObject.set(x, "hasDeviceInformationChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasNetworkChanged(value: Boolean): Self = StObject.set(x, "hasNetworkChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkAccountId(value: String): Self = StObject.set(x, "networkAccountId", value.asInstanceOf[js.Any])
  }
}
