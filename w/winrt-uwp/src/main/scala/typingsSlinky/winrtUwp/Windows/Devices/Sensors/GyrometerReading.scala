package typingsSlinky.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a gyrometer reading. */
@js.native
trait GyrometerReading extends js.Object {
  /** Gets the angular velocity, in degrees per second, about the x-axis. */
  var angularVelocityX: Double = js.native
  /** Gets the angular velocity, in degrees per second, about the y-axis. */
  var angularVelocityY: Double = js.native
  /** Gets the angular velocity, in degrees per second, about the z-axis. */
  var angularVelocityZ: Double = js.native
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: js.Date = js.native
}

object GyrometerReading {
  @scala.inline
  def apply(angularVelocityX: Double, angularVelocityY: Double, angularVelocityZ: Double, timestamp: js.Date): GyrometerReading = {
    val __obj = js.Dynamic.literal(angularVelocityX = angularVelocityX.asInstanceOf[js.Any], angularVelocityY = angularVelocityY.asInstanceOf[js.Any], angularVelocityZ = angularVelocityZ.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GyrometerReading]
  }
  @scala.inline
  implicit class GyrometerReadingOps[Self <: GyrometerReading] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngularVelocityX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularVelocityX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAngularVelocityY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularVelocityY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAngularVelocityZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularVelocityZ")(value.asInstanceOf[js.Any])
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

