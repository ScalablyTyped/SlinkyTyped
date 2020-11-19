package typingsSlinky.winrt.Windows.Media.Devices

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Media.Capture.MediaStreamType
import typingsSlinky.winrt.Windows.Media.Capture.PowerlineFrequency
import typingsSlinky.winrt.Windows.Media.MediaProperties.IMediaEncodingProperties
import typingsSlinky.winrt.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoDeviceController
  extends IVideoDeviceController
     with IAdvancedVideoCaptureDeviceController
object VideoDeviceController {
  
  @scala.inline
  def apply(
    backlightCompensation: MediaDeviceControl,
    brightness: MediaDeviceControl,
    contrast: MediaDeviceControl,
    exposure: MediaDeviceControl,
    focus: MediaDeviceControl,
    getAvailableMediaStreamProperties: MediaStreamType => IVectorView[IMediaEncodingProperties],
    getDeviceProperty: String => js.Any,
    getMediaStreamProperties: MediaStreamType => IMediaEncodingProperties,
    hue: MediaDeviceControl,
    pan: MediaDeviceControl,
    roll: MediaDeviceControl,
    setDeviceProperty: (String, js.Any) => Unit,
    setMediaStreamPropertiesAsync: (MediaStreamType, IMediaEncodingProperties) => IAsyncAction,
    tilt: MediaDeviceControl,
    tryGetPowerlineFrequency: () => Value,
    trySetPowerlineFrequency: PowerlineFrequency => Boolean,
    whiteBalance: MediaDeviceControl,
    zoom: MediaDeviceControl
  ): VideoDeviceController = {
    val __obj = js.Dynamic.literal(backlightCompensation = backlightCompensation.asInstanceOf[js.Any], brightness = brightness.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], exposure = exposure.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], getAvailableMediaStreamProperties = js.Any.fromFunction1(getAvailableMediaStreamProperties), getDeviceProperty = js.Any.fromFunction1(getDeviceProperty), getMediaStreamProperties = js.Any.fromFunction1(getMediaStreamProperties), hue = hue.asInstanceOf[js.Any], pan = pan.asInstanceOf[js.Any], roll = roll.asInstanceOf[js.Any], setDeviceProperty = js.Any.fromFunction2(setDeviceProperty), setMediaStreamPropertiesAsync = js.Any.fromFunction2(setMediaStreamPropertiesAsync), tilt = tilt.asInstanceOf[js.Any], tryGetPowerlineFrequency = js.Any.fromFunction0(tryGetPowerlineFrequency), trySetPowerlineFrequency = js.Any.fromFunction1(trySetPowerlineFrequency), whiteBalance = whiteBalance.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoDeviceController]
  }
}
