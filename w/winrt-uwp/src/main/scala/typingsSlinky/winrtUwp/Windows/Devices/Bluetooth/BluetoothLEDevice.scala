package typingsSlinky.winrtUwp.Windows.Devices.Bluetooth

import typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattDeviceService
import typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.connectionstatuschanged
import typingsSlinky.winrtUwp.winrtUwpStrings.gattserviceschanged
import typingsSlinky.winrtUwp.winrtUwpStrings.namechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Bluetooth LE device. */
@js.native
trait BluetoothLEDevice extends js.Object {
  /** Gets the BluetoothLEAppearance object for the Bluetooth LE device. */
  var appearance: BluetoothLEAppearance = js.native
  /** Gets the device address. */
  var bluetoothAddress: Double = js.native
  /** Gets the address type for the Bluetooth LE device. */
  var bluetoothAddressType: BluetoothAddressType = js.native
  /** Gets the connection status of the device. */
  var connectionStatus: BluetoothConnectionStatus = js.native
  /** Gets the device Id. */
  var deviceId: String = js.native
  /** Gets the DeviceInformation object for the Bluetooth LE device. */
  var deviceInformation: DeviceInformation = js.native
  /** Gets the read-only list of GATT services supported by the device. */
  var gattServices: IVectorView[GattDeviceService] = js.native
  /** Gets the name of the Bluetooth LE device. */
  var name: String = js.native
  /** Occurs when the connection status for the device has changed. */
  @JSName("onconnectionstatuschanged")
  var onconnectionstatuschanged_Original: TypedEventHandler[BluetoothLEDevice, _] = js.native
  /** Occurs when the list of GATT services supported by the device has changed. */
  @JSName("ongattserviceschanged")
  var ongattserviceschanged_Original: TypedEventHandler[BluetoothLEDevice, _] = js.native
  /** Occurs when the name of the device has changed. */
  @JSName("onnamechanged")
  var onnamechanged_Original: TypedEventHandler[BluetoothLEDevice, _] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionstatuschanged(`type`: connectionstatuschanged, listener: TypedEventHandler[BluetoothLEDevice, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gattserviceschanged(`type`: gattserviceschanged, listener: TypedEventHandler[BluetoothLEDevice, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_namechanged(`type`: namechanged, listener: TypedEventHandler[BluetoothLEDevice, _]): Unit = js.native
  /** Closes this Bluetooth LE device. */
  def close(): Unit = js.native
  /**
    * Returns the GATT service with the given service Id.
    * @param serviceUuid The service Id of the GATT service.
    * @return The GATT service represented by the given service Id.
    */
  def getGattService(serviceUuid: String): GattDeviceService = js.native
  /** Occurs when the connection status for the device has changed. */
  def onconnectionstatuschanged(ev: js.Any with WinRTEvent[BluetoothLEDevice]): Unit = js.native
  /** Occurs when the list of GATT services supported by the device has changed. */
  def ongattserviceschanged(ev: js.Any with WinRTEvent[BluetoothLEDevice]): Unit = js.native
  /** Occurs when the name of the device has changed. */
  def onnamechanged(ev: js.Any with WinRTEvent[BluetoothLEDevice]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionstatuschanged(`type`: connectionstatuschanged, listener: TypedEventHandler[BluetoothLEDevice, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gattserviceschanged(`type`: gattserviceschanged, listener: TypedEventHandler[BluetoothLEDevice, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_namechanged(`type`: namechanged, listener: TypedEventHandler[BluetoothLEDevice, _]): Unit = js.native
}

