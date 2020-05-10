package typingsSlinky.senchaTouch.Ext.chart.series

import typingsSlinky.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPolar extends ISeries {
  /** [Config Option] (Array) */
  var center: js.UndefOr[Array] = js.native
  /** [Method] Returns the value of center
  		* @returns Array
  		*/
  var getCenter: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of offsetX
  		* @returns Number
  		*/
  var getOffsetX: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of offsetY
  		* @returns Number
  		*/
  var getOffsetY: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of radius
  		* @returns Number
  		*/
  var getRadius: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of rotation
  		* @returns Number
  		*/
  var getRotation: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of xAxis
  		* @returns Object
  		*/
  var getXAxis: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of xField
  		* @returns String
  		*/
  var getXField: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of yAxis
  		* @returns Object
  		*/
  var getYAxis: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of yField
  		* @returns String
  		*/
  var getYField: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (Number) */
  var offsetX: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var offsetY: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var radius: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var rotation: js.UndefOr[Double] = js.native
  /** [Method] Sets the value of center
  		* @param center Array The new value.
  		*/
  var setCenter: js.UndefOr[js.Function1[/* center */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of offsetX
  		* @param offsetX Number The new value.
  		*/
  var setOffsetX: js.UndefOr[js.Function1[/* offsetX */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of offsetY
  		* @param offsetY Number The new value.
  		*/
  var setOffsetY: js.UndefOr[js.Function1[/* offsetY */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of radius
  		* @param radius Number The new value.
  		*/
  var setRadius: js.UndefOr[js.Function1[/* radius */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of rotation
  		* @param rotation Number The new value.
  		*/
  var setRotation: js.UndefOr[js.Function1[/* rotation */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of xAxis
  		* @param xAxis Object The new value.
  		*/
  var setXAxis: js.UndefOr[js.Function1[/* xAxis */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of xField
  		* @param xField String The new value.
  		*/
  var setXField: js.UndefOr[js.Function1[/* xField */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of yAxis
  		* @param yAxis Object The new value.
  		*/
  var setYAxis: js.UndefOr[js.Function1[/* yAxis */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of yField
  		* @param yField String The new value.
  		*/
  var setYField: js.UndefOr[js.Function1[/* yField */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (String) */
  var xField: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var yField: js.UndefOr[String] = js.native
}

object IPolar {
  @scala.inline
  def apply(): IPolar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPolar]
  }
  @scala.inline
  implicit class IPolarOps[Self <: IPolar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenter(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCenter(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCenter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOffsetX(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffsetX")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOffsetY(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffsetY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffsetY")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRadius(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRadius")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRotation(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRotation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withGetXAxis(value: () => _): Self = {
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
    def withGetYAxis(value: () => _): Self = {
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
    def withOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(js.undefined)
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCenter(value: /* center */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCenter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withSetOffsetX(value: /* offsetX */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOffsetX")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOffsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withSetOffsetY(value: /* offsetY */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOffsetY")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOffsetY")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRadius(value: /* radius */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRadius")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRotation(value: /* rotation */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withSetXAxis(value: /* xAxis */ js.UndefOr[js.Any] => Unit): Self = {
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
    def withSetYAxis(value: /* yAxis */ js.UndefOr[js.Any] => Unit): Self = {
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

