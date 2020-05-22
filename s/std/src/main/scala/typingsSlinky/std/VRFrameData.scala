package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This WebVR API interface represents all the information needed to render a single frame of a VR scene; constructed by VRDisplay.getFrameData(). */
trait VRFrameData extends js.Object {
  val leftProjectionMatrix: js.typedarray.Float32Array
  val leftViewMatrix: js.typedarray.Float32Array
  val pose: VRPose
  val rightProjectionMatrix: js.typedarray.Float32Array
  val rightViewMatrix: js.typedarray.Float32Array
  val timestamp: Double
}

object VRFrameData {
  @scala.inline
  def apply(
    leftProjectionMatrix: js.typedarray.Float32Array,
    leftViewMatrix: js.typedarray.Float32Array,
    pose: VRPose,
    rightProjectionMatrix: js.typedarray.Float32Array,
    rightViewMatrix: js.typedarray.Float32Array,
    timestamp: Double
  ): VRFrameData = {
    val __obj = js.Dynamic.literal(leftProjectionMatrix = leftProjectionMatrix.asInstanceOf[js.Any], leftViewMatrix = leftViewMatrix.asInstanceOf[js.Any], pose = pose.asInstanceOf[js.Any], rightProjectionMatrix = rightProjectionMatrix.asInstanceOf[js.Any], rightViewMatrix = rightViewMatrix.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRFrameData]
  }
}

