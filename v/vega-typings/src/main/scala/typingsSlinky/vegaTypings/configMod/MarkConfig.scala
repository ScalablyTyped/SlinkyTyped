package typingsSlinky.vegaTypings.configMod

import typingsSlinky.vegaTypings.colorMod.Color
import typingsSlinky.vegaTypings.encodeMod.Align
import typingsSlinky.vegaTypings.encodeMod.Blend
import typingsSlinky.vegaTypings.encodeMod.FontStyle
import typingsSlinky.vegaTypings.encodeMod.FontWeight
import typingsSlinky.vegaTypings.encodeMod.Gradient
import typingsSlinky.vegaTypings.encodeMod.Interpolate
import typingsSlinky.vegaTypings.encodeMod.Orientation
import typingsSlinky.vegaTypings.encodeMod.SymbolShape
import typingsSlinky.vegaTypings.encodeMod.Text
import typingsSlinky.vegaTypings.encodeMod.TextBaseline
import typingsSlinky.vegaTypings.encodeMod.TextDirection
import typingsSlinky.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkConfig extends js.Object {
  // Text / Label Mark Config
  /**
    * The horizontal alignment of the text. One of `"left"`, `"right"`, `"center"`.
    */
  var align: js.UndefOr[Align | SignalRef] = js.native
  /**
    * The rotation angle of the text, in degrees.
    *
    * @minimum 0
    * @maximum 360
    */
  var angle: js.UndefOr[Double | SignalRef] = js.native
  /**
    * Whether to keep aspect ratio of image marks.
    */
  var aspect: js.UndefOr[Boolean] = js.native
  /**
    * The vertical alignment of the text. One of `"top"`, `"bottom"`, `"middle"`, `"alphabetic"`.
    *
    * __Default value:__ `"middle"`
    *
    */
  var baseline: js.UndefOr[TextBaseline | SignalRef] = js.native
  /**
    * The color blend mode for drawing an item on its current background. Any valid [CSS mix-blend-mode](https://developer.mozilla.org/en-US/docs/Web/CSS/mix-blend-mode) value can be used.
    *
    * __Default value: `"source-over"`
    */
  var blend: js.UndefOr[Blend] = js.native
  // ---------- Corner Radius: Bar, Tick, Rect ----------
  /**
    * The radius in pixels of rounded rectangle corners.
    *
    * __Default value:__ `0`
    */
  var cornerRadius: js.UndefOr[Double] = js.native
  /**
    * The radius in pixels of rounded rectangle bottom left corner.
    *
    * __Default value:__ `0`
    */
  var cornerRadiusBottomLeft: js.UndefOr[Double] = js.native
  /**
    * The radius in pixels of rounded rectangle bottom right corner.
    *
    * __Default value:__ `0`
    */
  var cornerRadiusBottomRight: js.UndefOr[Double] = js.native
  /**
    * The radius in pixels of rounded rectangle top right corner.
    *
    * __Default value:__ `0`
    */
  var cornerRadiusTopLeft: js.UndefOr[Double] = js.native
  /**
    * The radius in pixels of rounded rectangle top left corner.
    *
    * __Default value:__ `0`
    */
  var cornerRadiusTopRight: js.UndefOr[Double] = js.native
  /**
    * The mouse cursor used over the mark. Any valid [CSS cursor type](https://developer.mozilla.org/en-US/docs/Web/CSS/cursor#Values) can be used.
    */
  var cursor: js.UndefOr[Cursor | SignalRef] = js.native
  /**
    * The direction of the text. One of `"ltr"` (left-to-right) or `"rtl"` (right-to-left). This property determines on which side is truncated in response to the limit parameter.
    *
    * __Default value:__ `"ltr"`
    */
  var dir: js.UndefOr[TextDirection | SignalRef] = js.native
  /**
    * The horizontal offset, in pixels, between the text label and its anchor point. The offset is applied after rotation by the _angle_ property.
    */
  var dx: js.UndefOr[Double | SignalRef] = js.native
  /**
    * The vertical offset, in pixels, between the text label and its anchor point. The offset is applied after rotation by the _angle_ property.
    */
  var dy: js.UndefOr[Double | SignalRef] = js.native
  /**
    * The ellipsis string for text truncated in response to the limit parameter.
    *
    * __Default value:__ `"…"`
    */
  var ellipsis: js.UndefOr[String] = js.native
  /**
    * Default fill color.
    *
    * __Default value:__ (None)
    *
    */
  var fill: js.UndefOr[Color | Gradient | Null | SignalRef] = js.native
  /**
    * The fill opacity (value between [0,1]).
    *
    * __Default value:__ `1`
    *
    * @minimum 0
    * @maximum 1
    */
  var fillOpacity: js.UndefOr[Double | SignalRef] = js.native
  /**
    * The typeface to set the text in (e.g., `"Helvetica Neue"`).
    */
  var font: js.UndefOr[String | SignalRef] = js.native
  /**
    * The font size, in pixels.
    *
    * __Default value:__ `11`
    *
    *  @minimum 0
    */
  var fontSize: js.UndefOr[Double | SignalRef] = js.native
  /**
    * The font style (e.g., `"italic"`).
    */
  var fontStyle: js.UndefOr[FontStyle | SignalRef] = js.native
  /**
    * The font weight.
    * This can be either a string (e.g `"bold"`, `"normal"`) or a number (`100`, `200`, `300`, ..., `900` where `"normal"` = `400` and `"bold"` = `700`).
    */
  var fontWeight: js.UndefOr[FontWeight | SignalRef] = js.native
  /**
    * Height of the marks.
    */
  var height: js.UndefOr[Double | SignalRef] = js.native
  /**
    * A URL to load upon mouse click. If defined, the mark acts as a hyperlink.
    *
    * @format uri
    */
  var href: js.UndefOr[String | SignalRef] = js.native
  // ---------- Interpolation: Line / area ----------
  /**
    * The line interpolation method to use for line and area marks. One of the following:
    * - `"linear"`: piecewise linear segments, as in a polyline.
    * - `"linear-closed"`: close the linear segments to form a polygon.
    * - `"step"`: alternate between horizontal and vertical segments, as in a step function.
    * - `"step-before"`: alternate between vertical and horizontal segments, as in a step function.
    * - `"step-after"`: alternate between horizontal and vertical segments, as in a step function.
    * - `"basis"`: a B-spline, with control point duplication on the ends.
    * - `"basis-open"`: an open B-spline; may not intersect the start or end.
    * - `"basis-closed"`: a closed B-spline, as in a loop.
    * - `"cardinal"`: a Cardinal spline, with control point duplication on the ends.
    * - `"cardinal-open"`: an open Cardinal spline; may not intersect the start or end, but will intersect other control points.
    * - `"cardinal-closed"`: a closed Cardinal spline, as in a loop.
    * - `"bundle"`: equivalent to basis, except the tension parameter is used to straighten the spline.
    * - `"monotone"`: cubic interpolation that preserves monotonicity in y.
    */
  var interpolate: js.UndefOr[Interpolate | SignalRef] = js.native
  /**
    * The maximum length of the text mark in pixels. The text value will be automatically truncated if the rendered size exceeds the limit.
    *
    * __Default value:__ `0` -- indicating no limit
    */
  var limit: js.UndefOr[Double | SignalRef] = js.native
  /**
    * A delimiter, such as a newline character, upon which to break text strings into multiple lines. This property is ignored if the text is array-valued.
    */
  var lineBreak: js.UndefOr[String | SignalRef] = js.native
  /**
    * The line height in pixels (the spacing between subsequent lines of text) for multi-line text marks.
    */
  var lineHeight: js.UndefOr[Double | SignalRef] = js.native
  // ---------- Opacity ----------
  /**
    * The overall opacity (value between [0,1]).
    *
    * @minimum 0
    * @maximum 1
    */
  var opacity: js.UndefOr[Double | SignalRef] = js.native
  /**
    * The orientation of the area mark. One of `horizontal` or `vertical` (the default). With a vertical orientation, an area mark is defined by the `x`, `y`, and (`y2` or `height`) properties; with a horizontal orientation, the `y`, `x` and (`x2` or `width`) properties must be specified instead.
    */
  var orient: js.UndefOr[Orientation | SignalRef] = js.native
  /**
    * Polar coordinate radial offset, in pixels, of the text label from the origin determined by the `x` and `y` properties.
    *
    * @minimum 0
    */
  var radius: js.UndefOr[Double | SignalRef] = js.native
  /**
    * Shape of the point marks. Supported values include:
    * - plotting shapes: `"circle"`, `"square"`, `"cross"`, `"diamond"`, `"triangle-up"`, `"triangle-down"`, `"triangle-right"`, or `"triangle-left"`.
    * - the line symbol `"stroke"`
    * - centered directional shapes `"arrow"`, `"wedge"`, or `"triangle"`
    * - a custom [SVG path string](https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths) (For correct sizing, custom shape paths should be defined within a square bounding box with coordinates ranging from -1 to 1 along both the x and y dimensions.)
    *
    * __Default value:__ `"circle"`
    */
  var shape: js.UndefOr[SymbolShape | String | SignalRef] = js.native
  /**
    * The area in pixels of the symbols bounding box. Note that this value sets the area of the symbol; the side lengths will increase with the square root of this value.
    *
    * __Default value:__ `30`
    *
    * @minimum 0
    */
  var size: js.UndefOr[Double | SignalRef] = js.native
  /**
    * Default stroke color.
    *
    * __Default value:__ (None)
    *
    */
  var stroke: js.UndefOr[Color | Gradient | Null | SignalRef] = js.native
  /**
    * The stroke cap for line ending style. One of `"butt"`, `"round"`, or `"square"`.
    *
    * __Default value:__ `"butt"`
    *
    */
  var strokeCap: js.UndefOr[String | SignalRef] = js.native
  /**
    * An array of alternating stroke, space lengths for creating dashed or dotted lines.
    */
  var strokeDash: js.UndefOr[js.Array[Double] | SignalRef] = js.native
  /**
    * The offset (in pixels) into which to begin drawing with the stroke dash array.
    */
  var strokeDashOffset: js.UndefOr[Double | SignalRef] = js.native
  /**
    * The stroke line join method. One of `"miter"`, `"round"` or `"bevel"`.
    *
    * __Default value:__ `"miter"`
    *
    */
  var strokeJoin: js.UndefOr[String | SignalRef] = js.native
  /**
    * The miter limit at which to bevel a line join.
    */
  var strokeMiterLimit: js.UndefOr[Double | SignalRef] = js.native
  /**
    * The offset in pixels at which to draw the group stroke and fill. If unspecified, the default behavior is to dynamically offset stroked groups such that 1 pixel stroke widths align with the pixel grid.
    */
  var strokeOffset: js.UndefOr[Double | SignalRef] = js.native
  /**
    * The stroke opacity (value between [0,1]).
    *
    * __Default value:__ `1`
    *
    * @minimum 0
    * @maximum 1
    */
  var strokeOpacity: js.UndefOr[Double | SignalRef] = js.native
  // ---------- Stroke Style ----------
  /**
    * The stroke width, in pixels.
    *
    * @minimum 0
    */
  var strokeWidth: js.UndefOr[Double | SignalRef] = js.native
  /**
    * Depending on the interpolation type, sets the tension parameter (for line and area marks).
    */
  var tension: js.UndefOr[Double | SignalRef] = js.native
  /**
    * Placeholder text if the `text` channel is not specified
    */
  var text: js.UndefOr[Text | SignalRef] = js.native
  /**
    * Polar coordinate angle, in radians, of the text label from the origin determined by the `x` and `y` properties. Values for `theta` follow the same convention of `arc` mark `startAngle` and `endAngle` properties: angles are measured in radians, with `0` indicating "north".
    */
  var theta: js.UndefOr[Double | SignalRef] = js.native
  /**
    * The tooltip text to show upon mouse hover.
    */
  var tooltip: js.UndefOr[String | SignalRef] = js.native
  /**
    * Width of the marks.
    */
  var width: js.UndefOr[Double | SignalRef] = js.native
}

