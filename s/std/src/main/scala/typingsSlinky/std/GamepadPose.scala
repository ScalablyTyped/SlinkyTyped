package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Gamepad API interface represents the pose of a WebVR controller at a given timestamp (which includes orientation, position, velocity, and acceleration information.) */
@js.native
trait GamepadPose extends js.Object {
  val angularAcceleration: js.typedarray.Float32Array | Null = js.native
  val angularVelocity: js.typedarray.Float32Array | Null = js.native
  val hasOrientation: scala.Boolean = js.native
  val hasPosition: scala.Boolean = js.native
  val linearAcceleration: js.typedarray.Float32Array | Null = js.native
  val linearVelocity: js.typedarray.Float32Array | Null = js.native
  val orientation: js.typedarray.Float32Array | Null = js.native
  val position: js.typedarray.Float32Array | Null = js.native
}

object GamepadPose {
  @scala.inline
  def apply(hasOrientation: scala.Boolean, hasPosition: scala.Boolean): GamepadPose = {
    val __obj = js.Dynamic.literal(hasOrientation = hasOrientation.asInstanceOf[js.Any], hasPosition = hasPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadPose]
  }
  @scala.inline
  implicit class GamepadPoseOps[Self <: GamepadPose] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasOrientation(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasPosition(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAngularAcceleration(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularAcceleration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAngularAccelerationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularAcceleration")(null)
        ret
    }
    @scala.inline
    def withAngularVelocity(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAngularVelocityNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angularVelocity")(null)
        ret
    }
    @scala.inline
    def withLinearAcceleration(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearAcceleration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinearAccelerationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearAcceleration")(null)
        ret
    }
    @scala.inline
    def withLinearVelocity(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinearVelocityNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearVelocity")(null)
        ret
    }
    @scala.inline
    def withOrientation(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(null)
        ret
    }
    @scala.inline
    def withPosition(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(null)
        ret
    }
  }
  
}

