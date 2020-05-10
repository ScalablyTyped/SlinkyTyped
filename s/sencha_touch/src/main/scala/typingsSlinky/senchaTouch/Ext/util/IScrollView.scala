package typingsSlinky.senchaTouch.Ext.util

import typingsSlinky.senchaTouch.Ext.IEvented
import typingsSlinky.senchaTouch.Ext.scroll.IView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScrollView extends IEvented {
  /** [Method] Returns the value of cls
  		* @returns String
  		*/
  var getCls: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of element
  		* @returns Object
  		*/
  var getElement: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of indicators
  		* @returns Object
  		*/
  var getIndicators: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of indicatorsHidingDelay
  		* @returns Number
  		*/
  var getIndicatorsHidingDelay: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of indicatorsUi
  		* @returns String
  		*/
  var getIndicatorsUi: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the scroller instance in this view
  		* @returns Ext.scroll.View The scroller
  		*/
  var getScroller: js.UndefOr[js.Function0[IView]] = js.native
  /** [Config Option] (String) */
  var indicatorsUi: js.UndefOr[String] = js.native
  /** [Method] Sets the value of cls
  		* @param cls String The new value.
  		*/
  var setCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of element
  		* @param element Object The new value.
  		*/
  var setElement: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of indicators
  		* @param indicators Object The new value.
  		*/
  var setIndicators: js.UndefOr[js.Function1[/* indicators */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of indicatorsHidingDelay
  		* @param indicatorsHidingDelay Number The new value.
  		*/
  var setIndicatorsHidingDelay: js.UndefOr[js.Function1[/* indicatorsHidingDelay */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of indicatorsUi
  		* @param indicatorsUi String The new value.
  		*/
  var setIndicatorsUi: js.UndefOr[js.Function1[/* indicatorsUi */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of scroller
  		* @param scroller Object The new value.
  		*/
  var setScroller: js.UndefOr[js.Function1[/* scroller */ js.UndefOr[js.Any], Unit]] = js.native
}

object IScrollView {
  @scala.inline
  def apply(): IScrollView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IScrollView]
  }
  @scala.inline
  implicit class IScrollViewOps[Self <: IScrollView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCls(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetElement(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElement")(js.undefined)
        ret
    }
    @scala.inline
    def withGetIndicators(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndicators")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetIndicators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndicators")(js.undefined)
        ret
    }
    @scala.inline
    def withGetIndicatorsHidingDelay(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndicatorsHidingDelay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetIndicatorsHidingDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndicatorsHidingDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withGetIndicatorsUi(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndicatorsUi")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetIndicatorsUi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndicatorsUi")(js.undefined)
        ret
    }
    @scala.inline
    def withGetScroller(value: () => IView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScroller")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetScroller: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScroller")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicatorsUi(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorsUi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicatorsUi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorsUi")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCls(value: /* cls */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetElement(value: /* element */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setElement")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIndicators(value: /* indicators */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIndicators")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetIndicators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIndicators")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIndicatorsHidingDelay(value: /* indicatorsHidingDelay */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIndicatorsHidingDelay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetIndicatorsHidingDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIndicatorsHidingDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIndicatorsUi(value: /* indicatorsUi */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIndicatorsUi")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetIndicatorsUi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIndicatorsUi")(js.undefined)
        ret
    }
    @scala.inline
    def withSetScroller(value: /* scroller */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScroller")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetScroller: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScroller")(js.undefined)
        ret
    }
  }
  
}

