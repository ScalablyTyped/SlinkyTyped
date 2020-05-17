package typingsSlinky.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the pedometer reading–changed event. */
@js.native
trait PedometerReadingChangedEventArgs extends js.Object {
  /** Gets the most recent pedometer reading. */
  var reading: PedometerReading = js.native
}

object PedometerReadingChangedEventArgs {
  @scala.inline
  def apply(reading: PedometerReading): PedometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[PedometerReadingChangedEventArgs]
  }
  @scala.inline
  implicit class PedometerReadingChangedEventArgsOps[Self <: PedometerReadingChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReading(value: PedometerReading): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reading")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

