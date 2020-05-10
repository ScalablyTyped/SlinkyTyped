package typingsSlinky.senchaTouch.Ext.chart.series

import typingsSlinky.senchaTouch.Ext.chart.axis.IAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICartesian extends ISeries {
  /** [Method] For a given x y point relative to the main region find a corresponding item from this series if any
  		* @param x Object
  		* @param y Object
  		* @returns Object An object describing the item, or null if there is no matching item. The exact contents of this object will vary by series type, but should always contain at least the following:
  		*/
  @JSName("getItemForPoint")
  var getItemForPoint_ICartesian: js.UndefOr[js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns the value of xAxis
  		* @returns Ext.chart.axis.Axis
  		*/
  var getXAxis: js.UndefOr[js.Function0[IAxis]] = js.native
  /** [Method] Returns the value of xField
  		* @returns String
  		*/
  var getXField: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of yAxis
  		* @returns Ext.chart.axis.Axis
  		*/
  var getYAxis: js.UndefOr[js.Function0[IAxis]] = js.native
  /** [Method] Returns the value of yField
  		* @returns String
  		*/
  var getYField: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Provide legend information to target array
  		* @param target Object
  		*/
  @JSName("provideLegendInfo")
  var provideLegendInfo_ICartesian: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of xAxis
  		* @param xAxis Ext.chart.axis.Axis The new value.
  		*/
  var setXAxis: js.UndefOr[js.Function1[/* xAxis */ js.UndefOr[IAxis], Unit]] = js.native
  /** [Method] Sets the value of xField
  		* @param xField String The new value.
  		*/
  var setXField: js.UndefOr[js.Function1[/* xField */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of yAxis
  		* @param yAxis Ext.chart.axis.Axis The new value.
  		*/
  var setYAxis: js.UndefOr[js.Function1[/* yAxis */ js.UndefOr[IAxis], Unit]] = js.native
  /** [Method] Sets the value of yField
  		* @param yField String The new value.
  		*/
  var setYField: js.UndefOr[js.Function1[/* yField */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (Ext.chart.axis.Axis) */
  var xAxis: js.UndefOr[IAxis] = js.native
  /** [Config Option] (String) */
  var xField: js.UndefOr[String] = js.native
  /** [Config Option] (Ext.chart.axis.Axis) */
  var yAxis: js.UndefOr[IAxis] = js.native
  /** [Config Option] (String) */
  var yField: js.UndefOr[String] = js.native
}

object ICartesian {
  @scala.inline
  def apply(): ICartesian = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICartesian]
  }
  @scala.inline
  implicit class ICartesianOps[Self <: ICartesian] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetItemForPoint(value: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemForPoint")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetItemForPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemForPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withGetXAxis(value: () => IAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXAxis")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetXAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withGetXField(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXField")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetXField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXField")(js.undefined)
        ret
    }
    @scala.inline
    def withGetYAxis(value: () => IAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getYAxis")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetYAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getYAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withGetYField(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getYField")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetYField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getYField")(js.undefined)
        ret
    }
    @scala.inline
    def withProvideLegendInfo(value: /* target */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideLegendInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProvideLegendInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideLegendInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withSetXAxis(value: /* xAxis */ js.UndefOr[IAxis] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXAxis")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetXAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withSetXField(value: /* xField */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXField")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetXField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXField")(js.undefined)
        ret
    }
    @scala.inline
    def withSetYAxis(value: /* yAxis */ js.UndefOr[IAxis] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setYAxis")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetYAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setYAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withSetYField(value: /* yField */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setYField")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetYField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setYField")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxis(value: IAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withXField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xField")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxis(value: IAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withYField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yField")(js.undefined)
        ret
    }
  }
  
}

