package typingsSlinky.senchaTouch.Ext.event.publisher

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITouchGesture extends IBase {
  /** [Method] Returns the value of moveThrottle
  		* @returns Number
  		*/
  var getMoveThrottle: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of recognizers
  		* @returns Object
  		*/
  var getRecognizers: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of moveThrottle
  		* @param moveThrottle Number The new value.
  		*/
  var setMoveThrottle: js.UndefOr[js.Function1[/* moveThrottle */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of recognizers
  		* @param recognizers Object The new value.
  		*/
  var setRecognizers: js.UndefOr[js.Function1[/* recognizers */ js.UndefOr[js.Any], Unit]] = js.native
}

object ITouchGesture {
  @scala.inline
  def apply(): ITouchGesture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITouchGesture]
  }
  @scala.inline
  implicit class ITouchGestureOps[Self <: ITouchGesture] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetMoveThrottle(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMoveThrottle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMoveThrottle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMoveThrottle")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRecognizers(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecognizers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRecognizers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecognizers")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMoveThrottle(value: /* moveThrottle */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMoveThrottle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMoveThrottle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMoveThrottle")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRecognizers(value: /* recognizers */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRecognizers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRecognizers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRecognizers")(js.undefined)
        ret
    }
  }
  
}

