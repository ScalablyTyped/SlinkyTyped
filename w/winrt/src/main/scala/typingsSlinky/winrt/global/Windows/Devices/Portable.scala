package typingsSlinky.winrt.global.Windows.Devices

import typingsSlinky.winrt.Windows.Devices.Portable.ServiceDeviceType
import typingsSlinky.winrt.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Portable {
  
  @JSGlobal("Windows.Devices.Portable.ServiceDevice")
  @js.native
  class ServiceDevice ()
    extends typingsSlinky.winrt.Windows.Devices.Portable.ServiceDevice
  /* static members */
  object ServiceDevice {
    
    @JSGlobal("Windows.Devices.Portable.ServiceDevice.getDeviceSelector")
    @js.native
    def getDeviceSelector(serviceType: ServiceDeviceType): String = js.native
    
    @JSGlobal("Windows.Devices.Portable.ServiceDevice.getDeviceSelectorFromServiceId")
    @js.native
    def getDeviceSelectorFromServiceId(serviceId: String): String = js.native
  }
  
  @JSGlobal("Windows.Devices.Portable.ServiceDeviceType")
  @js.native
  object ServiceDeviceType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Devices.Portable.ServiceDeviceType with Double] = js.native
    
    /* 0 */ val calendarService: typingsSlinky.winrt.Windows.Devices.Portable.ServiceDeviceType.calendarService with Double = js.native
    
    /* 1 */ val contactsService: typingsSlinky.winrt.Windows.Devices.Portable.ServiceDeviceType.contactsService with Double = js.native
    
    /* 2 */ val deviceStatusService: typingsSlinky.winrt.Windows.Devices.Portable.ServiceDeviceType.deviceStatusService with Double = js.native
    
    /* 3 */ val notesService: typingsSlinky.winrt.Windows.Devices.Portable.ServiceDeviceType.notesService with Double = js.native
    
    /* 4 */ val ringtonesService: typingsSlinky.winrt.Windows.Devices.Portable.ServiceDeviceType.ringtonesService with Double = js.native
    
    /* 5 */ val smsService: typingsSlinky.winrt.Windows.Devices.Portable.ServiceDeviceType.smsService with Double = js.native
    
    /* 6 */ val tasksService: typingsSlinky.winrt.Windows.Devices.Portable.ServiceDeviceType.tasksService with Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Portable.StorageDevice")
  @js.native
  class StorageDevice ()
    extends typingsSlinky.winrt.Windows.Devices.Portable.StorageDevice
  /* static members */
  object StorageDevice {
    
    @JSGlobal("Windows.Devices.Portable.StorageDevice.fromId")
    @js.native
    def fromId(interfaceId: String): StorageFolder = js.native
    
    @JSGlobal("Windows.Devices.Portable.StorageDevice.getDeviceSelector")
    @js.native
    def getDeviceSelector(): String = js.native
  }
}
