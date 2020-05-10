package typingsSlinky.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInclinometerReading extends js.Object {
  var pitchDegrees: Double = js.native
  var rollDegrees: Double = js.native
  var timestamp: js.Date = js.native
  var yawDegrees: Double = js.native
}

object IInclinometerReading {
  @scala.inline
  def apply(pitchDegrees: Double, rollDegrees: Double, timestamp: js.Date, yawDegrees: Double): IInclinometerReading = {
    val __obj = js.Dynamic.literal(pitchDegrees = pitchDegrees.asInstanceOf[js.Any], rollDegrees = rollDegrees.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], yawDegrees = yawDegrees.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInclinometerReading]
  }
  @scala.inline
  implicit class IInclinometerReadingOps[Self <: IInclinometerReading] (val x: Self) extends AnyVal {
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
    def withYawDegrees(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yawDegrees")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

