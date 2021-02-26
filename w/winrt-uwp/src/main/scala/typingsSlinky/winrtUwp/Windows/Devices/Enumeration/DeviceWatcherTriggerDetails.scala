package typingsSlinky.winrtUwp.Windows.Devices.Enumeration

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides details about the device updates that invoked the trigger. */
@js.native
trait DeviceWatcherTriggerDetails extends StObject {
  
  /** Gets the events that activated the trigger. */
  var deviceWatcherEvents: IVectorView[DeviceWatcherEvent] = js.native
}
object DeviceWatcherTriggerDetails {
  
  @scala.inline
  def apply(deviceWatcherEvents: IVectorView[DeviceWatcherEvent]): DeviceWatcherTriggerDetails = {
    val __obj = js.Dynamic.literal(deviceWatcherEvents = deviceWatcherEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceWatcherTriggerDetails]
  }
  
  @scala.inline
  implicit class DeviceWatcherTriggerDetailsMutableBuilder[Self <: DeviceWatcherTriggerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceWatcherEvents(value: IVectorView[DeviceWatcherEvent]): Self = StObject.set(x, "deviceWatcherEvents", value.asInstanceOf[js.Any])
  }
}
