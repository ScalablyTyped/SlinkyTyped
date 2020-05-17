package typingsSlinky.winrt.Windows.Media.Devices

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Media.Capture.MediaStreamType
import typingsSlinky.winrt.Windows.Media.Capture.PowerlineFrequency
import typingsSlinky.winrt.Windows.Media.MediaProperties.IMediaEncodingProperties
import typingsSlinky.winrt.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVideoDeviceController extends IMediaDeviceController {
  var backlightCompensation: MediaDeviceControl = js.native
  var brightness: MediaDeviceControl = js.native
  var contrast: MediaDeviceControl = js.native
  var exposure: MediaDeviceControl = js.native
  var focus: MediaDeviceControl = js.native
  var hue: MediaDeviceControl = js.native
  var pan: MediaDeviceControl = js.native
  var roll: MediaDeviceControl = js.native
  var tilt: MediaDeviceControl = js.native
  var whiteBalance: MediaDeviceControl = js.native
  var zoom: MediaDeviceControl = js.native
  def tryGetPowerlineFrequency(): Value = js.native
  def trySetPowerlineFrequency(value: PowerlineFrequency): Boolean = js.native
}

object IVideoDeviceController {
  @scala.inline
  def apply(
    backlightCompensation: MediaDeviceControl,
    brightness: MediaDeviceControl,
    contrast: MediaDeviceControl,
    exposure: MediaDeviceControl,
    focus: MediaDeviceControl,
    getAvailableMediaStreamProperties: MediaStreamType => IVectorView[IMediaEncodingProperties],
    getMediaStreamProperties: MediaStreamType => IMediaEncodingProperties,
    hue: MediaDeviceControl,
    pan: MediaDeviceControl,
    roll: MediaDeviceControl,
    setMediaStreamPropertiesAsync: (MediaStreamType, IMediaEncodingProperties) => IAsyncAction,
    tilt: MediaDeviceControl,
    tryGetPowerlineFrequency: () => Value,
    trySetPowerlineFrequency: PowerlineFrequency => Boolean,
    whiteBalance: MediaDeviceControl,
    zoom: MediaDeviceControl
  ): IVideoDeviceController = {
    val __obj = js.Dynamic.literal(backlightCompensation = backlightCompensation.asInstanceOf[js.Any], brightness = brightness.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], exposure = exposure.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], getAvailableMediaStreamProperties = js.Any.fromFunction1(getAvailableMediaStreamProperties), getMediaStreamProperties = js.Any.fromFunction1(getMediaStreamProperties), hue = hue.asInstanceOf[js.Any], pan = pan.asInstanceOf[js.Any], roll = roll.asInstanceOf[js.Any], setMediaStreamPropertiesAsync = js.Any.fromFunction2(setMediaStreamPropertiesAsync), tilt = tilt.asInstanceOf[js.Any], tryGetPowerlineFrequency = js.Any.fromFunction0(tryGetPowerlineFrequency), trySetPowerlineFrequency = js.Any.fromFunction1(trySetPowerlineFrequency), whiteBalance = whiteBalance.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVideoDeviceController]
  }
  @scala.inline
  implicit class IVideoDeviceControllerOps[Self <: IVideoDeviceController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBacklightCompensation(value: MediaDeviceControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backlightCompensation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrightness(value: MediaDeviceControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContrast(value: MediaDeviceControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExposure(value: MediaDeviceControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocus(value: MediaDeviceControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHue(value: MediaDeviceControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPan(value: MediaDeviceControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoll(value: MediaDeviceControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTilt(value: MediaDeviceControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTryGetPowerlineFrequency(value: () => Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryGetPowerlineFrequency")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTrySetPowerlineFrequency(value: PowerlineFrequency => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trySetPowerlineFrequency")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWhiteBalance(value: MediaDeviceControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteBalance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoom(value: MediaDeviceControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

