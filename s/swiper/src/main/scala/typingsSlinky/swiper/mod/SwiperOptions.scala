package typingsSlinky.swiper.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.swiper.anon.keyinSwiperEventvoid
import typingsSlinky.swiper.swiperStrings.auto
import typingsSlinky.swiper.swiperStrings.column
import typingsSlinky.swiper.swiperStrings.container
import typingsSlinky.swiper.swiperStrings.coverflow
import typingsSlinky.swiper.swiperStrings.cube
import typingsSlinky.swiper.swiperStrings.fade
import typingsSlinky.swiper.swiperStrings.flip
import typingsSlinky.swiper.swiperStrings.horizontal
import typingsSlinky.swiper.swiperStrings.row
import typingsSlinky.swiper.swiperStrings.slide
import typingsSlinky.swiper.swiperStrings.vertical
import typingsSlinky.swiper.swiperStrings.wrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwiperOptions extends js.Object {
  var a11y: js.UndefOr[A11yOptions | Boolean] = js.native
  var allowSlideNext: js.UndefOr[Boolean] = js.native
  var allowSlidePrev: js.UndefOr[Boolean] = js.native
  /**
    * If false, then the only way to switch the slide is use of external API functions like slidePrev or slideNext
    */
  var allowTouchMove: js.UndefOr[Boolean] = js.native
  /**
    * Set to true and slider wrapper will adopt its height to the height of the currently active slide
    *
    * @default false
    */
  var autoHeight: js.UndefOr[Boolean] = js.native
  var autoplay: js.UndefOr[AutoplayOptions | Boolean] = js.native
  // Breakpoints
  var breakpoints: js.UndefOr[NumberDictionary[SwiperOptions]] = js.native
  var breakpointsInverse: js.UndefOr[Boolean] = js.native
  /**
    * When enabled it center slides if the amount of slides less than `slidesPerView`. Not intended to be used loop mode and slidesPerColumn
    */
  var centerInsufficientSlides: js.UndefOr[Boolean] = js.native
  /**
    * If true, then active slide will be centered, not always on the left side.
    */
  var centeredSlides: js.UndefOr[Boolean] = js.native
  /**
    * If true, then active slide will be centered without adding gaps at the beginning and end of slider.
    * Required centeredSlides: true. Not intended to be used with loop or pagination
    *
    * @default false
    */
  var centeredSlidesBounds: js.UndefOr[Boolean] = js.native
  // Namespace
  var containerModifierClass: js.UndefOr[String] = js.native
  // Components
  var controller: js.UndefOr[ControllerOptions | Boolean] = js.native
  var coverflowEffect: js.UndefOr[CoverflowEffectOptions] = js.native
  // CSS Scroll Snap
  /**
    * When enabled it will use modern CSS Scroll Snap API.
    * It doesn't support all of Swiper's features, but potentially should bring a much better performance in simple configurations.
    *
    * @default false
    */
  var cssMode: js.UndefOr[Boolean] = js.native
  var cubeEffect: js.UndefOr[CubeEffectOptions] = js.native
  /**
    * Could be 'horizontal' or 'vertical' (for vertical slider).
    *
    * @default 'horizontal'
    */
  var direction: js.UndefOr[horizontal | vertical] = js.native
  /**
    * Tranisition effect. Could be "slide", "fade", "cube", "coverflow" or "flip"
    *
    * @default 'slide'
    */
  var effect: js.UndefOr[slide | fade | cube | coverflow | flip] = js.native
  var fadeEffect: js.UndefOr[FadeEffectOptions] = js.native
  var flipEffect: js.UndefOr[FlipEffectOptions] = js.native
  /**
    * If disabled, then slider will be animated only when you release it, it will not move while you hold your finger on it
    */
  var followFinger: js.UndefOr[Boolean] = js.native
  // Freemode
  var freeMode: js.UndefOr[Boolean] = js.native
  var freeModeMinimumVelocity: js.UndefOr[Double] = js.native
  var freeModeMomentum: js.UndefOr[Boolean] = js.native
  var freeModeMomentumBounce: js.UndefOr[Boolean] = js.native
  var freeModeMomentumBounceRatio: js.UndefOr[Double] = js.native
  var freeModeMomentumRatio: js.UndefOr[Double] = js.native
  var freeModeMomentumVelocityRatio: js.UndefOr[Double] = js.native
  var freeModeSticky: js.UndefOr[Boolean] = js.native
  // Grab Cursor
  var grabCursor: js.UndefOr[Boolean] = js.native
  var hashNavigation: js.UndefOr[HashNavigationOptions | Boolean] = js.native
  /**
    * Swiper height (in px). Parameter allows to force Swiper height.
    * Useful only if you initialize Swiper when it is hidden.
    *
    * @note Setting this parameter will make Swiper not responsive
    */
  var height: js.UndefOr[Double] = js.native
  var history: js.UndefOr[HistoryNavigationOptions | Boolean] = js.native
  /**
    * Enable to release Swiper events for swipe-to-go-back work in iOS UIWebView
    */
  var iOSEdgeSwipeDetection: js.UndefOr[Boolean] = js.native
  /**
    * Area (in px) from left edge of the screen to release touch events for swipe-to-go-back in iOS UIWebView
    */
  var iOSEdgeSwipeThreshold: js.UndefOr[Double] = js.native
  /**
    * Whether Swiper should be initialised automatically when you create an instance.
    * If disabled, then you need to init it manually by calling mySwiper.init()
    *
    * @default true
    */
  var init: js.UndefOr[Boolean] = js.native
  /**
    * Index number of initial slide.
    *
    * @default 0
    */
  var initialSlide: js.UndefOr[Double] = js.native
  var keyboard: js.UndefOr[KeyboardOptions | Boolean] = js.native
  var `lazy`: js.UndefOr[LazyOptions | Boolean] = js.native
  /**
    * Set to false if you want to disable long swipes
    */
  var longSwipes: js.UndefOr[Boolean] = js.native
  /**
    * Minimal duration (in ms) to trigger swipe to next/previous slide during long swipes
    */
  var longSwipesMs: js.UndefOr[Double] = js.native
  /**
    * Ratio to trigger swipe to next/previous slide during long swipes
    */
  var longSwipesRatio: js.UndefOr[Double] = js.native
  // Loop
  var loop: js.UndefOr[Boolean] = js.native
  var loopAdditionalSlides: js.UndefOr[Double] = js.native
  var loopFillGroupWithBlank: js.UndefOr[Boolean] = js.native
  var loopedSlides: js.UndefOr[Double] = js.native
  var mousewheel: js.UndefOr[MousewheelOptions | Boolean] = js.native
  var navigation: js.UndefOr[NavigationOptions] = js.native
  /**
    * Set to true on  Swiper for correct touch events interception. Use only on
    * swipers that use same direction as the parent one
    *
    * @default false
    */
  var nested: js.UndefOr[Boolean] = js.native
  var noSwiping: js.UndefOr[Boolean] = js.native
  var noSwipingClass: js.UndefOr[String] = js.native
  var noSwipingSelector: js.UndefOr[String] = js.native
  /**
    * Normalize slide index.
    */
  var normalizeSlideIndex: js.UndefOr[Boolean] = js.native
  var observeParents: js.UndefOr[Boolean] = js.native
  // Observer
  /**
    * Set to true if you also need to watch Mutations for Swiper slide children elements
    *
    * @default false
    */
  var observeSlideChildren: js.UndefOr[Boolean] = js.native
  var observer: js.UndefOr[Boolean] = js.native
  /**
    * Register event handlers.
    */
  var on: js.UndefOr[keyinSwiperEventvoid] = js.native
  var pagination: js.UndefOr[PaginationOptions] = js.native
  var parallax: js.UndefOr[Boolean] = js.native
  /**
    * Passive event listeners will be used by default where possible to improve scrolling performance on mobile devices.
    * But if you need to use `e.preventDefault` and you have conflict with it, then you should disable this parameter
    */
  var passiveListeners: js.UndefOr[Boolean] = js.native
  // Images
  var preloadImages: js.UndefOr[Boolean] = js.native
  // Clicks
  var preventClicks: js.UndefOr[Boolean] = js.native
  var preventClicksPropagation: js.UndefOr[Boolean] = js.native
  // Swiping / No swiping
  var preventInteractionOnTransition: js.UndefOr[Boolean] = js.native
  // Touch Resistance
  /**
    * Set to false if you want to disable resistant bounds
    */
  var resistance: js.UndefOr[Boolean] = js.native
  /**
    * This option allows you to control resistance ratio
    */
  var resistanceRatio: js.UndefOr[Double] = js.native
  /**
    * Set to true to round values of slides width and height to prevent blurry texts on usual
    * resolution screens (if you have such)
    *
    * @default false
    */
  var roundLengths: js.UndefOr[Boolean] = js.native
  /**
    * Fire [Transition/SlideChange][Start/End] events on swiper initialization.
    * Such events will be fired on initialization in case of your initialSlide is not 0, or you use loop mode
    *
    * @default true
    */
  var runCallbacksOnInit: js.UndefOr[Boolean] = js.native
  var scrollbar: js.UndefOr[ScrollbarOptions] = js.native
  /**
    * Enabled this option and plugin will set width/height on swiper wrapper equal to total size of all slides.
    * Mostly should be used as compatibility fallback option for browser that don't support flexbox layout well
    */
  var setWrapperSize: js.UndefOr[Boolean] = js.native
  /**
    * Set to false if you want to disable short swipes
    */
  var shortSwipes: js.UndefOr[Boolean] = js.native
  /**
    * If true, Swiper will accept mouse events like touch events (click and drag to change slides)
    */
  var simulateTouch: js.UndefOr[Boolean] = js.native
  var slideActiveClass: js.UndefOr[String] = js.native
  var slideClass: js.UndefOr[String] = js.native
  var slideDuplicateActiveClass: js.UndefOr[String] = js.native
  var slideDuplicateClass: js.UndefOr[String] = js.native
  var slideDuplicateNextClass: js.UndefOr[String] = js.native
  var slideDuplicatePrevClass: js.UndefOr[String] = js.native
  var slideNextClass: js.UndefOr[String] = js.native
  var slidePrevClass: js.UndefOr[String] = js.native
  var slideToClickedSlide: js.UndefOr[Boolean] = js.native
  var slideVisibleClass: js.UndefOr[String] = js.native
  /**
    * Add (in px) additional slide offset in the end of the container (after all slides)
    */
  var slidesOffsetAfter: js.UndefOr[Double] = js.native
  /**
    * Add (in px) additional slide offset in the beginning of the container (before all slides)
    */
  var slidesOffsetBefore: js.UndefOr[Double] = js.native
  /**
    * Number of slides per column, for multirow layout
    * slidesPerColumn > 1 is currently not compatible with loop mode (loop: true)
    */
  var slidesPerColumn: js.UndefOr[Double] = js.native
  /**
    * Could be 'column' or 'row'. Defines how slides should fill rows, by column or by row
    */
  var slidesPerColumnFill: js.UndefOr[row | column] = js.native
  /**
    * Set numbers of slides to define and enable group sliding. Useful to use with slidesPerView > 1
    */
  var slidesPerGroup: js.UndefOr[Double] = js.native
  /**
    * The parameter works in the following way: If slidesPerGroupSkip equals 0 (default), no slides are excluded from grouping, and the resulting behaviour is the same as without this change.
    * If slidesPerGroupSkip is equal or greater than 1 the first X slides are treated as single groups, whereas all following slides are grouped by the slidesPerGroup value.
    *
    * @default 0
    */
  var slidesPerGroupSkip: js.UndefOr[Double] = js.native
  /**
    * Number of slides per view (slides visible at the same time on slider's container).
    * If you use it with "auto" value and along with loop: true then you need to specify loopedSlides parameter with amount of slides to loop (duplicate)
    * slidesPerView: 'auto' is currently not compatible with multirow mode, when slidesPerColumn > 1
    */
  var slidesPerView: js.UndefOr[Double | auto] = js.native
  // Slides grid
  /**
    * Distance between slides in px.
    */
  var spaceBetween: js.UndefOr[Double] = js.native
  /**
    * Duration of transition between slides (in ms)
    *
    * @default 300
    */
  var speed: js.UndefOr[Double] = js.native
  var swipeHandler: js.UndefOr[SelectableElement] = js.native
  /**
    * Threshold value in px. If "touch distance" will be lower than this value then swiper will not move
    */
  var threshold: js.UndefOr[Double] = js.native
  var thumbs: js.UndefOr[ThumbsOptions] = js.native
  /**
    * Allowable angle (in degrees) to trigger touch move
    */
  var touchAngle: js.UndefOr[Double] = js.native
  // Touches
  /**
    * Target element to listen touch events on. Can be 'container' (to listen for touch events on swiper-container) or 'wrapper'
    * (to listen for touch events on swiper-wrapper)
    */
  var touchEventsTarget: js.UndefOr[container | wrapper] = js.native
  /**
    * If enabled, then propagation of "touchmove" will be stopped
    */
  var touchMoveStopPropagation: js.UndefOr[Boolean] = js.native
  /**
    * Touch ratio
    */
  var touchRatio: js.UndefOr[Double] = js.native
  /**
    * Enable to release touch events on slider edge position (beginning, end) to allow for further page scrolling
    */
  var touchReleaseOnEdges: js.UndefOr[Boolean] = js.native
  /**
    * Force to always prevent default for `touchstart` (`mousedown`) event
    */
  var touchStartForcePreventDefault: js.UndefOr[Boolean] = js.native
  /**
    * If disabled, `touchstart` (`mousedown`) event won't be prevented
    */
  var touchStartPreventDefault: js.UndefOr[Boolean] = js.native
  /**
    * If enabled (by default) and navigation elements' parameters passed as a string (like ".pagination")
    * then Swiper will look for such elements through child elements first.
    * Applies for pagination, prev/next buttons and scrollbar elements
    *
    * @default true
    */
  var uniqueNavElements: js.UndefOr[Boolean] = js.native
  var updateOnImagesReady: js.UndefOr[Boolean] = js.native
  /**
    * Swiper will recalculate slides position on window resize (orientationchange)
    *
    * @default true
    */
  var updateOnWindowResize: js.UndefOr[Boolean] = js.native
  var virtual: js.UndefOr[VirtualOptions | Boolean] = js.native
  /**
    * Enabled this option and swiper will be operated as usual except it will not move, real translate values on wrapper will not be set.
    * Useful when you may need to create custom slide transition
    */
  var virtualTranslate: js.UndefOr[Boolean] = js.native
  /**
    * When enabled Swiper will be disabled and hide navigation buttons on
    * case there are not enough slides for sliding.
    *
    * @default false
    */
  var watchOverflow: js.UndefOr[Boolean] = js.native
  // Progress
  var watchSlidesProgress: js.UndefOr[Boolean] = js.native
  var watchSlidesVisibility: js.UndefOr[Boolean] = js.native
  /**
    * Swiper width (in px). Parameter allows to force Swiper width.
    * Useful only if you initialize Swiper when it is hidden.
    *
    * @note Setting this parameter will make Swiper not responsive
    */
  var width: js.UndefOr[Double] = js.native
  var wrapperClass: js.UndefOr[String] = js.native
  var zoom: js.UndefOr[ZoomOptions | Boolean] = js.native
}

