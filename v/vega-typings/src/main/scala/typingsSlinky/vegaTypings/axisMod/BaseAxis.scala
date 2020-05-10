package typingsSlinky.vegaTypings.axisMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.valuesMod.AlignValue
import typingsSlinky.vegaTypings.valuesMod.AnchorValue
import typingsSlinky.vegaTypings.valuesMod.BooleanValue
import typingsSlinky.vegaTypings.valuesMod.ColorValue
import typingsSlinky.vegaTypings.valuesMod.DashArrayValue
import typingsSlinky.vegaTypings.valuesMod.FontStyleValue
import typingsSlinky.vegaTypings.valuesMod.FontWeightValue
import typingsSlinky.vegaTypings.valuesMod.NumberValue
import typingsSlinky.vegaTypings.valuesMod.StringValue
import typingsSlinky.vegaTypings.valuesMod.TextBaselineValue
import typingsSlinky.vegaTypings.vegaTypingsStrings.center
import typingsSlinky.vegaTypings.vegaTypingsStrings.extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseAxis extends js.Object {
  /**
    * An interpolation fraction indicating where, for `band` scales, axis ticks should be positioned. A value of `0` places ticks at the left edge of their bands. A value of `0.5` places ticks in the middle of their bands.
    *
    *  __Default value:__ `0.5`
    */
  var bandPosition: js.UndefOr[NumberValue] = js.native
  // ---------- Domain ----------
  /**
    * A boolean flag indicating if the domain (the axis baseline) should be included as part of the axis.
    *
    * __Default value:__ `true`
    */
  var domain: js.UndefOr[Boolean] = js.native
  /**
    * Color of axis domain line.
    *
    * __Default value:__ `"gray"`.
    */
  var domainColor: js.UndefOr[ColorValue] = js.native
  /**
    * An array of alternating [stroke, space] lengths for dashed domain lines.
    */
  var domainDash: js.UndefOr[DashArrayValue] = js.native
  /**
    * The pixel offset at which to start drawing with the domain dash array.
    */
  var domainDashOffset: js.UndefOr[NumberValue] = js.native
  /**
    * Opacity of the axis domain line.
    */
  var domainOpacity: js.UndefOr[NumberValue] = js.native
  /**
    * Stroke width of axis domain line
    *
    * __Default value:__ `1`
    */
  var domainWidth: js.UndefOr[NumberValue] = js.native
  // ---------- Grid ----------
  /**
    * A boolean flag indicating if grid lines should be included as part of the axis.
    */
  var grid: js.UndefOr[Boolean] = js.native
  /**
    * Color of gridlines.
    *
    * __Default value:__ `"lightGray"`.
    */
  var gridColor: js.UndefOr[ColorValue] = js.native
  /**
    * An array of alternating [stroke, space] lengths for dashed grid lines.
    */
  var gridDash: js.UndefOr[DashArrayValue] = js.native
  /**
    * The pixel offset at which to start drawing with the grid dash array.
    */
  var gridDashOffset: js.UndefOr[NumberValue] = js.native
  /**
    * The stroke opacity of grid (value between [0,1])
    *
    * __Default value:__ `1`
    * @minimum 0
    * @maximum 1
    */
  var gridOpacity: js.UndefOr[NumberValue] = js.native
  /**
    * The grid width, in pixels.
    *
    * __Default value:__ `1`
    * @minimum 0
    */
  var gridWidth: js.UndefOr[NumberValue] = js.native
  /**
    * Horizontal text alignment of axis tick labels, overriding the default setting for the current axis orientation.
    */
  var labelAlign: js.UndefOr[AlignValue] = js.native
  /**
    * The rotation angle of the axis labels.
    *
    * __Default value:__ `-90` for nominal and ordinal fields; `0` otherwise.
    *
    * @minimum -360
    * @maximum 360
    */
  var labelAngle: js.UndefOr[NumberValue] = js.native
  /**
    * Vertical text baseline of axis tick labels, overriding the default setting for the current axis orientation. Can be `"top"`, `"middle"`, `"bottom"`, or `"alphabetic"`.
    */
  var labelBaseline: js.UndefOr[TextBaselineValue] = js.native
  /**
    * Indicates if labels should be hidden if they exceed the axis range. If `false` (the default) no bounds overlap analysis is performed. If `true`, labels will be hidden if they exceed the axis range by more than 1 pixel. If this property is a number, it specifies the pixel tolerance: the maximum amount by which a label bounding box may exceed the axis range.
    *
    * __Default value:__ `false`.
    */
  var labelBound: js.UndefOr[Double | Boolean | SignalRef] = js.native
  /**
    * The color of the tick label, can be in hex color code or regular color name.
    */
  var labelColor: js.UndefOr[ColorValue] = js.native
  /**
    * Indicates if the first and last axis labels should be aligned flush with the scale range. Flush alignment for a horizontal axis will left-align the first label and right-align the last label. For vertical axes, bottom and top text baselines are applied instead. If this property is a number, it also indicates the number of pixels by which to offset the first and last labels; for example, a value of 2 will flush-align the first and last labels and also push them 2 pixels outward from the center of the axis. The additional adjustment can sometimes help the labels better visually group with corresponding axis ticks.
    */
  var labelFlush: js.UndefOr[Double | Boolean | SignalRef] = js.native
  /**
    * Indicates the number of pixels by which to offset flush-adjusted labels. For example, a value of `2` will push flush-adjusted labels 2 pixels outward from the center of the axis. Offsets can help the labels better visually group with corresponding axis ticks.
    *
    * __Default value:__ `0`.
    */
  var labelFlushOffset: js.UndefOr[Double | SignalRef] = js.native
  /**
    * The font of the tick label.
    */
  var labelFont: js.UndefOr[StringValue] = js.native
  /**
    * The font size of the label, in pixels.
    *
    * @minimum 0
    */
  var labelFontSize: js.UndefOr[NumberValue] = js.native
  /**
    * Font style of the title.
    */
  var labelFontStyle: js.UndefOr[FontStyleValue] = js.native
  /**
    * Font weight of axis tick labels.
    */
  var labelFontWeight: js.UndefOr[FontWeightValue] = js.native
  /**
    * Maximum allowed pixel width of axis tick labels.
    *
    * __Default value:__ `180`
    */
  var labelLimit: js.UndefOr[NumberValue] = js.native
  /**
    * Line height in pixels for multi-line label text.
    */
  var labelLineHeight: js.UndefOr[NumberValue] = js.native
  /**
    * Position offset in pixels to apply to labels, in addition to tickOffset.
    *
    * __Default value:__ `0`
    */
  var labelOffset: js.UndefOr[NumberValue] = js.native
  /**
    * The opacity of the labels.
    */
  var labelOpacity: js.UndefOr[NumberValue] = js.native
  /**
    * The strategy to use for resolving overlap of axis labels. If `false` (the default), no overlap reduction is attempted. If set to `true` or `"parity"`, a strategy of removing every other label is used (this works well for standard linear axes). If set to `"greedy"`, a linear scan of the labels is performed, removing any labels that overlaps with the last visible label (this often works better for log-scaled axes).
    */
  var labelOverlap: js.UndefOr[LabelOverlap | SignalRef] = js.native
  /**
    * The padding in pixels between labels and ticks.
    *
    * __Default value:__ `2`
    */
  var labelPadding: js.UndefOr[NumberValue] = js.native
  /**
    * The minimum separation that must be between label bounding boxes for them to be considered non-overlapping (default `0`). This property is ignored if *labelOverlap* resolution is not enabled.
    */
  var labelSeparation: js.UndefOr[Double | SignalRef] = js.native
  // ---------- Labels ----------
  /**
    * A boolean flag indicating if labels should be included as part of the axis.
    *
    * __Default value:__ `true`.
    */
  var labels: js.UndefOr[Boolean] = js.native
  /**
    * The maximum extent in pixels that axis ticks and labels should use. This determines a maximum offset value for axis titles.
    *
    * __Default value:__ `undefined`.
    */
  var maxExtent: js.UndefOr[NumberValue] = js.native
  /**
    * The minimum extent in pixels that axis ticks and labels should use. This determines a minimum offset value for axis titles.
    *
    * __Default value:__ `30` for y-axis; `undefined` for x-axis.
    */
  var minExtent: js.UndefOr[NumberValue] = js.native
  /**
    * For band scales, indicates if ticks and grid lines should be placed at the center of a band (default) or at the band extents to indicate intervals.
    */
  var tickBand: js.UndefOr[center | extent | SignalRef] = js.native
  /**
    * The color of the axis's tick.
    *
    * __Default value:__ `"gray"`
    */
  var tickColor: js.UndefOr[ColorValue] = js.native
  /**
    * An array of alternating [stroke, space] lengths for dashed tick mark lines.
    */
  var tickDash: js.UndefOr[DashArrayValue] = js.native
  /**
    * The pixel offset at which to start drawing with the tick mark dash array.
    */
  var tickDashOffset: js.UndefOr[NumberValue] = js.native
  /**
    * Boolean flag indicating if an extra axis tick should be added for the initial position of the axis. This flag is useful for styling axes for `band` scales such that ticks are placed on band boundaries rather in the middle of a band. Use in conjunction with `"bandPosition": 1` and an axis `"padding"` value of `0`.
    */
  var tickExtra: js.UndefOr[BooleanValue] = js.native
  /**
    * Position offset in pixels to apply to ticks, labels, and gridlines.
    */
  var tickOffset: js.UndefOr[NumberValue] = js.native
  /**
    * Opacity of the ticks.
    */
  var tickOpacity: js.UndefOr[NumberValue] = js.native
  /**
    * Boolean flag indicating if pixel position values should be rounded to the nearest integer.
    *
    * __Default value:__ `true`
    */
  var tickRound: js.UndefOr[BooleanValue] = js.native
  /**
    * The size in pixels of axis ticks.
    *
    * __Default value:__ `5`
    * @minimum 0
    */
  var tickSize: js.UndefOr[NumberValue] = js.native
  /**
    * The width, in pixels, of ticks.
    *
    * __Default value:__ `1`
    * @minimum 0
    */
  var tickWidth: js.UndefOr[NumberValue] = js.native
  // ---------- Ticks ----------
  /**
    * Boolean value that determines whether the axis should include ticks.
    *
    * __Default value:__ `true`
    */
  var ticks: js.UndefOr[BooleanValue] = js.native
  /**
    * Horizontal text alignment of axis titles.
    */
  var titleAlign: js.UndefOr[AlignValue] = js.native
  /**
    * Text anchor position for placing axis titles.
    */
  var titleAnchor: js.UndefOr[AnchorValue] = js.native
  /**
    * Angle in degrees of axis titles.
    */
  var titleAngle: js.UndefOr[NumberValue] = js.native
  /**
    * Vertical text baseline for axis titles.
    */
  var titleBaseline: js.UndefOr[TextBaselineValue] = js.native
  /**
    * Color of the title, can be in hex color code or regular color name.
    */
  var titleColor: js.UndefOr[ColorValue] = js.native
  /**
    * Font of the title. (e.g., `"Helvetica Neue"`).
    */
  var titleFont: js.UndefOr[StringValue] = js.native
  /**
    * Font size of the title.
    *
    * @minimum 0
    */
  var titleFontSize: js.UndefOr[NumberValue] = js.native
  /**
    * Font style of the title.
    */
  var titleFontStyle: js.UndefOr[FontStyleValue] = js.native
  /**
    * Font weight of the title.
    * This can be either a string (e.g `"bold"`, `"normal"`) or a number (`100`, `200`, `300`, ..., `900` where `"normal"` = `400` and `"bold"` = `700`).
    */
  var titleFontWeight: js.UndefOr[FontWeightValue] = js.native
  /**
    * Maximum allowed pixel width of axis titles.
    *
    * @minimum 0
    */
  var titleLimit: js.UndefOr[NumberValue] = js.native
  /**
    * Line height in pixels for multi-line title text.
    */
  var titleLineHeight: js.UndefOr[NumberValue] = js.native
  /**
    * Opacity of the axis title.
    */
  var titleOpacity: js.UndefOr[NumberValue] = js.native
  // ---------- Title ----------
  /**
    * The padding, in pixels, between title and axis.
    */
  var titlePadding: js.UndefOr[NumberValue] = js.native
  /**
    * X-coordinate of the axis title relative to the axis group.
    */
  var titleX: js.UndefOr[NumberValue] = js.native
  /**
    * Y-coordinate of the axis title relative to the axis group.
    */
  var titleY: js.UndefOr[NumberValue] = js.native
  /**
    * Translation offset in pixels applied to the axis group mark x and y. If specified, overrides the default behavior of a 0.5 offset to pixel-align stroked lines.
    */
  var translate: js.UndefOr[Double] = js.native
}

