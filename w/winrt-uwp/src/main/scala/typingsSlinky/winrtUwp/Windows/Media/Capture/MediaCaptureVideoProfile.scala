package typingsSlinky.winrtUwp.Windows.Media.Capture

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a video profile that indicates a configuration supported by the video capture device. */
@js.native
trait MediaCaptureVideoProfile extends js.Object {
  /** Gets the unique identifier of the video profile. */
  var id: String = js.native
  /** Gets a list of MediaCaptureVideoProfileMediaDescription objects that represent supported video device settings for photo capture. */
  var supportedPhotoMediaDescription: IVectorView[MediaCaptureVideoProfileMediaDescription] = js.native
  /** Gets a list of MediaCaptureVideoProfileMediaDescription objects that represent supported video device settings for video preview. */
  var supportedPreviewMediaDescription: IVectorView[MediaCaptureVideoProfileMediaDescription] = js.native
  /** Gets a list of MediaCaptureVideoProfileMediaDescription objects that represent supported video device settings for video recording. */
  var supportedRecordMediaDescription: IVectorView[MediaCaptureVideoProfileMediaDescription] = js.native
  /** Gets the device ID of the video device associated with the video profile. */
  var videoDeviceId: String = js.native
  /**
    * Gets the list of MediaCaptureVideoProfile objects that can be used concurrently with this video profile.
    * @return The list of MediaCaptureVideoProfile objects that can be used concurrently with this video profile.
    */
  def getConcurrency(): IVectorView[MediaCaptureVideoProfile] = js.native
}

object MediaCaptureVideoProfile {
  @scala.inline
  def apply(
    getConcurrency: () => IVectorView[MediaCaptureVideoProfile],
    id: String,
    supportedPhotoMediaDescription: IVectorView[MediaCaptureVideoProfileMediaDescription],
    supportedPreviewMediaDescription: IVectorView[MediaCaptureVideoProfileMediaDescription],
    supportedRecordMediaDescription: IVectorView[MediaCaptureVideoProfileMediaDescription],
    videoDeviceId: String
  ): MediaCaptureVideoProfile = {
    val __obj = js.Dynamic.literal(getConcurrency = js.Any.fromFunction0(getConcurrency), id = id.asInstanceOf[js.Any], supportedPhotoMediaDescription = supportedPhotoMediaDescription.asInstanceOf[js.Any], supportedPreviewMediaDescription = supportedPreviewMediaDescription.asInstanceOf[js.Any], supportedRecordMediaDescription = supportedRecordMediaDescription.asInstanceOf[js.Any], videoDeviceId = videoDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCaptureVideoProfile]
  }
  @scala.inline
  implicit class MediaCaptureVideoProfileOps[Self <: MediaCaptureVideoProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetConcurrency(value: () => IVectorView[MediaCaptureVideoProfile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConcurrency")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedPhotoMediaDescription(value: IVectorView[MediaCaptureVideoProfileMediaDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedPhotoMediaDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedPreviewMediaDescription(value: IVectorView[MediaCaptureVideoProfileMediaDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedPreviewMediaDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedRecordMediaDescription(value: IVectorView[MediaCaptureVideoProfileMediaDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedRecordMediaDescription")(value.asInstanceOf[js.Any])
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

