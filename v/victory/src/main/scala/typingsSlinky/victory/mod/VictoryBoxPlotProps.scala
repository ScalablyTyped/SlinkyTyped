package typingsSlinky.victory.mod

import slinky.core.facade.ReactElement
import typingsSlinky.victory.victoryStrings.bottom
import typingsSlinky.victory.victoryStrings.left
import typingsSlinky.victory.victoryStrings.right
import typingsSlinky.victory.victoryStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VictoryBoxPlotProps
  extends VictoryCommonProps
     with VictoryDatableProps {
  /**
    * The boxWidth prop specifies how wide each box should be. If the whiskerWidth
    * prop is not set, this prop will also determine the width of the whisker crosshair.
    */
  var boxWidth: js.UndefOr[Double] = js.native
  /**
    * The domainPadding prop specifies a number of pixels of padding to add to the
    * beginning and end of a domain. This prop is useful for explicitly spacing ticks farther
    * from the origin to prevent crowding. This prop should be given as an object with
    * numbers specified for x and y.
    */
  var domainPadding: js.UndefOr[DomainPaddingPropType] = js.native
  /**
    * Similar to data accessor props `x` and `y`, this prop may be used to functionally
    * assign eventKeys to data
    */
  var eventKey: js.UndefOr[StringOrNumberOrCallback] = js.native
  /**
    * The event prop take an array of event objects. Event objects are composed of
    * a childName, target, eventKey, and eventHandlers. Targets may be any valid style namespace
    * for a given component, (i.e. "data" and "labels"). The childName will refer to an
    * individual child of VictoryChart, either by its name prop, or by index. The eventKey
    * may optionally be used to select a single element by index or eventKey rather than
    * an entire set. The eventHandlers object should be given as an object whose keys are standard
    * event names (i.e. onClick) and whose values are event callbacks. The return value
    * of an event handler is used to modify elemnts. The return value should be given
    * as an object or an array of objects with optional target and eventKey and childName keys,
    * and a mutation key whose value is a function. The target and eventKey and childName keys
    * will default to those corresponding to the element the event handler was attached to.
    * The mutation function will be called with the calculated props for the individual selected
    * element (i.e. a single bar), and the object returned from the mutation function
    * will override the props of the selected element via object assignment.
    * @examples
    * events={[
    *   {
    *     target: "data",
    *     childName: "firstBar",
    *     eventHandlers: {
    *       onClick: () => {
    *         return [
    *            {
    *              childName: "secondBar",
    *              mutation: (props) => {
    *                return {style: merge({}, props.style, {fill: "orange"})};
    *              }
    *            }, {
    *              childName: "secondBar",
    *              target: "labels",
    *              mutation: () => {
    *                return {text: "hey"};
    *              }
    *            }
    *          ];
    *       }
    *     }
    *   }
    * ]}
    */
  var events: js.UndefOr[js.Array[EventPropTypeInterface[String, StringOrNumberOrCallback]]] = js.native
  /**
    * The labelOrientation prop determines where labels are placed relative to their
    * corresponding data. If this prop is not set, it will be set to “top” for
    * horizontal charts, and “right” for vertical charts.
    */
  var labelOrientation: js.UndefOr[top | bottom | left | right] = js.native
  /**
    * When the boolean labels prop is set to true, the values for min, max, median,
    * q1, and q3 will be displayed for each box. For more granular label control, use
    * the individual minLabels, maxLabels, medianLabels, q1Labels, and q3Labels props.
    */
  var labels: js.UndefOr[Boolean] = js.native
  /**
    * Use the max data accessor prop to define the max value of a box plot.
    *
    * string: specify which property in an array of data objects should be used as the max value
    * @example // max="max_value"
    *
    * function: use a function to translate each element in a data array into a max value
    * @example // max={() => 10}
    *
    * path string or path array: specify which property in an array of nested data objects should
    * be used as a max value
    * @example // max="bonds.max", max={["bonds", "max"]}
    */
  var max: js.UndefOr[StringOrNumberOrCallback | js.Array[String]] = js.native
  /**
    * The maxComponent prop takes a component instance which will be responsible for rendering
    * an element to represent the maximum value of the box plot. The new element created from
    * the passed maxComponent will be provided with the following props calculated by
    * VictoryBoxPlot: datum, index, scale, style, events, majorWhisker and minorWhisker. The
    * majorWhisker and minorWhisker props are given as objects with values for x1, y1, x2 and
    * y2 that describes the lines that make up the major and minor whisker. Any of these
    * props may be overridden by passing in props to the supplied component, or modified or
    * ignored within the custom component itself. If a maxComponent is not provided,
    * VictoryBoxPlot will use its default Whisker component.
    */
  var maxComponent: js.UndefOr[ReactElement] = js.native
  /**
    * The maxLabelComponent prop takes a component instance which will be used to render the
    * label corresponding to the maximum value for each box. The new element created from the
    * passed maxLabelComponent will be supplied with the following props: x, y, datum, index,
    * scale, verticalAnchor, textAnchor, angle, transform, style and events. Any of these
    * props may be overridden by passing in props to the supplied component, or modified or
    * ignored within the custom component itself. If maxLabelComponent is omitted, a new
    * VictoryLabel will be created with props described above.
    */
  var maxLabelComponent: js.UndefOr[ReactElement] = js.native
  /**
    * Use the median data accessor prop to define the median value of a box plot.
    *
    * string: specify which property in an array of data objects should be used as the median value
    * @example // median="median_value"
    *
    * function: use a function to translate each element in a data array into a median value
    * @example // median={() => 10}
    *
    * path string or path array: specify which property in an array of nested data objects should
    * be used as a median value
    * @example // median="bonds.median", median={["bonds", "median"]}
    */
  var median: js.UndefOr[StringOrNumberOrCallback | js.Array[String]] = js.native
  /**
    * The medianComponent prop takes a component instance which will be responsible for rendering an
    * element to represent the median value of the box plot. The new element created from the passed
    * medianComponent will be provided with the following props calculated by VictoryBoxPlot: datum,
    * index, scale, style, events, x1, y1, x2 and y2 Any of these props may be overridden by passing
    * in props to the supplied component, or modified or ignored within the custom component itself.
    * If a medianComponent is not provided, VictoryBoxPlot will use its default Line component.
    */
  var medianComponent: js.UndefOr[ReactElement] = js.native
  /**
    * The medianLabelComponent prop takes a component instance which will be used to render the label
    * corresponding to the median value for each box. The new element created from the passed
    * medianLabelComponent will be supplied with the following props: x, y, datum, index, scale,
    * verticalAnchor, textAnchor, angle, transform, style and events. Any of these props may be overridden
    * by passing in props to the supplied component, or modified or ignored within the custom component
    * itself. If medianLabelComponent is omitted, a new VictoryLabel will be created with props described above.
    */
  var medianLabelComponent: js.UndefOr[ReactElement] = js.native
  /**
    * Use the min data accessor prop to define the min value of a box plot.
    *
    * string: specify which property in an array of data objects should be used as the min value
    * @example // min="min_value"
    *
    * function: use a function to translate each element in a data array into a min value
    * @example // min={() => 10}
    *
    * path string or path array: specify which property in an array of nested data objects should
    * be used as a min value
    * @example // min="bonds.min", min={["bonds", "min"]}
    */
  var min: js.UndefOr[StringOrNumberOrCallback | js.Array[String]] = js.native
  /**
    * The medianComponent prop takes a component instance which will be responsible for rendering an
    * element to represent the median value of the box plot. The new element created from the passed
    * medianComponent will be provided with the following props calculated by VictoryBoxPlot: datum,
    * index, scale, style, events, x1, y1, x2 and y2 Any of these props may be overridden by passing
    * in props to the supplied component, or modified or ignored within the custom component itself.
    * If a medianComponent is not provided, VictoryBoxPlot will use its default Line component.
    */
  var minComponent: js.UndefOr[ReactElement] = js.native
  /**
    * The minLabelComponent prop takes a component instance which will be used to render the label
    * corresponding to the minimum value for each box. The new element created from the passed
    * minLabelComponent will be supplied with the following props: x, y, datum, index, scale, verticalAnchor,
    * textAnchor, angle, transform, style and events. Any of these props may be overridden by passing in
    * props to the supplied component, or modified or ignored within the custom component itself. If
    * minLabelComponent is omitted, a new VictoryLabel will be created with props described above.
    */
  var minLabelComponent: js.UndefOr[ReactElement] = js.native
  /**
    * Use the q1 data accessor prop to define the q1 value of a box plot.
    *
    * string: specify which property in an array of data objects should be used as the q1 value
    * @example // q1="q1_value"
    *
    * function: use a function to translate each element in a data array into a q1 value
    * @example // q1={() => 10}
    *
    * path string or path array: specify which property in an array of nested data objects should
    * be used as a q1 value
    * @example // q1="bonds.q1", q1={["bonds", "q1"]}
    */
  var q1: js.UndefOr[StringOrNumberOrCallback | js.Array[String]] = js.native
  /**
    * The q1Component prop takes a component instance which will be responsible for rendering an
    * element to represent the q1 value of the box plot. The new element created from the passed
    * q1Component will be provided with the following props calculated by VictoryBoxPlot: datum,
    * index, scale, style, events, x, y, width and height Any of these props may be overridden by
    * passing in props to the supplied component, or modified or ignored within the custom component
    * itself. If a q1Component is not provided, VictoryBoxPlot will use its default Box component.
    */
  var q1Component: js.UndefOr[ReactElement] = js.native
  /**
    * The q1LabelComponent prop takes a component instance which will be used to render the label
    * corresponding to the q1 value for each box. The new element created from the passed q1LabelComponent
    * will be supplied with the following props: x, y, datum, index, scale, verticalAnchor, textAnchor,
    * angle, transform, style and events. Any of these props may be overridden by passing in props to
    * the supplied component, or modified or ignored within the custom component itself. If
    * q1LabelComponent is omitted, a new VictoryLabel will be created with props described above.
    */
  var q1LabelComponent: js.UndefOr[ReactElement] = js.native
  /**
    * Use the q3 data accessor prop to define the q3 value of a box plot.
    *
    * string: specify which property in an array of data objects should be used as the q3 value
    * @example // q3="q3_value"
    *
    * function: use a function to translate each element in a data array into a q3 value
    * @example // q3={() => 10}
    *
    * path string or path array: specify which property in an array of nested data objects should
    * be used as a q3 value
    * @example // q3="bonds.q3", q3={["bonds", "q3"]}
    */
  var q3: js.UndefOr[StringOrNumberOrCallback | js.Array[String]] = js.native
  /**
    * The q3Component prop takes a component instance which will be responsible for rendering an
    * element to represent the q3 value of the box plot. The new element created from the passed
    * q3Component will be provided with the following props calculated by VictoryBoxPlot: datum,
    * index, scale, style, events, x, y, width and height Any of these props may be overridden by
    * passing in props to the supplied component, or modified or ignored within the custom component
    * itself. If a q3Component is not provided, VictoryBoxPlot will use its default Box component.
    */
  var q3Component: js.UndefOr[ReactElement] = js.native
  /**
    * The q3LabelComponent prop takes a component instance which will be used to render the label
    * corresponding to the q3 value for each box. The new element created from the passed q3LabelComponent
    * will be supplied with the following props: x, y, datum, index, scale, verticalAnchor, textAnchor,
    * angle, transform, style and events. Any of these props may be overridden by passing in props to
    * the supplied component, or modified or ignored within the custom component itself. If q3LabelComponent
    * is omitted, a new VictoryLabel will be created with props described above.
    */
  var q3LabelComponent: js.UndefOr[ReactElement] = js.native
  /**
    * The style prop defines the style of the component. The style prop
    * should be given as an object with styles defined for parent, max,
    * maxLabels, min, minLabels, median, medianLabels, q1, q1Labels, q3,
    * q3Labels. Any valid svg styles are supported, but width, height, a
    * nd padding should be specified via props as they determine relative
    * layout for components in VictoryChart. Functional styles may be
    * defined for style properties, and they will be evaluated with each datum.
    */
  var style: js.UndefOr[VictoryBoxPlotStyleInterface] = js.native
  /**
    * The whiskerWidth prop specifies how wide each whisker crosshair should be. If the
    * whiskerWidth prop is not set, the width of the whisker crosshair will match
    * the width of the box.
    */
  var whiskerWidth: js.UndefOr[Double] = js.native
}

