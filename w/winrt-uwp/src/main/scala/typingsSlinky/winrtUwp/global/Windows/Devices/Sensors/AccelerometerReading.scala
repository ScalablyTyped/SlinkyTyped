package typingsSlinky.winrtUwp.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an accelerometer reading. */
@JSGlobal("Windows.Devices.Sensors.AccelerometerReading")
@js.native
abstract class AccelerometerReading ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Sensors.AccelerometerReading {
  /** Gets the g-force acceleration along the x-axis. */
  /* CompleteClass */
  override var accelerationX: Double = js.native
  /** Gets the g-force acceleration along the y-axis. */
  /* CompleteClass */
  override var accelerationY: Double = js.native
  /** Gets the g-force acceleration along the z-axis. */
  /* CompleteClass */
  override var accelerationZ: Double = js.native
  /** Gets the time at which the sensor reported the reading. */
  /* CompleteClass */
  override var timestamp: js.Date = js.native
}

