package typingsSlinky.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCodehead extends js.Object {
  var code_head: js.UndefOr[String] = js.native
  var dot_shiftY: Double = js.native
  var flag: Boolean = js.native
  var gracenote_stem_down_extension: Double = js.native
  var gracenote_stem_up_extension: Double = js.native
  var head_width: Double = js.native
  var line_above: Double = js.native
  var line_below: Double = js.native
  var position: js.UndefOr[String] = js.native
  var rest: js.UndefOr[Boolean] = js.native
  var stem: Boolean = js.native
  var stem_down_extension: Double = js.native
  var stem_offset: Double = js.native
  var stem_up_extension: Double = js.native
  var tabnote_stem_down_extension: Double = js.native
  var tabnote_stem_up_extension: Double = js.native
}

object AnonCodehead {
  @scala.inline
  def apply(
    dot_shiftY: Double,
    flag: Boolean,
    gracenote_stem_down_extension: Double,
    gracenote_stem_up_extension: Double,
    head_width: Double,
    line_above: Double,
    line_below: Double,
    stem: Boolean,
    stem_down_extension: Double,
    stem_offset: Double,
    stem_up_extension: Double,
    tabnote_stem_down_extension: Double,
    tabnote_stem_up_extension: Double
  ): AnonCodehead = {
    val __obj = js.Dynamic.literal(dot_shiftY = dot_shiftY.asInstanceOf[js.Any], flag = flag.asInstanceOf[js.Any], gracenote_stem_down_extension = gracenote_stem_down_extension.asInstanceOf[js.Any], gracenote_stem_up_extension = gracenote_stem_up_extension.asInstanceOf[js.Any], head_width = head_width.asInstanceOf[js.Any], line_above = line_above.asInstanceOf[js.Any], line_below = line_below.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any], stem_down_extension = stem_down_extension.asInstanceOf[js.Any], stem_offset = stem_offset.asInstanceOf[js.Any], stem_up_extension = stem_up_extension.asInstanceOf[js.Any], tabnote_stem_down_extension = tabnote_stem_down_extension.asInstanceOf[js.Any], tabnote_stem_up_extension = tabnote_stem_up_extension.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCodehead]
  }
  @scala.inline
  implicit class AnonCodeheadOps[Self <: AnonCodehead] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDot_shiftY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot_shiftY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGracenote_stem_down_extension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gracenote_stem_down_extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGracenote_stem_up_extension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gracenote_stem_up_extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHead_width(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine_above(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line_above")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine_below(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line_below")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStem_down_extension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stem_down_extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStem_offset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stem_offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStem_up_extension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stem_up_extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabnote_stem_down_extension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabnote_stem_down_extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabnote_stem_up_extension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabnote_stem_up_extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCode_head(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code_head")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode_head: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code_head")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withRest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rest")(js.undefined)
        ret
    }
  }
  
}

