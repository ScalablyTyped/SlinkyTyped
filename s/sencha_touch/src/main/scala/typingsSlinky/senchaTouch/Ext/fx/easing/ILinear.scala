package typingsSlinky.senchaTouch.Ext.fx.easing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILinear extends IAbstract {
  /** [Method] Returns the value of duration
  		* @returns Number
  		*/
  var getDuration: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of endValue
  		* @returns Number
  		*/
  var getEndValue: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Sets the value of duration
  		* @param duration Number The new value.
  		*/
  var setDuration: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of endValue
  		* @param endValue Number The new value.
  		*/
  var setEndValue: js.UndefOr[js.Function1[/* endValue */ js.UndefOr[Double], Unit]] = js.native
}

object ILinear {
  @scala.inline
  def apply(): ILinear = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILinear]
  }
  @scala.inline
  implicit class ILinearOps[Self <: ILinear] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDuration(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDuration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEndValue(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEndValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEndValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEndValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDuration(value: /* duration */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDuration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withSetEndValue(value: /* endValue */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEndValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetEndValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEndValue")(js.undefined)
        ret
    }
  }
  
}

