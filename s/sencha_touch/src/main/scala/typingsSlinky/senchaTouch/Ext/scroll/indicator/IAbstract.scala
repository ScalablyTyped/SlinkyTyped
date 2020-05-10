package typingsSlinky.senchaTouch.Ext.scroll.indicator

import typingsSlinky.senchaTouch.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstract extends IComponent {
  /** [Config Option] (Boolean) */
  var autoHide: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the value of active
  		* @returns Boolean
  		*/
  var getActive: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of autoHide
  		* @returns Boolean
  		*/
  var getAutoHide: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of axis
  		* @returns String
  		*/
  var getAxis: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of barCls
  		* @returns String
  		*/
  var getBarCls: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of length
  		* @returns Object
  		*/
  var getLength: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of minLength
  		* @returns Number
  		*/
  var getMinLength: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of ratio
  		* @returns Number
  		*/
  var getRatio: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of value
  		* @returns Object
  		*/
  var getValue: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of active
  		* @param active Boolean The new value.
  		*/
  var setActive: js.UndefOr[js.Function1[/* active */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of autoHide
  		* @param autoHide Boolean The new value.
  		*/
  var setAutoHide: js.UndefOr[js.Function1[/* autoHide */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of axis
  		* @param axis String The new value.
  		*/
  var setAxis: js.UndefOr[js.Function1[/* axis */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of barCls
  		* @param barCls String The new value.
  		*/
  var setBarCls: js.UndefOr[js.Function1[/* barCls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of length
  		* @param length Object The new value.
  		*/
  var setLength: js.UndefOr[js.Function1[/* length */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of minLength
  		* @param minLength Number The new value.
  		*/
  var setMinLength: js.UndefOr[js.Function1[/* minLength */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of ratio
  		* @param ratio Number The new value.
  		*/
  var setRatio: js.UndefOr[js.Function1[/* ratio */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of value
  		* @param value Object The new value.
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
}

object IAbstract {
  @scala.inline
  def apply(): IAbstract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstract]
  }
  @scala.inline
  implicit class IAbstractOps[Self <: IAbstract] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHide")(js.undefined)
        ret
    }
    @scala.inline
    def withGetActive(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActive")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAutoHide(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAutoHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoHide")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAxis(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAxis")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBarCls(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBarCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBarCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBarCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLength(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLength")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMinLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMinLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinLength")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRatio(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRatio")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValue(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSetActive(value: /* active */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActive")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActive")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAutoHide(value: /* autoHide */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoHide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAutoHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoHide")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAxis(value: /* axis */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAxis")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBarCls(value: /* barCls */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBarCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBarCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBarCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLength(value: /* length */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLength")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMinLength(value: /* minLength */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMinLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinLength")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRatio(value: /* ratio */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRatio")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withSetValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = {
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
  }
  
}

