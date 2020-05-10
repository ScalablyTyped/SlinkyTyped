package typingsSlinky.senchaTouch.Ext.util

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPositionMap extends IBase {
  /** [Method] Returns the value of minimumHeight
  		* @returns Number
  		*/
  var getMinimumHeight: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Sets the value of minimumHeight
  		* @param minimumHeight Number The new value.
  		*/
  var setMinimumHeight: js.UndefOr[js.Function1[/* minimumHeight */ js.UndefOr[Double], Unit]] = js.native
}

object IPositionMap {
  @scala.inline
  def apply(): IPositionMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPositionMap]
  }
  @scala.inline
  implicit class IPositionMapOps[Self <: IPositionMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetMinimumHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinimumHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMinimumHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinimumHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMinimumHeight(value: /* minimumHeight */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinimumHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMinimumHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinimumHeight")(js.undefined)
        ret
    }
  }
  
}

