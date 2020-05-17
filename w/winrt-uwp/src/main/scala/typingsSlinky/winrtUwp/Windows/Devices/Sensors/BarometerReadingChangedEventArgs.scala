package typingsSlinky.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the barometer reading–changed event. */
@js.native
trait BarometerReadingChangedEventArgs extends js.Object {
  /** Gets the most recent barometer reading. */
  var reading: BarometerReading = js.native
}

object BarometerReadingChangedEventArgs {
  @scala.inline
  def apply(reading: BarometerReading): BarometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarometerReadingChangedEventArgs]
  }
  @scala.inline
  implicit class BarometerReadingChangedEventArgsOps[Self <: BarometerReadingChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReading(value: BarometerReading): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reading")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

