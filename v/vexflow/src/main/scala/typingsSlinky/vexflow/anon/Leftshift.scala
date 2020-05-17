package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Leftshift extends js.Object {
  var left_shift: Double = js.native
  var right_shift: Double = js.native
  var text_line: Double = js.native
}

object Leftshift {
  @scala.inline
  def apply(left_shift: Double, right_shift: Double, text_line: Double): Leftshift = {
    val __obj = js.Dynamic.literal(left_shift = left_shift.asInstanceOf[js.Any], right_shift = right_shift.asInstanceOf[js.Any], text_line = text_line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Leftshift]
  }
  @scala.inline
  implicit class LeftshiftOps[Self <: Leftshift] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeft_shift(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left_shift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight_shift(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right_shift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText_line(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text_line")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

