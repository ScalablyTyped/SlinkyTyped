package typingsSlinky.victory.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Common properties for all data components
  */
@js.native
trait VictoryDatableProps extends js.Object {
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
  implicit class VictoryDatablePropsOps[Self <: VictoryDatableProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategories(value: CategoryPropType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(js.undefined)
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
    def withDataComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: DomainPropType): Self = {
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
    def withXFunction1(value: /* data */ js.Any => Double | String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withX(value: DataGetterPropType): Self = {
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
    def withYFunction1(value: /* data */ js.Any => Double | String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withY(value: DataGetterPropType): Self = {
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
    @scala.inline
    def withY0Function1(value: /* data */ js.Any => Double | String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y0")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withY0(value: DataGetterPropType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY0: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y0")(js.undefined)
        ret
    }
  }
  
}

