package typingsSlinky.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsOptions extends js.Object {
  /**
    * Triggered right beforey Swiper destoryed
    */
  var beforeDestroy: js.UndefOr[js.Function0[_]] = js.native
  /**
    * Event will be fired right before "loop fix"
    */
  var beforeLoopFix: js.UndefOr[js.Function0[_]] = js.native
  /**
    * Triggered when user click/tap on Swiper after 300ms delay. Receives 'touchend' event as an arguments.
    */
  var click: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.native
  /**
    * Triggered when user double tap on Swiper's container. Receives 'touchend' event as an arguments
    */
  var doubleTap: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.native
  /**
    * Triggered when Swiper goes from beginning or end position
    */
  var fromEdge: js.UndefOr[js.Function0[_]] = js.native
  /**
    * Triggered right after all inner images are loaded. updateOnImagesReady should be also enabled
    */
  var imagesReady: js.UndefOr[js.Function0[_]] = js.native
  /**
    * Fired right after Swiper initialization.
    * Note that with swiper.on('init') syntax it will
    * work only in case you set init: false parameter.
    *
    * @example
    * var swiper = new Swiper('.swiper-container', {
    *   init: false,
    *   // other parameters
    * });
    *
    * @example
    * swiper.on('init', function() {
    *  // do something
    * });
    *
    * @example
    * // init Swiper
    * swiper.init();
    *
    * @example
    * // Otherwise use it as the parameter:
    * var swiper = new Swiper('.swiper-container', {
    *   // other parameters
    *   on: {
    *     init: function () {
    *       // do something
    *     },
    *   }
    * });
    */
  var init: js.UndefOr[js.Function0[_]] = js.native
  /**
    * Event will be fired after "loop fix"
    */
  var loopFix: js.UndefOr[js.Function0[_]] = js.native
  /**
    * Event will be fired if observer is enabled and it detects DOM mutations
    */
  var observerUpdate: js.UndefOr[js.Function0[_]] = js.native
  /**
    * Triggered when Swiper progress is changed, as an arguments it receives
    * progress that is always from 0 to 1
    */
  var progress: js.UndefOr[js.Function1[/* progress */ js.Any, _]] = js.native
  /**
    * Triggered when Swiper reach its beginning (initial position)
    */
  var reachBeginning: js.UndefOr[js.Function0[_]] = js.native
  /**
    * Triggered when Swiper reach last slide
    */
  var reachEnd: js.UndefOr[js.Function0[_]] = js.native
  /**
    * Triggered on window resize right before swiper's onresize manipulation
    */
  var resize: js.UndefOr[js.Function0[_]] = js.native
  /**
    * Triggered everytime when swiper starts animation.
    * Receives current transition duration (in ms) as an arguments,
    */
  var setTransition: js.UndefOr[js.Function1[/* transition */ js.Any, _]] = js.native
  /**
    * Triggered when swiper's wrapper change its position. Receives current translate value as an arguments
    */
  var setTranslate: js.UndefOr[js.Function1[/* translate */ js.Any, _]] = js.native
  /**
    * Triggered when currently active slide is changed
    */
  var slideChange: js.UndefOr[js.Function0[_]] = js.native
  /**
    * Triggered after animation to other slide (next or previous).
    */
  var slideChangeTransitionEnd: js.UndefOr[js.Function0[_]] = js.native
  /**
    * Triggered in the beginning of animation to other slide (next or previous).
    */
  var slideChangeTransitionStart: js.UndefOr[js.Function0[_]] = js.native
  /**
    * Same as "slideChangeTransitionEnd" but for "forward" direction only
    */
  var slideNextTransitionEnd: js.UndefOr[js.Function0[_]] = js.native
  /**
    * Same as "slideChangeTransitionStart" but for "forward" direction only
    */
  var slideNextTransitionStart: js.UndefOr[js.Function0[_]] = js.native
  /**
    * Same as "slideChangeTransitionEnd" but for "backward" direction only
    */
  var slidePrevTransitionEnd: js.UndefOr[js.Function0[_]] = js.native
  /**
    * Same as "slideChangeTransitionStart" but for "backward" direction only
    */
  var slidePrevTransitionStart: js.UndefOr[js.Function0[_]] = js.native
  /**
    * Triggered when user touch and move finger over Swiper and move it.
    * Receives 'touchmove' event as an arguments.
    */
  var sliderMove: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.native
  /**
    * Triggered when user click/tap on Swiper. Receives 'touchend' event as an arguments.
    */
  var tap: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.native
  /**
    * Triggered when user release Swiper. Receives 'touchend' event as an arguments.
    */
  var touchEnd: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.native
  /**
    * Triggered when user touch and move finger over Swiper. Receives 'touchmove' event as an arguments.
    */
  var touchMove: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.native
  /**
    * Fired when user touch and move finger over
    * Swiper in direction opposite to direction parameter.
    * Receives 'touchmove' event as an arguments.
    */
  var touchMoveOpposite: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.native
  /**
    * Triggered when user touch Swiper. Receives 'touchstart' event as an arguments.
    */
  var touchStart: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.native
  /**
    * Triggered after transition.
    */
  var transitionEnd: js.UndefOr[js.Function0[_]] = js.native
  /**
    * Triggered in the beginning of transition.
    */
  var transitionStart: js.UndefOr[js.Function0[_]] = js.native
}

