package typingsSlinky.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an orientation-sensor reading. */
@js.native
trait OrientationSensorReading extends js.Object {
  /** Gets the Quaternion for the current orientation-sensor reading. */
  var quaternion: SensorQuaternion = js.native
  /** Gets the rotation matrix for the current orientation-sensor reading. */
  var rotationMatrix: SensorRotationMatrix = js.native
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: js.Date = js.native
  /** Gets the orientation sensor's z-axis accuracy. */
  var yawAccuracy: MagnetometerAccuracy = js.native
}

object OrientationSensorReading {
  @scala.inline
  def apply(
    quaternion: SensorQuaternion,
    rotationMatrix: SensorRotationMatrix,
    timestamp: js.Date,
    yawAccuracy: MagnetometerAccuracy
  ): OrientationSensorReading = {
    val __obj = js.Dynamic.literal(quaternion = quaternion.asInstanceOf[js.Any], rotationMatrix = rotationMatrix.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], yawAccuracy = yawAccuracy.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrientationSensorReading]
  }
  @scala.inline
  implicit class OrientationSensorReadingOps[Self <: OrientationSensorReading] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuaternion(value: SensorQuaternion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quaternion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotationMatrix(value: SensorRotationMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYawAccuracy(value: MagnetometerAccuracy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yawAccuracy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

