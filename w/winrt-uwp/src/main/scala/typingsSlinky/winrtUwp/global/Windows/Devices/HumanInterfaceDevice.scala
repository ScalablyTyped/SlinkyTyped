package typingsSlinky.winrtUwp.global.Windows.Devices

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.FileAccessMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This namespace gives your Windows Store app access to devices that support the Human Interface Device (HID) protocol. */
@JSGlobal("Windows.Devices.HumanInterfaceDevice")
@js.native
object HumanInterfaceDevice extends js.Object {
  
  /** Represents a simple Boolean control on a HID device that returns on/off values. An example would be the LED light on a keyboard. */
  @js.native
  abstract class HidBooleanControl ()
    extends typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidBooleanControl
  
  /** Describes a Boolean control for a given HID device. */
  @js.native
  abstract class HidBooleanControlDescription ()
    extends typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidBooleanControlDescription
  
  /** Retrieves the collection information for a group of related controls. */
  @js.native
  abstract class HidCollection ()
    extends typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollection
  
  /** Identifies the relationship that defines a grouping of controls on the device. */
  @js.native
  object HidCollectionType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType with Double
      ] = js.native
    
    /* 1 */ val application: typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.application with Double = js.native
    
    /* 2 */ val logical: typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.logical with Double = js.native
    
    /* 4 */ val namedArray: typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.namedArray with Double = js.native
    
    /* 7 */ val other: typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.other with Double = js.native
    
    /* 0 */ val physical: typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.physical with Double = js.native
    
    /* 3 */ val report: typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.report with Double = js.native
    
    /* 6 */ val usageModifier: typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.usageModifier with Double = js.native
    
    /* 5 */ val usageSwitch: typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidCollectionType.usageSwitch with Double = js.native
  }
  
  /** Represents a top-level collection and the corresponding device. */
  @js.native
  abstract class HidDevice ()
    extends typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidDevice
  /* static members */
  @js.native
  object HidDevice extends js.Object {
    
    /**
      * Opens a handle to the device identified by the deviceId parameter. The acess type is specified by the accessMode parameter.
      * @param deviceId The DeviceInformation ID that identifies the HID device.
      * @param accessMode Specifies the access mode. The supported access modes are Read and ReadWrite.
      * @return A HidDevice object.
      */
    def fromIdAsync(deviceId: String, accessMode: FileAccessMode): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidDevice] = js.native
    
    /**
      * Retrieves an Advanced Query Syntax (AQS) string based on the given usagePage and usageId.
      * @param usagePage Specifies the usage page of the top-level collection for the given HID device.
      * @param usageId Specifies the usage identifier of the top-level collection for the given HID device.
      * @return An Advanced Query Syntax (AQS) string that represents a device selector.
      */
    def getDeviceSelector(usagePage: Double, usageId: Double): String = js.native
    /**
      * Retrieves an Advanced Query Syntax (AQS) string based on the given usagePage, usageId, vendorId, and productId.
      * @param usagePage Specifies the usage page of the top-level collection for the given HID device.
      * @param usageId Specifies the usage identifier of the top-level collection for the given HID device.
      * @param vendorId Identifies the device vendor.
      * @param productId Identifies the product.
      * @return An Advanced Query Syntax (AQS) string that represents a device selector.
      */
    def getDeviceSelector(usagePage: Double, usageId: Double, vendorId: Double, productId: Double): String = js.native
  }
  
  /** Represents a feature report. */
  @js.native
  abstract class HidFeatureReport ()
    extends typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidFeatureReport
  
  /** Represents an input report. */
  @js.native
  abstract class HidInputReport ()
    extends typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidInputReport
  
  /** Represents the arguments which the HID API sends as part of an input-report event. */
  @js.native
  abstract class HidInputReportReceivedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidInputReportReceivedEventArgs
  
  /** Represents a numeric control on a HID device that returns a range of values. An example would be the volume control on a speaker. */
  @js.native
  abstract class HidNumericControl ()
    extends typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidNumericControl
  
  /** Describes a numeric control for a given HID device. */
  @js.native
  abstract class HidNumericControlDescription ()
    extends typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidNumericControlDescription
  
  /** Represents an output report. */
  @js.native
  abstract class HidOutputReport ()
    extends typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidOutputReport
  
  /** Specifies a HID report type. */
  @js.native
  object HidReportType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidReportType with Double
      ] = js.native
    
    /* 2 */ val feature: typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidReportType.feature with Double = js.native
    
    /* 0 */ val input: typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidReportType.input with Double = js.native
    
    /* 1 */ val output: typingsSlinky.winrtUwp.Windows.Devices.HumanInterfaceDevice.HidReportType.output with Double = js.native
  }
}
