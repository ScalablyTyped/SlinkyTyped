package typingsSlinky.victory.mod

import typingsSlinky.victory.victoryStrings.data
import typingsSlinky.victory.victoryStrings.labels
import typingsSlinky.victory.victoryStrings.parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VictoryStackProps
  extends VictoryMultiLabeableProps
     with VictoryCommonProps {
  
  /**
    * The categories prop specifies how categorical data for a chart should be ordered.
    * This prop should be given as an array of string values, or an object with
    * these values for x and y. When categories are not given as an object
    * When this prop is set on a wrapper component, it will dictate the categories of
    * its the children. If this prop is not set, any categories on child component
    * or catigorical data, will be merged to create a shared set of categories.
    * @example ["dogs", "cats", "mice"]
    */
  var categories: js.UndefOr[CategoryPropType] = js.native
  
  /**
    * The colorScale prop is an optional prop that defines the color scale the chart's bars
    * will be created on. This prop should be given as an array of CSS colors, or as a string
    * corresponding to one of the built in color scales. VictoryBar will automatically assign
    * values from this color scale to the bars unless colors are explicitly provided in the
    * `dataAttributes` prop.
    */
  var colorScale: js.UndefOr[ColorScalePropType] = js.native
  
  /**
    * The domain prop describes the range of values your chart will include. This prop can be
    * given as a array of the minimum and maximum expected values for your chart,
    * or as an object that specifies separate arrays for x and y.
    * If this prop is not provided, a domain will be calculated from data, or other
    * available information.
    * @example: [-1, 1], {x: [0, 100], y: [0, 1]}
    */
  var domain: js.UndefOr[DomainPropType] = js.native
  
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
    * individual child of VictoryStack, either by its name prop, or by index. The eventKey
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
  var events: js.UndefOr[
    js.Array[EventPropTypeInterface[data | labels | parent, StringOrNumberOrCallback]]
  ] = js.native
  
  /**
    * The style prop specifies styles for your grouped chart. These styles will be
    * applied to all grouped children
    */
  var style: js.UndefOr[VictoryStyleInterface] = js.native
  
  /**
    * The xOffset prop is used for grouping stacks of bars. This prop will be set
    * by the VictoryGroup component wrapper, or can be set manually.
    */
  var xOffset: js.UndefOr[Double] = js.native
}
object VictoryStackProps {
  
  @scala.inline
  def apply(): VictoryStackProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryStackProps]
  }
  
  @scala.inline
  implicit class VictoryStackPropsOps[Self <: VictoryStackProps] (val x: Self) extends AnyVal {
    
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
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: CategoryPropType): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    
    @scala.inline
    def setColorScaleVarargs(value: String*): Self = this.set("colorScale", js.Array(value :_*))
    
    @scala.inline
    def setColorScale(value: ColorScalePropType): Self = this.set("colorScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorScale: Self = this.set("colorScale", js.undefined)
    
    @scala.inline
    def setDomain(value: DomainPropType): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setDomainPadding(value: DomainPaddingPropType): Self = this.set("domainPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainPadding: Self = this.set("domainPadding", js.undefined)
    
    @scala.inline
    def setEventKeyFunction1(value: /* args */ CallbackArgs => String | Double): Self = this.set("eventKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEventKey(value: StringOrNumberOrCallback): Self = this.set("eventKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventKey: Self = this.set("eventKey", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: (EventPropTypeInterface[data | labels | parent, StringOrNumberOrCallback])*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[EventPropTypeInterface[data | labels | parent, StringOrNumberOrCallback]]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setStyle(value: VictoryStyleInterface): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setXOffset(value: Double): Self = this.set("xOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXOffset: Self = this.set("xOffset", js.undefined)
  }
}
