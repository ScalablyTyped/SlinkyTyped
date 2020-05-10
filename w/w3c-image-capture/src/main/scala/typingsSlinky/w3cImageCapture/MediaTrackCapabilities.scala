package typingsSlinky.w3cImageCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaTrackCapabilities extends js.Object {
  var brightness: MediaSettingsRange = js.native
  var colorTemperature: MediaSettingsRange = js.native
  var contrast: MediaSettingsRange = js.native
  var exposureCompensation: MediaSettingsRange = js.native
  var exposureMode: js.Array[MeteringMode] = js.native
  var focusDistance: MediaSettingsRange = js.native
  var focusMode: js.Array[MeteringMode] = js.native
  var iso: MediaSettingsRange = js.native
  var saturation: MediaSettingsRange = js.native
  var sharpness: MediaSettingsRange = js.native
  var torch: Boolean = js.native
  var whiteBalanceMode: js.Array[MeteringMode] = js.native
  var zoom: MediaSettingsRange = js.native
}

object MediaTrackCapabilities {
  @scala.inline
  def apply(
    brightness: MediaSettingsRange,
    colorTemperature: MediaSettingsRange,
    contrast: MediaSettingsRange,
    exposureCompensation: MediaSettingsRange,
    exposureMode: js.Array[MeteringMode],
    focusDistance: MediaSettingsRange,
    focusMode: js.Array[MeteringMode],
    iso: MediaSettingsRange,
    saturation: MediaSettingsRange,
    sharpness: MediaSettingsRange,
    torch: Boolean,
    whiteBalanceMode: js.Array[MeteringMode],
    zoom: MediaSettingsRange
  ): MediaTrackCapabilities = {
    val __obj = js.Dynamic.literal(brightness = brightness.asInstanceOf[js.Any], colorTemperature = colorTemperature.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], exposureCompensation = exposureCompensation.asInstanceOf[js.Any], exposureMode = exposureMode.asInstanceOf[js.Any], focusDistance = focusDistance.asInstanceOf[js.Any], focusMode = focusMode.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any], sharpness = sharpness.asInstanceOf[js.Any], torch = torch.asInstanceOf[js.Any], whiteBalanceMode = whiteBalanceMode.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTrackCapabilities]
  }
  @scala.inline
  implicit class MediaTrackCapabilitiesOps[Self <: MediaTrackCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrightness(value: MediaSettingsRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorTemperature(value: MediaSettingsRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorTemperature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContrast(value: MediaSettingsRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExposureCompensation(value: MediaSettingsRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureCompensation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExposureMode(value: js.Array[MeteringMode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusDistance(value: MediaSettingsRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusMode(value: js.Array[MeteringMode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIso(value: MediaSettingsRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iso")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaturation(value: MediaSettingsRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saturation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharpness(value: MediaSettingsRange): Self = {
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
    def withWhiteBalanceMode(value: js.Array[MeteringMode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteBalanceMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoom(value: MediaSettingsRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

