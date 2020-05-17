package typingsSlinky.winrtUwp.Windows.Media.Devices

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsSlinky.winrtUwp.Windows.Media.Capture.MediaStreamType
import typingsSlinky.winrtUwp.Windows.Media.MediaProperties.IMediaEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Controls device settings on the microphone. */
@js.native
trait AudioDeviceController extends js.Object {
  /** Mutes or unmutes the microphone. */
  var muted: Boolean = js.native
  /** Gets or sets the volume of the microphone. */
  var volumePercent: Double = js.native
  /**
    * Gets a list of the supported encoding properties for the device.
    * @param mediaStreamType The type of media stream for which to get the properties.
    * @return A list of the supported encoding properties.
    */
  def getAvailableMediaStreamProperties(mediaStreamType: MediaStreamType): IVectorView[IMediaEncodingProperties] = js.native
  /**
    * Gets the encoding properties for the specified media stream type for the device.
    * @param mediaStreamType The type of media stream for which to get the properties.
    * @return The encoding properties.
    */
  def getMediaStreamProperties(mediaStreamType: MediaStreamType): IMediaEncodingProperties = js.native
  /**
    * Sets the encoding properties asynchronously for the specified media stream type for the device.
    * @param mediaStreamType The type of media stream for which to set the properties.
    * @param mediaEncodingProperties The encoding properties to set.
    * @return An IAsyncAction object that is used to control the asynchronous operation.
    */
  def setMediaStreamPropertiesAsync(mediaStreamType: MediaStreamType, mediaEncodingProperties: IMediaEncodingProperties): IPromiseWithIAsyncAction = js.native
}

object AudioDeviceController {
  @scala.inline
  def apply(
    getAvailableMediaStreamProperties: MediaStreamType => IVectorView[IMediaEncodingProperties],
    getMediaStreamProperties: MediaStreamType => IMediaEncodingProperties,
    muted: Boolean,
    setMediaStreamPropertiesAsync: (MediaStreamType, IMediaEncodingProperties) => IPromiseWithIAsyncAction,
    volumePercent: Double
  ): AudioDeviceController = {
    val __obj = js.Dynamic.literal(getAvailableMediaStreamProperties = js.Any.fromFunction1(getAvailableMediaStreamProperties), getMediaStreamProperties = js.Any.fromFunction1(getMediaStreamProperties), muted = muted.asInstanceOf[js.Any], setMediaStreamPropertiesAsync = js.Any.fromFunction2(setMediaStreamPropertiesAsync), volumePercent = volumePercent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioDeviceController]
  }
  @scala.inline
  implicit class AudioDeviceControllerOps[Self <: AudioDeviceController] (val x: Self) extends AnyVal {
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
    def withMuted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetMediaStreamPropertiesAsync(value: (MediaStreamType, IMediaEncodingProperties) => IPromiseWithIAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMediaStreamPropertiesAsync")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVolumePercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumePercent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

