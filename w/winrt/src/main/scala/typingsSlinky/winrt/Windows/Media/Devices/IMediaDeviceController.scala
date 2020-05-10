package typingsSlinky.winrt.Windows.Media.Devices

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Media.Capture.MediaStreamType
import typingsSlinky.winrt.Windows.Media.MediaProperties.IMediaEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMediaDeviceController extends js.Object {
  def getAvailableMediaStreamProperties(mediaStreamType: MediaStreamType): IVectorView[IMediaEncodingProperties] = js.native
  def getMediaStreamProperties(mediaStreamType: MediaStreamType): IMediaEncodingProperties = js.native
  def setMediaStreamPropertiesAsync(mediaStreamType: MediaStreamType, mediaEncodingProperties: IMediaEncodingProperties): IAsyncAction = js.native
}

object IMediaDeviceController {
  @scala.inline
  def apply(
    getAvailableMediaStreamProperties: MediaStreamType => IVectorView[IMediaEncodingProperties],
    getMediaStreamProperties: MediaStreamType => IMediaEncodingProperties,
    setMediaStreamPropertiesAsync: (MediaStreamType, IMediaEncodingProperties) => IAsyncAction
  ): IMediaDeviceController = {
    val __obj = js.Dynamic.literal(getAvailableMediaStreamProperties = js.Any.fromFunction1(getAvailableMediaStreamProperties), getMediaStreamProperties = js.Any.fromFunction1(getMediaStreamProperties), setMediaStreamPropertiesAsync = js.Any.fromFunction2(setMediaStreamPropertiesAsync))
    __obj.asInstanceOf[IMediaDeviceController]
  }
  @scala.inline
  implicit class IMediaDeviceControllerOps[Self <: IMediaDeviceController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAvailableMediaStreamProperties(value: MediaStreamType => IVectorView[IMediaEncodingProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAvailableMediaStreamProperties")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetMediaStreamProperties(value: MediaStreamType => IMediaEncodingProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMediaStreamProperties")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMediaStreamPropertiesAsync(value: (MediaStreamType, IMediaEncodingProperties) => IAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMediaStreamPropertiesAsync")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

