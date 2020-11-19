package typingsSlinky.winrt.Windows.Devices.Enumeration

import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceInformationUpdate extends IDeviceInformationUpdate
object DeviceInformationUpdate {
  
  @scala.inline
  def apply(id: String, properties: IMapView[String, _]): DeviceInformationUpdate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceInformationUpdate]
  }
}
