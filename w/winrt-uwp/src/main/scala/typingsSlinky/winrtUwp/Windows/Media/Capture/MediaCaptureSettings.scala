package typingsSlinky.winrtUwp.Windows.Media.Capture

import typingsSlinky.winrtUwp.Windows.Media.AudioProcessing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains read-only configuration settings for the MediaCapture object. */
@js.native
trait MediaCaptureSettings extends StObject {
  
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
  implicit class MediaCaptureSettingsMutableBuilder[Self <: MediaCaptureSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioDeviceId(value: String): Self = StObject.set(x, "audioDeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioProcessing(value: AudioProcessing): Self = StObject.set(x, "audioProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraSoundRequiredForRegion(value: Boolean): Self = StObject.set(x, "cameraSoundRequiredForRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcurrentRecordAndPhotoSequenceSupported(value: Boolean): Self = StObject.set(x, "concurrentRecordAndPhotoSequenceSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcurrentRecordAndPhotoSupported(value: Boolean): Self = StObject.set(x, "concurrentRecordAndPhotoSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontal35mmEquivalentFocalLength(value: Double): Self = StObject.set(x, "horizontal35mmEquivalentFocalLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaCategory(value: MediaCategory): Self = StObject.set(x, "mediaCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoCaptureSource(value: PhotoCaptureSource): Self = StObject.set(x, "photoCaptureSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitchOffsetDegrees(value: Double): Self = StObject.set(x, "pitchOffsetDegrees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingCaptureMode(value: StreamingCaptureMode): Self = StObject.set(x, "streamingCaptureMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertical35mmEquivalentFocalLength(value: Double): Self = StObject.set(x, "vertical35mmEquivalentFocalLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoDeviceCharacteristic(value: VideoDeviceCharacteristic): Self = StObject.set(x, "videoDeviceCharacteristic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoDeviceId(value: String): Self = StObject.set(x, "videoDeviceId", value.asInstanceOf[js.Any])
  }
}
