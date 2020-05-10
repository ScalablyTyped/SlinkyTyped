package typingsSlinky.victory.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VictoryTooltipProps extends js.Object {
  /**
    * When true, tooltip events will set the active prop on both data and label elements.
    * @default false
    */
  var activateData: js.UndefOr[Boolean] = js.native
  /**
    * The active prop specifies whether the tooltip component should be displayed.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * The angle prop specifies the angle to rotate the tooltip around its origin point.
    */
  var angle: js.UndefOr[String | Double] = js.native
  /**
    * The cornerRadius prop determines corner radius of the flyout container. This prop may be given as a positive number or a function of datum.
    */
  var cornerRadius: js.UndefOr[NumberOrCallback] = js.native
  /**
    * Victory components can pass a data prop to their label component. This can be useful in custom components that need to make use of the entire dataset.
    */
  var data: js.UndefOr[js.Array[_]] = js.native
  /**
    * Victory components can pass a datum prop to their label component. This can be used to calculate functional styles, and determine text.
    */
  var datum: js.UndefOr[js.Object] = js.native
  /**
    * The dx prop defines a horizontal shift from the x coordinate.
    */
  var dx: js.UndefOr[StringOrNumberOrCallback] = js.native
  /**
    * The dy prop defines a vertical shift from the y coordinate.
    */
  var dy: js.UndefOr[StringOrNumberOrCallback] = js.native
  /**
    * The events prop attaches arbitrary event handlers to the label component. This prop should be given as an object of event names and corresponding event handlers.
    * When events are provided via Victory’s event system, event handlers will be called with the event, the props of the component is attached to, and an eventKey.
    * Examples: events={{onClick: (evt) => alert("x: " + evt.clientX)}}
    */
  var events: js.UndefOr[js.Object] = js.native
  /**
    * The flyoutComponent prop takes a component instance which will be used to create the flyout path for each tooltip.
    * The new element created from the passed flyoutComponent will be supplied with the following properties: x, y, dx, dy,
    * index, datum, cornerRadius, pointerLength, pointerWidth, width, height, orientation, style, and events.
    * Any of these props may be overridden by passing in props to the supplied component, or modified or ignored within the custom component itself.
    * If flyoutComponent is omitted, a default Flyout component will be created with props described above.
    * Examples: flyoutComponent={<Flyout x={50} y={50}/>}, flyoutComponent={<MyCustomFlyout/>}
    * @default <Flyout/>
    */
  var flyoutComponent: js.UndefOr[ReactElement] = js.native
  /**
    * The flyoutHeight prop defines the height of the tooltip flyout. This prop may be given as a positive number or a function of datum. If this prop
    * is not set, flyoutHeight will be determined based on an approximate text size calculated from the text and style props provided to VictoryTooltip.
    */
  var flyoutHeight: js.UndefOr[NumberOrCallback] = js.native
  /**
    * The style prop applies SVG style properties to the rendered flyout container. These props will be passed to the flyoutComponent.
    */
  var flyoutStyle: js.UndefOr[VictoryStyleObject] = js.native
  /**
    * The flyoutWidth prop defines the width of the tooltip flyout. This prop may be given as a positive number or a function of datum. If this prop is
    * not set, flyoutWidth will be determined based on an approximate text size calculated from the text and style props provided to VictoryTooltip.
    */
  var flyoutWidth: js.UndefOr[NumberOrCallback] = js.native
  /**
    * The groupComponent prop takes a component instance which will be used to create group elements for use within container elements. This prop defaults to a <g> tag.
    * @default groupComponent={<g/>}
    */
  var groupComponent: js.UndefOr[ReactElement] = js.native
  /**
    * This prop refers to the height of the svg that VictoryLabel is rendered within. This prop is passed from parents of VictoryLabel, and should not be set
    * manually. In versions before ^33.0.0 this prop referred to the height of the tooltip flyout. Please use flyoutHeight instead
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The horizontal prop determines whether to plot the flyouts to the left / right of the (x, y) coordinate rather than top / bottom.
    * This is useful when an orientation prop is not provided, and data will determine the default orientation. i.e.
    * negative values result in a left orientation and positive values will result in a right orientation by default.
    */
  var horizontal: js.UndefOr[Boolean] = js.native
  /**
    * The index prop represents the index of the datum in the data array.
    */
  var index: js.UndefOr[Double | String] = js.native
  /**
    * The labelComponent prop takes a component instance which will be used to render each tooltip label.
    * The new element created from the passed labelComponent will be supplied with the following properties: x, y, index, datum, verticalAnchor, textAnchor, style, text, and events.
    * Any of these props may be overridden by passing in props to the supplied component, or modified or ignored within the custom component itself.
    * If labelComponent is omitted, a new VictoryLabel will be created with the props described above.
    * Examples: labelComponent={<VictoryLabel dy={20}/>}, labelComponent={<MyCustomLabel/>}
    * @default <VictoryLabel/>
    */
  var labelComponent: js.UndefOr[ReactElement] = js.native
  /**
    * The orientation prop determines which side of the (x, y) coordinate the tooltip should be rendered on.
    * This prop can be given as “top”, “bottom”, “left”, “right”, or as a function of datum that returns one of these values.
    * If this prop is not provided it will be determined from the sign of the datum, and the value of the horizontal prop.
    */
  var orientation: js.UndefOr[OrientationTypes | VictoryNumberCallback] = js.native
  /**
    * The pointerLength prop determines the length of the triangular pointer extending from the flyout. This prop may be given as a positive number or a function of datum.
    */
  var pointerLength: js.UndefOr[NumberOrCallback] = js.native
  /**
    * The pointerWidth prop determines the width of the base of the triangular pointer extending from
    * the flyout. This prop may be given as a positive number or a function of datum.
    */
  var pointerWidth: js.UndefOr[NumberOrCallback] = js.native
  /**
    * When renderInPortal is true, rendered tooltips will be wrapped in VictoryPortal and rendered within the Portal element
    * within VictoryContainer. Note: This prop should not be set to true when using a custom container element.
    */
  var renderInPortal: js.UndefOr[Boolean] = js.native
  /**
    * The style prop applies CSS properties to the rendered `<text>` element.
    */
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * The text prop defines the text VictoryTooltip will render. The text prop may be given as a string, number, or function of datum.
    * When VictoryLabel is used as the labelComponent, strings may include newline characters, which VictoryLabel will split in to separate <tspan/> elements.
    */
  var text: js.UndefOr[StringOrNumberOrCallback | (js.Array[Double | String])] = js.native
  /**
    * VictoryAxis uses the standard theme prop. Read about it here
    * @default VictoryTheme.grayscale
    */
  var theme: js.UndefOr[VictoryThemeDefinition] = js.native
  /**
    * This prop refers to the width of the svg that VictoryLabel is rendered within. This prop is passed from parents of VictoryLabel,
    * and should not be set manually. In versions before ^33.0.0 this prop referred to the width of the tooltip flyout. Please use flyoutWidth instead
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * The x prop defines the x coordinate to use as a basis for horizontal positioning.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * The y prop defines the y coordinate to use as a basis for vertical positioning.
    */
  var y: js.UndefOr[Double] = js.native
}

