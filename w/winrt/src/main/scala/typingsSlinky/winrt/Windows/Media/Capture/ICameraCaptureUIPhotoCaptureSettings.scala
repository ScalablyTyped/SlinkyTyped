package typingsSlinky.winrt.Windows.Media.Capture

import typingsSlinky.winrt.Windows.Foundation.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICameraCaptureUIPhotoCaptureSettings extends js.Object {
  var allowCropping: Boolean = js.native
  var croppedAspectRatio: Size = js.native
  var croppedSizeInPixels: Size = js.native
  var format: CameraCaptureUIPhotoFormat = js.native
  var maxResolution: CameraCaptureUIMaxPhotoResolution = js.native
}

object ICameraCaptureUIPhotoCaptureSettings {
  @scala.inline
  def apply(
    allowCropping: Boolean,
    croppedAspectRatio: Size,
    croppedSizeInPixels: Size,
    format: CameraCaptureUIPhotoFormat,
    maxResolution: CameraCaptureUIMaxPhotoResolution
  ): ICameraCaptureUIPhotoCaptureSettings = {
    val __obj = js.Dynamic.literal(allowCropping = allowCropping.asInstanceOf[js.Any], croppedAspectRatio = croppedAspectRatio.asInstanceOf[js.Any], croppedSizeInPixels = croppedSizeInPixels.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], maxResolution = maxResolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICameraCaptureUIPhotoCaptureSettings]
  }
  @scala.inline
  implicit class ICameraCaptureUIPhotoCaptureSettingsOps[Self <: ICameraCaptureUIPhotoCaptureSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowCropping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCropping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCroppedAspectRatio(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("croppedAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCroppedSizeInPixels(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("croppedSizeInPixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: CameraCaptureUIPhotoFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxResolution(value: CameraCaptureUIMaxPhotoResolution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResolution")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

