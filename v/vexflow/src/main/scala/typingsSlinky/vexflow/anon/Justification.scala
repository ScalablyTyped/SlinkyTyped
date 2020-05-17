package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Justification extends js.Object {
  var justification: js.UndefOr[typingsSlinky.vexflow.Vex.Flow.TextNote.Justification] = js.native
  var shift_x: js.UndefOr[Double] = js.native
  var shift_y: js.UndefOr[Double] = js.native
}

object Justification {
  @scala.inline
  def apply(): Justification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Justification]
  }
  @scala.inline
  implicit class JustificationOps[Self <: Justification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJustification(value: typingsSlinky.vexflow.Vex.Flow.TextNote.Justification): Self = {
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

