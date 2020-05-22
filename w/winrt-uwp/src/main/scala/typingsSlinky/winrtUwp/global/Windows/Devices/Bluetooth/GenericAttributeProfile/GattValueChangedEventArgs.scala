package typingsSlinky.winrtUwp.global.Windows.Devices.Bluetooth.GenericAttributeProfile

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value received when registering to receive notifications or indications from a Bluetooth LE device. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattValueChangedEventArgs")
@js.native
abstract class GattValueChangedEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattValueChangedEventArgs {
  /** Gets the new Characteristic Value. */
  /* CompleteClass */
  override var characteristicValue: IBuffer = js.native
  /** Gets the time at which the system was notified of the Characteristic Value change. */
  /* CompleteClass */
  override var timestamp: js.Date = js.native
}

