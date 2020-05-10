package typingsSlinky.senchaTouch.Ext.event.recognizer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDoubleTap extends IRecognizer {
  /** [Method] Returns the value of maxDuration
  		* @returns Number
  		*/
  var getMaxDuration: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Sets the value of maxDuration
  		* @param maxDuration Number The new value.
  		*/
  var setMaxDuration: js.UndefOr[js.Function1[/* maxDuration */ js.UndefOr[Double], Unit]] = js.native
}

object IDoubleTap {
  @scala.inline
  def apply(): IDoubleTap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDoubleTap]
  }
  @scala.inline
  implicit class IDoubleTapOps[Self <: IDoubleTap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetMaxDuration(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxDuration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMaxDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMaxDuration(value: /* maxDuration */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxDuration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMaxDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxDuration")(js.undefined)
        ret
    }
  }
  
}

