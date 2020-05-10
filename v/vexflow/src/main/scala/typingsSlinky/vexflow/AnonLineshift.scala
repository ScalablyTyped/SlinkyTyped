package typingsSlinky.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLineshift extends js.Object {
  var line_shift: Double = js.native
}

object AnonLineshift {
  @scala.inline
  def apply(line_shift: Double): AnonLineshift = {
    val __obj = js.Dynamic.literal(line_shift = line_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLineshift]
  }
  @scala.inline
  implicit class AnonLineshiftOps[Self <: AnonLineshift] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLine_shift(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line_shift")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

