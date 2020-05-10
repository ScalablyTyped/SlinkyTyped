package typingsSlinky.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLeftshiftpx extends js.Object {
  var height: js.UndefOr[Double] = js.native
  var left_shift_px: Double = js.native
  var right_shift_px: Double = js.native
  var y_shift: Double = js.native
}

object AnonLeftshiftpx {
  @scala.inline
  def apply(left_shift_px: Double, right_shift_px: Double, y_shift: Double): AnonLeftshiftpx = {
    val __obj = js.Dynamic.literal(left_shift_px = left_shift_px.asInstanceOf[js.Any], right_shift_px = right_shift_px.asInstanceOf[js.Any], y_shift = y_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLeftshiftpx]
  }
  @scala.inline
  implicit class AnonLeftshiftpxOps[Self <: AnonLeftshiftpx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeft_shift_px(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left_shift_px")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight_shift_px(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right_shift_px")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY_shift(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y_shift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
  }
  
}

