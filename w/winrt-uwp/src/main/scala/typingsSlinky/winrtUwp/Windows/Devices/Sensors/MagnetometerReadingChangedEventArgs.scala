package typingsSlinky.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the magnetometer reading–changed event. */
@js.native
trait MagnetometerReadingChangedEventArgs extends js.Object {
  /** Gets the current magnetometer reading. */
  var reading: MagnetometerReading = js.native
}

object MagnetometerReadingChangedEventArgs {
  @scala.inline
  def apply(reading: MagnetometerReading): MagnetometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagnetometerReadingChangedEventArgs]
  }
  @scala.inline
  implicit class MagnetometerReadingChangedEventArgsOps[Self <: MagnetometerReadingChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReading(value: MagnetometerReading): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reading")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

