package typingsSlinky.senchaTouch.Ext.fx.easing

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstract extends IBase {
  /** [Method] Returns the value of startTime
  		* @returns Number
  		*/
  var getStartTime: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of startValue
  		* @returns Number
  		*/
  var getStartValue: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Sets the value of startTime
  		* @param startTime Number The new value.
  		*/
  var setStartTime: js.UndefOr[js.Function1[/* startTime */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of startValue
  		* @param startValue Number The new value.
  		*/
  var setStartValue: js.UndefOr[js.Function1[/* startValue */ js.UndefOr[Double], Unit]] = js.native
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
    def withGetStartTime(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStartTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStartValue(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStartValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStartValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStartValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStartTime(value: /* startTime */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStartTime")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStartValue(value: /* startValue */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStartValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStartValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStartValue")(js.undefined)
        ret
    }
  }
  
}

