package typingsSlinky.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICarousel extends IContainer {
  /** [Config Option] (String) */
  var direction: js.UndefOr[java.lang.String] = js.native
  /** [Method] Returns the index of the currently active card
  		* @returns Number The index of the currently active card.
  		*/
  var getActiveIndex: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of animation
  		* @returns Object
  		*/
  var getAnimation: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of bufferSize
  		* @returns Number
  		*/
  var getBufferSize: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of direction
  		* @returns String
  		*/
  var getDirection: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of directionLock
  		* @returns Boolean
  		*/
  var getDirectionLock: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of indicator
  		* @returns any
  		*/
  var getIndicator: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of itemConfig
  		* @returns Object
  		*/
  var getItemConfig: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of itemLength
  		* @returns Object
  		*/
  var getItemLength: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Boolean) */
  var indicator: js.UndefOr[Boolean] = js.native
  /** [Method] Returns true when direction is horizontal
  		* @returns Boolean
  		*/
  var isHorizontal: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true when direction is vertical
  		* @returns Boolean
  		*/
  var isVertical: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Switches to the next card
  		* @returns Ext.carousel.Carousel this
  		*/
  var next: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Switches to the previous card
  		* @returns Ext.carousel.Carousel this
  		*/
  var prev: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Switches to the previous card
  		* @returns Ext.carousel.Carousel this
  		*/
  var previous: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Sets the value of animation
  		* @param animation Object The new value.
  		*/
  var setAnimation: js.UndefOr[js.Function1[/* animation */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of bufferSize
  		* @param bufferSize Number The new value.
  		*/
  var setBufferSize: js.UndefOr[js.Function1[/* bufferSize */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of direction
  		* @param direction String The new value.
  		*/
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of directionLock
  		* @param directionLock Boolean The new value.
  		*/
  var setDirectionLock: js.UndefOr[js.Function1[/* directionLock */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of indicator
  		* @param indicator Boolean The new value.
  		*/
  var setIndicator: js.UndefOr[js.Function1[/* indicator */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of itemConfig
  		* @param itemConfig Object The new value.
  		*/
  var setItemConfig: js.UndefOr[js.Function1[/* itemConfig */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of itemLength
  		* @param itemLength Object The new value.
  		*/
  var setItemLength: js.UndefOr[js.Function1[/* itemLength */ js.UndefOr[js.Any], Unit]] = js.native
}

object ICarousel {
  @scala.inline
  def apply(): ICarousel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICarousel]
  }
  @scala.inline
  implicit class ICarouselOps[Self <: ICarousel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: java.lang.String): Self = {
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
    def withGetActiveIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetActiveIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAnimation(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnimation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBufferSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBufferSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBufferSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBufferSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDirection(value: () => java.lang.String): Self = {
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
    def withGetIndicator(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndicator")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemConfig(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemConfig")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetItemConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemLength(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetItemLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemLength")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicator")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHorizontal(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHorizontal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHorizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withIsVertical(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVertical")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVertical")(js.undefined)
        ret
    }
    @scala.inline
    def withNext(value: () => ICarousel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.undefined)
        ret
    }
    @scala.inline
    def withPrev(value: () => ICarousel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevious(value: () => ICarousel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPrevious: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAnimation(value: /* animation */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAnimation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBufferSize(value: /* bufferSize */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBufferSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBufferSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBufferSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDirection(value: /* direction */ js.UndefOr[java.lang.String] => Unit): Self = {
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
    def withSetIndicator(value: /* indicator */ js.UndefOr[Boolean] => Unit): Self = {
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
    def withSetItemConfig(value: /* itemConfig */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItemConfig")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetItemConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItemConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSetItemLength(value: /* itemLength */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItemLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetItemLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItemLength")(js.undefined)
        ret
    }
  }
  
}

