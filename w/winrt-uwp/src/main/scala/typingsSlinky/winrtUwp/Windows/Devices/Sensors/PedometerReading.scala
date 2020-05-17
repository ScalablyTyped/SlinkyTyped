package typingsSlinky.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a pedometer reading. */
@js.native
trait PedometerReading extends js.Object {
  /** Gets the total number of steps taken for this pedometer reading. */
  var cumulativeSteps: Double = js.native
  /** Gets the amount of time that has elapsed for this pedometer reading. */
  var cumulativeStepsDuration: Double = js.native
  /** Indicates the type of steps taken for this pedometer reading. */
  var stepKind: PedometerStepKind = js.native
  /** Gets the time for the most recent pedometer reading. */
  var timestamp: js.Date = js.native
}

object PedometerReading {
  @scala.inline
  def apply(
    cumulativeSteps: Double,
    cumulativeStepsDuration: Double,
    stepKind: PedometerStepKind,
    timestamp: js.Date
  ): PedometerReading = {
    val __obj = js.Dynamic.literal(cumulativeSteps = cumulativeSteps.asInstanceOf[js.Any], cumulativeStepsDuration = cumulativeStepsDuration.asInstanceOf[js.Any], stepKind = stepKind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PedometerReading]
  }
  @scala.inline
  implicit class PedometerReadingOps[Self <: PedometerReading] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCumulativeSteps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cumulativeSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCumulativeStepsDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cumulativeStepsDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepKind(value: PedometerStepKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepKind")(value.asInstanceOf[js.Any])
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

