package typingsSlinky.winrtUwp.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the orientation-sensor reading-changed event. */
@JSGlobal("Windows.Devices.Sensors.OrientationSensorReadingChangedEventArgs")
@js.native
abstract class OrientationSensorReadingChangedEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Sensors.OrientationSensorReadingChangedEventArgs {
  /** Gets the current reading which includes a Quaternion, a RotationMatrix, and a timestamp. */
  /* CompleteClass */
  override var reading: typingsSlinky.winrtUwp.Windows.Devices.Sensors.OrientationSensorReading = js.native
}

