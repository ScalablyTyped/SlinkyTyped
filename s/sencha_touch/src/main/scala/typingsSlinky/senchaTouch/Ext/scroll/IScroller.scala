package typingsSlinky.senchaTouch.Ext.scroll

import typingsSlinky.senchaTouch.Ext.IEvented
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScroller extends IEvented {
  /** [Config Option] (Number) */
  var acceleration: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var direction: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var directionLock: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var friction: js.UndefOr[Double] = js.native
  /** [Method] Returns the value of direction
  		* @returns String
  		*/
  var getDirection: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of directionLock
  		* @returns Boolean
  		*/
  var getDirectionLock: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of disabled
  		* @returns Boolean
  		*/
  var getDisabled: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of initialOffset
  		* @returns Object/Number
  		*/
  var getInitialOffset: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of momentumEasing
  		* @returns Object
  		*/
  var getMomentumEasing: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of slotSnapEasing
  		* @returns Object
  		*/
  var getSlotSnapEasing: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of slotSnapSize
  		* @returns Number/Object
  		*/
  var getSlotSnapSize: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of translatable
  		* @returns Object
  		*/
  var getTranslatable: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Object/Number) */
  var initialOffset: js.UndefOr[js.Any] = js.native
  /** [Method] Returns true if a specified axis is enabled
  		* @param axis String The axis to check (x or y).
  		* @returns Boolean true if the axis is enabled.
  		*/
  var isAxisEnabled: js.UndefOr[js.Function1[/* axis */ js.UndefOr[String], Boolean]] = js.native
  /** [Config Option] (Object) */
  var momentumEasing: js.UndefOr[js.Any] = js.native
  /** [Method] Change the scroll offset by the given amount
  		* @param x Number The offset to scroll by on the x axis.
  		* @param y Number The offset to scroll by on the y axis.
  		* @param animation Boolean/Object Whether or not to animate the scrolling to the new position.
  		* @returns Ext.scroll.Scroller this
  		*/
  var scrollBy: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* animation */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.native
  /** [Method] Scrolls to the given location
  		* @param x Number The scroll position on the x axis.
  		* @param y Number The scroll position on the y axis.
  		* @param animation Boolean/Object Whether or not to animate the scrolling to the new position.
  		* @returns Ext.scroll.Scroller this
  		*/
  var scrollTo: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* animation */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.native
  /** [Method] Scrolls to the end of the scrollable view
  		* @param animation Object
  		* @returns Ext.scroll.Scroller this
  		*/
  var scrollToEnd: js.UndefOr[js.Function1[/* animation */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Sets the value of direction
  		* @param direction String The new value.
  		*/
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of directionLock
  		* @param directionLock Boolean The new value.
  		*/
  var setDirectionLock: js.UndefOr[js.Function1[/* directionLock */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of disabled
  		* @param disabled Boolean The new value.
  		*/
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of initialOffset
  		* @param initialOffset Object/Number The new value.
  		*/
  var setInitialOffset: js.UndefOr[js.Function1[/* initialOffset */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of momentumEasing
  		* @param momentumEasing Object The new value.
  		*/
  var setMomentumEasing: js.UndefOr[js.Function1[/* momentumEasing */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the offset of this scroller
  		* @param offset Object The offset to move to.
  		* @returns Ext.scroll.Scroller this
  		*/
  var setOffset: js.UndefOr[js.Function1[/* offset */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Sets the value of slotSnapEasing
  		* @param slotSnapEasing Object The new value.
  		*/
  var setSlotSnapEasing: js.UndefOr[js.Function1[/* slotSnapEasing */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of slotSnapSize
  		* @param slotSnapSize Number/Object The new value.
  		*/
  var setSlotSnapSize: js.UndefOr[js.Function1[/* slotSnapSize */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of translatable
  		* @param translatable Object The new value.
  		*/
  var setTranslatable: js.UndefOr[js.Function1[/* translatable */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Number/Object) */
  var slotSnapSize: js.UndefOr[js.Any] = js.native
  /** [Method] Updates the boundary information for this scroller
  		* @returns Ext.scroll.Scroller this
  		*/
  var updateBoundary: js.UndefOr[js.Function0[this.type]] = js.native
}

object IScroller {
  @scala.inline
  def apply(): IScroller = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IScroller]
  }
  @scala.inline
  implicit class IScrollerOps[Self <: IScroller] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceleration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceleration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceleration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceleration")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionLock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionLock")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFriction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friction")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDirection(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDirectionLock(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirectionLock")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDirectionLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirectionLock")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDisabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withGetInitialOffset(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInitialOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetInitialOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInitialOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMomentumEasing(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMomentumEasing")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMomentumEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMomentumEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSlotSnapEasing(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSlotSnapEasing")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSlotSnapEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSlotSnapEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSlotSnapSize(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSlotSnapSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSlotSnapSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSlotSnapSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTranslatable(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTranslatable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTranslatable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTranslatable")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialOffset(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAxisEnabled(value: /* axis */ js.UndefOr[String] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAxisEnabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsAxisEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAxisEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMomentumEasing(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("momentumEasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMomentumEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("momentumEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollBy(
      value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* animation */ js.UndefOr[js.Any]) => IScroller
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollBy")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutScrollBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollBy")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollTo(
      value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* animation */ js.UndefOr[js.Any]) => IScroller
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutScrollTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToEnd(value: /* animation */ js.UndefOr[js.Any] => IScroller): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScrollToEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDirection(value: /* direction */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDirectionLock(value: /* directionLock */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirectionLock")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDirectionLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirectionLock")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDisabled(value: /* disabled */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSetInitialOffset(value: /* initialOffset */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInitialOffset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetInitialOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInitialOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMomentumEasing(value: /* momentumEasing */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMomentumEasing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMomentumEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMomentumEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withSetOffset(value: /* offset */ js.UndefOr[js.Any] => IScroller): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOffset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSlotSnapEasing(value: /* slotSnapEasing */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSlotSnapEasing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSlotSnapEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSlotSnapEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSlotSnapSize(value: /* slotSnapSize */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSlotSnapSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSlotSnapSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSlotSnapSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTranslatable(value: /* translatable */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTranslatable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTranslatable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTranslatable")(js.undefined)
        ret
    }
    @scala.inline
    def withSlotSnapSize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotSnapSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlotSnapSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotSnapSize")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateBoundary(value: () => IScroller): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateBoundary")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUpdateBoundary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateBoundary")(js.undefined)
        ret
    }
  }
  
}

