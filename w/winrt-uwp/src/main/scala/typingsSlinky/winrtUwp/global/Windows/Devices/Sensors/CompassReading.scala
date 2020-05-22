package typingsSlinky.winrtUwp.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a compass reading. */
@JSGlobal("Windows.Devices.Sensors.CompassReading")
@js.native
abstract class CompassReading ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Sensors.CompassReading {
  /** Gets the compass's heading accuracy. */
  /* CompleteClass */
  override var headingAccuracy: typingsSlinky.winrtUwp.Windows.Devices.Sensors.MagnetometerAccuracy = js.native
  /** Gets the heading in degrees relative to magnetic-north. */
  /* CompleteClass */
  override var headingMagneticNorth: Double = js.native
  /** Gets the heading in degrees relative to geographic true-north. */
  /* CompleteClass */
  override var headingTrueNorth: Double = js.native
  /** Gets the time at which the sensor reported the reading. */
  /* CompleteClass */
  override var timestamp: js.Date = js.native
}

