package typingsSlinky.winrtUwp.Windows.Media.Capture

import typingsSlinky.winrtUwp.Windows.Foundation.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides settings for capturing photos. The settings include aspect ratio, image size, format, resolution, and whether or not cropping is allowed by the user interface (UI). */
@js.native
trait CameraCaptureUIPhotoCaptureSettings extends js.Object {
  /** Determines whether photo cropping will be enabled in the user interface for capture a photo. */
  var allowCropping: Boolean = js.native
  /** The aspect ratio of the captured photo. */
  var croppedAspectRatio: Size = js.native
  /** The exact size in pixels of the captured photo. */
  var croppedSizeInPixels: Size = js.native
  /** Determines the format that captured photos will be stored in. */
  var format: CameraCaptureUIPhotoFormat = js.native
  /** Determines the maximum resolution the user will be able to select. */
  var maxResolution: CameraCaptureUIMaxPhotoResolution = js.native
}

object CameraCaptureUIPhotoCaptureSettings {
  @scala.inline
  def apply(
    allowCropping: Boolean,
    croppedAspectRatio: Size,
    croppedSizeInPixels: Size,
    format: CameraCaptureUIPhotoFormat,
    maxResolution: CameraCaptureUIMaxPhotoResolution
  ): CameraCaptureUIPhotoCaptureSettings = {
    val __obj = js.Dynamic.literal(allowCropping = allowCropping.asInstanceOf[js.Any], croppedAspectRatio = croppedAspectRatio.asInstanceOf[js.Any], croppedSizeInPixels = croppedSizeInPixels.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], maxResolution = maxResolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraCaptureUIPhotoCaptureSettings]
  }
  @scala.inline
  implicit class CameraCaptureUIPhotoCaptureSettingsOps[Self <: CameraCaptureUIPhotoCaptureSettings] (val x: Self) extends AnyVal {
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

