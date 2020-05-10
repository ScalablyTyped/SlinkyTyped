package typingsSlinky.w3cImageCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaTrackSettings extends js.Object {
  var brightness: Double = js.native
  var colorTemperature: Double = js.native
  var contrast: Double = js.native
  var exposureCompensation: Double = js.native
  var exposureMode: MeteringMode = js.native
  var focusDistance: Double = js.native
  var focusMode: MeteringMode = js.native
  var iso: Double = js.native
  var pointsOfInterest: js.Array[Point2D] = js.native
  var saturation: Double = js.native
  var sharpness: Double = js.native
  var torch: Boolean = js.native
  var whiteBalanceMode: MeteringMode = js.native
  var zoom: Double = js.native
}

object MediaTrackSettings {
  @scala.inline
  def apply(
    brightness: Double,
    colorTemperature: Double,
    contrast: Double,
    exposureCompensation: Double,
    exposureMode: MeteringMode,
    focusDistance: Double,
    focusMode: MeteringMode,
    iso: Double,
    pointsOfInterest: js.Array[Point2D],
    saturation: Double,
    sharpness: Double,
    torch: Boolean,
    whiteBalanceMode: MeteringMode,
    zoom: Double
  ): MediaTrackSettings = {
    val __obj = js.Dynamic.literal(brightness = brightness.asInstanceOf[js.Any], colorTemperature = colorTemperature.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], exposureCompensation = exposureCompensation.asInstanceOf[js.Any], exposureMode = exposureMode.asInstanceOf[js.Any], focusDistance = focusDistance.asInstanceOf[js.Any], focusMode = focusMode.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any], pointsOfInterest = pointsOfInterest.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any], sharpness = sharpness.asInstanceOf[js.Any], torch = torch.asInstanceOf[js.Any], whiteBalanceMode = whiteBalanceMode.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTrackSettings]
  }
  @scala.inline
  implicit class MediaTrackSettingsOps[Self <: MediaTrackSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrightness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorTemperature(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorTemperature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContrast(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExposureCompensation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureCompensation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExposureMode(value: MeteringMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusMode(value: MeteringMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIso(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iso")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointsOfInterest(value: js.Array[Point2D]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointsOfInterest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaturation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saturation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharpness(value: Double): Self = {
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
    def withWhiteBalanceMode(value: MeteringMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteBalanceMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

