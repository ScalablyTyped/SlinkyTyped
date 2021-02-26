package typingsSlinky.winrtUwp.global.Windows.Devices

import typingsSlinky.winrtUwp.Windows.Devices.I2c.Provider.II2cProvider
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains types that you can use to communicate with peripheral devices connected through a inter-integrated circuit (I²C) bus from an application. */
object I2c {
  
  /** Describes the bus speeds that are available for connecting to an inter-integrated circuit (I²C) device. The bus speed is the frequency at which to clock the I²C bus when accessing the device. */
  @JSGlobal("Windows.Devices.I2c.I2cBusSpeed")
  @js.native
  object I2cBusSpeed extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Devices.I2c.I2cBusSpeed with Double] = js.native
    
    /* 1 */ val fastMode: typingsSlinky.winrtUwp.Windows.Devices.I2c.I2cBusSpeed.fastMode with Double = js.native
    
    /* 0 */ val standardMode: typingsSlinky.winrtUwp.Windows.Devices.I2c.I2cBusSpeed.standardMode with Double = js.native
  }
  
  /** Represents the connection settings you want to use for an inter-integrated circuit (I²C) device. */
  @JSGlobal("Windows.Devices.I2c.I2cConnectionSettings")
  @js.native
  class I2cConnectionSettings protected ()
    extends typingsSlinky.winrtUwp.Windows.Devices.I2c.I2cConnectionSettings {
    /**
      * Creates and initializes a new instance of the I2cConnectionSettings class for inter-integrated circuit (I²C) device with specified bus address, using the default settings of the standard mode for the bus speed and exclusive sharing mode.
      * @param slaveAddress The bus address of the inter-integrated circuit (I²C) device to which the settings of the I2cConnectionSettings should apply. Only 7-bit addressing is supported, so the range of values that are valid is from 8 to 119.
      */
    def this(slaveAddress: Double) = this()
  }
  
  /** Represents the I²C controller for the system. */
  @JSGlobal("Windows.Devices.I2c.I2cController")
  @js.native
  abstract class I2cController ()
    extends typingsSlinky.winrtUwp.Windows.Devices.I2c.I2cController
  object I2cController {
    
    /**
      * Gets all the I²C controllers that are on the system.
      * @param provider The I²C provider for the controllers on the system.
      * @return When the method completes successfully, it returns a list of values that represent the available I²C controllers on the system.
      */
    /* static member */
    @JSGlobal("Windows.Devices.I2c.I2cController.getControllersAsync")
    @js.native
    def getControllersAsync(provider: II2cProvider): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    
    /**
      * Gets the default I²C controller on the system.
      * @return The default I²C controller on the system, or null if the system has no I²C controller.
      */
    /* static member */
    @JSGlobal("Windows.Devices.I2c.I2cController.getDefaultAsync")
    @js.native
    def getDefaultAsync(): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.I2c.I2cController] = js.native
  }
  
  /** Represents a communications channel to a device on an inter-integrated circuit (I²C) bus. */
  @JSGlobal("Windows.Devices.I2c.I2cDevice")
  @js.native
  abstract class I2cDevice ()
    extends typingsSlinky.winrtUwp.Windows.Devices.I2c.I2cDevice
  object I2cDevice {
    
    /**
      * Retrieves an I2cDevice object asynchronously for the inter-integrated circuit (I²C) bus controller that has the specified plug and play device identifier, using the specified connection settings.
      * @param deviceId The plug and play device identifier of the I²C bus controller for which you want to create an I2cDevice object.
      * @param settings The connection settings to use for communication with the I²C bus controller that deviceId specifies.
      * @return An asynchronous operation that returns the I2cDevice object.
      */
    /* static member */
    @JSGlobal("Windows.Devices.I2c.I2cDevice.fromIdAsync")
    @js.native
    def fromIdAsync(deviceId: String, settings: typingsSlinky.winrtUwp.Windows.Devices.I2c.I2cConnectionSettings): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.I2c.I2cDevice] = js.native
    
    /**
      * Retrieves an Advanced Query Syntax (AQS) string for all of the inter-integrated circuit (I²C) bus controllers on the system. You can use this string with the DeviceInformation.FindAllAsync method to get DeviceInformation objects for those bus controllers.
      * @return An AQS string for all of the I²C bus controllers on the system, which you can use with the DeviceInformation.FindAllAsync method to get DeviceInformation objects for those bus controllers.
      */
    /* static member */
    @JSGlobal("Windows.Devices.I2c.I2cDevice.getDeviceSelector")
    @js.native
    def getDeviceSelector(): String = js.native
    /**
      * Retrieves an Advanced Query Syntax (AQS) string for the inter-integrated circuit (I²C) bus that has the specified friendly name. You can use this string with the DeviceInformation.FindAllAsync method to get a DeviceInformation object for that bus.
      * @param friendlyName A friendly name for the particular I²C bus on a particular hardware platform for which you want to get the AQS string.
      * @return An AQS string for the I²C bus that friendlyName specifies, which you can use with the DeviceInformation.FindAllAsync method to get a DeviceInformation object for that bus.
      */
    /* static member */
    @JSGlobal("Windows.Devices.I2c.I2cDevice.getDeviceSelector")
    @js.native
    def getDeviceSelector(friendlyName: String): String = js.native
  }
  
  /** Describes the modes in which you can connect to an inter-integrated circuit (I²C) bus address. These modes determine whether other connections to the I²C bus address can be opened while you are connected to the I²C bus address. */
  @JSGlobal("Windows.Devices.I2c.I2cSharingMode")
  @js.native
  object I2cSharingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Devices.I2c.I2cSharingMode with Double] = js.native
    
    /* 0 */ val exclusive: typingsSlinky.winrtUwp.Windows.Devices.I2c.I2cSharingMode.exclusive with Double = js.native
    
    /* 1 */ val shared: typingsSlinky.winrtUwp.Windows.Devices.I2c.I2cSharingMode.shared with Double = js.native
  }
  
  /** Describes whether the data transfers that the ReadPartial , WritePartial , or WriteReadPartial method performed succeeded, or provides the reason that the transfers did not succeed. */
  @JSGlobal("Windows.Devices.I2c.I2cTransferStatus")
  @js.native
  object I2cTransferStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Devices.I2c.I2cTransferStatus with Double] = js.native
    
    /* 0 */ val fullTransfer: typingsSlinky.winrtUwp.Windows.Devices.I2c.I2cTransferStatus.fullTransfer with Double = js.native
    
    /* 1 */ val partialTransfer: typingsSlinky.winrtUwp.Windows.Devices.I2c.I2cTransferStatus.partialTransfer with Double = js.native
    
    /* 2 */ val slaveAddressNotAcknowledged: typingsSlinky.winrtUwp.Windows.Devices.I2c.I2cTransferStatus.slaveAddressNotAcknowledged with Double = js.native
  }
  
  /** This API exposes a Provider interface and associated classes for the user to implement for a specific controller. The I2C API needs a I²C Provider implementation to talk to the I²C controller. */
  object Provider {
    
    object ProviderI2cBusSpeed {
      
      @JSGlobal("Windows.Devices.I2c.Provider.ProviderI2cBusSpeed")
      @js.native
      val ^ : js.Any = js.native
      
      /* unmapped type */
      @JSGlobal("Windows.Devices.I2c.Provider.ProviderI2cBusSpeed.fastMode")
      @js.native
      def fastMode: js.Any = js.native
      @scala.inline
      def fastMode_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fastMode")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Windows.Devices.I2c.Provider.ProviderI2cBusSpeed.standardMode")
      @js.native
      def standardMode: js.Any = js.native
      @scala.inline
      def standardMode_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("standardMode")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Windows.Devices.I2c.Provider.ProviderI2cConnectionSettings")
    @js.native
    abstract class ProviderI2cConnectionSettings ()
      extends typingsSlinky.winrtUwp.Windows.Devices.I2c.Provider.ProviderI2cConnectionSettings
    
    object ProviderI2cSharingMode {
      
      @JSGlobal("Windows.Devices.I2c.Provider.ProviderI2cSharingMode")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Windows.Devices.I2c.Provider.ProviderI2cSharingMode.exclusive")
      @js.native
      def exclusive: js.Any = js.native
      @scala.inline
      def exclusive_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exclusive")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      @JSGlobal("Windows.Devices.I2c.Provider.ProviderI2cSharingMode.shared")
      @js.native
      def shared: js.Any = js.native
      @scala.inline
      def shared_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shared")(x.asInstanceOf[js.Any])
    }
    
    object ProviderI2cTransferStatus {
      
      @JSGlobal("Windows.Devices.I2c.Provider.ProviderI2cTransferStatus")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Windows.Devices.I2c.Provider.ProviderI2cTransferStatus.fullTransfer")
      @js.native
      def fullTransfer: js.Any = js.native
      @scala.inline
      def fullTransfer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fullTransfer")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      @JSGlobal("Windows.Devices.I2c.Provider.ProviderI2cTransferStatus.partialTransfer")
      @js.native
      def partialTransfer: js.Any = js.native
      @scala.inline
      def partialTransfer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("partialTransfer")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      @JSGlobal("Windows.Devices.I2c.Provider.ProviderI2cTransferStatus.slaveAddressNotAcknowledged")
      @js.native
      def slaveAddressNotAcknowledged: js.Any = js.native
      @scala.inline
      def slaveAddressNotAcknowledged_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slaveAddressNotAcknowledged")(x.asInstanceOf[js.Any])
    }
  }
}
