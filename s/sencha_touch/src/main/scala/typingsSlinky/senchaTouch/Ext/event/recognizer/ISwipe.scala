package typingsSlinky.senchaTouch.Ext.event.recognizer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISwipe extends IRecognizer {
  /** [Method] Returns the value of maxDuration
  		* @returns Number
  		*/
  var getMaxDuration: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of maxOffset
  		* @returns Number
  		*/
  var getMaxOffset: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of minDistance
  		* @returns Number
  		*/
  var getMinDistance: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Sets the value of maxDuration
  		* @param maxDuration Number The new value.
  		*/
  var setMaxDuration: js.UndefOr[js.Function1[/* maxDuration */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of maxOffset
  		* @param maxOffset Number The new value.
  		*/
  var setMaxOffset: js.UndefOr[js.Function1[/* maxOffset */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of minDistance
  		* @param minDistance Number The new value.
  		*/
  var setMinDistance: js.UndefOr[js.Function1[/* minDistance */ js.UndefOr[Double], Unit]] = js.native
}

object ISwipe {
  @scala.inline
  def apply(): ISwipe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISwipe]
  }
  @scala.inline
  implicit class ISwipeOps[Self <: ISwipe] (val x: Self) extends AnyVal {
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
    def withGetMaxOffset(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMaxOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMinDistance(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinDistance")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMinDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinDistance")(js.undefined)
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
    @scala.inline
    def withSetMaxOffset(value: /* maxOffset */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxOffset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMaxOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMinDistance(value: /* minDistance */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinDistance")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMinDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinDistance")(js.undefined)
        ret
    }
  }
  
}

