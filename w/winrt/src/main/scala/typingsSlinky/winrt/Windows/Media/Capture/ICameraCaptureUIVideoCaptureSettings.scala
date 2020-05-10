package typingsSlinky.winrt.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICameraCaptureUIVideoCaptureSettings extends js.Object {
  var allowTrimming: Boolean = js.native
  var format: CameraCaptureUIVideoFormat = js.native
  var maxDurationInSeconds: Double = js.native
  var maxResolution: CameraCaptureUIMaxVideoResolution = js.native
}

object ICameraCaptureUIVideoCaptureSettings {
  @scala.inline
  def apply(
    allowTrimming: Boolean,
    format: CameraCaptureUIVideoFormat,
    maxDurationInSeconds: Double,
    maxResolution: CameraCaptureUIMaxVideoResolution
  ): ICameraCaptureUIVideoCaptureSettings = {
    val __obj = js.Dynamic.literal(allowTrimming = allowTrimming.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], maxDurationInSeconds = maxDurationInSeconds.asInstanceOf[js.Any], maxResolution = maxResolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICameraCaptureUIVideoCaptureSettings]
  }
  @scala.inline
  implicit class ICameraCaptureUIVideoCaptureSettingsOps[Self <: ICameraCaptureUIVideoCaptureSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowTrimming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTrimming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: CameraCaptureUIVideoFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxDurationInSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDurationInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxResolution(value: CameraCaptureUIMaxVideoResolution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResolution")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

