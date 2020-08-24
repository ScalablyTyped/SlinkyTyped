package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This WebVR API interface represents the state of a VR sensor at a given timestamp (which includes orientation, position, velocity, and acceleration information.) */
@js.native
trait VRPose extends js.Object {
  val angularAcceleration: js.typedarray.Float32Array | Null = js.native
  val angularVelocity: js.typedarray.Float32Array | Null = js.native
  val linearAcceleration: js.typedarray.Float32Array | Null = js.native
  val linearVelocity: js.typedarray.Float32Array | Null = js.native
  val orientation: js.typedarray.Float32Array | Null = js.native
  val position: js.typedarray.Float32Array | Null = js.native
  val timestamp: Double = js.native
}

object VRPose {
  @scala.inline
  def apply(timestamp: Double): VRPose = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRPose]
  }
  @scala.inline
  implicit class VRPoseOps[Self <: VRPose] (val x: Self) extends AnyVal {
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
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
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

