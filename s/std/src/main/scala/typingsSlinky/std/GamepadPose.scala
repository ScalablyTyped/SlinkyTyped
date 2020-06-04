package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Gamepad API interface represents the pose of a WebVR controller at a given timestamp (which includes orientation, position, velocity, and acceleration information.) */
trait GamepadPose extends js.Object {
  val angularAcceleration: js.typedarray.Float32Array | Null
  val angularVelocity: js.typedarray.Float32Array | Null
  val hasOrientation: scala.Boolean
  val hasPosition: scala.Boolean
  val linearAcceleration: js.typedarray.Float32Array | Null
  val linearVelocity: js.typedarray.Float32Array | Null
  val orientation: js.typedarray.Float32Array | Null
  val position: js.typedarray.Float32Array | Null
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHasOrientation(value: scala.Boolean): Self = this.set("hasOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasPosition(value: scala.Boolean): Self = this.set("hasPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setAngularAcceleration(value: js.typedarray.Float32Array): Self = this.set("angularAcceleration", value.asInstanceOf[js.Any])
    @scala.inline
    def setAngularAccelerationNull: Self = this.set("angularAcceleration", null)
    @scala.inline
    def setAngularVelocity(value: js.typedarray.Float32Array): Self = this.set("angularVelocity", value.asInstanceOf[js.Any])
    @scala.inline
    def setAngularVelocityNull: Self = this.set("angularVelocity", null)
    @scala.inline
    def setLinearAcceleration(value: js.typedarray.Float32Array): Self = this.set("linearAcceleration", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinearAccelerationNull: Self = this.set("linearAcceleration", null)
    @scala.inline
    def setLinearVelocity(value: js.typedarray.Float32Array): Self = this.set("linearVelocity", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinearVelocityNull: Self = this.set("linearVelocity", null)
    @scala.inline
    def setOrientation(value: js.typedarray.Float32Array): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrientationNull: Self = this.set("orientation", null)
    @scala.inline
    def setPosition(value: js.typedarray.Float32Array): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setPositionNull: Self = this.set("position", null)
  }
  
}

