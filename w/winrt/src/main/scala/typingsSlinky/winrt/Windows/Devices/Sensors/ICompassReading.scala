package typingsSlinky.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompassReading extends js.Object {
  var headingMagneticNorth: Double = js.native
  var headingTrueNorth: Double = js.native
  var timestamp: js.Date = js.native
}

object ICompassReading {
  @scala.inline
  def apply(headingMagneticNorth: Double, headingTrueNorth: Double, timestamp: js.Date): ICompassReading = {
    val __obj = js.Dynamic.literal(headingMagneticNorth = headingMagneticNorth.asInstanceOf[js.Any], headingTrueNorth = headingTrueNorth.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompassReading]
  }
  @scala.inline
  implicit class ICompassReadingOps[Self <: ICompassReading] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeadingMagneticNorth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headingMagneticNorth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeadingTrueNorth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headingTrueNorth")(value.asInstanceOf[js.Any])
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

