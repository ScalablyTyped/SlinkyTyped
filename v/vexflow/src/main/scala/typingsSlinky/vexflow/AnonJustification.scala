package typingsSlinky.vexflow

import typingsSlinky.vexflow.Vex.Flow.TextNote.Justification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonJustification extends js.Object {
  var justification: js.UndefOr[Justification] = js.native
  var shift_x: js.UndefOr[Double] = js.native
  var shift_y: js.UndefOr[Double] = js.native
}

object AnonJustification {
  @scala.inline
  def apply(): AnonJustification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonJustification]
  }
  @scala.inline
  implicit class AnonJustificationOps[Self <: AnonJustification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJustification(value: Justification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJustification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justification")(js.undefined)
        ret
    }
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

