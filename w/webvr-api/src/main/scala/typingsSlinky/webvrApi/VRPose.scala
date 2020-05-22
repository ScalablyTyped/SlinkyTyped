package typingsSlinky.webvrApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VRPose extends js.Object {
  val angularAcceleration: js.typedarray.Float32Array | Null
  val angularVelocity: js.typedarray.Float32Array | Null
  val linearAcceleration: js.typedarray.Float32Array | Null
  val linearVelocity: js.typedarray.Float32Array | Null
  val orientation: js.typedarray.Float32Array | Null
  val position: js.typedarray.Float32Array | Null
  val timestamp: Double
}

object VRPose {
  @scala.inline
  def apply(
    timestamp: Double,
    angularAcceleration: js.typedarray.Float32Array = null,
    angularVelocity: js.typedarray.Float32Array = null,
    linearAcceleration: js.typedarray.Float32Array = null,
    linearVelocity: js.typedarray.Float32Array = null,
    orientation: js.typedarray.Float32Array = null,
    position: js.typedarray.Float32Array = null
  ): VRPose = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], angularAcceleration = angularAcceleration.asInstanceOf[js.Any], angularVelocity = angularVelocity.asInstanceOf[js.Any], linearAcceleration = linearAcceleration.asInstanceOf[js.Any], linearVelocity = linearVelocity.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRPose]
  }
}

