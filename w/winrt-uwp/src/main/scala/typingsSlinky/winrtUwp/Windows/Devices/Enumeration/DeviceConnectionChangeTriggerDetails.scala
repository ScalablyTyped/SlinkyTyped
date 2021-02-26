package typingsSlinky.winrtUwp.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the device that caused this trigger to fire. */
@js.native
trait DeviceConnectionChangeTriggerDetails extends StObject {
  
  /** Gets the device Id of the device that caused this trigger to fire. */
  var deviceId: String = js.native
}
object DeviceConnectionChangeTriggerDetails {
  
  @scala.inline
  def apply(deviceId: String): DeviceConnectionChangeTriggerDetails = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceConnectionChangeTriggerDetails]
  }
  
  @scala.inline
  implicit class DeviceConnectionChangeTriggerDetailsMutableBuilder[Self <: DeviceConnectionChangeTriggerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
  }
}
