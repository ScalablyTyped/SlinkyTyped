package typingsSlinky.victory.mod

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.DOMAttributes
import typingsSlinky.victory.AnonX
import typingsSlinky.victory.victoryStrings.parallel
import typingsSlinky.victory.victoryStrings.perpendicular
import typingsSlinky.victory.victoryStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VictoryLabelProps extends js.Object {
  /**
    * Specifies the angle to rotate the text by.
    */
  var angle: js.UndefOr[String | Double] = js.native
  /**
    * The capHeight prop defines a text metric for the font being used: the expected height of capital letters.
    * This is necessary because of SVG, which (a) positions the *bottom* of the text at `y`, and (b) has no notion of line height.
    * The value should ideally use the same units as `lineHeight` and `dy`, preferably ems. If given a unitless number, it is assumed to be ems.
    * @default "0.71em"
    */
  var capHeight: js.UndefOr[StringOrNumberOrCallback] = js.native
  /**
    * The children of this component define the content of the label.
    * This makes using the component similar to normal HTML spans or labels. strings, numbers, and functions of data / value are supported.
    */
  var children: js.UndefOr[StringOrNumberOrCallback] = js.native
  /**
    * The className prop specifies a class name that will be applied to the rendered text element.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Labels that apply to an entire data series will recieve the entire series as `data` instead of an individual datum prop.
    */
  var data: js.UndefOr[js.Array[_]] = js.native
  /**
    * Victory components can pass a datum prop to their label component. This can be used to calculate functional styles, and determine child text
    */
  var datum: js.UndefOr[js.Object] = js.native
  /**
    * The dx prop defines a horizontal shift from the `x` coordinate.
    */
  var dx: js.UndefOr[StringOrNumberOrCallback] = js.native
  /**
    * The dy prop defines a vertical shift from the `y` coordinate.
    * Since this component already accounts for `capHeight`, `lineHeight`, and `verticalAnchor`, this will usually not be necessary.
    */
  var dy: js.UndefOr[StringOrNumberOrCallback] = js.native
  /**
    * The events prop attaches arbitrary event handlers to the label component.
    * Event handlers are currently only called with their corresponding events.
    */
  var events: js.UndefOr[DOMAttributes[_]] = js.native
  /**
    * The labelPlacement prop is used to specify the placement of labels relative to the data point they represent.
    * This prop may be given as “vertical”, “parallel” or “perpendicular”. This props is particularly useful in polar
    * charts, where it may be desireable to position a label either parallel or perpendicular to its corresponding angle.
    * When this prop is not set, perpendicular label placement will be used for polar charts, and vertical label
    * placement will be used for cartesian charts.
    */
  var labelPlacement: js.UndefOr[parallel | perpendicular | vertical] = js.native
  /**
    * The lineHeight prop defines how much space a single line of text should take up.
    * Note that SVG has no notion of line-height, so the positioning may differ slightly from what you would expect with CSS,
    * but the result is similar: a roughly equal amount of extra space is distributed above and below the line of text.
    * The value should ideally use the same units as `capHeight` and `dy`, preferably ems.
    * If given a unitless number, it is assumed to be ems.
    * @default 1
    */
  var lineHeight: js.UndefOr[StringOrNumberOrCallback] = js.native
  /**
    * Victory components will pass an origin prop is to define the center point in svg coordinates for polar charts.
    * **This prop should not be set manually.**
    */
  var origin: js.UndefOr[AnonX] = js.native
  /**
    * Victory components can pass a boolean polar prop to specify whether a label is part of a polar chart.
    * **This prop should not be set manually.**
    */
  var polar: js.UndefOr[Boolean] = js.native
  /**
    * The renderInPortal prop specifies whether VictoryLabel should render text in place or within a VictoryPortal.
    * Setting renderInPortal to true is equivalent to wrapping VictoryLabel in a VictoryPortal. This prop is false by default.
    */
  var renderInPortal: js.UndefOr[Boolean] = js.native
  /**
    * The style prop applies CSS properties to the rendered `<text>` element.
    */
  var style: js.UndefOr[CSSProperties | js.Array[CSSProperties]] = js.native
  /**
    * The text prop defines the text VictoryLabel will render. The text prop may be given as a string, number, a function of datum,
    * or an array of any of these. Strings may include newline characters, which VictoryLabel will split into separate
    * <tspan/> elements. When text is given as an array, separate <tspan/> elements will be created for each element in the array.
    */
  var text: js.UndefOr[js.Array[String] | StringOrNumberOrCallback] = js.native
  /**
    * The textAnchor prop defines how the text is horizontally positioned relative to the given `x` and `y` coordinates.
    */
  var textAnchor: js.UndefOr[TextAnchorType | js.Function0[TextAnchorType]] = js.native
  /**
    * The transform prop applies a transform to the rendered `<text>` element.
    * In addition to being a string, it can be an object containing transform definitions for easier authoring.
    */
  var transform: js.UndefOr[String | js.Object | (js.Function0[String | js.Object])] = js.native
  /**
    * The verticalAnchor prop defines how the text is vertically positioned relative to the given `x` and `y` coordinates.
    */
  var verticalAnchor: js.UndefOr[VerticalAnchorType | js.Function0[VerticalAnchorType]] = js.native
  /**
    * The x prop defines the x coordinate to use as a basis for horizontal positioning.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * The y prop defines the y coordinate to use as a basis for vertical positioning.
    */
  var y: js.UndefOr[Double] = js.native
}

object VictoryLabelProps {
  @scala.inline
  def apply(): VictoryLabelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryLabelProps]
  }
  @scala.inline
  implicit class VictoryLabelPropsOps[Self <: VictoryLabelProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngle(value: String | Double): Self = {
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
    def withCapHeightFunction1(value: /* args */ CallbackArgs => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCapHeight(value: StringOrNumberOrCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenFunction1(value: /* args */ CallbackArgs => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildren(value: StringOrNumberOrCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDatum(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datum")(js.undefined)
        ret
    }
    @scala.inline
    def withDxFunction1(value: /* args */ CallbackArgs => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dx")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDx(value: StringOrNumberOrCallback): Self = {
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
    def withDyFunction1(value: /* args */ CallbackArgs => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDy(value: StringOrNumberOrCallback): Self = {
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
    def withEvents(value: DOMAttributes[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelPlacement(value: parallel | perpendicular | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPlacement")(js.undefined)
        ret
    }
    @scala.inline
    def withLineHeightFunction1(value: /* args */ CallbackArgs => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLineHeight(value: StringOrNumberOrCallback): Self = {
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
    def withOrigin(value: AnonX): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withPolar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderInPortal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderInPortal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderInPortal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderInPortal")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties | js.Array[CSSProperties]): Self = {
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
    def withTextFunction1(value: /* args */ CallbackArgs => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withText(value: js.Array[String] | StringOrNumberOrCallback): Self = {
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
    def withTextAnchorFunction0(value: () => TextAnchorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAnchor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTextAnchor(value: TextAnchorType | js.Function0[TextAnchorType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAnchor")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformFunction0(value: () => String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTransform(value: String | js.Object | (js.Function0[String | js.Object])): Self = {
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
    def withVerticalAnchorFunction0(value: () => VerticalAnchorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAnchor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVerticalAnchor(value: VerticalAnchorType | js.Function0[VerticalAnchorType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAnchor")(js.undefined)
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

