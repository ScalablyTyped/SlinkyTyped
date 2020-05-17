package typingsSlinky.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the sensor reading–changed event. */
@js.native
trait SimpleOrientationSensorOrientationChangedEventArgs extends js.Object {
  /** Gets the current sensor orientation. */
  var orientation: SimpleOrientation = js.native
  /** Gets the time of the current sensor reading. */
  var timestamp: js.Date = js.native
}

object SimpleOrientationSensorOrientationChangedEventArgs {
  @scala.inline
  def apply(orientation: SimpleOrientation, timestamp: js.Date): SimpleOrientationSensorOrientationChangedEventArgs = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleOrientationSensorOrientationChangedEventArgs]
  }
  @scala.inline
  implicit class SimpleOrientationSensorOrientationChangedEventArgsOps[Self <: SimpleOrientationSensorOrientationChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrientation(value: SimpleOrientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
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

