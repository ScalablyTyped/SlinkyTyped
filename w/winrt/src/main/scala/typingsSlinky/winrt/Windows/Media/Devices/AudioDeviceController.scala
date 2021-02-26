package typingsSlinky.winrt.Windows.Media.Devices

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Media.Capture.MediaStreamType
import typingsSlinky.winrt.Windows.Media.MediaProperties.IMediaEncodingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioDeviceController extends IAudioDeviceController
object AudioDeviceController {
  
  @scala.inline
  def apply(
    getAvailableMediaStreamProperties: MediaStreamType => IVectorView[IMediaEncodingProperties],
    getMediaStreamProperties: MediaStreamType => IMediaEncodingProperties,
    muted: Boolean,
    setMediaStreamPropertiesAsync: (MediaStreamType, IMediaEncodingProperties) => IAsyncAction,
    volumePercent: Double
  ): AudioDeviceController = {
    val __obj = js.Dynamic.literal(getAvailableMediaStreamProperties = js.Any.fromFunction1(getAvailableMediaStreamProperties), getMediaStreamProperties = js.Any.fromFunction1(getMediaStreamProperties), muted = muted.asInstanceOf[js.Any], setMediaStreamPropertiesAsync = js.Any.fromFunction2(setMediaStreamPropertiesAsync), volumePercent = volumePercent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioDeviceController]
  }
}
