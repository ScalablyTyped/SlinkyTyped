package typingsSlinky.senchaTouch.Ext.chart.series

import typingsSlinky.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPie3D extends IPolar {
  /** [Config Option] (Boolean/Number) */
  var donut: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var field: js.UndefOr[String] = js.native
  /** [Method] Returns the value of distortion
  		* @returns Number
  		*/
  var getDistortion: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of donut
  		* @returns Boolean/Number
  		*/
  var getDonut: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of field
  		* @returns String
  		*/
  var getField: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of region
  		* @returns Array
  		*/
  var getRegion: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of thickness
  		* @returns Number
  		*/
  var getThickness: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Sets the value of distortion
  		* @param distortion Number The new value.
  		*/
  var setDistortion: js.UndefOr[js.Function1[/* distortion */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of donut
  		* @param donut Boolean/Number The new value.
  		*/
  var setDonut: js.UndefOr[js.Function1[/* donut */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of field
  		* @param field String The new value.
  		*/
  var setField: js.UndefOr[js.Function1[/* field */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of region
  		* @param region Array The new value.
  		*/
  var setRegion: js.UndefOr[js.Function1[/* region */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of thickness
  		* @param thickness Number The new value.
  		*/
  var setThickness: js.UndefOr[js.Function1[/* thickness */ js.UndefOr[Double], Unit]] = js.native
}

object IPie3D {
  @scala.inline
  def apply(): IPie3D = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPie3D]
  }
  @scala.inline
  implicit class IPie3DOps[Self <: IPie3D] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withGetDistortion(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDistortion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDistortion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDistortion")(js.undefined)
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
    def withGetField(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getField")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getField")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRegion(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRegion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withGetThickness(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThickness")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDistortion(value: /* distortion */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDistortion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDistortion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDistortion")(js.undefined)
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
    def withSetField(value: /* field */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setField")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setField")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRegion(value: /* region */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRegion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withSetThickness(value: /* thickness */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setThickness")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setThickness")(js.undefined)
        ret
    }
  }
  
}

