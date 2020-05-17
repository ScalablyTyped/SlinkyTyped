package typingsSlinky.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the FaceDetected event. */
@js.native
trait FaceDetectedEventArgs extends js.Object {
  /** Gets the FaceDetectionEffectFrame associated with a FaceDetected event. */
  var resultFrame: FaceDetectionEffectFrame = js.native
}

object FaceDetectedEventArgs {
  @scala.inline
  def apply(resultFrame: FaceDetectionEffectFrame): FaceDetectedEventArgs = {
    val __obj = js.Dynamic.literal(resultFrame = resultFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceDetectedEventArgs]
  }
  @scala.inline
  implicit class FaceDetectedEventArgsOps[Self <: FaceDetectedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResultFrame(value: FaceDetectionEffectFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultFrame")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

