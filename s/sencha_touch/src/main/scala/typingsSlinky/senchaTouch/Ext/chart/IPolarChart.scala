package typingsSlinky.senchaTouch.Ext.chart

import typingsSlinky.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPolarChart extends IAbstractChart {
  /** [Config Option] (Array) */
  var center: js.UndefOr[Array] = js.native
  /** [Method] Returns the value of center
  		* @returns Array
  		*/
  var getCenter: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of radius
  		* @returns Number
  		*/
  var getRadius: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (Number) */
  var radius: js.UndefOr[Double] = js.native
  /** [Method] Sets the value of center
  		* @param center Array The new value.
  		*/
  var setCenter: js.UndefOr[js.Function1[/* center */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of radius
  		* @param radius Number The new value.
  		*/
  var setRadius: js.UndefOr[js.Function1[/* radius */ js.UndefOr[Double], Unit]] = js.native
}

object IPolarChart {
  @scala.inline
  def apply(): IPolarChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPolarChart]
  }
  @scala.inline
  implicit class IPolarChartOps[Self <: IPolarChart] (val x: Self) extends AnyVal {
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
  }
  
}

