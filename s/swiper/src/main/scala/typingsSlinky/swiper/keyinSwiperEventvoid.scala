package typingsSlinky.swiper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in swiper.swiper.SwiperEvent ]:? (): void} */
@js.native
trait keyinSwiperEventvoid extends js.Object {
  var autoplay: js.UndefOr[js.Function0[Unit]] = js.native
  var autoplayStart: js.UndefOr[js.Function0[Unit]] = js.native
  var autoplayStop: js.UndefOr[js.Function0[Unit]] = js.native
  var beforeDestroy: js.UndefOr[js.Function0[Unit]] = js.native
  var beforeLoopFix: js.UndefOr[js.Function0[Unit]] = js.native
  var click: js.UndefOr[js.Function0[Unit]] = js.native
  var doubleTap: js.UndefOr[js.Function0[Unit]] = js.native
  var fromEdge: js.UndefOr[js.Function0[Unit]] = js.native
  var imagesReady: js.UndefOr[js.Function0[Unit]] = js.native
  var init: js.UndefOr[js.Function0[Unit]] = js.native
  var lazyImageLoad: js.UndefOr[js.Function0[Unit]] = js.native
  var lazyImageReady: js.UndefOr[js.Function0[Unit]] = js.native
  var loopFix: js.UndefOr[js.Function0[Unit]] = js.native
  var observerUpdate: js.UndefOr[js.Function0[Unit]] = js.native
  var paginationRender: js.UndefOr[js.Function0[Unit]] = js.native
  var paginationUpdate: js.UndefOr[js.Function0[Unit]] = js.native
  var progress: js.UndefOr[js.Function0[Unit]] = js.native
  var reachBeginning: js.UndefOr[js.Function0[Unit]] = js.native
  var reachEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var resize: js.UndefOr[js.Function0[Unit]] = js.native
  var setTransition: js.UndefOr[js.Function0[Unit]] = js.native
  var setTranslate: js.UndefOr[js.Function0[Unit]] = js.native
  var slideChange: js.UndefOr[js.Function0[Unit]] = js.native
  var slideChangeTransitionEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var slideChangeTransitionStart: js.UndefOr[js.Function0[Unit]] = js.native
  var slideNextTransitionEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var slideNextTransitionStart: js.UndefOr[js.Function0[Unit]] = js.native
  var slidePrevTransitionEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var slidePrevTransitionStart: js.UndefOr[js.Function0[Unit]] = js.native
  var sliderMove: js.UndefOr[js.Function0[Unit]] = js.native
  var tap: js.UndefOr[js.Function0[Unit]] = js.native
  var touchEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var touchMove: js.UndefOr[js.Function0[Unit]] = js.native
  var touchMoveOpposite: js.UndefOr[js.Function0[Unit]] = js.native
  var touchStart: js.UndefOr[js.Function0[Unit]] = js.native
  var transitionEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var transitionStart: js.UndefOr[js.Function0[Unit]] = js.native
}

object keyinSwiperEventvoid {
  @scala.inline
  def apply(): keyinSwiperEventvoid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[keyinSwiperEventvoid]
  }
  @scala.inline
  implicit class keyinSwiperEventvoidOps[Self <: keyinSwiperEventvoid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoplay(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAutoplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplayStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAutoplayStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayStart")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplayStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayStop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAutoplayStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayStop")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDestroy(value: () => Unit): Self = {
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
    def withBeforeLoopFix(value: () => Unit): Self = {
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
    def withClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleTap(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleTap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDoubleTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleTap")(js.undefined)
        ret
    }
    @scala.inline
    def withFromEdge(value: () => Unit): Self = {
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
    def withImagesReady(value: () => Unit): Self = {
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
    def withInit(value: () => Unit): Self = {
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
    def withLazyImageLoad(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyImageLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutLazyImageLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyImageLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withLazyImageReady(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyImageReady")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutLazyImageReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyImageReady")(js.undefined)
        ret
    }
    @scala.inline
    def withLoopFix(value: () => Unit): Self = {
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
    def withObserverUpdate(value: () => Unit): Self = {
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
    def withPaginationRender(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationRender")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPaginationRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationRender")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationUpdate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPaginationUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
    @scala.inline
    def withReachBeginning(value: () => Unit): Self = {
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
    def withReachEnd(value: () => Unit): Self = {
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
    def withResize(value: () => Unit): Self = {
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
    def withSetTransition(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTransition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTransition")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTranslate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTranslate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetTranslate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTranslate")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideChange(value: () => Unit): Self = {
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
    def withSlideChangeTransitionEnd(value: () => Unit): Self = {
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
    def withSlideChangeTransitionStart(value: () => Unit): Self = {
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
    def withSlideNextTransitionEnd(value: () => Unit): Self = {
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
    def withSlideNextTransitionStart(value: () => Unit): Self = {
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
    def withSlidePrevTransitionEnd(value: () => Unit): Self = {
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
    def withSlidePrevTransitionStart(value: () => Unit): Self = {
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
    def withSliderMove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderMove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSliderMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderMove")(js.undefined)
        ret
    }
    @scala.inline
    def withTap(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tap")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutTouchEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchMove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchMove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutTouchMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchMove")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchMoveOpposite(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchMoveOpposite")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutTouchMoveOpposite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchMoveOpposite")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutTouchStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchStart")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionEnd(value: () => Unit): Self = {
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
    def withTransitionStart(value: () => Unit): Self = {
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

