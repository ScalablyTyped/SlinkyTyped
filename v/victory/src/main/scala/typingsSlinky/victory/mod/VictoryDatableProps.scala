package typingsSlinky.victory.mod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Common properties for all data components
  */
@js.native
trait VictoryDatableProps extends StObject {
  
  /**
    * The categories prop specifies how categorical data for a chart should be ordered.
    * This prop should be given as an array of string values, or an object with
    * these arrays of values specified for x and y. If this prop is not set,
    * categorical data will be plotted in the order it was given in the data array
    * @example ["dogs", "cats", "mice"]
    */
  var categories: js.UndefOr[CategoryPropType] = js.native
  
  /**
    * The data prop specifies the data to be plotted. Data should be in the form of an array
    * of data points, or an array of arrays of data points for multiple datasets.
    * Each data point may be any format you wish (depending on the `x` and `y` accessor props),
    * but by default, an object with x and y properties is expected.
    * @example [{x: 1, y: 2}, {x: 2, y: 3}], [[1, 2], [2, 3]],
    * [[{x: "a", y: 1}, {x: "b", y: 2}], [{x: "a", y: 2}, {x: "b", y: 3}]]
    */
  var data: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * The dataComponent prop takes an entire component which will be used to create an area.
    * The new element created from the passed dataComponent will be provided with the
    * following properties calculated by VictoryArea: a scale, style, events, interpolation,
    * and an array of modified data objects (including x, y, and calculated y0 and y1).
    * Any of these props may be overridden by passing in props to the supplied component,
    * or modified or ignored within the custom component itself. If a dataComponent is
    * not provided, VictoryArea will use its default Area component.
    * @default <Area/>
    */
  var dataComponent: js.UndefOr[ReactElement] = js.native
  
  /**
    * The domain prop describes the range of values your chart will cover. This prop can be
    * given as a array of the minimum and maximum expected values for your bar chart,
    * or as an object that specifies separate arrays for x and y.
    * If this prop is not provided, a domain will be calculated from data, or other
    * available information.
    * @example [-1, 1], {x: [0, 100], y: [0, 1]}
    */
  var domain: js.UndefOr[DomainPropType] = js.native
  
  /**
    * The x prop specifies how to access the X value of each data point.
    * If given as a function, it will be run on each data point, and returned value will be used.
    * If given as an integer, it will be used as an array index for array-type data points.
    * If given as a string, it will be used as a property key for object-type data points.
    * If given as an array of strings, or a string containing dots or brackets,
    * it will be used as a nested object property path (for details see Lodash docs for _.get).
    * If `null` or `undefined`, the data value will be used as is (identity function/pass-through).
    * @example 0, 'x', 'x.value.nested.1.thing', 'x[2].also.nested', null, d => Math.sin(d)
    * @default "x"
    */
  var x: js.UndefOr[DataGetterPropType] = js.native
  
  /**
    * The y prop specifies how to access the Y value of each data point.
    * If given as a function, it will be run on each data point, and returned value will be used.
    * If given as an integer, it will be used as an array index for array-type data points.
    * If given as a string, it will be used as a property key for object-type data points.
    * If given as an array of strings, or a string containing dots or brackets,
    * it will be used as a nested object property path (for details see Lodash docs for _.get).
    * If `null` or `undefined`, the data value will be used as is (identity function/pass-through).
    * @example 0, 'y', 'y.value.nested.1.thing', 'y[2].also.nested', null, d => Math.sin(d)
    * @default "y"
    */
  var y: js.UndefOr[DataGetterPropType] = js.native
  
  /**
    * Use y0 data accessor prop to determine how the component defines the baseline y0 data.
    * This prop is useful for defining custom baselines for components like VictoryBar or VictoryArea.
    * This prop may be given in a variety of formats.
    * @example 'last_quarter_profit', () => 10, 1, 'employees.salary', ["employees", "salary"]
    */
  var y0: js.UndefOr[DataGetterPropType] = js.native
}
object VictoryDatableProps {
  
  @scala.inline
  def apply(): VictoryDatableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryDatableProps]
  }
  
  @scala.inline
  implicit class VictoryDatablePropsMutableBuilder[Self <: VictoryDatableProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: CategoryPropType): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataComponent(value: ReactElement): Self = StObject.set(x, "dataComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataComponentUndefined: Self = StObject.set(x, "dataComponent", js.undefined)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setDomain(value: DomainPropType): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setX(value: DataGetterPropType): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXFunction1(value: /* data */ js.Any => Double | String | js.Array[String]): Self = StObject.set(x, "x", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setXVarargs(value: String*): Self = StObject.set(x, "x", js.Array(value :_*))
    
    @scala.inline
    def setY(value: DataGetterPropType): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY0(value: DataGetterPropType): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY0Function1(value: /* data */ js.Any => Double | String | js.Array[String]): Self = StObject.set(x, "y0", js.Any.fromFunction1(value))
    
    @scala.inline
    def setY0Undefined: Self = StObject.set(x, "y0", js.undefined)
    
    @scala.inline
    def setY0Varargs(value: String*): Self = StObject.set(x, "y0", js.Array(value :_*))
    
    @scala.inline
    def setYFunction1(value: /* data */ js.Any => Double | String | js.Array[String]): Self = StObject.set(x, "y", js.Any.fromFunction1(value))
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setYVarargs(value: String*): Self = StObject.set(x, "y", js.Array(value :_*))
  }
}
