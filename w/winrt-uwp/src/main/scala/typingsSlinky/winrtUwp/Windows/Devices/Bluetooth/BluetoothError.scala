package typingsSlinky.winrtUwp.Windows.Devices.Bluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BluetoothError extends StObject
/** Specifies common Bluetooth error cases. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothError")
@js.native
object BluetoothError extends StObject {
  
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
}
