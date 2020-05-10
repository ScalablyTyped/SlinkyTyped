package typingsSlinky.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompassReadingChangedEventArgs extends js.Object {
  var reading: CompassReading = js.native
}

object ICompassReadingChangedEventArgs {
  @scala.inline
  def apply(reading: CompassReading): ICompassReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompassReadingChangedEventArgs]
  }
  @scala.inline
  implicit class ICompassReadingChangedEventArgsOps[Self <: ICompassReadingChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReading(value: CompassReading): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reading")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

