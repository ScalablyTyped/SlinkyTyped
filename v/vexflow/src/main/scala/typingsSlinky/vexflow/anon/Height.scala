package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Height extends js.Object {
  var height: Double = js.native
  var left_shift_ticks: Double = js.native
  var right_shift_ticks: Double = js.native
  var y_shift: Double = js.native
}

object Height {
  @scala.inline
  def apply(height: Double, left_shift_ticks: Double, right_shift_ticks: Double, y_shift: Double): Height = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left_shift_ticks = left_shift_ticks.asInstanceOf[js.Any], right_shift_ticks = right_shift_ticks.asInstanceOf[js.Any], y_shift = y_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
  @scala.inline
  implicit class HeightOps[Self <: Height] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft_shift_ticks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left_shift_ticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight_shift_ticks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right_shift_ticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY_shift(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y_shift")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

