package typingsSlinky.senchaTouch.Ext.slider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToggle extends ISlider {
  /** [Method] Sets the increment configuration
  		* @returns Number
  		*/
  @JSName("applyIncrement")
  var applyIncrement_IToggle: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of maxValueCls
  		* @returns String
  		*/
  var getMaxValueCls: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of minValueCls
  		* @returns String
  		*/
  var getMinValueCls: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (String) */
  var maxValueCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var minValueCls: js.UndefOr[String] = js.native
  /** [Method] Sets the value of maxValueCls
  		* @param maxValueCls String The new value.
  		*/
  var setMaxValueCls: js.UndefOr[js.Function1[/* maxValueCls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of minValueCls
  		* @param minValueCls String The new value.
  		*/
  var setMinValueCls: js.UndefOr[js.Function1[/* minValueCls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of value
  		* @param newValue Object
  		* @param oldValue Object
  		*/
  @JSName("setValue")
  var setValue_IToggle: js.UndefOr[
    js.Function2[/* newValue */ js.UndefOr[js.Any], /* oldValue */ js.UndefOr[js.Any], Unit]
  ] = js.native
}

object IToggle {
  @scala.inline
  def apply(): IToggle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToggle]
  }
  @scala.inline
  implicit class IToggleOps[Self <: IToggle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyIncrement(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyIncrement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutApplyIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyIncrement")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMaxValueCls(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxValueCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMaxValueCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxValueCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMinValueCls(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinValueCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMinValueCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinValueCls")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxValueCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValueCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValueCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValueCls")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValueCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValueCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValueCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValueCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMaxValueCls(value: /* maxValueCls */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxValueCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMaxValueCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxValueCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMinValueCls(value: /* minValueCls */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinValueCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMinValueCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinValueCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetValue(value: (/* newValue */ js.UndefOr[js.Any], /* oldValue */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.undefined)
        ret
    }
  }
  
}

