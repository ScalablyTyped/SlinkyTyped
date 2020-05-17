package typingsSlinky.winrtUwp.Windows.Media.Capture

import typingsSlinky.winrtUwp.Windows.Media.AudioProcessing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains read-only configuration settings for the MediaCapture object. */
@js.native
trait MediaCaptureSettings extends js.Object {
  /** Gets the DeviceInformation.Id of the microphone. */
  var audioDeviceId: String = js.native
  /** Gets the audio processing mode. */
  var audioProcessing: AudioProcessing = js.native
  /** Gets a value that indicates if the operating system will make a sound when the capture device takes a picture. */
  var cameraSoundRequiredForRegion: Boolean = js.native
  /** Gets a value that indicates if the capture device supports recording video and taking a photo sequence at the same time. */
  var concurrentRecordAndPhotoSequenceSupported: Boolean = js.native
  /** Gets a value that indicates if the capture device supports recording video and taking a photo at the same time. */
  var concurrentRecordAndPhotoSupported: Boolean = js.native
  /** Gets the horizontal 35mm equivalent focal length of the camera lens on the capture device. */
  var horizontal35mmEquivalentFocalLength: Double = js.native
  /** Gets the media category of the media. */
  var mediaCategory: MediaCategory = js.native
  /** Gets the stream that is used for photo capture. */
  var photoCaptureSource: PhotoCaptureSource = js.native
  /** Gets the pitch offset of the camera in degrees. */
  var pitchOffsetDegrees: Double = js.native
  /** Gets the streaming mode. */
  var streamingCaptureMode: StreamingCaptureMode = js.native
  /** Gets the vertical 35mm equivalent focal length of the camera lens on the capture device. */
  var vertical35mmEquivalentFocalLength: Double = js.native
  /** Gets a value that indicates which video streams are independent of each other. */
  var videoDeviceCharacteristic: VideoDeviceCharacteristic = js.native
  /** Gets the DeviceInformation.Id of the video camera. */
  var videoDeviceId: String = js.native
}

object MediaCaptureSettings {
  @scala.inline
  def apply(
    audioDeviceId: String,
    audioProcessing: AudioProcessing,
    cameraSoundRequiredForRegion: Boolean,
    concurrentRecordAndPhotoSequenceSupported: Boolean,
    concurrentRecordAndPhotoSupported: Boolean,
    horizontal35mmEquivalentFocalLength: Double,
    mediaCategory: MediaCategory,
    photoCaptureSource: PhotoCaptureSource,
    pitchOffsetDegrees: Double,
    streamingCaptureMode: StreamingCaptureMode,
    vertical35mmEquivalentFocalLength: Double,
    videoDeviceCharacteristic: VideoDeviceCharacteristic,
    videoDeviceId: String
  ): MediaCaptureSettings = {
    val __obj = js.Dynamic.literal(audioDeviceId = audioDeviceId.asInstanceOf[js.Any], audioProcessing = audioProcessing.asInstanceOf[js.Any], cameraSoundRequiredForRegion = cameraSoundRequiredForRegion.asInstanceOf[js.Any], concurrentRecordAndPhotoSequenceSupported = concurrentRecordAndPhotoSequenceSupported.asInstanceOf[js.Any], concurrentRecordAndPhotoSupported = concurrentRecordAndPhotoSupported.asInstanceOf[js.Any], horizontal35mmEquivalentFocalLength = horizontal35mmEquivalentFocalLength.asInstanceOf[js.Any], mediaCategory = mediaCategory.asInstanceOf[js.Any], photoCaptureSource = photoCaptureSource.asInstanceOf[js.Any], pitchOffsetDegrees = pitchOffsetDegrees.asInstanceOf[js.Any], streamingCaptureMode = streamingCaptureMode.asInstanceOf[js.Any], vertical35mmEquivalentFocalLength = vertical35mmEquivalentFocalLength.asInstanceOf[js.Any], videoDeviceCharacteristic = videoDeviceCharacteristic.asInstanceOf[js.Any], videoDeviceId = videoDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCaptureSettings]
  }
  @scala.inline
  implicit class MediaCaptureSettingsOps[Self <: MediaCaptureSettings] (val x: Self) extends AnyVal {
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
    def withAudioProcessing(value: AudioProcessing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioProcessing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCameraSoundRequiredForRegion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraSoundRequiredForRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConcurrentRecordAndPhotoSequenceSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrentRecordAndPhotoSequenceSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConcurrentRecordAndPhotoSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrentRecordAndPhotoSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontal35mmEquivalentFocalLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal35mmEquivalentFocalLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaCategory(value: MediaCategory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhotoCaptureSource(value: PhotoCaptureSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoCaptureSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPitchOffsetDegrees(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitchOffsetDegrees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamingCaptureMode(value: StreamingCaptureMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamingCaptureMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertical35mmEquivalentFocalLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical35mmEquivalentFocalLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoDeviceCharacteristic(value: VideoDeviceCharacteristic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoDeviceCharacteristic")(value.asInstanceOf[js.Any])
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

