package typingsSlinky.w3cImageCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaTrackSupportedConstraints extends js.Object {
  var brightness: Boolean = js.native
  var colorTemperature: Boolean = js.native
  var contrast: Boolean = js.native
  var exposureCompensation: Boolean = js.native
  var exposureMode: Boolean = js.native
  var focusDistance: Boolean = js.native
  var focusMode: Boolean = js.native
  var iso: Boolean = js.native
  var pointsOfInterest: Boolean = js.native
  var saturation: Boolean = js.native
  var sharpness: Boolean = js.native
  var torch: Boolean = js.native
  var whiteBalanceMode: Boolean = js.native
  var zoom: Boolean = js.native
}

object MediaTrackSupportedConstraints {
  @scala.inline
  def apply(
    brightness: Boolean,
    colorTemperature: Boolean,
    contrast: Boolean,
    exposureCompensation: Boolean,
    exposureMode: Boolean,
    focusDistance: Boolean,
    focusMode: Boolean,
    iso: Boolean,
    pointsOfInterest: Boolean,
    saturation: Boolean,
    sharpness: Boolean,
    torch: Boolean,
    whiteBalanceMode: Boolean,
    zoom: Boolean
  ): MediaTrackSupportedConstraints = {
    val __obj = js.Dynamic.literal(brightness = brightness.asInstanceOf[js.Any], colorTemperature = colorTemperature.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], exposureCompensation = exposureCompensation.asInstanceOf[js.Any], exposureMode = exposureMode.asInstanceOf[js.Any], focusDistance = focusDistance.asInstanceOf[js.Any], focusMode = focusMode.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any], pointsOfInterest = pointsOfInterest.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any], sharpness = sharpness.asInstanceOf[js.Any], torch = torch.asInstanceOf[js.Any], whiteBalanceMode = whiteBalanceMode.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTrackSupportedConstraints]
  }
  @scala.inline
  implicit class MediaTrackSupportedConstraintsOps[Self <: MediaTrackSupportedConstraints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrightness(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorTemperature(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorTemperature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContrast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExposureCompensation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureCompensation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExposureMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusDistance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIso(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iso")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointsOfInterest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointsOfInterest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaturation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saturation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharpness(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharpness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTorch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("torch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhiteBalanceMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteBalanceMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

