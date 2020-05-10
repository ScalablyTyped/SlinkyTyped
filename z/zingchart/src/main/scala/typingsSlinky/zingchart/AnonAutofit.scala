package typingsSlinky.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAutofit extends js.Object {
  /**
    * true | false | 1 | 0
    */
  var `auto-fit`: js.UndefOr[Boolean] = js.native
  /**
    * Sets whether the scale values will be displayed in scientific notation. Particularly useful when dealing with large numbers. true
    * | false | 1 | 0
    */
  var exponent: js.UndefOr[Boolean] = js.native
  /**
    * Sets the number of decimals that will be displayed when using scientific notation. Use with the 'exponent' attribute. 5 | 10 | ...
    */
  var `exponent-decimals`: js.UndefOr[Double] = js.native
  var guide: js.UndefOr[AnonLinesegmentsize] = js.native
  var item: js.UndefOr[AnonBorderradiustopleft] = js.native
  var label: js.UndefOr[AnonBorderradiustopleft] = js.native
  /**
    * ''horizontal' | 'h' | 'vertical' | 'v' | 'row x col' | 'x col' | 'row x' | 'float''
    */
  var layout: js.UndefOr[String] = js.native
  /**
    * Sets the color of the axis line. 'none' | 'transparent' | '#f00' | '#f00 #00f' | 'red yellow' | 'rgb(100, 15, 15)' | ...
    */
  var `line-color`: js.UndefOr[String] = js.native
  /**
    * Sets the gap size in case of a non-contiguous line style. 4 | '6px' | ...
    */
  var `line-gap-size`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the segment size in case of a non-contiguous line style. 4 | '6px' | ...
    */
  var `line-segment-size`: js.UndefOr[js.Any] = js.native
  /**
    * Logarithmic Scales only: To set the base value, which defaults to Math.E (Euler's number, the base of natural logarithms). Math.E
    * | 10 | 2 | ...
    */
  var `log-base`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's margin/s. 10 | '5px' | '10 20' | '5px 10px 15px 20px' | ...
    */
  var margin: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's bottom margin. 4 | '6px' | ...
    */
  var `margin-bottom`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's left margin. 4 | '6px' | ...
    */
  var `margin-left`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's right margin. 4 | '6px' | ...
    */
  var `margin-right`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the object's top margin. 4 | '6px' | ...
    */
  var `margin-top`: js.UndefOr[js.Any] = js.native
  var markers: js.UndefOr[js.Array[AnonLabelalignment]] = js.native
  /**
    * Sets the maximum number of labels that will display along the axis. 5 | 10 | ...
    */
  var `max-labels`: js.UndefOr[Double] = js.native
  /**
    * Sets the maximum number of ticks to display on the x axis. 5 | 10 | ...
    */
  var `max-ticks`: js.UndefOr[Double] = js.native
  /**
    * Sets the maximum value for the x axis. 'max-value': is one of the multiple ways you can set x axis values. Commonly used with time
    *  series data. Also see 'mix-value': and 'step': 4 | '6px' | ...
    */
  var `max-value`: js.UndefOr[Double] = js.native
  var `minor-guide`: js.UndefOr[AnonLinecolorLinegapsize] = js.native
  var `minor-tick`: js.UndefOr[AnonLinegapsizeLinesegmentsize] = js.native
  /**
    * Sets the number of minor tick marks displayed between the major tick marks. Note that this attribute is required to style the mino
    * r tick marks and/or guides. 5 | 10 | ...
    */
  var `minor-ticks`: js.UndefOr[Double] = js.native
  /**
    * Setting 'mirrored': true will reverse/mirror the x axis values. 'scale-x': {} values will read right to left. true | false | 1 | 0
    */
  var mirrored: js.UndefOr[Boolean] = js.native
  /**
    * Sets the negative symbol just outside of the formatted value. 'standard' | 'currency'
    */
  var negation: js.UndefOr[String] = js.native
  /**
    * Sets an offset from the end of the plotted data. This will cause the data to appear as if it were 'squeezed' from the right side.
    * 4 | '6px' | '5%' | 35%' | ...
    */
  var `offset-end`: js.UndefOr[Double] = js.native
  /**
    * Sets an offset at the start of the plotted data. This will cause the data to appear as if it were 'squeezed' from the left side. 4
    *  | '6px' | '5%' | '35%' | ...
    */
  var `offset-start`: js.UndefOr[Double] = js.native
  /**
    * Sets an x offset that will be applied to the scale-x object. 4 | '6px' | ...
    */
  var `offset-x`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the placement of the scale object. 'default' | 'opposite'
    */
  var placement: js.UndefOr[String] = js.native
  /**
    * To change the scale type from linear (default) to logarithmic. 'lin' | 'log'
    */
  var progression: js.UndefOr[String] = js.native
  /**
    * Used on radial charts (pie, radar, gauge) to specify the starting angle of the nodes. -45 | 115 | ...
    */
  var `ref-angle`: js.UndefOr[Double] = js.native
  var `ref-line`: js.UndefOr[AnonLinecolorLinegapsize] = js.native
  /**
    * To set the value the reference line is drawn at. 1 | 5 | 10 | ...
    */
  var `ref-value`: js.UndefOr[Double] = js.native
  var rules: js.UndefOr[js.Array[AnonRule]] = js.native
  /**
    * 5 | 10 | ...
    */
  var `scale-factor`: js.UndefOr[Double] = js.native
  /**
    * Setting to true will cause the values on the x axis to use an abbreviated notation with a short unit such as K,M,B, etc. true | fa
    * lse | 1 | 0
    */
  var short: js.UndefOr[Boolean] = js.native
  /**
    * Specifies which unit of measure to use when short is set to true. K | M | B | KB | MB | GB | TB | PB
    */
  var `short-unit`: js.UndefOr[String] = js.native
  /**
    * ['A', 'B'] | ...
    */
  var `show-labels`: js.UndefOr[js.Any] = js.native
  /**
    * Sets the size of the object/shape. 4 | '6px' | ...
    */
  var size: js.UndefOr[js.Any] = js.native
  var tick: js.UndefOr[AnonShadowalpha] = js.native
  var tooltip: js.UndefOr[AnonFontweight] = js.native
  var transform: js.UndefOr[AnonA] = js.native
  /**
    * An alternative way to create category scale labels. Similar to a 'labels' array, the 'values' array also acts as a maximum scale v
    * alue. [1, 7, 9] | ['Jan', 'Feb', 'Mar', 'Apr'] | ['Q1', 'Q2', 'Q3', 'Q4']
    */
  var values: js.UndefOr[js.Any] = js.native
  /**
    * You can set the 'scale-x': { } to 'visible': false to hide the x axis. The x-axis will still calculate plots correctly, however yo
    * u will not be able to see the x axis line or any of the attributes such as scale values. If you simply want to hide the x axis lin
    * e you can utilize 'line-color':'none'. This will remove the visibility of the x axis line and still allow you to style ticks, item
    * s, etc separately, true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * When zooming is enabled, setting zoom-snap to true snaps the zoom area to the nearest data node as a zoom area is selected. By def
    * ault, zoom-snap is set to false. true | false | 1 | 0
    */
  var `zoom-snap`: js.UndefOr[Boolean] = js.native
}

