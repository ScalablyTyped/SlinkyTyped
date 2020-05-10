package typingsSlinky.winrt.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMediaCaptureInitializationSettings extends js.Object {
  var audioDeviceId: String = js.native
  var photoCaptureSource: PhotoCaptureSource = js.native
  var streamingCaptureMode: StreamingCaptureMode = js.native
  var videoDeviceId: String = js.native
}

object IMediaCaptureInitializationSettings {
  @scala.inline
  def apply(
    audioDeviceId: String,
    photoCaptureSource: PhotoCaptureSource,
    streamingCaptureMode: StreamingCaptureMode,
    videoDeviceId: String
  ): IMediaCaptureInitializationSettings = {
    val __obj = js.Dynamic.literal(audioDeviceId = audioDeviceId.asInstanceOf[js.Any], photoCaptureSource = photoCaptureSource.asInstanceOf[js.Any], streamingCaptureMode = streamingCaptureMode.asInstanceOf[js.Any], videoDeviceId = videoDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaCaptureInitializationSettings]
  }
  @scala.inline
  implicit class IMediaCaptureInitializationSettingsOps[Self <: IMediaCaptureInitializationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioDeviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhotoCaptureSource(value: PhotoCaptureSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoCaptureSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamingCaptureMode(value: StreamingCaptureMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamingCaptureMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoDeviceId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

