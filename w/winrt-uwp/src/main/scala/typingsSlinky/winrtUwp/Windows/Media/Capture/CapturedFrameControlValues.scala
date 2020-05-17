package typingsSlinky.winrtUwp.Windows.Media.Capture

import typingsSlinky.winrtUwp.Windows.Media.Devices.CaptureSceneMode
import typingsSlinky.winrtUwp.Windows.Media.Devices.MediaCaptureFocusState
import typingsSlinky.winrtUwp.Windows.Media.MediaProperties.MediaRatio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the capture device settings that were used for a frame in a variable photo sequence. */
@js.native
trait CapturedFrameControlValues extends js.Object {
  /** Gets the exposure time used for a frame in a variable photo sequence. */
  var exposure: Double = js.native
  /** Gets the exposure compensation value used for a frame in a variable photo sequence. */
  var exposureCompensation: Double = js.native
  /** Gets the flash power used for a frame in a variable photo sequence. */
  var flashPowerPercent: Double = js.native
  /** Gets a value indicating if the flash was used for a frame in a variable photo sequence. */
  var flashed: Boolean = js.native
  /** Gets the focus lens position used for a frame in a variable photo sequence. */
  var focus: Double = js.native
  /** Gets the focus state for a frame in a variable photo sequence. */
  var focusState: MediaCaptureFocusState = js.native
  /** Gets the ISO analog gain used for a frame in a variable photo sequence. */
  var isoAnalogGain: Double = js.native
  /** Gets the ISO digital gain used for a frame in a variable photo sequence. */
  var isoDigitalGain: Double = js.native
  /** Gets the ISO speed used for a frame in a variable photo sequence. */
  var isoSpeed: Double = js.native
  /** Gets the scene mode used for a frame in a variable photo sequence. */
  var sceneMode: CaptureSceneMode = js.native
  /** Gets the sensor frame rate used for a frame in a variable photo sequence. */
  var sensorFrameRate: MediaRatio = js.native
  /** Gets the white balance setting used for a frame in a variable photo sequence. */
  var whiteBalance: Double = js.native
  /** Gets the white balance gain used for a frame in a variable photo sequence. */
  var whiteBalanceGain: WhiteBalanceGain = js.native
  /** Gets the zoom factor used for a frame in a variable photo sequence. */
  var zoomFactor: Double = js.native
}

object CapturedFrameControlValues {
  @scala.inline
  def apply(
    exposure: Double,
    exposureCompensation: Double,
    flashPowerPercent: Double,
    flashed: Boolean,
    focus: Double,
    focusState: MediaCaptureFocusState,
    isoAnalogGain: Double,
    isoDigitalGain: Double,
    isoSpeed: Double,
    sceneMode: CaptureSceneMode,
    sensorFrameRate: MediaRatio,
    whiteBalance: Double,
    whiteBalanceGain: WhiteBalanceGain,
    zoomFactor: Double
  ): CapturedFrameControlValues = {
    val __obj = js.Dynamic.literal(exposure = exposure.asInstanceOf[js.Any], exposureCompensation = exposureCompensation.asInstanceOf[js.Any], flashPowerPercent = flashPowerPercent.asInstanceOf[js.Any], flashed = flashed.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusState = focusState.asInstanceOf[js.Any], isoAnalogGain = isoAnalogGain.asInstanceOf[js.Any], isoDigitalGain = isoDigitalGain.asInstanceOf[js.Any], isoSpeed = isoSpeed.asInstanceOf[js.Any], sceneMode = sceneMode.asInstanceOf[js.Any], sensorFrameRate = sensorFrameRate.asInstanceOf[js.Any], whiteBalance = whiteBalance.asInstanceOf[js.Any], whiteBalanceGain = whiteBalanceGain.asInstanceOf[js.Any], zoomFactor = zoomFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapturedFrameControlValues]
  }
  @scala.inline
  implicit class CapturedFrameControlValuesOps[Self <: CapturedFrameControlValues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExposure(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExposureCompensation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureCompensation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlashPowerPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashPowerPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlashed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusState(value: MediaCaptureFocusState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsoAnalogGain(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isoAnalogGain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsoDigitalGain(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isoDigitalGain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsoSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isoSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSceneMode(value: CaptureSceneMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sceneMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSensorFrameRate(value: MediaRatio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensorFrameRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhiteBalance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteBalance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhiteBalanceGain(value: WhiteBalanceGain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteBalanceGain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomFactor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

