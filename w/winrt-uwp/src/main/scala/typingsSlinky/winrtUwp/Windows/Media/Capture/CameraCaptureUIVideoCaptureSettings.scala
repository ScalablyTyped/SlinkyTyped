package typingsSlinky.winrtUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides settings for capturing videos. The settings include format, maximum resolution, maximum duration, and whether or not to allow trimming. */
@js.native
trait CameraCaptureUIVideoCaptureSettings extends js.Object {
  /** Determines whether or not the video trimming user interface will be enabled. */
  var allowTrimming: Boolean = js.native
  /** Determines the format for storing captured videos. */
  var format: CameraCaptureUIVideoFormat = js.native
  /** Determines the maximum duration of a video. */
  var maxDurationInSeconds: Double = js.native
  /** Determines the maximum resolution that the user can select. */
  var maxResolution: CameraCaptureUIMaxVideoResolution = js.native
}

object CameraCaptureUIVideoCaptureSettings {
  @scala.inline
  def apply(
    allowTrimming: Boolean,
    format: CameraCaptureUIVideoFormat,
    maxDurationInSeconds: Double,
    maxResolution: CameraCaptureUIMaxVideoResolution
  ): CameraCaptureUIVideoCaptureSettings = {
    val __obj = js.Dynamic.literal(allowTrimming = allowTrimming.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], maxDurationInSeconds = maxDurationInSeconds.asInstanceOf[js.Any], maxResolution = maxResolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraCaptureUIVideoCaptureSettings]
  }
  @scala.inline
  implicit class CameraCaptureUIVideoCaptureSettingsOps[Self <: CameraCaptureUIVideoCaptureSettings] (val x: Self) extends AnyVal {
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

