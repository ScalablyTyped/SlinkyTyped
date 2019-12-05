package typingsSlinky.winrtDashUwp.Windows.Devices.Bluetooth.Advertisement

import typingsSlinky.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a Stopped event on a BluetoothLEAdvertisementWatcher . */
@JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcherStoppedEventArgs")
@js.native
abstract class BluetoothLEAdvertisementWatcherStoppedEventArgs () extends js.Object {
  /** Gets the error status for Stopped event. */
  var error: BluetoothError = js.native
}

