package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stemdirection extends js.Object {
  var stem_direction: js.UndefOr[Double] = js.native
  var stem_extension: js.UndefOr[Double] = js.native
  var x_begin: js.UndefOr[Double] = js.native
  var x_end: js.UndefOr[Double] = js.native
  var y_bottom: js.UndefOr[Double] = js.native
  var y_extend: js.UndefOr[Double] = js.native
  var y_top: js.UndefOr[Double] = js.native
}

object Stemdirection {
  @scala.inline
  def apply(): Stemdirection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stemdirection]
  }
  @scala.inline
  implicit class StemdirectionOps[Self <: Stemdirection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStem_direction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stem_direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStem_direction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stem_direction")(js.undefined)
        ret
    }
    @scala.inline
    def withStem_extension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stem_extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStem_extension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stem_extension")(js.undefined)
        ret
    }
    @scala.inline
    def withX_begin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x_begin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX_begin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x_begin")(js.undefined)
        ret
    }
    @scala.inline
    def withX_end(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x_end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX_end: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x_end")(js.undefined)
        ret
    }
    @scala.inline
    def withY_bottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y_bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY_bottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y_bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withY_extend(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y_extend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY_extend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y_extend")(js.undefined)
        ret
    }
    @scala.inline
    def withY_top(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y_top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY_top: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y_top")(js.undefined)
        ret
    }
  }
  
}

