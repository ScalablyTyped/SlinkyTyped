package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shiftdown extends js.Object {
  var code: String = js.native
  var shift_down: Double = js.native
  var shift_right: Double = js.native
  var shift_up: Double = js.native
  var width: Double = js.native
}

object Shiftdown {
  @scala.inline
  def apply(code: String, shift_down: Double, shift_right: Double, shift_up: Double, width: Double): Shiftdown = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], shift_down = shift_down.asInstanceOf[js.Any], shift_right = shift_right.asInstanceOf[js.Any], shift_up = shift_up.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shiftdown]
  }
  @scala.inline
  implicit class ShiftdownOps[Self <: Shiftdown] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShift_down(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift_down")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShift_right(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift_right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShift_up(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift_up")(value.asInstanceOf[js.Any])
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

