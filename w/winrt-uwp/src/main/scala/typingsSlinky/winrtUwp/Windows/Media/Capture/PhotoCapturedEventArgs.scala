package typingsSlinky.winrtUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the photo sequence PhotoCaptured event. */
@js.native
trait PhotoCapturedEventArgs extends js.Object {
  /** Gets a value that indicates time offset in the photo sequence. */
  var captureTimeOffset: Double = js.native
  /** Gets the captured image associated with the event. */
  var frame: CapturedFrame = js.native
  /** Gets a thumbnail version of the captured image associated with the event. */
  var thumbnail: CapturedFrame = js.native
}

object PhotoCapturedEventArgs {
  @scala.inline
  def apply(captureTimeOffset: Double, frame: CapturedFrame, thumbnail: CapturedFrame): PhotoCapturedEventArgs = {
    val __obj = js.Dynamic.literal(captureTimeOffset = captureTimeOffset.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoCapturedEventArgs]
  }
  @scala.inline
  implicit class PhotoCapturedEventArgsOps[Self <: PhotoCapturedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptureTimeOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureTimeOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrame(value: CapturedFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnail(value: CapturedFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

