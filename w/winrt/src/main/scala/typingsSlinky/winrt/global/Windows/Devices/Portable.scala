package typingsSlinky.winrt.global.Windows.Devices

import typingsSlinky.winrt.Windows.Devices.Portable.ServiceDeviceType
import typingsSlinky.winrt.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Devices.Portable")
@js.native
object Portable extends js.Object {
  
  @js.native
  class ServiceDevice ()
    extends typingsSlinky.winrt.Windows.Devices.Portable.ServiceDevice
  /* static members */
  @js.native
  object ServiceDevice extends js.Object {
    
    def getDeviceSelector(serviceType: ServiceDeviceType): String = js.native
    
    def getDeviceSelectorFromServiceId(serviceId: String): String = js.native
  }
  
  @js.native
  object ServiceDeviceType extends js.Object {
    
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
  
  @js.native
  class StorageDevice ()
    extends typingsSlinky.winrt.Windows.Devices.Portable.StorageDevice
  /* static members */
  @js.native
  object StorageDevice extends js.Object {
    
    def fromId(interfaceId: String): StorageFolder = js.native
    
    def getDeviceSelector(): String = js.native
  }
}
