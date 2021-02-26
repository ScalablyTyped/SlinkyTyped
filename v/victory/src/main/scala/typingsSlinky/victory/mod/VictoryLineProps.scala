package typingsSlinky.victory.mod

import typingsSlinky.victory.victoryStrings.data
import typingsSlinky.victory.victoryStrings.labels
import typingsSlinky.victory.victoryStrings.parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VictoryLineProps
  extends VictorySingleLabableProps
     with VictoryCommonProps
     with VictoryDatableProps {
  
  /**
    * The event prop take an array of event objects. Event objects are composed of
    * a target, an eventKey, and eventHandlers. Targets may be any valid style namespace
    * for a given component, so "data" and "labels" are all valid targets for VictoryLine events.
    * Since VictoryLine only renders a single element, the eventKey property is not used.
    * The eventHandlers object should be given as an object whose keys are standard
    * event names (i.e. onClick) and whose values are event callbacks. The return value
    * of an event handler is used to modify elemnts. The return value should be given
    * as an object or an array of objects with optional target and eventKey keys,
    * and a mutation key whose value is a function. The target and eventKey keys
    * will default to those corresponding to the element the event handler was attached to.
    * The mutation function will be called with the calculated props for the individual selected
    * element (i.e. a line), and the object returned from the mutation function
    * will override the props of the selected element via object assignment.
    * @examples
    * events={[
    *   {
    *     target: "data",
    *     eventHandlers: {
    *       onClick: () => {
    *         return [
    *            {
    *              mutation: (props) => {
    *                return {style: merge({}, props.style, {stroke: "orange"})};
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
  var events: js.UndefOr[js.Array[EventPropTypeInterface[data | labels | parent, Double | String]]] = js.native
  
  /**
    * The interpolation prop determines how data points should be connected
    * when plotting a line
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
    */
  var samples: js.UndefOr[Double] = js.native
  
  /**
    * Use the sortKey prop to indicate how data should be sorted. This prop
    * is given directly to the lodash sortBy function to be executed on the
    * final dataset.
    */
  var sortKey: js.UndefOr[String | js.Array[String] | js.Function] = js.native
  
  /**
    * The style prop specifies styles for your VictoryLine. Any valid inline style properties
    * will be applied. Height, width, and padding should be specified via the height,
    * width, and padding props, as they are used to calculate the alignment of
    * components within chart. in addition to normal style properties, angle and verticalAnchor
    * may also be specified via the labels object, and they will be passed as props to
    * VictoryLabel, or any custom labelComponent.
    * @examples{data: {stroke: "red"}, labels: {fontSize: 12}}
    */
  var style: js.UndefOr[VictoryStyleInterface] = js.native
}
object VictoryLineProps {
  
  @scala.inline
  def apply(): VictoryLineProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryLineProps]
  }
  
  @scala.inline
  implicit class VictoryLinePropsMutableBuilder[Self <: VictoryLineProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: js.Array[EventPropTypeInterface[data | labels | parent, Double | String]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: (EventPropTypeInterface[data | labels | parent, Double | String])*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setInterpolation(value: InterpolationPropType): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    @scala.inline
    def setLabels(value: (js.Array[Double | String]) | js.Function): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: (Double | String)*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setSamples(value: Double): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplesUndefined: Self = StObject.set(x, "samples", js.undefined)
    
    @scala.inline
    def setSortKey(value: String | js.Array[String] | js.Function): Self = StObject.set(x, "sortKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortKeyUndefined: Self = StObject.set(x, "sortKey", js.undefined)
    
    @scala.inline
    def setSortKeyVarargs(value: String*): Self = StObject.set(x, "sortKey", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: VictoryStyleInterface): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
