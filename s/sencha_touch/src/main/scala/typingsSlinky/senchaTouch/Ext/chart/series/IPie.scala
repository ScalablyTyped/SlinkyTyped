package typingsSlinky.senchaTouch.Ext.chart.series

import typingsSlinky.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPie extends IPolar {
  /** [Config Option] (Number) */
  var Allows: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean/Number) */
  var donut: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var field: js.UndefOr[String] = js.native
  /** [Method] Returns the value of donut
  		* @returns Boolean/Number
  		*/
  var getDonut: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the pie slice for a given angle
  		* @param angle Number The angle to search for the slice
  		* @returns Object An object containing the reocord, sprite, scope etc.
  		*/
  var getItemForAngle: js.UndefOr[js.Function1[/* angle */ js.UndefOr[Double], _]] = js.native
  /** [Method] For a given x y point relative to the main region find a corresponding item from this series if any
  		* @param x Object
  		* @param y Object
  		* @returns Object An object describing the item, or null if there is no matching item. The exact contents of this object will vary by series type, but should always contain at least the following:
  		*/
  @JSName("getItemForPoint")
  var getItemForPoint_IPie: js.UndefOr[js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns the value of labelField
  		* @returns String
  		*/
  @JSName("getLabelField")
  var getLabelField_IPie: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of totalAngle
  		* @returns Number
  		*/
  var getTotalAngle: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (Array) */
  @JSName("hidden")
  var hidden_IPie: js.UndefOr[Array] = js.native
  /** [Config Option] (String) */
  @JSName("labelField")
  var labelField_IPie: js.UndefOr[String] = js.native
  /** [Method] Provide legend information to target array
  		* @param target Object
  		*/
  @JSName("provideLegendInfo")
  var provideLegendInfo_IPie: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of donut
  		* @param donut Boolean/Number The new value.
  		*/
  var setDonut: js.UndefOr[js.Function1[/* donut */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of hidden
  		* @param hidden Array The new value.
  		*/
  @JSName("setHidden")
  var setHidden_IPie: js.UndefOr[js.Function1[/* hidden */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of labelField
  		* @param labelField String The new value.
  		*/
  @JSName("setLabelField")
  var setLabelField_IPie: js.UndefOr[js.Function1[/* labelField */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of totalAngle
  		* @param totalAngle Number The new value.
  		*/
  var setTotalAngle: js.UndefOr[js.Function1[/* totalAngle */ js.UndefOr[Double], Unit]] = js.native
  /** [Config Option] (Number) */
  var totalAngle: js.UndefOr[Double] = js.native
}

object IPie {
  @scala.inline
  def apply(): IPie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPie]
  }
  @scala.inline
  implicit class IPieOps[Self <: IPie] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Allows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Allows")(js.undefined)
        ret
    }
    @scala.inline
    def withDonut(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("donut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDonut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("donut")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDonut(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDonut")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDonut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDonut")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemForAngle(value: /* angle */ js.UndefOr[Double] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemForAngle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetItemForAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemForAngle")(js.undefined)
        ret
    }
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
    def withGetLabelField(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelField")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLabelField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelField")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTotalAngle(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTotalAngle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTotalAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTotalAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelField")(js.undefined)
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
    def withSetDonut(value: /* donut */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDonut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDonut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDonut")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHidden(value: /* hidden */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHidden")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLabelField(value: /* labelField */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabelField")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLabelField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabelField")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTotalAngle(value: /* totalAngle */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTotalAngle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTotalAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTotalAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalAngle")(js.undefined)
        ret
    }
  }
  
}