object EventsOptions {
  @scala.inline
  def apply(): EventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventsOptions]
  }
  @scala.inline
  implicit class EventsOptionsOps[Self <: EventsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeforeDestroy(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDestroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeLoopFix(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLoopFix")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeLoopFix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLoopFix")(js.undefined)
        ret
    }
    @scala.inline
    def withClick(value: /* event */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleTap(value: /* event */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleTap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDoubleTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleTap")(js.undefined)
        ret
    }
    @scala.inline
    def withFromEdge(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromEdge")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFromEdge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromEdge")(js.undefined)
        ret
    }
    @scala.inline
    def withImagesReady(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagesReady")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutImagesReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagesReady")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withLoopFix(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopFix")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutLoopFix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopFix")(js.undefined)
        ret
    }
    @scala.inline
    def withObserverUpdate(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observerUpdate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutObserverUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observerUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: /* progress */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
    @scala.inline
    def withReachBeginning(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reachBeginning")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutReachBeginning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reachBeginning")(js.undefined)
        ret
    }
    @scala.inline
    def withReachEnd(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reachEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutReachEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reachEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTransition(value: /* transition */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTransition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTransition")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTranslate(value: /* translate */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTranslate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTranslate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTranslate")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideChange(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSlideChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideChange")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideChangeTransitionEnd(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideChangeTransitionEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSlideChangeTransitionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideChangeTransitionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideChangeTransitionStart(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideChangeTransitionStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSlideChangeTransitionStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideChangeTransitionStart")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideNextTransitionEnd(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideNextTransitionEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSlideNextTransitionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideNextTransitionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideNextTransitionStart(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideNextTransitionStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSlideNextTransitionStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideNextTransitionStart")(js.undefined)
        ret
    }
    @scala.inline
    def withSlidePrevTransitionEnd(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidePrevTransitionEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSlidePrevTransitionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidePrevTransitionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withSlidePrevTransitionStart(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidePrevTransitionStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSlidePrevTransitionStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidePrevTransitionStart")(js.undefined)
        ret
    }
    @scala.inline
    def withSliderMove(value: /* event */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSliderMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderMove")(js.undefined)
        ret
    }
    @scala.inline
    def withTap(value: /* event */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tap")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchEnd(value: /* event */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTouchEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchMove(value: /* event */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTouchMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchMove")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchMoveOpposite(value: /* event */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchMoveOpposite")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTouchMoveOpposite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchMoveOpposite")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchStart(value: /* event */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTouchStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchStart")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionEnd(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutTransitionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionStart(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutTransitionStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionStart")(js.undefined)
        ret
    }
  }
  
}

