package typingsSlinky.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccelerometer extends js.Object {
  var minimumReportInterval: Double = js.native
  var onreadingchanged: js.Any = js.native
  var onshaken: js.Any = js.native
  var reportInterval: Double = js.native
  def getCurrentReading(): AccelerometerReading = js.native
}

object IAccelerometer {
  @scala.inline
  def apply(
    getCurrentReading: () => AccelerometerReading,
    minimumReportInterval: Double,
    onreadingchanged: js.Any,
    onshaken: js.Any,
    reportInterval: Double
  ): IAccelerometer = {
    val __obj = js.Dynamic.literal(getCurrentReading = js.Any.fromFunction0(getCurrentReading), minimumReportInterval = minimumReportInterval.asInstanceOf[js.Any], onreadingchanged = onreadingchanged.asInstanceOf[js.Any], onshaken = onshaken.asInstanceOf[js.Any], reportInterval = reportInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccelerometer]
  }
  @scala.inline
  implicit class IAccelerometerOps[Self <: IAccelerometer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCurrentReading(value: () => AccelerometerReading): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentReading")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMinimumReportInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumReportInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnreadingchanged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onreadingchanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnshaken(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onshaken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReportInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportInterval")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

