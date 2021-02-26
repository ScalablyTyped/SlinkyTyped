package typingsSlinky.winrtUwp.Windows.Devices.Enumeration

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains updated properties for a DeviceInformation object. */
@js.native
trait DeviceInformationUpdate extends StObject {
  
  /** The DeviceInformation ID of the updated device. */
  var id: String = js.native
  
  /** Gets the type of device for the updated device. */
  var kind: DeviceInformationKind = js.native
  
  /** The changed properties in a update to a DeviceInformation object. */
  var properties: IMapView[String, _] = js.native
}
object DeviceInformationUpdate {
  
  @scala.inline
  def apply(id: String, kind: DeviceInformationKind, properties: IMapView[String, _]): DeviceInformationUpdate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceInformationUpdate]
  }
  
  @scala.inline
  implicit class DeviceInformationUpdateMutableBuilder[Self <: DeviceInformationUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: DeviceInformationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: IMapView[String, _]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
