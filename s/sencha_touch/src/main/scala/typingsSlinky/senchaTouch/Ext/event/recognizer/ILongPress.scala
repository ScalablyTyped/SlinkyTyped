package typingsSlinky.senchaTouch.Ext.event.recognizer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILongPress extends IRecognizer {
  /** [Method] Returns the value of minDuration
  		* @returns Number
  		*/
  var getMinDuration: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Sets the value of minDuration
  		* @param minDuration Number The new value.
  		*/
  var setMinDuration: js.UndefOr[js.Function1[/* minDuration */ js.UndefOr[Double], Unit]] = js.native
}

object ILongPress {
  @scala.inline
  def apply(): ILongPress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILongPress]
  }
  @scala.inline
  implicit class ILongPressOps[Self <: ILongPress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetMinDuration(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinDuration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMinDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMinDuration(value: /* minDuration */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinDuration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMinDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinDuration")(js.undefined)
        ret
    }
  }
  
}

