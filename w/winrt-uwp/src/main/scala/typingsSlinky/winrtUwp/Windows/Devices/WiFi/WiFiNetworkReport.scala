package typingsSlinky.winrtUwp.Windows.Devices.WiFi

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the result of a network scan operation. */
@js.native
trait WiFiNetworkReport extends StObject {
  
  /** A list of available networks. */
  var availableNetworks: IVectorView[WiFiAvailableNetwork] = js.native
  
  /** Contains the result of a network scan operation. */
  var timestamp: js.Date = js.native
}
object WiFiNetworkReport {
  
  @scala.inline
  def apply(availableNetworks: IVectorView[WiFiAvailableNetwork], timestamp: js.Date): WiFiNetworkReport = {
    val __obj = js.Dynamic.literal(availableNetworks = availableNetworks.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiNetworkReport]
  }
  
  @scala.inline
  implicit class WiFiNetworkReportMutableBuilder[Self <: WiFiNetworkReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableNetworks(value: IVectorView[WiFiAvailableNetwork]): Self = StObject.set(x, "availableNetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
