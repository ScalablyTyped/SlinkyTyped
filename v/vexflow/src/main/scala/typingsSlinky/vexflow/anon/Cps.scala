package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cps extends js.Object {
  var cps: js.UndefOr[js.Array[X]] = js.native
  var invert: Boolean = js.native
  var position: typingsSlinky.vexflow.Vex.Flow.Curve.Position = js.native
  var spacing: js.UndefOr[Double] = js.native
  var thickness: js.UndefOr[Double] = js.native
  var x_shift: js.UndefOr[Double] = js.native
  var y_shift: Double = js.native
}

object Cps {
  @scala.inline
  def apply(invert: Boolean, position: typingsSlinky.vexflow.Vex.Flow.Curve.Position, y_shift: Double): Cps = {
    val __obj = js.Dynamic.literal(invert = invert.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], y_shift = y_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cps]
  }
  @scala.inline
  implicit class CpsOps[Self <: Cps] (val x: Self) extends AnyVal {
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
    def withPosition(value: typingsSlinky.vexflow.Vex.Flow.Curve.Position): Self = {
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
    def withCps(value: js.Array[X]): Self = {
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

