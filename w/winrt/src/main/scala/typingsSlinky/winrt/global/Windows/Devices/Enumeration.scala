package typingsSlinky.winrt.global.Windows.Devices

import typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceClass
import typingsSlinky.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectType
import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Devices.Enumeration")
@js.native
object Enumeration extends js.Object {
  
  @js.native
  object DeviceClass extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceClass with Double] = js.native
    
    /* 0 */ val all: typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceClass.all with Double = js.native
    
    /* 1 */ val audioCapture: typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceClass.audioCapture with Double = js.native
    
    /* 2 */ val audioRender: typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceClass.audioRender with Double = js.native
    
    /* 3 */ val portableStorageDevice: typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceClass.portableStorageDevice with Double = js.native
    
    /* 4 */ val videoCapture: typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceClass.videoCapture with Double = js.native
  }
  
  @js.native
  class DeviceInformation ()
    extends typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceInformation
  /* static members */
  @js.native
  object DeviceInformation extends js.Object {
    
    def createFromIdAsync(id: String): IAsyncOperation[typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceInformation] = js.native
    def createFromIdAsync(id: String, additionalProperties: IIterable[String]): IAsyncOperation[typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceInformation] = js.native
    
    def createWatcher(): typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceWatcher = js.native
    def createWatcher(aqsFilter: String): typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceWatcher = js.native
    def createWatcher(aqsFilter: String, additionalProperties: IIterable[String]): typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceWatcher = js.native
    def createWatcher(deviceClass: DeviceClass): typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceWatcher = js.native
    
    def findAllAsync(): IAsyncOperation[typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceInformationCollection] = js.native
    def findAllAsync(aqsFilter: String): IAsyncOperation[typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceInformationCollection] = js.native
    def findAllAsync(aqsFilter: String, additionalProperties: IIterable[String]): IAsyncOperation[typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceInformationCollection] = js.native
    def findAllAsync(deviceClass: DeviceClass): IAsyncOperation[typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceInformationCollection] = js.native
  }
  
  @js.native
  class DeviceInformationCollection ()
    extends typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceInformationCollection
  
  @js.native
  class DeviceInformationUpdate ()
    extends typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceInformationUpdate
  
  @js.native
  class DeviceThumbnail ()
    extends typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceThumbnail
  
  @js.native
  class DeviceWatcher ()
    extends typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceWatcher
  
  @js.native
  object DeviceWatcherStatus extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus with Double] = js.native
    
    /* 5 */ val aborted: typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.aborted with Double = js.native
    
    /* 0 */ val created: typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.created with Double = js.native
    
    /* 2 */ val enumerationCompleted: typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.enumerationCompleted with Double = js.native
    
    /* 1 */ val started: typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.started with Double = js.native
    
    /* 4 */ val stopped: typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.stopped with Double = js.native
    
    /* 3 */ val stopping: typingsSlinky.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.stopping with Double = js.native
  }
  
  @js.native
  class EnclosureLocation ()
    extends typingsSlinky.winrt.Windows.Devices.Enumeration.EnclosureLocation
  
  @js.native
  object Panel extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Devices.Enumeration.Panel with Double] = js.native
    
    /* 2 */ val back: typingsSlinky.winrt.Windows.Devices.Enumeration.Panel.back with Double = js.native
    
    /* 4 */ val bottom: typingsSlinky.winrt.Windows.Devices.Enumeration.Panel.bottom with Double = js.native
    
    /* 1 */ val front: typingsSlinky.winrt.Windows.Devices.Enumeration.Panel.front with Double = js.native
    
    /* 5 */ val left: typingsSlinky.winrt.Windows.Devices.Enumeration.Panel.left with Double = js.native
    
    /* 6 */ val right: typingsSlinky.winrt.Windows.Devices.Enumeration.Panel.right with Double = js.native
    
    /* 3 */ val top: typingsSlinky.winrt.Windows.Devices.Enumeration.Panel.top with Double = js.native
    
    /* 0 */ val unknown: typingsSlinky.winrt.Windows.Devices.Enumeration.Panel.unknown with Double = js.native
  }
  
  @js.native
  object Pnp extends js.Object {
    
    @js.native
    class PnpObject ()
      extends typingsSlinky.winrt.Windows.Devices.Enumeration.Pnp.PnpObject
    /* static members */
    @js.native
    object PnpObject extends js.Object {
      
      def createFromIdAsync(`type`: PnpObjectType, id: String, requestedProperties: IIterable[String]): IAsyncOperation[typingsSlinky.winrt.Windows.Devices.Enumeration.Pnp.PnpObject] = js.native
      
      def createWatcher(`type`: PnpObjectType, requestedProperties: IIterable[String]): typingsSlinky.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectWatcher = js.native
      def createWatcher(`type`: PnpObjectType, requestedProperties: IIterable[String], aqsFilter: String): typingsSlinky.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectWatcher = js.native
      
      def findAllAsync(`type`: PnpObjectType, requestedProperties: IIterable[String]): IAsyncOperation[typingsSlinky.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectCollection] = js.native
      def findAllAsync(`type`: PnpObjectType, requestedProperties: IIterable[String], aqsFilter: String): IAsyncOperation[typingsSlinky.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectCollection] = js.native
    }
    
    @js.native
    class PnpObjectCollection ()
      extends typingsSlinky.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectCollection
    
    @js.native
    object PnpObjectType extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectType with Double] = js.native
      
      /* 3 */ val device: typingsSlinky.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectType.device with Double = js.native
      
      /* 2 */ val deviceContainer: typingsSlinky.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectType.deviceContainer with Double = js.native
      
      /* 1 */ val deviceInterface: typingsSlinky.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectType.deviceInterface with Double = js.native
      
      /* 4 */ val deviceInterfaceClass: typingsSlinky.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectType.deviceInterfaceClass with Double = js.native
      
      /* 0 */ val unknown: typingsSlinky.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectType.unknown with Double = js.native
    }
    
    @js.native
    class PnpObjectUpdate ()
      extends typingsSlinky.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectUpdate
    
    @js.native
    class PnpObjectWatcher ()
      extends typingsSlinky.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectWatcher
  }
}
