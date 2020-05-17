package typingsSlinky.vexflow.anon

import typingsSlinky.vexflow.Vex.Flow.StaveLine.TextJustification
import typingsSlinky.vexflow.Vex.Flow.StaveLine.TextVerticalPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arrowheadangle extends js.Object {
  var arrowhead_angle: Double = js.native
  var arrowhead_length: Double = js.native
  var color: String = js.native
  var draw_end_arrow: Boolean = js.native
  var draw_start_arrow: Boolean = js.native
  var line_dash: js.Array[Double] = js.native
  var line_width: Double = js.native
  var padding_left: Double = js.native
  var padding_right: Double = js.native
  var rounded_end: Boolean = js.native
  var text_justification: TextJustification = js.native
  var text_position_vertical: TextVerticalPosition = js.native
}

object Arrowheadangle {
  @scala.inline
  def apply(
    arrowhead_angle: Double,
    arrowhead_length: Double,
    color: String,
    draw_end_arrow: Boolean,
    draw_start_arrow: Boolean,
    line_dash: js.Array[Double],
    line_width: Double,
    padding_left: Double,
    padding_right: Double,
    rounded_end: Boolean,
    text_justification: TextJustification,
    text_position_vertical: TextVerticalPosition
  ): Arrowheadangle = {
    val __obj = js.Dynamic.literal(arrowhead_angle = arrowhead_angle.asInstanceOf[js.Any], arrowhead_length = arrowhead_length.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], draw_end_arrow = draw_end_arrow.asInstanceOf[js.Any], draw_start_arrow = draw_start_arrow.asInstanceOf[js.Any], line_dash = line_dash.asInstanceOf[js.Any], line_width = line_width.asInstanceOf[js.Any], padding_left = padding_left.asInstanceOf[js.Any], padding_right = padding_right.asInstanceOf[js.Any], rounded_end = rounded_end.asInstanceOf[js.Any], text_justification = text_justification.asInstanceOf[js.Any], text_position_vertical = text_position_vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arrowheadangle]
  }
  @scala.inline
  implicit class ArrowheadangleOps[Self <: Arrowheadangle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowhead_angle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowhead_angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrowhead_length(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowhead_length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDraw_end_arrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw_end_arrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDraw_start_arrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw_start_arrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine_dash(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line_dash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine_width(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPadding_left(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding_left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPadding_right(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding_right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRounded_end(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rounded_end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText_justification(value: TextJustification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text_justification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText_position_vertical(value: TextVerticalPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text_position_vertical")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