object BaseAxis {
  @scala.inline
  def apply(): BaseAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseAxis]
  }
  @scala.inline
  implicit class BaseAxisOps[Self <: BaseAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBandPosition(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBandPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainColor(value: ColorValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainColorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainColor")(null)
        ret
    }
    @scala.inline
    def withDomainDash(value: DashArrayValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainDash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainDash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainDash")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainDashOffset(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainDashOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainDashOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainDashOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainOpacity(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainWidth(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withGridColor(value: ColorValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColor")(js.undefined)
        ret
    }
    @scala.inline
    def withGridColorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColor")(null)
        ret
    }
    @scala.inline
    def withGridDash(value: DashArrayValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridDash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridDash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridDash")(js.undefined)
        ret
    }
    @scala.inline
    def withGridDashOffset(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridDashOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridDashOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridDashOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withGridOpacity(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withGridWidth(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridWidth")(js.undefined)
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
    def withLabelAngle(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAngle")(js.undefined)
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
    def withLabelBound(value: Double | Boolean | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelBound")(js.undefined)
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
    def withLabelFlush(value: Double | Boolean | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFlush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFlush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFlush")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFlushOffset(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFlushOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFlushOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFlushOffset")(js.undefined)
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
    def withLabelLineHeight(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelLineHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLineHeight")(js.undefined)
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
    def withLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxExtent(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withMinExtent(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withTickBand(value: center | extent | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickBand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickBand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickBand")(js.undefined)
        ret
    }
    @scala.inline
    def withTickColor(value: ColorValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTickColorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickColor")(null)
        ret
    }
    @scala.inline
    def withTickDash(value: DashArrayValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickDash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickDash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickDash")(js.undefined)
        ret
    }
    @scala.inline
    def withTickDashOffset(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickDashOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickDashOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickDashOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withTickExtra(value: BooleanValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickExtra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickExtra: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickExtra")(js.undefined)
        ret
    }
    @scala.inline
    def withTickOffset(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withTickOpacity(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withTickRound(value: BooleanValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickRound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickRound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickRound")(js.undefined)
        ret
    }
    @scala.inline
    def withTickSize(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTickWidth(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTicks(value: BooleanValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(js.undefined)
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
    def withTitleAngle(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAngle")(js.undefined)
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
    @scala.inline
    def withTitleX(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleX")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleY(value: NumberValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleY")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(js.undefined)
        ret
    }
  }
  
}

