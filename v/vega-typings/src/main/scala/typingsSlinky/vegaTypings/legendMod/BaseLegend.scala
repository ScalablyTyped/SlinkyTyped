package typingsSlinky.vegaTypings.legendMod

import typingsSlinky.vegaTypings.axisMod.LabelOverlap
import typingsSlinky.vegaTypings.axisMod.TickCount
import typingsSlinky.vegaTypings.layoutMod.LayoutAlign
import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.valuesMod.AlignValue
import typingsSlinky.vegaTypings.valuesMod.AnchorValue
import typingsSlinky.vegaTypings.valuesMod.ColorValue
import typingsSlinky.vegaTypings.valuesMod.DashArrayValue
import typingsSlinky.vegaTypings.valuesMod.FontStyleValue
import typingsSlinky.vegaTypings.valuesMod.FontWeightValue
import typingsSlinky.vegaTypings.valuesMod.NumberValue
import typingsSlinky.vegaTypings.valuesMod.OrientValue
import typingsSlinky.vegaTypings.valuesMod.StringValue
import typingsSlinky.vegaTypings.valuesMod.SymbolShapeValue
import typingsSlinky.vegaTypings.valuesMod.TextBaselineValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseLegend extends js.Object {
  // ---------- Symbol Layout ----------
  /**
    * The height in pixels to clip symbol legend entries and limit their size.
    */
  var clipHeight: js.UndefOr[Double | SignalRef] = js.native
  /**
    * The horizontal padding in pixels between symbol legend entries.
    *
    * __Default value:__ `10`.
    */
  var columnPadding: js.UndefOr[Double | SignalRef] = js.native
  /**
    * The number of columns in which to arrange symbol legend entries. A value of `0` or lower indicates a single row with one column per entry.
    */
  var columns: js.UndefOr[Double | SignalRef] = js.native
  // ---------- Legend Group ----------
  /**
    * Corner radius for the full legend.
    */
  var cornerRadius: js.UndefOr[NumberValue] = js.native
  /**
    * Background fill color for the full legend.
    */
  var fillColor: js.UndefOr[ColorValue] = js.native
  // ---------- Gradient ----------
  /**
    * The length in pixels of the primary axis of a color gradient. This value corresponds to the height of a vertical gradient or the width of a horizontal gradient.
    *
    * __Default value:__ `200`.
    * @minimum 0
    */
  var gradientLength: js.UndefOr[Double | SignalRef] = js.native
  /**
    * Opacity of the color gradient.
    */
  var gradientOpacity: js.UndefOr[NumberValue] = js.native
  /**
    * The color of the gradient stroke, can be in hex color code or regular color name.
    *
    * __Default value:__ `"lightGray"`.
    */
  var gradientStrokeColor: js.UndefOr[ColorValue] = js.native
  /**
    * The width of the gradient stroke, in pixels.
    *
    * __Default value:__ `0`.
    * @minimum 0
    */
  var gradientStrokeWidth: js.UndefOr[NumberValue] = js.native
  /**
    * The thickness in pixels of the color gradient. This value corresponds to the width of a vertical gradient or the height of a horizontal gradient.
    *
    * __Default value:__ `16`.
    * @minimum 0
    */
  var gradientThickness: js.UndefOr[Double | SignalRef] = js.native
  /**
    * The alignment to apply to symbol legends rows and columns. The supported string values are `"all"`, `"each"` (the default), and `none`. For more information, see the [grid layout documentation](https://vega.github.io/vega/docs/layout).
    *
    * __Default value:__ `"each"`.
    */
  var gridAlign: js.UndefOr[LayoutAlign | SignalRef] = js.native
  // ---------- Label ----------
  /**
    * The alignment of the legend label, can be left, center, or right.
    */
  var labelAlign: js.UndefOr[AlignValue] = js.native
  /**
    * The position of the baseline of legend label, can be `"top"`, `"middle"`, `"bottom"`, or `"alphabetic"`.
    *
    * __Default value:__ `"middle"`.
    */
  var labelBaseline: js.UndefOr[TextBaselineValue] = js.native
  /**
    * The color of the legend label, can be in hex color code or regular color name.
    */
  var labelColor: js.UndefOr[ColorValue] = js.native
  /**
    * The font of the legend label.
    */
  var labelFont: js.UndefOr[StringValue] = js.native
  /**
    * The font size of legend label.
    *
    * __Default value:__ `10`.
    *
    * @minimum 0
    */
  var labelFontSize: js.UndefOr[NumberValue] = js.native
  /**
    * The font style of legend label.
    */
  var labelFontStyle: js.UndefOr[FontStyleValue] = js.native
  /**
    * The font weight of legend label.
    */
  var labelFontWeight: js.UndefOr[FontWeightValue] = js.native
  /**
    * Maximum allowed pixel width of legend tick labels.
    *
    * __Default value:__ `160`.
    */
  var labelLimit: js.UndefOr[NumberValue] = js.native
  /**
    * The offset of the legend label.
    * @minimum 0
    *
    * __Default value:__ `4`.
    */
  var labelOffset: js.UndefOr[NumberValue] = js.native
  /**
    * Opacity of labels.
    */
  var labelOpacity: js.UndefOr[NumberValue] = js.native
  /**
    * The strategy to use for resolving overlap of labels in gradient legends. If `false`, no overlap reduction is attempted. If set to `true` (default) or `"parity"`, a strategy of removing every other label is used. If set to `"greedy"`, a linear scan of the labels is performed, removing any label that overlaps with the last visible label (this often works better for log-scaled axes).
    *
    * __Default value:__ `true`.
    */
  var labelOverlap: js.UndefOr[LabelOverlap | SignalRef] = js.native
  /**
    * Padding in pixels between the legend and legend labels.
    */
  var labelPadding: js.UndefOr[NumberValue] = js.native
  /**
    * The minimum separation that must be between label bounding boxes for them to be considered non-overlapping (default `0`). This property is ignored if *labelOverlap* resolution is not enabled.
    */
  var labelSeparation: js.UndefOr[Double | SignalRef] = js.native
  /**
    * Custom x-position for legend with orient "none".
    */
  var legendX: js.UndefOr[NumberValue] = js.native
  /**
    * Custom y-position for legend with orient "none".
    */
  var legendY: js.UndefOr[NumberValue] = js.native
  /**
    * The offset in pixels by which to displace the legend from the data rectangle and axes.
    *
    * __Default value:__ `18`.
    */
  var offset: js.UndefOr[NumberValue] = js.native
  /**
    * The orientation of the legend, which determines how the legend is positioned within the scene. One of "left", "right", "top-left", "top-right", "bottom-left", "bottom-right", "none".
    *
    * __Default value:__ `"right"`
    */
  var orient: js.UndefOr[LegendOrient | SignalRef] = js.native
  /**
    * The padding between the border and content of the legend group.
    *
    * __Default value:__ `0`.
    */
  var padding: js.UndefOr[NumberValue] = js.native
  /**
    * The vertical padding in pixels between symbol legend entries.
    *
    * __Default value:__ `2`.
    */
  var rowPadding: js.UndefOr[Double | SignalRef] = js.native
  /**
    * Border stroke color for the full legend.
    */
  var strokeColor: js.UndefOr[ColorValue] = js.native
  // ---------- Symbols ----------
  /**
    * An array of alternating [stroke, space] lengths for dashed symbol strokes.
    */
  var symbolDash: js.UndefOr[DashArrayValue] = js.native
  /**
    * The pixel offset at which to start drawing with the symbol stroke dash array.
    */
  var symbolDashOffset: js.UndefOr[NumberValue] = js.native
  /**
    * The color of the legend symbol,
    */
  var symbolFillColor: js.UndefOr[ColorValue] = js.native
  /**
    * The maximum number of allowed entries for a symbol legend. Additional entries will be dropped.
    */
  var symbolLimit: js.UndefOr[NumberValue] = js.native
  /**
    * Horizontal pixel offset for legend symbols.
    *
    * __Default value:__ `0`.
    */
  var symbolOffset: js.UndefOr[NumberValue] = js.native
  /**
    * Opacity of the legend symbols.
    */
  var symbolOpacity: js.UndefOr[NumberValue] = js.native
  /**
    * The size of the legend symbol, in pixels.
    *
    * __Default value:__ `100`.
    * @minimum 0
    */
  var symbolSize: js.UndefOr[NumberValue] = js.native
  /**
    * Stroke color for legend symbols.
    */
  var symbolStrokeColor: js.UndefOr[ColorValue] = js.native
  /**
    * The width of the symbol's stroke.
    *
    * __Default value:__ `1.5`.
    * @minimum 0
    */
  var symbolStrokeWidth: js.UndefOr[NumberValue] = js.native
  /**
    * The symbol shape. One of the plotting shapes `circle` (default), `square`, `cross`, `diamond`, `triangle-up`, `triangle-down`, `triangle-right`, or `triangle-left`, the line symbol `stroke`, or one of the centered directional shapes `arrow`, `wedge`, or `triangle`. Alternatively, a custom [SVG path string](https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths) can be provided. For correct sizing, custom shape paths should be defined within a square bounding box with coordinates ranging from -1 to 1 along both the x and y dimensions.
    *
    * __Default value:__ `"circle"`.
    */
  var symbolType: js.UndefOr[SymbolShapeValue | SignalRef] = js.native
  /**
    * The desired number of tick values for quantitative legends.
    */
  var tickCount: js.UndefOr[TickCount] = js.native
  // ---------- Title ----------
  /**
    * Horizontal text alignment for legend titles.
    *
    * __Default value:__ `"left"`.
    */
  var titleAlign: js.UndefOr[AlignValue] = js.native
  /**
    * Text anchor position for placing legend titles.
    */
  var titleAnchor: js.UndefOr[AnchorValue] = js.native
  /**
    * Vertical text baseline for legend titles.
    *
    * __Default value:__ `"top"`.
    */
  var titleBaseline: js.UndefOr[TextBaselineValue] = js.native
  /**
    * The color of the legend title, can be in hex color code or regular color name.
    */
  var titleColor: js.UndefOr[ColorValue] = js.native
  /**
    * The font of the legend title.
    */
  var titleFont: js.UndefOr[StringValue] = js.native
  /**
    * The font size of the legend title.
    */
  var titleFontSize: js.UndefOr[NumberValue] = js.native
  /**
    * The font style of the legend title.
    */
  var titleFontStyle: js.UndefOr[FontStyleValue] = js.native
  /**
    * The font weight of the legend title.
    * This can be either a string (e.g `"bold"`, `"normal"`) or a number (`100`, `200`, `300`, ..., `900` where `"normal"` = `400` and `"bold"` = `700`).
    */
  var titleFontWeight: js.UndefOr[FontWeightValue] = js.native
  /**
    * Maximum allowed pixel width of legend titles.
    *
    * __Default value:__ `180`.
    * @minimum 0
    */
  var titleLimit: js.UndefOr[NumberValue] = js.native
  /**
    * Line height in pixels for multi-line title text.
    */
  var titleLineHeight: js.UndefOr[NumberValue] = js.native
  /**
    * Opacity of the legend title.
    */
  var titleOpacity: js.UndefOr[NumberValue] = js.native
  /**
    * Orientation of the legend title.
    */
  var titleOrient: js.UndefOr[OrientValue] = js.native
  /**
    * The padding, in pixels, between title and legend.
    *
    * __Default value:__ `5`.
    */
  var titlePadding: js.UndefOr[NumberValue] = js.native
}

