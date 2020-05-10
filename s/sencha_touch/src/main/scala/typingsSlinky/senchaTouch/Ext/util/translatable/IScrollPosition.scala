package typingsSlinky.senchaTouch.Ext.util.translatable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScrollPosition extends IDom {
  /** [Method] Returns the value of useWrapper
  		* @returns Boolean
  		*/
  @JSName("getUseWrapper")
  var getUseWrapper_IScrollPosition: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Sets the value of useWrapper
  		* @param useWrapper Boolean The new value.
  		*/
  @JSName("setUseWrapper")
  var setUseWrapper_IScrollPosition: js.UndefOr[js.Function1[/* useWrapper */ js.UndefOr[Boolean], Unit]] = js.native
}

object IScrollPosition {
  @scala.inline
  def apply(): IScrollPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IScrollPosition]
  }
  @scala.inline
  implicit class IScrollPositionOps[Self <: IScrollPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetUseWrapper(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseWrapper")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUseWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUseWrapper(value: /* useWrapper */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseWrapper")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUseWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseWrapper")(js.undefined)
        ret
    }
  }
  
}

