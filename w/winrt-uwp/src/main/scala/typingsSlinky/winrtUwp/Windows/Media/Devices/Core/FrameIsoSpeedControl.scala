package typingsSlinky.winrtUwp.Windows.Media.Devices.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the ISO speed settings for a frame in a variable photo sequence. */
@js.native
trait FrameIsoSpeedControl extends js.Object {
  /** Gets or sets a value indicating whether ISO speed is automatically set for a frame in a variable photo sequence. */
  var auto: Boolean = js.native
  /** Gets or sets the ISO speed for a frame in a variable photo sequence. */
  var value: Double = js.native
}

object FrameIsoSpeedControl {
  @scala.inline
  def apply(auto: Boolean, value: Double): FrameIsoSpeedControl = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameIsoSpeedControl]
  }
  @scala.inline
  implicit class FrameIsoSpeedControlOps[Self <: FrameIsoSpeedControl] (val x: Self) extends AnyVal {
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
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

