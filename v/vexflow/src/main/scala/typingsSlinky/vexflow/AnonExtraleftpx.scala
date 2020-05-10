package typingsSlinky.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExtraleftpx extends js.Object {
  var extra_left_px: Double = js.native
  var extra_right_px: Double = js.native
  var spacing: Double = js.native
  var width: Double = js.native
}

object AnonExtraleftpx {
  @scala.inline
  def apply(extra_left_px: Double, extra_right_px: Double, spacing: Double, width: Double): AnonExtraleftpx = {
    val __obj = js.Dynamic.literal(extra_left_px = extra_left_px.asInstanceOf[js.Any], extra_right_px = extra_right_px.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtraleftpx]
  }
  @scala.inline
  implicit class AnonExtraleftpxOps[Self <: AnonExtraleftpx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtra_left_px(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra_left_px")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtra_right_px(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra_right_px")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(value.asInstanceOf[js.Any])
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