object SwiperOptions {
  @scala.inline
  def apply(): SwiperOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwiperOptions]
  }
  @scala.inline
  implicit class SwiperOptionsOps[Self <: SwiperOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withA11y(value: A11yOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a11y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutA11y: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a11y")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSlideNext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSlideNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSlideNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSlideNext")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSlidePrev(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSlidePrev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSlidePrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSlidePrev")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowTouchMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTouchMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowTouchMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTouchMove")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplay(value: AutoplayOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(js.undefined)
        ret
    }
    @scala.inline
    def withBreakpoints(value: NumberDictionary[SwiperOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withBreakpointsInverse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpointsInverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakpointsInverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpointsInverse")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterInsufficientSlides(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerInsufficientSlides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterInsufficientSlides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerInsufficientSlides")(js.undefined)
        ret
    }
    @scala.inline
    def withCenteredSlides(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centeredSlides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenteredSlides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centeredSlides")(js.undefined)
        ret
    }
    @scala.inline
    def withCenteredSlidesBounds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centeredSlidesBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenteredSlidesBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centeredSlidesBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerModifierClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerModifierClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerModifierClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerModifierClass")(js.undefined)
        ret
    }
    @scala.inline
    def withController(value: ControllerOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutController: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(js.undefined)
        ret
    }
    @scala.inline
    def withCoverflowEffect(value: CoverflowEffectOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverflowEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverflowEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverflowEffect")(js.undefined)
        ret
    }
    @scala.inline
    def withCssMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCubeEffect(value: CubeEffectOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cubeEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCubeEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cubeEffect")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: horizontal | vertical): Self = {
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
    def withEffect(value: slide | fade | cube | coverflow | flip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(js.undefined)
        ret
    }
    @scala.inline
    def withFadeEffect(value: FadeEffectOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadeEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeEffect")(js.undefined)
        ret
    }
    @scala.inline
    def withFlipEffect(value: FlipEffectOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlipEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipEffect")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowFinger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followFinger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowFinger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followFinger")(js.undefined)
        ret
    }
    @scala.inline
    def withFreeMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeMode")(js.undefined)
        ret
    }
    @scala.inline
    def withFreeModeMinimumVelocity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeModeMinimumVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreeModeMinimumVelocity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeModeMinimumVelocity")(js.undefined)
        ret
    }
    @scala.inline
    def withFreeModeMomentum(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeModeMomentum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreeModeMomentum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeModeMomentum")(js.undefined)
        ret
    }
    @scala.inline
    def withFreeModeMomentumBounce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeModeMomentumBounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreeModeMomentumBounce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeModeMomentumBounce")(js.undefined)
        ret
    }
    @scala.inline
    def withFreeModeMomentumBounceRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeModeMomentumBounceRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreeModeMomentumBounceRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeModeMomentumBounceRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withFreeModeMomentumRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeModeMomentumRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreeModeMomentumRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeModeMomentumRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withFreeModeMomentumVelocityRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeModeMomentumVelocityRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreeModeMomentumVelocityRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeModeMomentumVelocityRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withFreeModeSticky(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeModeSticky")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreeModeSticky: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeModeSticky")(js.undefined)
        ret
    }
    @scala.inline
    def withGrabCursor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grabCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrabCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grabCursor")(js.undefined)
        ret
    }
    @scala.inline
    def withHashNavigation(value: HashNavigationOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHistory(value: HistoryNavigationOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(js.undefined)
        ret
    }
    @scala.inline
    def withIOSEdgeSwipeDetection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iOSEdgeSwipeDetection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIOSEdgeSwipeDetection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iOSEdgeSwipeDetection")(js.undefined)
        ret
    }
    @scala.inline
    def withIOSEdgeSwipeThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iOSEdgeSwipeThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIOSEdgeSwipeThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iOSEdgeSwipeThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialSlide(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSlide")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboard(value: KeyboardOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withLazy(value: LazyOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(js.undefined)
        ret
    }
    @scala.inline
    def withLongSwipes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longSwipes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongSwipes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longSwipes")(js.undefined)
        ret
    }
    @scala.inline
    def withLongSwipesMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longSwipesMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongSwipesMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longSwipesMs")(js.undefined)
        ret
    }
    @scala.inline
    def withLongSwipesRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longSwipesRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongSwipesRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longSwipesRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withLoopAdditionalSlides(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopAdditionalSlides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoopAdditionalSlides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopAdditionalSlides")(js.undefined)
        ret
    }
    @scala.inline
    def withLoopFillGroupWithBlank(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopFillGroupWithBlank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoopFillGroupWithBlank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopFillGroupWithBlank")(js.undefined)
        ret
    }
    @scala.inline
    def withLoopedSlides(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopedSlides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoopedSlides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopedSlides")(js.undefined)
        ret
    }
    @scala.inline
    def withMousewheel(value: MousewheelOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousewheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMousewheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousewheel")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigation(value: NavigationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(js.undefined)
        ret
    }
    @scala.inline
    def withNested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nested")(js.undefined)
        ret
    }
    @scala.inline
    def withNoSwiping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSwiping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSwiping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSwiping")(js.undefined)
        ret
    }
    @scala.inline
    def withNoSwipingClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSwipingClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSwipingClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSwipingClass")(js.undefined)
        ret
    }
    @scala.inline
    def withNoSwipingSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSwipingSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSwipingSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSwipingSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalizeSlideIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeSlideIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalizeSlideIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeSlideIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withObserveParents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeParents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObserveParents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeParents")(js.undefined)
        ret
    }
    @scala.inline
    def withObserveSlideChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeSlideChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObserveSlideChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeSlideChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withObserver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObserver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observer")(js.undefined)
        ret
    }
    @scala.inline
    def withOn(value: keyinSwiperEventvoid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.undefined)
        ret
    }
    @scala.inline
    def withPagination(value: PaginationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(js.undefined)
        ret
    }
    @scala.inline
    def withParallax(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallax")(js.undefined)
        ret
    }
    @scala.inline
    def withPassiveListeners(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passiveListeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassiveListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passiveListeners")(js.undefined)
        ret
    }
    @scala.inline
    def withPreloadImages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreloadImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadImages")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventClicks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventClicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventClicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventClicks")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventClicksPropagation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventClicksPropagation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventClicksPropagation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventClicksPropagation")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventInteractionOnTransition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventInteractionOnTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventInteractionOnTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventInteractionOnTransition")(js.undefined)
        ret
    }
    @scala.inline
    def withResistance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resistance")(js.undefined)
        ret
    }
    @scala.inline
    def withResistanceRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resistanceRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResistanceRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resistanceRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withRoundLengths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundLengths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundLengths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundLengths")(js.undefined)
        ret
    }
    @scala.inline
    def withRunCallbacksOnInit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runCallbacksOnInit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunCallbacksOnInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runCallbacksOnInit")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollbar(value: ScrollbarOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbar")(js.undefined)
        ret
    }
    @scala.inline
    def withSetWrapperSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWrapperSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetWrapperSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWrapperSize")(js.undefined)
        ret
    }
    @scala.inline
    def withShortSwipes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortSwipes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortSwipes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortSwipes")(js.undefined)
        ret
    }
    @scala.inline
    def withSimulateTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simulateTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimulateTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simulateTouch")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideActiveClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideActiveClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideActiveClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideActiveClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideDuplicateActiveClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideDuplicateActiveClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideDuplicateActiveClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideDuplicateActiveClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideDuplicateClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideDuplicateClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideDuplicateClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideDuplicateClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideDuplicateNextClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideDuplicateNextClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideDuplicateNextClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideDuplicateNextClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideDuplicatePrevClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideDuplicatePrevClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideDuplicatePrevClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideDuplicatePrevClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideNextClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideNextClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideNextClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideNextClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSlidePrevClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidePrevClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlidePrevClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidePrevClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideToClickedSlide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideToClickedSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideToClickedSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideToClickedSlide")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideVisibleClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideVisibleClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideVisibleClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideVisibleClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSlidesOffsetAfter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesOffsetAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlidesOffsetAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesOffsetAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withSlidesOffsetBefore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesOffsetBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlidesOffsetBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesOffsetBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withSlidesPerColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesPerColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlidesPerColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesPerColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withSlidesPerColumnFill(value: row | column): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesPerColumnFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlidesPerColumnFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesPerColumnFill")(js.undefined)
        ret
    }
    @scala.inline
    def withSlidesPerGroup(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesPerGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlidesPerGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesPerGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withSlidesPerGroupSkip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesPerGroupSkip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlidesPerGroupSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesPerGroupSkip")(js.undefined)
        ret
    }
    @scala.inline
    def withSlidesPerView(value: Double | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesPerView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlidesPerView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesPerView")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaceBetween(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceBetween")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaceBetween: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceBetween")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeHandlerHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipeHandler(value: SelectableElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbs(value: ThumbsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbs")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchEventsTarget(value: container | wrapper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchEventsTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchEventsTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchEventsTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchMoveStopPropagation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchMoveStopPropagation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchMoveStopPropagation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchMoveStopPropagation")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchReleaseOnEdges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchReleaseOnEdges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchReleaseOnEdges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchReleaseOnEdges")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchStartForcePreventDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchStartForcePreventDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchStartForcePreventDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchStartForcePreventDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchStartPreventDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchStartPreventDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchStartPreventDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchStartPreventDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withUniqueNavElements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueNavElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniqueNavElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueNavElements")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateOnImagesReady(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOnImagesReady")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateOnImagesReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOnImagesReady")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateOnWindowResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOnWindowResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateOnWindowResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOnWindowResize")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtual(value: VirtualOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtual")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualTranslate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualTranslate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualTranslate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualTranslate")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchOverflow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchOverflow")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchSlidesProgress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchSlidesProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchSlidesProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchSlidesProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchSlidesVisibility(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchSlidesVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchSlidesVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchSlidesVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapperClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapperClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperClass")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: ZoomOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
  }
  
}

