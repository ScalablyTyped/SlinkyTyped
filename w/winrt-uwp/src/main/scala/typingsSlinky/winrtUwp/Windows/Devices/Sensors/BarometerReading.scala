package typingsSlinky.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a barometer reading. */
@JSGlobal("Windows.Devices.Sensors.BarometerReading")
@js.native
abstract class BarometerReading () extends js.Object {
  /** Gets the barometric pressure determined by the barometer sensor. */
  var stationPressureInHectopascals: Double = js.native
  /** Gets the time for the most recent barometer reading. */
  var timestamp: js.Date = js.native
}

