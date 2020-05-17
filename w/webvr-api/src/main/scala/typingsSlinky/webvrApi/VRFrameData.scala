package typingsSlinky.webvrApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VRFrameData extends js.Object {
  val leftProjectionMatrix: js.typedarray.Float32Array = js.native
  val leftViewMatrix: js.typedarray.Float32Array = js.native
  val pose: VRPose = js.native
  val rightProjectionMatrix: js.typedarray.Float32Array = js.native
  val rightViewMatrix: js.typedarray.Float32Array = js.native
  val timestamp: Double = js.native
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
  @scala.inline
  implicit class VRFrameDataOps[Self <: VRFrameData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeftProjectionMatrix(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftProjectionMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftViewMatrix(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftViewMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPose(value: VRPose): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightProjectionMatrix(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightProjectionMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightViewMatrix(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightViewMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

