package typingsSlinky.winrtUwp.Windows.Media.Devices.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the settings for a frame in a variable photo sequence. */
@js.native
trait FrameController extends js.Object {
  /** Gets the exposure compensation settings for a frame in a variable photo sequence. */
  var exposureCompensationControl: FrameExposureCompensationControl = js.native
  /** Gets the exposure settings for a frame in a variable photo sequence. */
  var exposureControl: FrameExposureControl = js.native
  /** Gets the flash settings for a frame in a variable photo sequence. */
  var flashControl: FrameFlashControl = js.native
  /** Gets the focus settings for a frame in a variable photo sequence. */
  var focusControl: FrameFocusControl = js.native
  /** Gets the ISO speed settings for a frame in a variable photo sequence. */
  var isoSpeedControl: FrameIsoSpeedControl = js.native
  /** Gets or sets whether photo confirmation is enabled for a frame in a variable photo sequence. */
  var photoConfirmationEnabled: Boolean = js.native
}

object FrameController {
  @scala.inline
  def apply(
    exposureCompensationControl: FrameExposureCompensationControl,
    exposureControl: FrameExposureControl,
    flashControl: FrameFlashControl,
    focusControl: FrameFocusControl,
    isoSpeedControl: FrameIsoSpeedControl,
    photoConfirmationEnabled: Boolean
  ): FrameController = {
    val __obj = js.Dynamic.literal(exposureCompensationControl = exposureCompensationControl.asInstanceOf[js.Any], exposureControl = exposureControl.asInstanceOf[js.Any], flashControl = flashControl.asInstanceOf[js.Any], focusControl = focusControl.asInstanceOf[js.Any], isoSpeedControl = isoSpeedControl.asInstanceOf[js.Any], photoConfirmationEnabled = photoConfirmationEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameController]
  }
  @scala.inline
  implicit class FrameControllerOps[Self <: FrameController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExposureCompensationControl(value: FrameExposureCompensationControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureCompensationControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExposureControl(value: FrameExposureControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlashControl(value: FrameFlashControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusControl(value: FrameFocusControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsoSpeedControl(value: FrameIsoSpeedControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isoSpeedControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhotoConfirmationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoConfirmationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

