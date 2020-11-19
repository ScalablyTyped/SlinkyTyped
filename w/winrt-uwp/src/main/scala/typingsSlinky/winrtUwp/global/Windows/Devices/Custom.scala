package typingsSlinky.winrtUwp.global.Windows.Devices

import typingsSlinky.winrtUwp.Windows.Devices.Custom.DeviceAccessMode
import typingsSlinky.winrtUwp.Windows.Devices.Custom.DeviceSharingMode
import typingsSlinky.winrtUwp.Windows.Devices.Custom.IOControlAccessMode
import typingsSlinky.winrtUwp.Windows.Devices.Custom.IOControlBufferingMethod
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Opens a custom device asynchronously, and with the object returned from the open operation send asynchronous IOCTLs to the device. */
@JSGlobal("Windows.Devices.Custom")
@js.native
object Custom extends js.Object {
  
  /** Represents a custom device. */
  @js.native
  abstract class CustomDevice ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Custom.CustomDevice
  /* static members */
  @js.native
  object CustomDevice extends js.Object {
    
    /**
      * Creates a CustomDevice object asynchronously for the specified DeviceInformation.Id .
      * @param deviceId The DeviceInformation.Id of the device .
      * @param desiredAccess The desired access.
      * @param sharingMode The sharing mode.
      * @return Returns a custom device.
      */
    def fromIdAsync(deviceId: String, desiredAccess: DeviceAccessMode, sharingMode: DeviceSharingMode): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Custom.CustomDevice] = js.native
    
    /**
      * Gets a device selector.
      * @param classGuid The Device Interface Class GUID of the device interface to create a device selector for.
      * @return The device selector.
      */
    def getDeviceSelector(classGuid: String): String = js.native
  }
  
  /** The device access mode. */
  @js.native
  object DeviceAccessMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Devices.Custom.DeviceAccessMode with Double] = js.native
    
    /* 0 */ val read: typingsSlinky.winrtUwp.Windows.Devices.Custom.DeviceAccessMode.read with Double = js.native
    
    /* 2 */ val readWrite: typingsSlinky.winrtUwp.Windows.Devices.Custom.DeviceAccessMode.readWrite with Double = js.native
    
    /* 1 */ val write: typingsSlinky.winrtUwp.Windows.Devices.Custom.DeviceAccessMode.write with Double = js.native
  }
  
  /** The device sharing mode. */
  @js.native
  object DeviceSharingMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Devices.Custom.DeviceSharingMode with Double] = js.native
    
    /* 1 */ val exclusive: typingsSlinky.winrtUwp.Windows.Devices.Custom.DeviceSharingMode.exclusive with Double = js.native
    
    /* 0 */ val shared: typingsSlinky.winrtUwp.Windows.Devices.Custom.DeviceSharingMode.shared with Double = js.native
  }
  
  /** Identifies the access mode. */
  @js.native
  object IOControlAccessMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Devices.Custom.IOControlAccessMode with Double] = js.native
    
    /* 0 */ val any: typingsSlinky.winrtUwp.Windows.Devices.Custom.IOControlAccessMode.any with Double = js.native
    
    /* 1 */ val read: typingsSlinky.winrtUwp.Windows.Devices.Custom.IOControlAccessMode.read with Double = js.native
    
    /* 3 */ val readWrite: typingsSlinky.winrtUwp.Windows.Devices.Custom.IOControlAccessMode.readWrite with Double = js.native
    
    /* 2 */ val write: typingsSlinky.winrtUwp.Windows.Devices.Custom.IOControlAccessMode.write with Double = js.native
  }
  
  /** Identifies the buffering method. */
  @js.native
  object IOControlBufferingMethod extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Devices.Custom.IOControlBufferingMethod with Double
      ] = js.native
    
    /* 0 */ val buffered: typingsSlinky.winrtUwp.Windows.Devices.Custom.IOControlBufferingMethod.buffered with Double = js.native
    
    /* 1 */ val directInput: typingsSlinky.winrtUwp.Windows.Devices.Custom.IOControlBufferingMethod.directInput with Double = js.native
    
    /* 2 */ val directOutput: typingsSlinky.winrtUwp.Windows.Devices.Custom.IOControlBufferingMethod.directOutput with Double = js.native
    
    /* 3 */ val neither: typingsSlinky.winrtUwp.Windows.Devices.Custom.IOControlBufferingMethod.neither with Double = js.native
  }
  
  /** Represents the control code. */
  @js.native
  class IOControlCode protected ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Custom.IOControlCode {
    /**
      * The control code.
      * @param deviceType The device type.
      * @param function The device function.
      * @param accessMode The access mode.
      * @param bufferingMethod The buffering method.
      */
    def this(
      deviceType: Double,
      func: Double,
      accessMode: IOControlAccessMode,
      bufferingMethod: IOControlBufferingMethod
    ) = this()
  }
  
  /** Represents know device types. */
  @js.native
  abstract class KnownDeviceTypes ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Custom.KnownDeviceTypes
  /* static members */
  @js.native
  object KnownDeviceTypes extends js.Object {
    
    /** Defined by the device vendor. */
    var unknown: Double = js.native
  }
}