object VictoryBoxPlotProps {
  @scala.inline
  def apply(): VictoryBoxPlotProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryBoxPlotProps]
  }
  @scala.inline
  implicit class VictoryBoxPlotPropsOps[Self <: VictoryBoxPlotProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainPadding(value: DomainPaddingPropType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withEventKeyFunction1(value: /* args */ CallbackArgs => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEventKey(value: StringOrNumberOrCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventKey")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[EventPropTypeInterface[String, StringOrNumberOrCallback]]): Self = {
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
    def withLabelOrientation(value: top | bottom | left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOrientation")(js.undefined)
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
    def withMaxFunction1(value: /* args */ CallbackArgs => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMax(value: StringOrNumberOrCallback | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLabelComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLabelComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLabelComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLabelComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withMedianFunction1(value: /* args */ CallbackArgs => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("median")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMedian(value: StringOrNumberOrCallback | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("median")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedian: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("median")(js.undefined)
        ret
    }
    @scala.inline
    def withMedianComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medianComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedianComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medianComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withMedianLabelComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medianLabelComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedianLabelComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medianLabelComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withMinFunction1(value: /* args */ CallbackArgs => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMin(value: StringOrNumberOrCallback | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withMinComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withMinLabelComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLabelComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLabelComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLabelComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withQ1Function1(value: /* args */ CallbackArgs => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q1")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQ1(value: StringOrNumberOrCallback | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q1")(js.undefined)
        ret
    }
    @scala.inline
    def withQ1Component(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q1Component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ1Component: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q1Component")(js.undefined)
        ret
    }
    @scala.inline
    def withQ1LabelComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q1LabelComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ1LabelComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q1LabelComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withQ3Function1(value: /* args */ CallbackArgs => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q3")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQ3(value: StringOrNumberOrCallback | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q3")(js.undefined)
        ret
    }
    @scala.inline
    def withQ3Component(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q3Component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ3Component: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q3Component")(js.undefined)
        ret
    }
    @scala.inline
    def withQ3LabelComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q3LabelComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ3LabelComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q3LabelComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: VictoryBoxPlotStyleInterface): Self = {
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
    def withWhiskerWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiskerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhiskerWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiskerWidth")(js.undefined)
        ret
    }
  }
  
}

