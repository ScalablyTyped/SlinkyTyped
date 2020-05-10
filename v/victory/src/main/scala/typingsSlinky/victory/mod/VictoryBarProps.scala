package typingsSlinky.victory.mod

import typingsSlinky.victory.AnonBottom
import typingsSlinky.victory.victoryStrings.data
import typingsSlinky.victory.victoryStrings.end
import typingsSlinky.victory.victoryStrings.labels
import typingsSlinky.victory.victoryStrings.middle
import typingsSlinky.victory.victoryStrings.parent
import typingsSlinky.victory.victoryStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VictoryBarProps
  extends VictoryMultiLabeableProps
     with VictoryCommonProps
     with VictoryDatableProps {
  /**
    * The alignment prop specifies how bars should be aligned relative to their data points.
    * This prop may be given as “start”, “middle” or “end”. When this prop is not specified,
    * bars will have “middle” alignment relative to their data points.
    */
  var alignment: js.UndefOr[start | middle | end] = js.native
  /**
    * The barRatio prop specifies an approximate ratio between bar widths and spaces between bars.
    * When width is not specified via the barWidth prop or in bar styles, the barRatio prop will
    * be used to calculate a default width for each bar given the total number of bars in the data series
    * and the overall width of the chart.
    */
  var barRatio: js.UndefOr[Double] = js.native
  /**
    * The barWidth prop is used to specify the width of each bar. This prop may be given as
    * a number of pixels or as a function that returns a number. When this prop is given as
    * a function, it will be evaluated with the arguments datum, and active. When this value
    * is not given, a default value will be calculated based on the overall dimensions of
    * the chart, and the number of bars.
    */
  var barWidth: js.UndefOr[NumberOrCallback] = js.native
  /**
    * The cornerRadius prop specifies a radius to apply to each bar.
    * If this prop is given as a single number, the radius will only be applied to the top of each bar.
    * When this prop is given as a function, it will be evaluated with the arguments datum, and active.
    */
  var cornerRadius: js.UndefOr[NumberOrCallback | AnonBottom] = js.native
  /**
    * Similar to data accessor props `x` and `y`, this prop may be used to functionally
    * assign eventKeys to data
    */
  var eventKey: js.UndefOr[StringOrNumberOrCallback] = js.native
  /**
    * The event prop take an array of event objects. Event objects are composed of
    * a target, an eventKey, and eventHandlers. Targets may be any valid style namespace
    * for a given component, so "data" and "labels" are all valid targets for VictoryBar events.
    * The eventKey may optionally be used to select a single element by index rather than an entire
    * set. The eventHandlers object should be given as an object whose keys are standard
    * event names (i.e. onClick) and whose values are event callbacks. The return value
    * of an event handler is used to modify elemnts. The return value should be given
    * as an object or an array of objects with optional target and eventKey keys,
    * and a mutation key whose value is a function. The target and eventKey keys
    * will default to those corresponding to the element the event handler was attached to.
    * The mutation function will be called with the calculated props for the individual selected
    * element (i.e. a single bar), and the object returned from the mutation function
    * will override the props of the selected element via object assignment.
    * @example
    * events={[
    *   {
    *     target: "data",
    *     eventKey: "thisOne",
    *     eventHandlers: {
    *       onClick: () => {
    *         return [
    *            {
    *              eventKey: "theOtherOne",
    *              mutation: (props) => {
    *                return {style: merge({}, props.style, {fill: "orange"})};
    *              }
    *            }, {
    *              eventKey: "theOtherOne",
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
  var events: js.UndefOr[js.Array[EventPropTypeInterface[data | labels | parent, Double | String]]] = js.native
  /**
    * The style prop specifies styles for your VictoryBar. Any valid inline style properties
    * will be applied. Height, width, and padding should be specified via the height,
    * width, and padding props, as they are used to calculate the alignment of
    * components within chart. In addition to normal style properties, angle and verticalAnchor
    * may also be specified via the labels object, and they will be passed as props to
    * VictoryLabel, or any custom labelComponent.
    * @example {data: {fill: "red", width: 8}, labels: {fontSize: 12}}
    */
  var style: js.UndefOr[VictoryStyleInterface] = js.native
}

object VictoryBarProps {
  @scala.inline
  def apply(): VictoryBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryBarProps]
  }
  @scala.inline
  implicit class VictoryBarPropsOps[Self <: VictoryBarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: start | middle | end): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(js.undefined)
        ret
    }
    @scala.inline
    def withBarRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withBarWidthFunction1(value: /* args */ CallbackArgs => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBarWidth(value: NumberOrCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCornerRadiusFunction1(value: /* args */ CallbackArgs => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCornerRadius(value: NumberOrCallback | AnonBottom): Self = {
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
    def withEvents(value: js.Array[EventPropTypeInterface[data | labels | parent, Double | String]]): Self = {
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
    def withStyle(value: VictoryStyleInterface): Self = {
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
  }
  
}

