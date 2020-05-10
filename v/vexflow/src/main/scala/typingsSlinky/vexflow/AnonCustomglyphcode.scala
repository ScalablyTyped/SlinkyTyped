package typingsSlinky.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCustomglyphcode extends js.Object {
  var custom_glyph_code: js.UndefOr[String] = js.native
  var displaced: js.UndefOr[Boolean] = js.native
  var duration: String = js.native
  var glyph_font_scale: js.UndefOr[Double] = js.native
  var line: Double = js.native
  var note_type: js.UndefOr[String] = js.native
  var slashed: js.UndefOr[Boolean] = js.native
  var stem_direction: js.UndefOr[Double] = js.native
  var style: js.UndefOr[String] = js.native
  var x: js.UndefOr[Double] = js.native
  var x_shift: Double = js.native
  var y: js.UndefOr[Double] = js.native
}

object AnonCustomglyphcode {
  @scala.inline
  def apply(duration: String, line: Double, x_shift: Double): AnonCustomglyphcode = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], x_shift = x_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustomglyphcode]
  }
  @scala.inline
  implicit class AnonCustomglyphcodeOps[Self <: AnonCustomglyphcode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX_shift(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x_shift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustom_glyph_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_glyph_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_glyph_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_glyph_code")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplaced(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displaced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplaced: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displaced")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyph_font_scale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyph_font_scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyph_font_scale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyph_font_scale")(js.undefined)
        ret
    }
    @scala.inline
    def withNote_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note_type")(js.undefined)
        ret
    }
    @scala.inline
    def withSlashed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slashed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlashed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slashed")(js.undefined)
        ret
    }
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
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

