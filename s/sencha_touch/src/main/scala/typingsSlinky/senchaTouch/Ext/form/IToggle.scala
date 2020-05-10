package typingsSlinky.senchaTouch.Ext.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToggle
  extends typingsSlinky.senchaTouch.Ext.field.ISlider {
  /** [Config Option] (String) */
  var activeLabel: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  @JSName("cls")
  var cls_IToggle: js.UndefOr[String] = js.native
  /** [Method] Returns the value of activeLabel
  		* @returns String
  		*/
  var getActiveLabel: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of inactiveLabel
  		* @returns String
  		*/
  var getInactiveLabel: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of maxValueCls
  		* @returns String
  		*/
  var getMaxValueCls: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of minValueCls
  		* @returns String
  		*/
  var getMinValueCls: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (String) */
  var inactiveLabel: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var maxValueCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var minValueCls: js.UndefOr[String] = js.native
  /** [Method] Sets the value of activeLabel
  		* @param activeLabel String The new value.
  		*/
  var setActiveLabel: js.UndefOr[js.Function1[/* activeLabel */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of inactiveLabel
  		* @param inactiveLabel String The new value.
  		*/
  var setInactiveLabel: js.UndefOr[js.Function1[/* inactiveLabel */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of maxValueCls
  		* @param maxValueCls String The new value.
  		*/
  var setMaxValueCls: js.UndefOr[js.Function1[/* maxValueCls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of minValueCls
  		* @param minValueCls String The new value.
  		*/
  var setMinValueCls: js.UndefOr[js.Function1[/* minValueCls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of the toggle
  		* @param newValue Number 1 for toggled, 0 for untoggled.
  		* @returns Object this
  		*/
  @JSName("setValue")
  var setValue_IToggle: js.UndefOr[js.Function1[/* newValue */ js.UndefOr[Double], _]] = js.native
  /** [Method] Toggles the value of this toggle field
  		* @returns Object this
  		*/
  var toggle: js.UndefOr[js.Function0[_]] = js.native
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
    def withActiveLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetActiveLabel(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveLabel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetActiveLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withGetInactiveLabel(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInactiveLabel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetInactiveLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInactiveLabel")(js.undefined)
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
    def withInactiveLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInactiveLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveLabel")(js.undefined)
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
    def withSetActiveLabel(value: /* activeLabel */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActiveLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetActiveLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActiveLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withSetInactiveLabel(value: /* inactiveLabel */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInactiveLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetInactiveLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInactiveLabel")(js.undefined)
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
    def withSetValue(value: /* newValue */ js.UndefOr[Double] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.undefined)
        ret
    }
    @scala.inline
    def withToggle(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.undefined)
        ret
    }
  }
  
}

