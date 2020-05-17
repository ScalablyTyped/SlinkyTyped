package typingsSlinky.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a barometer reading. */
@js.native
trait BarometerReading extends js.Object {
  /** Gets the barometric pressure determined by the barometer sensor. */
  var stationPressureInHectopascals: Double = js.native
  /** Gets the time for the most recent barometer reading. */
  var timestamp: js.Date = js.native
}

object BarometerReading {
  @scala.inline
  def apply(stationPressureInHectopascals: Double, timestamp: js.Date): BarometerReading = {
    val __obj = js.Dynamic.literal(stationPressureInHectopascals = stationPressureInHectopascals.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarometerReading]
  }
  @scala.inline
  implicit class BarometerReadingOps[Self <: BarometerReading] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStationPressureInHectopascals(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stationPressureInHectopascals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

