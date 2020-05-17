package typingsSlinky.winrtUwp.Windows.Media.Devices.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the variable photo sequence capabilities of the capture device. */
@js.native
trait FrameControlCapabilities extends js.Object {
  /** Gets the exposure capabilities of the capture device for variable photo sequences. */
  var exposure: FrameExposureCapabilities = js.native
  /** Gets the exposure compensation capabilities of the capture device for variable photo sequences. */
  var exposureCompensation: FrameExposureCompensationCapabilities = js.native
  /** Gets the flash capabilities of the capture device for variable photo sequences. */
  var flash: FrameFlashCapabilities = js.native
  /** Gets the focus capabilities of the capture device for variable photo sequences. */
  var focus: FrameFocusCapabilities = js.native
  /** Gets the ISO speed capabilities of the capture device for variable photo sequences. */
  var isoSpeed: FrameIsoSpeedCapabilities = js.native
  /** Gets whether the capture device supports photo confirmation for variable photo sequences. */
  var photoConfirmationSupported: Boolean = js.native
}

object FrameControlCapabilities {
  @scala.inline
  def apply(
    exposure: FrameExposureCapabilities,
    exposureCompensation: FrameExposureCompensationCapabilities,
    flash: FrameFlashCapabilities,
    focus: FrameFocusCapabilities,
    isoSpeed: FrameIsoSpeedCapabilities,
    photoConfirmationSupported: Boolean
  ): FrameControlCapabilities = {
    val __obj = js.Dynamic.literal(exposure = exposure.asInstanceOf[js.Any], exposureCompensation = exposureCompensation.asInstanceOf[js.Any], flash = flash.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], isoSpeed = isoSpeed.asInstanceOf[js.Any], photoConfirmationSupported = photoConfirmationSupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameControlCapabilities]
  }
  @scala.inline
  implicit class FrameControlCapabilitiesOps[Self <: FrameControlCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExposure(value: FrameExposureCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExposureCompensation(value: FrameExposureCompensationCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureCompensation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlash(value: FrameFlashCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocus(value: FrameFocusCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsoSpeed(value: FrameIsoSpeedCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isoSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhotoConfirmationSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoConfirmationSupported")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

