package typingsSlinky.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Fired when the accelerometer changes.
	 */
@js.native
trait AccelerometerUpdateEvent extends AccelerometerBaseEvent {
  /**
  		 * Reference timestamp since the previous change. This is not a valid timestamp and should
  		 * simply be used to determine the number of milliseconds between events.
  		 */
  var timestamp: Double = js.native
  /**
  		 * Current `x` axis of the device.
  		 */
  var x: Double = js.native
  /**
  		 * Current `y` axis of the device.
  		 */
  var y: Double = js.native
  /**
  		 * Current `z` axis of the device.
  		 */
  var z: Double = js.native
}

object AccelerometerUpdateEvent {
  @scala.inline
  def apply(source: Accelerometer, timestamp: Double, x: Double, y: Double, z: Double): AccelerometerUpdateEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerUpdateEvent]
  }
  @scala.inline
  implicit class AccelerometerUpdateEventOps[Self <: AccelerometerUpdateEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

