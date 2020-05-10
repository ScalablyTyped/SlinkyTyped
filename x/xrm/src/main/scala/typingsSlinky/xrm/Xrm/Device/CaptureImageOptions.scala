package typingsSlinky.xrm.Xrm.Device

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for Xrm.Device.captureImage
  */
@js.native
trait CaptureImageOptions extends js.Object {
  /**
    * Indicates whether to edit the image before saving.
    */
  var allowEdit: Boolean = js.native
  /**
    * Height of the image to capture.
    */
  var height: Double = js.native
  /**
    * Indicates whether to capture image using the front camera of the device.
    */
  var preferFrontCamera: Boolean = js.native
  /**
    * Quality of the image file in percentage. Number.
    */
  var quality: Double = js.native
  /**
    * Width of the image to capture
    */
  var width: Double = js.native
}

object CaptureImageOptions {
  @scala.inline
  def apply(allowEdit: Boolean, height: Double, preferFrontCamera: Boolean, quality: Double, width: Double): CaptureImageOptions = {
    val __obj = js.Dynamic.literal(allowEdit = allowEdit.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], preferFrontCamera = preferFrontCamera.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureImageOptions]
  }
  @scala.inline
  implicit class CaptureImageOptionsOps[Self <: CaptureImageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreferFrontCamera(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferFrontCamera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