object AnonAutofit {
  @scala.inline
  def apply(): AnonAutofit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAutofit]
  }
  @scala.inline
  implicit class AnonAutofitOps[Self <: AnonAutofit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAuto-fit`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto-fit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAuto-fit`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto-fit")(js.undefined)
        ret
    }
    @scala.inline
    def withExponent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponent")(js.undefined)
        ret
    }
    @scala.inline
    def `withExponent-decimals`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponent-decimals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutExponent-decimals`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponent-decimals")(js.undefined)
        ret
    }
    @scala.inline
    def withGuide(value: AnonLinesegmentsize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guide")(js.undefined)
        ret
    }
    @scala.inline
    def withItem(value: AnonBorderradiustopleft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: AnonBorderradiustopleft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-color`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-gap-size`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-gap-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-gap-size`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-gap-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withLine-segment-size`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-segment-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLine-segment-size`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line-segment-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withLog-base`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log-base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLog-base`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log-base")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def `withMargin-bottom`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMargin-bottom`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-bottom")(js.undefined)
        ret
    }
    @scala.inline
    def `withMargin-left`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMargin-left`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-left")(js.undefined)
        ret
    }
    @scala.inline
    def `withMargin-right`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMargin-right`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-right")(js.undefined)
        ret
    }
    @scala.inline
    def `withMargin-top`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMargin-top`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin-top")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkers(value: js.Array[AnonLabelalignment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(js.undefined)
        ret
    }
    @scala.inline
    def `withMax-labels`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-labels`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-labels")(js.undefined)
        ret
    }
    @scala.inline
    def `withMax-ticks`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-ticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-ticks`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-ticks")(js.undefined)
        ret
    }
    @scala.inline
    def `withMax-value`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-value`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-value")(js.undefined)
        ret
    }
    @scala.inline
    def `withMinor-guide`(value: AnonLinecolorLinegapsize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minor-guide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMinor-guide`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minor-guide")(js.undefined)
        ret
    }
    @scala.inline
    def `withMinor-tick`(value: AnonLinegapsizeLinesegmentsize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minor-tick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMinor-tick`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minor-tick")(js.undefined)
        ret
    }
    @scala.inline
    def `withMinor-ticks`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minor-ticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMinor-ticks`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minor-ticks")(js.undefined)
        ret
    }
    @scala.inline
    def withMirrored(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirrored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMirrored: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirrored")(js.undefined)
        ret
    }
    @scala.inline
    def withNegation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negation")(js.undefined)
        ret
    }
    @scala.inline
    def `withOffset-end`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOffset-end`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-end")(js.undefined)
        ret
    }
    @scala.inline
    def `withOffset-start`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOffset-start`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-start")(js.undefined)
        ret
    }
    @scala.inline
    def `withOffset-x`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOffset-x`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset-x")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withProgression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progression")(js.undefined)
        ret
    }
    @scala.inline
    def `withRef-angle`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref-angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRef-angle`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref-angle")(js.undefined)
        ret
    }
    @scala.inline
    def `withRef-line`(value: AnonLinecolorLinegapsize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref-line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRef-line`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref-line")(js.undefined)
        ret
    }
    @scala.inline
    def `withRef-value`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref-value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRef-value`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref-value")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: js.Array[AnonRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
    @scala.inline
    def `withScale-factor`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale-factor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutScale-factor`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale-factor")(js.undefined)
        ret
    }
    @scala.inline
    def withShort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short")(js.undefined)
        ret
    }
    @scala.inline
    def `withShort-unit`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short-unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutShort-unit`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short-unit")(js.undefined)
        ret
    }
    @scala.inline
    def `withShow-labels`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show-labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutShow-labels`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show-labels")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: js.Any): Self = {
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
    def withTick(value: AnonShadowalpha): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: AnonFontweight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: AnonA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Any): Self = {
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
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def `withZoom-snap`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom-snap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutZoom-snap`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom-snap")(js.undefined)
        ret
    }
  }
  
}

