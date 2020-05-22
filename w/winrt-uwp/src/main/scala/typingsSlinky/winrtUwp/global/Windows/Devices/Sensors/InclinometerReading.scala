package typingsSlinky.winrtUwp.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an inclinometer reading. */
@JSGlobal("Windows.Devices.Sensors.InclinometerReading")
@js.native
abstract class InclinometerReading ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Sensors.InclinometerReading {
  /** Gets the rotation in degrees around the x-axis. */
  /* CompleteClass */
  override var pitchDegrees: Double = js.native
  /** Gets the rotation in degrees around the y-axis. */
  /* CompleteClass */
  override var rollDegrees: Double = js.native
  /** Gets the time at which the sensor reported the reading. */
  /* CompleteClass */
  override var timestamp: js.Date = js.native
  /** Gets the inclinometer's z-axis accuracy. */
  /* CompleteClass */
  override var yawAccuracy: typingsSlinky.winrtUwp.Windows.Devices.Sensors.MagnetometerAccuracy = js.native
  /** Gets the rotation in degrees around the z-axis. */
  /* CompleteClass */
  override var yawDegrees: Double = js.native
}