object MarkConfig {
  @scala.inline
  def apply(): MarkConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkConfig]
  }
  @scala.inline
  implicit class MarkConfigOps[Self <: MarkConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: Align | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withAngle(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(js.undefined)
        ret
    }
    @scala.inline
    def withAspect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAspect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspect")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseline(value: TextBaseline | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseline")(js.undefined)
        ret
    }
    @scala.inline
    def withBlend(value: Blend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blend")(js.undefined)
        ret
    }
    @scala.inline
    def withBlendNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blend")(null)
        ret
    }
    @scala.inline
    def withCornerRadius(value: Double): Self = {
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
    def withCornerRadiusBottomLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadiusBottomLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerRadiusBottomLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadiusBottomLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withCornerRadiusBottomRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadiusBottomRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerRadiusBottomRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadiusBottomRight")(js.undefined)
        ret
    }
    @scala.inline
    def withCornerRadiusTopLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadiusTopLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerRadiusTopLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadiusTopLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withCornerRadiusTopRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadiusTopRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerRadiusTopRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadiusTopRight")(js.undefined)
        ret
    }
    @scala.inline
    def withCursor(value: Cursor | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withDir(value: TextDirection | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withDx(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dx")(js.undefined)
        ret
    }
    @scala.inline
    def withDy(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dy")(js.undefined)
        ret
    }
    @scala.inline
    def withEllipsis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllipsis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: Color | Gradient | SignalRef): Self = {
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
    def withFillNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(null)
        ret
    }
    @scala.inline
    def withFillOpacity(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: String | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFontStyle(value: FontStyle | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeight(value: FontWeight | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHref(value: String | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(js.undefined)
        ret
    }
    @scala.inline
    def withInterpolate(value: Interpolate | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterpolate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withLineBreak(value: String | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineBreak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineBreak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineBreak")(js.undefined)
        ret
    }
    @scala.inline
    def withLineHeight(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double | SignalRef): Self = {
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
    def withOrient(value: Orientation | SignalRef): Self = {
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
    def withRadius(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
    @scala.inline
    def withShape(value: SymbolShape | String | SignalRef): Self = {
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
    def withSize(value: Double | SignalRef): Self = {
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
    def withStroke(value: Color | Gradient | SignalRef): Self = {
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
    def withStrokeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(null)
        ret
    }
    @scala.inline
    def withStrokeCap(value: String | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeCap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeCap")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeDash(value: js.Array[Double] | SignalRef): Self = {
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
    def withStrokeDashOffset(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDashOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeDashOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDashOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeJoin(value: String | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeJoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeJoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeJoin")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeMiterLimit(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeMiterLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeMiterLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeMiterLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeOffset(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeOpacity(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWidth(value: Double | SignalRef): Self = {
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
    def withTension(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tension")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: Text | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTheta(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theta")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: String | SignalRef): Self = {
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
    def withWidth(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

