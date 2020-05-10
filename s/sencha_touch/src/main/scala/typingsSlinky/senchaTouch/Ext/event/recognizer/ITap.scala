package typingsSlinky.senchaTouch.Ext.event.recognizer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITap extends IRecognizer {
  /** [Method] Returns the value of moveDistance
  		* @returns Number
  		*/
  var getMoveDistance: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (Number) */
  var moveDistance: js.UndefOr[Double] = js.native
  /** [Method] Sets the value of moveDistance
  		* @param moveDistance Number The new value.
  		*/
  var setMoveDistance: js.UndefOr[js.Function1[/* moveDistance */ js.UndefOr[Double], Unit]] = js.native
}

object ITap {
  @scala.inline
  def apply(): ITap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITap]
  }
  @scala.inline
  implicit class ITapOps[Self <: ITap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetMoveDistance(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMoveDistance")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMoveDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMoveDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMoveDistance(value: /* moveDistance */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMoveDistance")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMoveDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMoveDistance")(js.undefined)
        ret
    }
  }
  
}