object BaseLegend {
  @scala.inline
  def apply(): BaseLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseLegend]
  }
  @scala.inline
  implicit class BaseLegendOps[Self <: BaseLegend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClipHeight(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnPadding(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withCornerRadius(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withFillColor(value: ColorValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFillColorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(null)
        ret
    }
    @scala.inline
    def withGradientLength(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradientLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientLength")(js.undefined)
        ret
    }
    @scala.inline
    def withGradientOpacity(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradientOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withGradientStrokeColor(value: ColorValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientStrokeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradientStrokeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientStrokeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withGradientStrokeColorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientStrokeColor")(null)
        ret
    }
    @scala.inline
    def withGradientStrokeWidth(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientStrokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradientStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientStrokeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGradientThickness(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradientThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withGridAlign(value: LayoutAlign | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelAlign(value: AlignValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelBaseline(value: TextBaselineValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelBaseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelBaseline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelBaseline")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelColor(value: ColorValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelColorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelColor")(null)
        ret
    }
    @scala.inline
    def withLabelFont(value: StringValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFont")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFontSize(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFontStyle(value: FontStyleValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFontWeight(value: FontWeightValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelLimit(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelOffset(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelOpacity(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelOverlap(value: LabelOverlap | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOverlap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelOverlap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOverlap")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelPadding(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelSeparation(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSeparation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelSeparation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSeparation")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendX(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendX")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendY(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendY")(js.undefined)
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
    def withOrient(value: LegendOrient | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orient")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withRowPadding(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeColor(value: ColorValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeColorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(null)
        ret
    }
    @scala.inline
    def withSymbolDash(value: DashArrayValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolDash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolDash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolDash")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolDashOffset(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolDashOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolDashOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolDashOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolFillColor(value: ColorValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolFillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolFillColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolFillColorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolFillColor")(null)
        ret
    }
    @scala.inline
    def withSymbolLimit(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolOffset(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolOpacity(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolSize(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolStrokeColor(value: ColorValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolStrokeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolStrokeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolStrokeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolStrokeColorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolStrokeColor")(null)
        ret
    }
    @scala.inline
    def withSymbolStrokeWidth(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolStrokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolStrokeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolType(value: SymbolShapeValue | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolType")(js.undefined)
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
    def withTitleAlign(value: AlignValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleAnchor(value: AnchorValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAnchor")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleAnchorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAnchor")(null)
        ret
    }
    @scala.inline
    def withTitleBaseline(value: TextBaselineValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleBaseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleBaseline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleBaseline")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleColor(value: ColorValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleColorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleColor")(null)
        ret
    }
    @scala.inline
    def withTitleFont(value: StringValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFont")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleFontSize(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleFontStyle(value: FontStyleValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleFontWeight(value: FontWeightValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleLimit(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleLineHeight(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleLineHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLineHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleOpacity(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleOrient(value: OrientValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleOrient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleOrient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleOrient")(js.undefined)
        ret
    }
    @scala.inline
    def withTitlePadding(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titlePadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitlePadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titlePadding")(js.undefined)
        ret
    }
  }
  
}

