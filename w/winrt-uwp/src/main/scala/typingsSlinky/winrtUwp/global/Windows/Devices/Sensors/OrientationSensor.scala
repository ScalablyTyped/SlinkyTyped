package typingsSlinky.winrtUwp.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an orientation sensor. */
@JSGlobal("Windows.Devices.Sensors.OrientationSensor")
@js.native
abstract class OrientationSensor ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Sensors.OrientationSensor

/* static members */
@JSGlobal("Windows.Devices.Sensors.OrientationSensor")
@js.native
object OrientationSensor extends js.Object {
  /**
    * Gets the default orientation sensor.
    * @return The default orientation sensor or null if no orientation sensors are found.
    */
  def getDefault(): typingsSlinky.winrtUwp.Windows.Devices.Sensors.OrientationSensor = js.native
  /**
    * Gets the default orientation sensor.
    * @return The default orientation sensor or null if no orientation sensors are found.
    */
  def getDefaultForRelativeReadings(): typingsSlinky.winrtUwp.Windows.Devices.Sensors.OrientationSensor = js.native
}

