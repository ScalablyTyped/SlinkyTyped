package typingsSlinky.victory.mod

import typingsSlinky.victory.victoryStrings.all
import typingsSlinky.victory.victoryStrings.data
import typingsSlinky.victory.victoryStrings.labels
import typingsSlinky.victory.victoryStrings.parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VictoryAreaProps
  extends VictorySingleLabableProps
     with VictoryCommonProps
     with VictoryDatableProps {
  
  /**
    * The event prop take an array of event objects. Event objects are composed of
    * a target, an eventKey, and eventHandlers. Targets may be any valid style namespace
    * for a given component, so "data" and "labels" are all valid targets for VictoryArea events.
    * Since VictoryArea only renders a single element, the eventKey property is not used.
    * The eventHandlers object should be given as an object whose keys are standard
    * event names (i.e. onClick) and whose values are event callbacks. The return value
    * of an event handler is used to modify elemnts. The return value should be given
    * as an object or an array of objects with optional target and eventKey keys,
    * and a mutation key whose value is a function. The target and eventKey keys
    * will default to those corresponding to the element the event handler was attached to.
    * The mutation function will be called with the calculated props for the individual selected
    * element (i.e. an area), and the object returned from the mutation function
    * will override the props of the selected element via object assignment.
    * @example
    * events={[
    *   {
    *     target: "data",
    *     eventHandlers: {
    *       onClick: () => {
    *         return [
    *            {
    *              mutation: (props) => {
    *                return {style: merge({}, props.style, {fill: "orange"})};
    *              }
    *            }, {
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
  var events: js.UndefOr[js.Array[EventPropTypeInterface[data | labels | parent, all]]] = js.native
  
  /**
    * The interpolation prop determines how data points should be connected when plotting a line
    * @default "linear"
    */
  var interpolation: js.UndefOr[InterpolationPropType] = js.native
  
  /**
    * The labels prop defines the labels that will appear above each point.
    * This prop should be given as an array or as a function of data.
    */
  var labels: js.UndefOr[(js.Array[Double | String]) | js.Function] = js.native
  
  /**
    * The samples prop specifies how many individual points to plot when plotting
    * y as a function of x. Samples is ignored if x props are provided instead.
    * @default 50
    */
  var samples: js.UndefOr[Double] = js.native
  
  /**
    * The style prop specifies styles for your VictoryArea. Any valid inline style properties
    * will be applied. Height, width, and padding should be specified via the height,
    * width, and padding props, as they are used to calculate the alignment of
    * components within chart.
    * @example {data: {fill: "red"}, labels: {fontSize: 12}}
    */
  var style: js.UndefOr[VictoryStyleInterface] = js.native
}
object VictoryAreaProps {
  
  @scala.inline
  def apply(): VictoryAreaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryAreaProps]
  }
  
  @scala.inline
  implicit class VictoryAreaPropsOps[Self <: VictoryAreaProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventsVarargs(value: (EventPropTypeInterface[data | labels | parent, all])*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[EventPropTypeInterface[data | labels | parent, all]]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setInterpolation(value: InterpolationPropType): Self = this.set("interpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterpolation: Self = this.set("interpolation", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: (Double | String)*): Self = this.set("labels", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: (js.Array[Double | String]) | js.Function): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setSamples(value: Double): Self = this.set("samples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamples: Self = this.set("samples", js.undefined)
    
    @scala.inline
    def setStyle(value: VictoryStyleInterface): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
