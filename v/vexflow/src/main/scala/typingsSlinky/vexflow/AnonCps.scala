package typingsSlinky.vexflow

import typingsSlinky.vexflow.Vex.Flow.Curve.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCps extends js.Object {
  var cps: js.UndefOr[js.Array[AnonX]] = js.native
  var invert: Boolean = js.native
  var position: Position = js.native
  var spacing: js.UndefOr[Double] = js.native
  var thickness: js.UndefOr[Double] = js.native
  var x_shift: js.UndefOr[Double] = js.native
  var y_shift: Double = js.native
}

object AnonCps {
  @scala.inline
  def apply(invert: Boolean, position: Position, y_shift: Double): AnonCps = {
    val __obj = js.Dynamic.literal(invert = invert.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], y_shift = y_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCps]
  }
  @scala.inline
  implicit class AnonCpsOps[Self <: AnonCps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY_shift(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y_shift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCps(value: js.Array[AnonX]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cps")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(js.undefined)
        ret
    }
    @scala.inline
    def withThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickness")(js.undefined)
        ret
    }
    @scala.inline
    def withX_shift(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x_shift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX_shift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x_shift")(js.undefined)
        ret
    }
  }
  
}

