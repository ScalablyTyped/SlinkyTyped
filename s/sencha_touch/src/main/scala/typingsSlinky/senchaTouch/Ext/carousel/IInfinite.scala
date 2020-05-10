package typingsSlinky.senchaTouch.Ext.carousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInfinite extends ICarousel {
  /** [Method] Returns the value of innerItemConfig
  		* @returns Object
  		*/
  var getInnerItemConfig: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of maxItemIndex
  		* @returns Object
  		*/
  var getMaxItemIndex: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of indicator
  		* @param indicator Object The new value.
  		*/
  @JSName("setIndicator")
  var setIndicator_IInfinite: js.UndefOr[js.Function1[/* indicator */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of innerItemConfig
  		* @param innerItemConfig Object The new value.
  		*/
  var setInnerItemConfig: js.UndefOr[js.Function1[/* innerItemConfig */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of maxItemIndex
  		* @param maxItemIndex Object The new value.
  		*/
  var setMaxItemIndex: js.UndefOr[js.Function1[/* maxItemIndex */ js.UndefOr[js.Any], Unit]] = js.native
}

object IInfinite {
  @scala.inline
  def apply(): IInfinite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInfinite]
  }
  @scala.inline
  implicit class IInfiniteOps[Self <: IInfinite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetInnerItemConfig(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInnerItemConfig")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetInnerItemConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInnerItemConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMaxItemIndex(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxItemIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMaxItemIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxItemIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIndicator(value: /* indicator */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIndicator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withSetInnerItemConfig(value: /* innerItemConfig */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInnerItemConfig")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetInnerItemConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInnerItemConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMaxItemIndex(value: /* maxItemIndex */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxItemIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMaxItemIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxItemIndex")(js.undefined)
        ret
    }
  }
  
}

