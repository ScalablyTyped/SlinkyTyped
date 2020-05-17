package typingsSlinky.winrtUwp.Windows.Media.Capture

import typingsSlinky.winrtUwp.Windows.Media.Devices.AdvancedPhotoMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a photo captured using system-provided computational photography techniques provided by the AdvancedPhotoCapture class. */
@js.native
trait AdvancedCapturedPhoto extends js.Object {
  /** Gets the app-defined context object associated with the advanced photo capture operation, if one was provided in the call to AdvancedPhotoCapture::CaptureAsync(Object) . */
  var context: js.Any = js.native
  /** Gets the captured frame containing the result of the advanced photo capture. */
  var frame: CapturedFrame = js.native
  /** Gets a value indicating the advanced capture mode with which the photo was captured. */
  var mode: AdvancedPhotoMode = js.native
}

object AdvancedCapturedPhoto {
  @scala.inline
  def apply(context: js.Any, frame: CapturedFrame, mode: AdvancedPhotoMode): AdvancedCapturedPhoto = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedCapturedPhoto]
  }
  @scala.inline
  implicit class AdvancedCapturedPhotoOps[Self <: AdvancedCapturedPhoto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrame(value: CapturedFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: AdvancedPhotoMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

