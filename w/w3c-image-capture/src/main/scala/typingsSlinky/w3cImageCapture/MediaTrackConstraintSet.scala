package typingsSlinky.w3cImageCapture

import typingsSlinky.w3cImageCapture.W3C.ConstrainPoint2D
import typingsSlinky.webrtc.W3C.ConstrainBoolean
import typingsSlinky.webrtc.W3C.ConstrainDouble
import typingsSlinky.webrtc.W3C.ConstrainString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaTrackConstraintSet extends js.Object {
  var brightness: js.UndefOr[ConstrainDouble] = js.native
  var colorTemperature: js.UndefOr[ConstrainDouble] = js.native
  var contrast: js.UndefOr[ConstrainDouble] = js.native
  var exposureCompensation: js.UndefOr[ConstrainDouble] = js.native
  var exposureMode: js.UndefOr[ConstrainString] = js.native
  var focusDistance: js.UndefOr[ConstrainDouble] = js.native
  var focusMode: js.UndefOr[ConstrainString] = js.native
  var iso: js.UndefOr[ConstrainDouble] = js.native
  var pointsOfInterest: js.UndefOr[ConstrainPoint2D] = js.native
  var saturation: js.UndefOr[ConstrainDouble] = js.native
  var sharpness: js.UndefOr[ConstrainDouble] = js.native
  var torch: js.UndefOr[ConstrainBoolean] = js.native
  var whiteBalanceMode: js.UndefOr[ConstrainString] = js.native
  var zoom: js.UndefOr[ConstrainDouble] = js.native
}

object MediaTrackConstraintSet {
  @scala.inline
  def apply(): MediaTrackConstraintSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTrackConstraintSet]
  }
  @scala.inline
  implicit class MediaTrackConstraintSetOps[Self <: MediaTrackConstraintSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrightness(value: ConstrainDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrightness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightness")(js.undefined)
        ret
    }
    @scala.inline
    def withColorTemperature(value: ConstrainDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorTemperature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorTemperature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorTemperature")(js.undefined)
        ret
    }
    @scala.inline
    def withContrast(value: ConstrainDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContrast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrast")(js.undefined)
        ret
    }
    @scala.inline
    def withExposureCompensation(value: ConstrainDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureCompensation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExposureCompensation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureCompensation")(js.undefined)
        ret
    }
    @scala.inline
    def withExposureMode(value: ConstrainString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExposureMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureMode")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusDistance(value: ConstrainDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusMode(value: ConstrainString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusMode")(js.undefined)
        ret
    }
    @scala.inline
    def withIso(value: ConstrainDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iso")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIso: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iso")(js.undefined)
        ret
    }
    @scala.inline
    def withPointsOfInterest(value: ConstrainPoint2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointsOfInterest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointsOfInterest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointsOfInterest")(js.undefined)
        ret
    }
    @scala.inline
    def withSaturation(value: ConstrainDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saturation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaturation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saturation")(js.undefined)
        ret
    }
    @scala.inline
    def withSharpness(value: ConstrainDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharpness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharpness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharpness")(js.undefined)
        ret
    }
    @scala.inline
    def withTorch(value: ConstrainBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("torch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTorch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("torch")(js.undefined)
        ret
    }
    @scala.inline
    def withWhiteBalanceMode(value: ConstrainString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteBalanceMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhiteBalanceMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteBalanceMode")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: ConstrainDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
  }
  
}

