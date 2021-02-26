package typingsSlinky.winrtUwp.global.Windows.Devices.Bluetooth

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Networking.HostName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Bluetooth device. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothDevice")
@js.native
abstract class BluetoothDevice ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.BluetoothDevice
object BluetoothDevice {
  
  /**
    * Returns a BluetoothDevice object for the given BluetoothAddress .
    * @param address The address of the Bluetooth device.
    * @return After the asynchronous operation completes, returns the BluetoothDevice object with the given BluetoothAddress or null if the address does not resolve to a valid device.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Bluetooth.BluetoothDevice.fromBluetoothAddressAsync")
  @js.native
  def fromBluetoothAddressAsync(address: Double): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.BluetoothDevice] = js.native
  
  /**
    * Returns a BluetoothDevice object identified by the given HostName .
    * @param hostName The HostName that identifies the BluetoothDevice instance.
    * @return After the asynchronous operation completes, returns the BluetoothDevice object identified by the given HostName .
    */
  /* static member */
  @JSGlobal("Windows.Devices.Bluetooth.BluetoothDevice.fromHostNameAsync")
  @js.native
  def fromHostNameAsync(hostName: HostName): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.BluetoothDevice] = js.native
  
  /**
    * Returns a BluetoothDevice object identified by the given DeviceId .
    * @param deviceId The DeviceId value that identifies the BluetoothDevice instance.
    * @return After the asynchronous operation completes, returns the BluetoothDevice object identified by the given DeviceId .
    */
  /* static member */
  @JSGlobal("Windows.Devices.Bluetooth.BluetoothDevice.fromIdAsync")
  @js.native
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.BluetoothDevice] = js.native
  
  /**
    * Gets an Advanced Query Syntax (AQS) string for identifying instances of this device. This string is passed to the FindAllAsync or CreateWatcher method.
    * @return The device selector for this device.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Bluetooth.BluetoothDevice.getDeviceSelector")
  @js.native
  def getDeviceSelector(): String = js.native
  
  /**
    * Creates an Advanced Query Syntax (AQS) filter string from a 64-bit address that represents a Bluetooth device. The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects.
    * @param bluetoothAddress A 64-bit Bluetooth device address used for constructing the AQS string.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Bluetooth.BluetoothDevice.getDeviceSelectorFromBluetoothAddress")
  @js.native
  def getDeviceSelectorFromBluetoothAddress(bluetoothAddress: Double): String = js.native
  
  /**
    * Creates an Advanced Query Syntax (AQS) filter string from a BluetoothClassOfDevice object. The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects.
    * @param classOfDevice The class of device used for constructing the AQS string.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Bluetooth.BluetoothDevice.getDeviceSelectorFromClassOfDevice")
  @js.native
  def getDeviceSelectorFromClassOfDevice(classOfDevice: typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.BluetoothClassOfDevice): String = js.native
  
  /**
    * Creates an Advanced Query Syntax (AQS) filter string that contains a query for Bluetooth devices with the indicated BluetoothConnectionStatus . The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects with the indicated Bluetooth connection status.
    * @param connectionStatus The connection status used for constructing the AQS string.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Bluetooth.BluetoothDevice.getDeviceSelectorFromConnectionStatus")
  @js.native
  def getDeviceSelectorFromConnectionStatus(connectionStatus: typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.BluetoothConnectionStatus): String = js.native
  
  /**
    * Creates an Advanced Query Syntax (AQS) filter string that contains a query for the Bluetooth device name. The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects containing the specified Bluetooth device name.
    * @param deviceName The Bluetooth device name used for constructing the AQS string.
    * @return An AQS string that is passed as a parameter to the CreateWatcher method.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Bluetooth.BluetoothDevice.getDeviceSelectorFromDeviceName")
  @js.native
  def getDeviceSelectorFromDeviceName(deviceName: String): String = js.native
  
  /**
    * Creates an Advanced Query Syntax (AQS) filter string that contains a query for Bluetooth devices that are either paired or unpaired. The AQS string is passed into the CreateWatcher method to return a collection of DeviceInformation objects.
    * @param pairingState The current pairing state for Bluetooth devices used for constructing the AQS string. Bluetooth devices can be either paired (true) or unpaired (false). The AQS Filter string will request scanning to be performed when the pairingState is false.
    * @return An AQS string that can be passed as a parameter to the CreateWatcher method.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Bluetooth.BluetoothDevice.getDeviceSelectorFromPairingState")
  @js.native
  def getDeviceSelectorFromPairingState(pairingState: Boolean): String = js.native
}
