package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fillstyle extends js.Object {
  var fill_style: js.UndefOr[String] = js.native
  var glyph_spacing_px: js.UndefOr[Double] = js.native
  var num_lines: js.UndefOr[Double] = js.native
  var space_above_staff_ln: js.UndefOr[Double] = js.native
  var space_below_staff_ln: js.UndefOr[Double] = js.native
  var spacing_between_lines_px: js.UndefOr[Double] = js.native
  var top_text_position: js.UndefOr[Double] = js.native
  var vertical_bar_width: js.UndefOr[Double] = js.native
}

object Fillstyle {
  @scala.inline
  def apply(): Fillstyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fillstyle]
  }
  @scala.inline
  implicit class FillstyleOps[Self <: Fillstyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFill_style(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill_style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill_style: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill_style")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyph_spacing_px(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyph_spacing_px")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyph_spacing_px: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyph_spacing_px")(js.undefined)
        ret
    }
    @scala.inline
    def withNum_lines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNum_lines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_lines")(js.undefined)
        ret
    }
    @scala.inline
    def withSpace_above_staff_ln(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space_above_staff_ln")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace_above_staff_ln: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space_above_staff_ln")(js.undefined)
        ret
    }
    @scala.inline
    def withSpace_below_staff_ln(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space_below_staff_ln")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace_below_staff_ln: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space_below_staff_ln")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacing_between_lines_px(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing_between_lines_px")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacing_between_lines_px: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing_between_lines_px")(js.undefined)
        ret
    }
    @scala.inline
    def withTop_text_position(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top_text_position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop_text_position: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top_text_position")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical_bar_width(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical_bar_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical_bar_width: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical_bar_width")(js.undefined)
        ret
    }
  }
  
}

