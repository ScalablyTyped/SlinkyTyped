package typingsSlinky.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** When supported, allows an app to specify whether the camera driver can dynamically adjust the frame rate of video capture in order to improve video quality in low-light conditions. */
@js.native
trait ExposurePriorityVideoControl extends js.Object {
  /** Gets or sets a value that specifies if ExposurePriorityVideoControl is enabled. */
  var enabled: Boolean = js.native
  /** Gets or sets a value that specifies if ExposurePriorityVideoControl is supported on the current device. */
  var supported: Boolean = js.native
}

object ExposurePriorityVideoControl {
  @scala.inline
  def apply(enabled: Boolean, supported: Boolean): ExposurePriorityVideoControl = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExposurePriorityVideoControl]
  }
  @scala.inline
  implicit class ExposurePriorityVideoControlOps[Self <: ExposurePriorityVideoControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supported")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

