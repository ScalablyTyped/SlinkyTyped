package typingsSlinky.senchaTouch.Ext.util.translatable

import typingsSlinky.senchaTouch.Ext.IEvented
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstract extends IEvented {
  /** [Method] Returns the value of easing
  		* @returns Object
  		*/
  var getEasing: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of easingX
  		* @returns Object
  		*/
  var getEasingX: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of easingY
  		* @returns Object
  		*/
  var getEasingY: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of useWrapper
  		* @returns Object
  		*/
  var getUseWrapper: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of easing
  		* @param easing Object The new value.
  		*/
  var setEasing: js.UndefOr[js.Function1[/* easing */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of easingX
  		* @param easingX Object The new value.
  		*/
  var setEasingX: js.UndefOr[js.Function1[/* easingX */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of easingY
  		* @param easingY Object The new value.
  		*/
  var setEasingY: js.UndefOr[js.Function1[/* easingY */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of useWrapper
  		* @param useWrapper Object The new value.
  		*/
  var setUseWrapper: js.UndefOr[js.Function1[/* useWrapper */ js.UndefOr[js.Any], Unit]] = js.native
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
    def withGetEasing(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEasing")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEasingX(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEasingX")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEasingX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEasingX")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEasingY(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEasingY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEasingY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEasingY")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUseWrapper(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseWrapper")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUseWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withSetEasing(value: /* easing */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEasing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withSetEasingX(value: /* easingX */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEasingX")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetEasingX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEasingX")(js.undefined)
        ret
    }
    @scala.inline
    def withSetEasingY(value: /* easingY */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEasingY")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetEasingY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEasingY")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUseWrapper(value: /* useWrapper */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseWrapper")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUseWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseWrapper")(js.undefined)
        ret
    }
  }
  
}

