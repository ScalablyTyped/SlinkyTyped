package typingsSlinky.senchaTouch.Ext.fx.easing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEaseIn extends ILinear {
  /** [Method] Returns the value of exponent
  		* @returns Number
  		*/
  var getExponent: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Sets the value of exponent
  		* @param exponent Number The new value.
  		*/
  var setExponent: js.UndefOr[js.Function1[/* exponent */ js.UndefOr[Double], Unit]] = js.native
}

object IEaseIn {
  @scala.inline
  def apply(): IEaseIn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEaseIn]
  }
  @scala.inline
  implicit class IEaseInOps[Self <: IEaseIn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetExponent(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExponent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetExponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExponent")(js.undefined)
        ret
    }
    @scala.inline
    def withSetExponent(value: /* exponent */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setExponent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetExponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setExponent")(js.undefined)
        ret
    }
  }
  
}

