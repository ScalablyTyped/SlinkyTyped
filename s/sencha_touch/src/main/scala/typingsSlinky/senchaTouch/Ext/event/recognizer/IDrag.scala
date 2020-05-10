package typingsSlinky.senchaTouch.Ext.event.recognizer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDrag extends IRecognizer {
  /** [Method] Returns the value of minDistance
  		* @returns Number
  		*/
  var getMinDistance: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (Number) */
  var minDistance: js.UndefOr[Double] = js.native
  /** [Method] Sets the value of minDistance
  		* @param minDistance Number The new value.
  		*/
  var setMinDistance: js.UndefOr[js.Function1[/* minDistance */ js.UndefOr[Double], Unit]] = js.native
}

object IDrag {
  @scala.inline
  def apply(): IDrag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDrag]
  }
  @scala.inline
  implicit class IDragOps[Self <: IDrag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withMinDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDistance")(js.undefined)
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

