package typingsSlinky.vegaTypings.legendMod

import typingsSlinky.vegaTypings.axisMod.FormatType
import typingsSlinky.vegaTypings.axisMod.TimeFormatSpecifier
import typingsSlinky.vegaTypings.encodeMod.Orientation
import typingsSlinky.vegaTypings.encodeMod.Text
import typingsSlinky.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Legend extends BaseLegend {
  /**
    * The direction of the legend, one of `"vertical"` (default) or `"horizontal"`.
    *
    * __Default value:__ `"vertical"`
    */
  var direction: js.UndefOr[Orientation] = js.native
  /**
    * Mark definitions for custom legend encoding.
    */
  var encode: js.UndefOr[LegendEncode] = js.native
  var fill: js.UndefOr[String] = js.native
  /**
    * The format specifier pattern for legend labels. For numerical values, must be a legal [d3-format](https://github.com/d3/d3-format#locale_format) specifier. For date-time values, must be a legal [d3-time-format](https://github.com/d3/d3-time-format#locale_format) specifier or multi-format object.
    */
  var format: js.UndefOr[String | TimeFormatSpecifier | SignalRef] = js.native
  /**
    * The format type for legend labels (number, time, or utc).
    */
  var formatType: js.UndefOr[FormatType | SignalRef] = js.native
  var opacity: js.UndefOr[String] = js.native
  var shape: js.UndefOr[String] = js.native
  var size: js.UndefOr[String] = js.native
  var stroke: js.UndefOr[String] = js.native
  var strokeDash: js.UndefOr[String] = js.native
  var strokeWidth: js.UndefOr[String] = js.native
  /**
    * The minimum desired step between tick values for quantitative legends, in terms of scale domain values. For example, a value of `1` indicates that ticks should not be less than 1 unit apart. If `tickMinStep` is specified, the `tickCount` value will be adjusted, if necessary, to enforce the minimum step value.
    */
  var tickMinStep: js.UndefOr[Double | SignalRef] = js.native
  /**
    * The title for the legend.
    */
  var title: js.UndefOr[Text | SignalRef] = js.native
  /**
    * The type of legend to include. One of `"symbol"` for discrete symbol legends, or `"gradient"` for a continuous color gradient. If gradient is used only the fill or stroke scale parameters are considered. If unspecified, the type will be inferred based on the scale parameters used and their backing scale types.
    */
  var `type`: js.UndefOr[LegendType] = js.native
  /**
    * Explicitly set the visible legend values.
    */
  var values: js.UndefOr[js.Array[_] | SignalRef] = js.native
  /**
    * The integer z-index indicating the layering of the legend group relative to other axis, mark, and legend groups.
    *
    * @TJS-type integer
    * @minimum 0
    */
  var zindex: js.UndefOr[Double] = js.native
}

object Legend {
  @scala.inline
  def apply(): Legend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Legend]
  }
  @scala.inline
  implicit class LegendOps[Self <: Legend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: Orientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withEncode(value: LegendEncode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String | TimeFormatSpecifier | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatType(value: FormatType | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatType")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withShape(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeDash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeDash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDash")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTickMinStep(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickMinStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickMinStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickMinStep")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: Text | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: LegendType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[_] | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
    @scala.inline
    def withZindex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zindex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZindex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zindex")(js.undefined)
        ret
    }
  }
  
}

