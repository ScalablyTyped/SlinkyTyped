package typingsSlinky.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an accelerometer reading. */
@js.native
trait AccelerometerReading extends js.Object {
  /** Gets the g-force acceleration along the x-axis. */
  var accelerationX: Double = js.native
  /** Gets the g-force acceleration along the y-axis. */
  var accelerationY: Double = js.native
  /** Gets the g-force acceleration along the z-axis. */
  var accelerationZ: Double = js.native
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: js.Date = js.native
}

object AccelerometerReading {
  @scala.inline
  def apply(accelerationX: Double, accelerationY: Double, accelerationZ: Double, timestamp: js.Date): AccelerometerReading = {
    val __obj = js.Dynamic.literal(accelerationX = accelerationX.asInstanceOf[js.Any], accelerationY = accelerationY.asInstanceOf[js.Any], accelerationZ = accelerationZ.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerReading]
  }
  @scala.inline
  implicit class AccelerometerReadingOps[Self <: AccelerometerReading] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccelerationX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerationX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccelerationY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerationY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccelerationZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerationZ")(value.asInstanceOf[js.Any])
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

