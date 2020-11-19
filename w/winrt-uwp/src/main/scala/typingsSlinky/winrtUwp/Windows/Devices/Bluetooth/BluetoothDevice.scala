package typingsSlinky.winrtUwp.Windows.Devices.Bluetooth

import typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommDeviceService
import typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.Networking.HostName
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.connectionstatuschanged
import typingsSlinky.winrtUwp.winrtUwpStrings.namechanged
import typingsSlinky.winrtUwp.winrtUwpStrings.sdprecordschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Bluetooth device. */
@js.native
trait BluetoothDevice extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionstatuschanged(`type`: connectionstatuschanged, listener: TypedEventHandler[BluetoothDevice, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_namechanged(`type`: namechanged, listener: TypedEventHandler[BluetoothDevice, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sdprecordschanged(`type`: sdprecordschanged, listener: TypedEventHandler[BluetoothDevice, _]): Unit = js.native
  
  /** Gets the device address. */
  var bluetoothAddress: Double = js.native
  
  /** Gets the Bluetooth Class Of Device information of the device. */
  var classOfDevice: BluetoothClassOfDevice = js.native
  
  /** Closes the Bluetooth device. */
  def close(): Unit = js.native
  
  /** Gets the connection status of the device. */
  var connectionStatus: BluetoothConnectionStatus = js.native
  
  /** Gets the device ID. */
  var deviceId: String = js.native
  
  /** Gets the DeviceInformation object for the Bluetooth device. */
  var deviceInformation: DeviceInformation = js.native
  
  /** Gets the HostName of the device. */
  var hostName: HostName = js.native
  
  /** Gets the Name of the device. */
  var name: String = js.native
  
  /** Occurs when the connection status of the device has changed. */
  def onconnectionstatuschanged(ev: js.Any with WinRTEvent[BluetoothDevice]): Unit = js.native
  /** Occurs when the connection status of the device has changed. */
  @JSName("onconnectionstatuschanged")
  var onconnectionstatuschanged_Original: TypedEventHandler[BluetoothDevice, _] = js.native
  
  /** Occurs when the name of the device has changed. */
  def onnamechanged(ev: js.Any with WinRTEvent[BluetoothDevice]): Unit = js.native
  /** Occurs when the name of the device has changed. */
  @JSName("onnamechanged")
  var onnamechanged_Original: TypedEventHandler[BluetoothDevice, _] = js.native
  
  /** Occurs when the list SDP records for the device has changed. */
  def onsdprecordschanged(ev: js.Any with WinRTEvent[BluetoothDevice]): Unit = js.native
  /** Occurs when the list SDP records for the device has changed. */
  @JSName("onsdprecordschanged")
  var onsdprecordschanged_Original: TypedEventHandler[BluetoothDevice, _] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionstatuschanged(`type`: connectionstatuschanged, listener: TypedEventHandler[BluetoothDevice, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_namechanged(`type`: namechanged, listener: TypedEventHandler[BluetoothDevice, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sdprecordschanged(`type`: sdprecordschanged, listener: TypedEventHandler[BluetoothDevice, _]): Unit = js.native
  
  /** Gets the read-only list of RFCOMM services supported by the device. */
  var rfcommServices: IVectorView[RfcommDeviceService] = js.native
  
  /** Gets the read-only list of Service Discovery Protocol (SDP) records for the device. */
  var sdpRecords: IVectorView[IBuffer] = js.native
}
