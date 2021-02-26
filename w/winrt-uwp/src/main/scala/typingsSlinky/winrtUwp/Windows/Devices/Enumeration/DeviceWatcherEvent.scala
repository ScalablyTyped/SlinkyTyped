package typingsSlinky.winrtUwp.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Triggered when the list of devices is updated after the initial enumeration is complete. */
@js.native
trait DeviceWatcherEvent extends StObject {
  
  /** Gets the information for the device associated with the DeviceWatcherEvent . */
  var deviceInformation: DeviceInformation = js.native
  
  /** Gets updated information for a device updated by the DeviceWatcherEvent . */
  var deviceInformationUpdate: DeviceInformationUpdate = js.native
  
  /** Gets the type for the device indicated by the DeviceWatcherEvent . */
  var kind: DeviceWatcherEventKind = js.native
}
object DeviceWatcherEvent {
  
  @scala.inline
  def apply(
    deviceInformation: DeviceInformation,
    deviceInformationUpdate: DeviceInformationUpdate,
    kind: DeviceWatcherEventKind
  ): DeviceWatcherEvent = {
    val __obj = js.Dynamic.literal(deviceInformation = deviceInformation.asInstanceOf[js.Any], deviceInformationUpdate = deviceInformationUpdate.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceWatcherEvent]
  }
  
  @scala.inline
  implicit class DeviceWatcherEventMutableBuilder[Self <: DeviceWatcherEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceInformation(value: DeviceInformation): Self = StObject.set(x, "deviceInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceInformationUpdate(value: DeviceInformationUpdate): Self = StObject.set(x, "deviceInformationUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: DeviceWatcherEventKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
