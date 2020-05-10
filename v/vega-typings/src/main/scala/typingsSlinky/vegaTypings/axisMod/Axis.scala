package typingsSlinky.vegaTypings.axisMod

import typingsSlinky.vegaTypings.encodeMod.Text
import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.valuesMod.NumberValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Axis extends BaseAxis {
  /**
    * Mark definitions for custom axis encoding.
    */
  var encode: js.UndefOr[AxisEncode] = js.native
  /**
    * The format specifier pattern for axis labels. For numerical values, must be a legal [d3-format](https://github.com/d3/d3-format#locale_format) specifier. For date-time values, must be a legal [d3-time-format](https://github.com/d3/d3-time-format#locale_format) specifier or multi-format object.
    */
  var format: js.UndefOr[String | TimeFormatSpecifier | SignalRef] = js.native
  /**
    * The format type for axis labels (number, time, or utc).
    */
  var formatType: js.UndefOr[FormatType | SignalRef] = js.native
  /**
    * The name of the scale to use for including grid lines. By default grid lines are driven by the same scale as the ticks and labels.
    */
  var gridScale: js.UndefOr[String] = js.native
  /**
    * The orthogonal offset in pixels by which to displace the axis from its position along the edge of the chart.
    */
  var offset: js.UndefOr[NumberValue] = js.native
  /**
    * The orientation of the axis. One of `"top"`, `"bottom"`, `"left"` or `"right"`. The orientation can be used to further specialize the axis type (e.g., a y axis oriented for the right edge of the chart).
    *
    * __Default value:__ `"bottom"` for x-axes and `"left"` for y-axes.
    */
  var orient: AxisOrient = js.native
  /**
    * The anchor position of the axis in pixels. For x-axes with top or bottom orientation, this sets the axis group x coordinate. For y-axes with left or right orientation, this sets the axis group y coordinate.
    *
    * __Default value__: `0`
    */
  var position: js.UndefOr[NumberValue] = js.native
  /**
    * The name of the scale backing the axis component.
    */
  var scale: String = js.native
  /**
    * A desired number of ticks, for axes visualizing quantitative scales. The resulting number may be different so that values are "nice" (multiples of `2`, `5`, `10`) and lie within the underlying scale's range.
    *
    * For scales of type `"time"` or `"utc"`, the tick count can instead be a time interval specifier. Legal string values are `"millisecond"`, `"second"`, `"minute"`, `"hour"`, `"day"`, `"week"`, `"month"`, and "year". Alternatively, an object-valued interval specifier of the form `{"interval": "month", "step": 3}` includes a desired number of interval steps. Here, ticks are generated for each quarter (Jan, Apr, Jul, Oct) boundary.
    *
    * @minimum 0
    */
  var tickCount: js.UndefOr[TickCount] = js.native
  /**
    * The minimum desired step between axis ticks, in terms of scale domain values. For example, a value of `1` indicates that ticks should not be less than 1 unit apart. If `tickMinStep` is specified, the `tickCount` value will be adjusted, if necessary, to enforce the minimum step value.
    */
  var tickMinStep: js.UndefOr[Double | SignalRef] = js.native
  /**
    * A title for the axis (none by default).
    */
  var title: js.UndefOr[Text | SignalRef] = js.native
  /**
    * Explicitly set the visible axis tick and label values.
    */
  var values: js.UndefOr[js.Array[_] | SignalRef] = js.native
  /**
    * The integer z-index indicating the layering of the axis group relative to other axis, mark, and legend groups.
    *
    * @TJS-type integer
    * @minimum 0
    */
  var zindex: js.UndefOr[Double] = js.native
}

object Axis {
  @scala.inline
  def apply(orient: AxisOrient, scale: String): Axis = {
    val __obj = js.Dynamic.literal(orient = orient.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis]
  }
  @scala.inline
  implicit class AxisOps[Self <: Axis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrient(value: AxisOrient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncode(value: AxisEncode): Self = {
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
    def withGridScale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridScale")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: NumberValue): Self = {
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
    def withTickCount(value: TickCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickCount")(js.undefined)
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

