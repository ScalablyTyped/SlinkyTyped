package typingsSlinky.winrtUwp.Windows.Media.Devices.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the flash settings for a frame in a variable photo sequence. */
@js.native
trait FrameFlashControl extends js.Object {
  /** Gets or sets a value indicating whether flash settings are automatically set for a frame in a variable photo sequence. */
  var auto: Boolean = js.native
  /** Gets or sets the flash mode for a frame in a variable photo sequence. */
  var mode: FrameFlashMode = js.native
  /** Gets or sets the flash power for a frame in a variable photo sequence. */
  var powerPercent: Double = js.native
  /** Gets or sets a value indicating if red eye reduction is enabled for a frame in a variable photo sequence. */
  var redEyeReduction: Boolean = js.native
}

object FrameFlashControl {
  @scala.inline
  def apply(auto: Boolean, mode: FrameFlashMode, powerPercent: Double, redEyeReduction: Boolean): FrameFlashControl = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], powerPercent = powerPercent.asInstanceOf[js.Any], redEyeReduction = redEyeReduction.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameFlashControl]
  }
  @scala.inline
  implicit class FrameFlashControlOps[Self <: FrameFlashControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: FrameFlashMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedEyeReduction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redEyeReduction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

