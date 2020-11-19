package typingsSlinky.winrtUwp.Windows.Media.Capture

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a full window UI for capturing audio, video, and photos from a camera. As well as controls for trimming video, time delayed capture, and camera settings. */
@js.native
trait CameraCaptureUI extends js.Object {
  
  /**
    * Launches the CameraCaptureUI user interface.
    * @param mode Specifies whether the user interface that will be shown allows the user to capture a photo, capture a video, or capture both photos and videos.
    * @return When this operation completes, a StorageFile object is returned.
    */
  def captureFileAsync(mode: CameraCaptureUIMode): IPromiseWithIAsyncOperation[StorageFile] = js.native
  
  /** Provides settings for capturing photos. The settings include aspect ratio, image size, format, resolution, and whether or not cropping is allowed by the user interface (UI). */
  var photoSettings: CameraCaptureUIPhotoCaptureSettings = js.native
  
  /** Provides settings for capturing videos. The settings include format, maximum resolution, maximum duration, and whether or not to allow trimming. */
  var videoSettings: CameraCaptureUIVideoCaptureSettings = js.native
}
object CameraCaptureUI {
  
  @scala.inline
  def apply(
    captureFileAsync: CameraCaptureUIMode => IPromiseWithIAsyncOperation[StorageFile],
    photoSettings: CameraCaptureUIPhotoCaptureSettings,
    videoSettings: CameraCaptureUIVideoCaptureSettings
  ): CameraCaptureUI = {
    val __obj = js.Dynamic.literal(captureFileAsync = js.Any.fromFunction1(captureFileAsync), photoSettings = photoSettings.asInstanceOf[js.Any], videoSettings = videoSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraCaptureUI]
  }
  
  @scala.inline
  implicit class CameraCaptureUIOps[Self <: CameraCaptureUI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCaptureFileAsync(value: CameraCaptureUIMode => IPromiseWithIAsyncOperation[StorageFile]): Self = this.set("captureFileAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPhotoSettings(value: CameraCaptureUIPhotoCaptureSettings): Self = this.set("photoSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoSettings(value: CameraCaptureUIVideoCaptureSettings): Self = this.set("videoSettings", value.asInstanceOf[js.Any])
  }
}
