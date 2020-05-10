package typingsSlinky.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Fired when the device is shaken.
	 */
@js.native
trait GestureShakeEvent extends GestureBaseEvent {
  /**
  		 * Time interval since previous shake event. On iOS, this value is 0 for the first shake
  		 * event in a series.
  		 */
  var timestamp: Double = js.native
  /**
  		 * Acceleration along the X axis, in Gs.
  		 */
  var x: Double = js.native
  /**
  		 * Acceleration along the Y axis, in Gs.
  		 */
  var y: Double = js.native
  /**
  		 * Acceleration along the Z axis, in Gs.
  		 */
  var z: Double = js.native
}

object GestureShakeEvent {
  @scala.inline
  def apply(source: Gesture, timestamp: Double, x: Double, y: Double, z: Double): GestureShakeEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureShakeEvent]
  }
  @scala.inline
  implicit class GestureShakeEventOps[Self <: GestureShakeEvent] (val x: Self) extends AnyVal {
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

