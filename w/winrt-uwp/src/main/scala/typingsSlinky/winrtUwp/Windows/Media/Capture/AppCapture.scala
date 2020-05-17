package typingsSlinky.winrtUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppCapture extends js.Object {
   /* unmapped type */ var addEventListener: js.Any = js.native
   /* unmapped type */ var isCapturingAudio: js.Any = js.native
   /* unmapped type */ var isCapturingVideo: js.Any = js.native
   /* unmapped type */ var oncapturingchanged: js.Any = js.native
   /* unmapped type */ var removeEventListener: js.Any = js.native
}

object AppCapture {
  @scala.inline
  def apply(
    addEventListener: js.Any,
    isCapturingAudio: js.Any,
    isCapturingVideo: js.Any,
    oncapturingchanged: js.Any,
    removeEventListener: js.Any
  ): AppCapture = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], isCapturingAudio = isCapturingAudio.asInstanceOf[js.Any], isCapturingVideo = isCapturingVideo.asInstanceOf[js.Any], oncapturingchanged = oncapturingchanged.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppCapture]
  }
  @scala.inline
  implicit class AppCaptureOps[Self <: AppCapture] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEventListener(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCapturingAudio(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCapturingAudio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCapturingVideo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCapturingVideo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOncapturingchanged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncapturingchanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveEventListener(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

