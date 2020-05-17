package typingsSlinky.winrtUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a description of media that is supported by a video profile. */
@js.native
trait MediaCaptureVideoProfileMediaDescription extends js.Object {
  /** Gets the frame rate of the media description. */
  var frameRate: Double = js.native
  /** Gets the height of the media description. */
  var height: Double = js.native
  /** Gets a value indicating if the media description includes HDR video support. */
  var isHdrVideoSupported: Boolean = js.native
  /** Gets a value indicating if the media description includes variable photo sequence support. */
  var isVariablePhotoSequenceSupported: Boolean = js.native
  /** Gets the height of the media description. */
  var width: Double = js.native
}

object MediaCaptureVideoProfileMediaDescription {
  @scala.inline
  def apply(
    frameRate: Double,
    height: Double,
    isHdrVideoSupported: Boolean,
    isVariablePhotoSequenceSupported: Boolean,
    width: Double
  ): MediaCaptureVideoProfileMediaDescription = {
    val __obj = js.Dynamic.literal(frameRate = frameRate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isHdrVideoSupported = isHdrVideoSupported.asInstanceOf[js.Any], isVariablePhotoSequenceSupported = isVariablePhotoSequenceSupported.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCaptureVideoProfileMediaDescription]
  }
  @scala.inline
  implicit class MediaCaptureVideoProfileMediaDescriptionOps[Self <: MediaCaptureVideoProfileMediaDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrameRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHdrVideoSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHdrVideoSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVariablePhotoSequenceSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVariablePhotoSequenceSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

