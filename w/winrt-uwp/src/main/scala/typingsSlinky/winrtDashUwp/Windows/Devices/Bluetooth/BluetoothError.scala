package typingsSlinky.winrtDashUwp.Windows.Devices.Bluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BluetoothError extends js.Object

/** Specifies common Bluetooth error cases. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothError")
@js.native
object BluetoothError extends js.Object {
  /** The operation cannot be completed because the remote device is not connected. */
  @js.native
  sealed trait deviceNotConnected extends BluetoothError
  
  /** The operation is disabled by policy. */
  @js.native
  sealed trait disabledByPolicy extends BluetoothError
  
  /** The operation is disabled by the user. */
  @js.native
  sealed trait disabledByUser extends BluetoothError
  
  /** The operation is not supported on the current Bluetooth radio hardware. */
  @js.native
  sealed trait notSupported extends BluetoothError
  
  /** An unexpected error has occurred. */
  @js.native
  sealed trait otherError extends BluetoothError
  
  /** The Bluetooth radio was not available. This error occurs when the Bluetooth radio has been turned off. */
  @js.native
  sealed trait radioNotAvailable extends BluetoothError
  
  /** The operation cannot be serviced because the necessary resources are currently in use. */
  @js.native
  sealed trait resourceInUse extends BluetoothError
  
  /** The operation was successfully completed or serviced. */
  @js.native
  sealed trait success extends BluetoothError
  
  /* 3 */ val deviceNotConnected: typingsSlinky.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothError.deviceNotConnected with Double = js.native
  /* 5 */ val disabledByPolicy: typingsSlinky.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothError.disabledByPolicy with Double = js.native
  /* 7 */ val disabledByUser: typingsSlinky.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothError.disabledByUser with Double = js.native
  /* 6 */ val notSupported: typingsSlinky.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothError.notSupported with Double = js.native
  /* 4 */ val otherError: typingsSlinky.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothError.otherError with Double = js.native
  /* 1 */ val radioNotAvailable: typingsSlinky.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothError.radioNotAvailable with Double = js.native
  /* 2 */ val resourceInUse: typingsSlinky.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothError.resourceInUse with Double = js.native
  /* 0 */ val success: typingsSlinky.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothError.success with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BluetoothError with Double] = js.native
}