object VictoryTooltipProps {
  @scala.inline
  def apply(): VictoryTooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryTooltipProps]
  }
  @scala.inline
  implicit class VictoryTooltipPropsOps[Self <: VictoryTooltipProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivateData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activateData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivateData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activateData")(js.undefined)
        ret
    }
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
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
    def withCornerRadiusFunction1(value: /* args */ CallbackArgs => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCornerRadius(value: NumberOrCallback): Self = {
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
    def withEvents(value: js.Object): Self = {
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
    def withFlyoutComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flyoutComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlyoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flyoutComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withFlyoutHeightFunction1(value: /* args */ CallbackArgs => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flyoutHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFlyoutHeight(value: NumberOrCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flyoutHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlyoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flyoutHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withFlyoutStyle(value: VictoryStyleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flyoutStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlyoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flyoutStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFlyoutWidthFunction1(value: /* args */ CallbackArgs => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flyoutWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFlyoutWidth(value: NumberOrCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flyoutWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlyoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flyoutWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
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
    def withHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientationFunction1(value: /* args */ CallbackArgs => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOrientation(value: OrientationTypes | VictoryNumberCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerLengthFunction1(value: /* args */ CallbackArgs => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPointerLength(value: NumberOrCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointerLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerLength")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerWidthFunction1(value: /* args */ CallbackArgs => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPointerWidth(value: NumberOrCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointerWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerWidth")(js.undefined)
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
    def withStyle(value: CSSProperties): Self = {
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
    def withText(value: StringOrNumberOrCallback | (js.Array[Double | String])): Self = {
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
    def withTheme(value: VictoryThemeDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
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

