package typingsSlinky.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an inclinometer reading. */
@js.native
trait InclinometerReading extends js.Object {
  /** Gets the rotation in degrees around the x-axis. */
  var pitchDegrees: Double = js.native
  /** Gets the rotation in degrees around the y-axis. */
  var rollDegrees: Double = js.native
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: js.Date = js.native
  /** Gets the inclinometer's z-axis accuracy. */
  var yawAccuracy: MagnetometerAccuracy = js.native
  /** Gets the rotation in degrees around the z-axis. */
  var yawDegrees: Double = js.native
}

object InclinometerReading {
  @scala.inline
  def apply(
    pitchDegrees: Double,
    rollDegrees: Double,
    timestamp: js.Date,
    yawAccuracy: MagnetometerAccuracy,
    yawDegrees: Double
  ): InclinometerReading = {
    val __obj = js.Dynamic.literal(pitchDegrees = pitchDegrees.asInstanceOf[js.Any], rollDegrees = rollDegrees.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], yawAccuracy = yawAccuracy.asInstanceOf[js.Any], yawDegrees = yawDegrees.asInstanceOf[js.Any])
    __obj.asInstanceOf[InclinometerReading]
  }
  @scala.inline
  implicit class InclinometerReadingOps[Self <: InclinometerReading] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPitchDegrees(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitchDegrees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRollDegrees(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollDegrees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYawAccuracy(value: MagnetometerAccuracy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yawAccuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYawDegrees(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yawDegrees")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

