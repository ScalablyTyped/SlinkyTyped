package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shiftx extends js.Object {
  var shift_x: js.UndefOr[Double] = js.native
  var shift_y: js.UndefOr[Double] = js.native
}

object Shiftx {
  @scala.inline
  def apply(): Shiftx = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shiftx]
  }
  @scala.inline
  implicit class ShiftxOps[Self <: Shiftx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShift_x(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift_x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShift_x: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift_x")(js.undefined)
        ret
    }
    @scala.inline
    def withShift_y(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift_y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShift_y: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift_y")(js.undefined)
        ret
    }
  }
  
}

