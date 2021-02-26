package typingsSlinky.winrtUwp.Windows.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Windows Store apps use background tasks to perform long-running syncs with devices and update device settings and firmware. The classes in Windows.Devices.Background are used by device background tasks to get info provided by the app that triggered the task and to report progress back to the app. */
object Background {
  
  /** Used to provide the DeviceInformation.ID , expected duration, and arguments given by the app that triggered the background servicing task. */
  @js.native
  trait DeviceServicingDetails extends StObject {
    
    /** Gets the arguments string provided by the app when it called RequestAsync on the DeviceServicingTrigger . This allows the app to easily pass parameters to the task when it invokes it. */
    var arguments: String = js.native
    
    /** Gets the DeviceInformation.ID of the device the task is targeting. The background task can provide this to the FromIdAsync method of the appropriate device access class to open the device. For example, call UsbDevice.FromIdAsync in the Windows.Devices.Usb namespace to open a USB device. */
    var deviceId: String = js.native
    
    /** Gets the estimated duration provided by the app when it called RequestAsync on the DeviceServicingTrigger . */
    var expectedDuration: Double = js.native
  }
  object DeviceServicingDetails {
    
    @scala.inline
    def apply(arguments: String, deviceId: String, expectedDuration: Double): DeviceServicingDetails = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], expectedDuration = expectedDuration.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceServicingDetails]
    }
    
    @scala.inline
    implicit class DeviceServicingDetailsMutableBuilder[Self <: DeviceServicingDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArguments(value: String): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpectedDuration(value: Double): Self = StObject.set(x, "expectedDuration", value.asInstanceOf[js.Any])
    }
  }
  
  /** Used to provide the DeviceInformation.ID and arguments given by the app that triggered the background sync task. */
  @js.native
  trait DeviceUseDetails extends StObject {
    
    /** Gets the arguments string provided by the app when it called RequestAsync on the DeviceUseTrigger . This allows the app to easily pass parameters to the task when it invokes it. */
    var arguments: String = js.native
    
    /** Gets the DeviceInformation.ID of the device the task is targeting. The background task can provide this to the FromIdAsync method of the appropriate device access class to open the device. For example, call UsbDevice.FromIdAsync in the Windows.Devices.Usb namespace to open a USB device. */
    var deviceId: String = js.native
  }
  object DeviceUseDetails {
    
    @scala.inline
    def apply(arguments: String, deviceId: String): DeviceUseDetails = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceUseDetails]
    }
    
    @scala.inline
    implicit class DeviceUseDetailsMutableBuilder[Self <: DeviceUseDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArguments(value: String): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    }
  }
}
