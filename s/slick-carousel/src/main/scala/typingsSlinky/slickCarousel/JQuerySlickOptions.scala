package typingsSlinky.slickCarousel

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuerySlickOptions extends js.Object {
  /**
    * Enables tabbing and arrow key navigation
    * Default: true
    */
  var accessibility: js.UndefOr[Boolean] = js.native
  /**
    * Enables adaptive height for single slide horizontal carousels.
    * Default: false
    */
  var adaptiveHeight: js.UndefOr[Boolean] = js.native
  /**
    * Change where the navigation arrows are attached (Selector, htmlString, Array, Element, jQuery object)
    * `false` will prevent arrows from being created/appended
    * Default: $(element)
    */
  var appendArrows: js.UndefOr[Element | js.Array[Element] | JQuery | String | Boolean] = js.native
  /**
    * Change where the navigation dots are attached (Selector, htmlString, Array, Element, jQuery object)
    * Default: $(element)
    */
  var appendDots: js.UndefOr[Element | js.Array[Element] | JQuery | String] = js.native
  /**
    * Prev/Next Arrows
    * Default: true
    */
  var arrows: js.UndefOr[Boolean] = js.native
  /**
    * Set the slider to be the navigation of other slider
    * Default: null
    */
  var asNavFor: js.UndefOr[Element | JQuery | String] = js.native
  /**
    * Enables Autoplay
    * Default: false
    */
  var autoplay: js.UndefOr[Boolean] = js.native
  /**
    * Autoplay Speed in milliseconds
    * Default: 3000
    */
  var autoplaySpeed: js.UndefOr[Double] = js.native
  /**
    * Enables centered view with partial prev/next slides. Use with odd numbered slidesToShow counts.
    * Default: false
    */
  var centerMode: js.UndefOr[Boolean] = js.native
  /**
    * Side padding when in center mode (px or %)
    * Default: '50px'
    */
  var centerPadding: js.UndefOr[String] = js.native
  /**
    * CSS3 Animation Easing
    * Default: 'ease'
    */
  var cssEase: js.UndefOr[String] = js.native
  /**
    * Custom paging templates. See source for use example.
    * Default: n/a
    */
  var customPaging: js.UndefOr[js.Function2[/* slider */ js.Any, /* i */ Double, String]] = js.native
  /**
    * Show dot indicators
    * Default: false
    */
  var dots: js.UndefOr[Boolean] = js.native
  /**
    * Class for slide indicator dots container
    * Default: 'slick-dots'
    */
  var dotsClass: js.UndefOr[String] = js.native
  /**
    * Enable mouse dragging
    * Default: true
    */
  var draggable: js.UndefOr[Boolean] = js.native
  /**
    * Add easing for jQuery animate. Use with easing libraries or default easing methods
    * Default: 'linear'
    */
  var easing: js.UndefOr[String] = js.native
  /**
    * Resistance when swiping edges of non-infinite carousels
    * Default: 0.15
    */
  var edgeFriction: js.UndefOr[Double] = js.native
  /**
    * Enable fade
    * Default: false
    */
  var fade: js.UndefOr[Boolean] = js.native
  /**
    * Puts focus on slide after change
    * Default: false
    */
  var focusOnChange: js.UndefOr[Boolean] = js.native
  /**
    * Enable focus on selected element (click)
    * Default: false
    */
  var focusOnSelect: js.UndefOr[Boolean] = js.native
  /**
    * Infinite loop sliding
    * Default: true
    */
  var infinite: js.UndefOr[Boolean] = js.native
  /**
    * Slide to start on
    * Default: 0
    */
  var initialSlide: js.UndefOr[Double] = js.native
  /**
    * Set lazy loading technique. Accepts 'ondemand' or 'progressive'.
    * Default: 'ondemand'
    */
  var lazyLoad: js.UndefOr[String] = js.native
  /**
    * Responsive settings use mobile first calculation
    * Default: false
    */
  var mobileFirst: js.UndefOr[Boolean] = js.native
  /**
    * Allows you to select a node or customize the HTML for the "Next" arrow.
    * Default: <button type="button" class="slick-next">Next</button>
    */
  var nextArrow: js.UndefOr[Element | JQuery | String] = js.native
  /**
    * Pause Autoplay when a dot is hovered
    * Default: false
    */
  var pauseOnDotsHover: js.UndefOr[Boolean] = js.native
  /**
    * Pause Autoplay On Focus
    * Default: true
    */
  var pauseOnFocus: js.UndefOr[Boolean] = js.native
  /**
    * Pause Autoplay On Hover
    * Default: true
    */
  var pauseOnHover: js.UndefOr[Boolean] = js.native
  /**
    * Allows you to select a node or customize the HTML for the "Previous" arrow.
    * Default: <button type="button" class="slick-prev">Previous</button>
    */
  var prevArrow: js.UndefOr[Element | JQuery | String] = js.native
  /**
    * Width that responsive object responds to. Can be 'window', 'slider' or 'min' (the smaller of the two)
    * Default: 'window'
    */
  var respondTo: js.UndefOr[String] = js.native
  /**
    * Object containing breakpoints and settings objects (see demo).
    * Enables settings sets at given screen width.
    * Set settings to "unslick" instead of an object to disable slick at a given breakpoint.
    * Default: none
    */
  var responsive: js.UndefOr[js.Object] = js.native
  /**
    * Setting this to more than 1 initializes grid mode. Use slidesPerRow to set how many slides should be in each row.
    * Default: 1
    */
  var rows: js.UndefOr[Double] = js.native
  /**
    * Change the slider's direction to become right-to-left
    * Default: false
    */
  var rtl: js.UndefOr[Boolean] = js.native
  /**
    * Element query to use as slide
    * Default: 'div'
    */
  var slide: js.UndefOr[String] = js.native
  /**
    * With grid mode intialized via the rows option, this sets how many slides are in each grid row.
    * Default: 1
    */
  var slidesPerRow: js.UndefOr[Double] = js.native
  /**
    * # of slides to scroll
    * Default: 1
    */
  var slidesToScroll: js.UndefOr[Double] = js.native
  /**
    * # of slides to show
    * Default: 1
    */
  var slidesToShow: js.UndefOr[Double] = js.native
  /**
    * Slide/Fade animation speed (ms)
    * Default: 300
    */
  var speed: js.UndefOr[Double] = js.native
  /**
    * Enable swiping
    * Default: true
    */
  var swipe: js.UndefOr[Boolean] = js.native
  /**
    * Allow users to drag or swipe directly to a slide irrespective of slidesToScroll.
    * Default: false
    */
  var swipeToSlide: js.UndefOr[Boolean] = js.native
  /**
    * Enable slide motion with touch
    * Default: true
    */
  var touchMove: js.UndefOr[Boolean] = js.native
  /**
    * To advance slides, the user must swipe a length of (1/touchThreshold) * the width of the slider.
    * Default: 5
    */
  var touchThreshold: js.UndefOr[Double] = js.native
  /**
    * Enable/Disable CSS Transitions
    * Default: true
    */
  var useCSS: js.UndefOr[Boolean] = js.native
  /**
    * Enable/Disable CSS Transforms
    * Default: true
    */
  var useTransform: js.UndefOr[Boolean] = js.native
  /**
    * Variable width slides.
    * Default: false
    */
  var variableWidth: js.UndefOr[Boolean] = js.native
  /**
    * Vertical slide mode
    * Default: false
    */
  var vertical: js.UndefOr[Boolean] = js.native
  /**
    * Vertical swipe mode
    * Default: false
    */
  var verticalSwiping: js.UndefOr[Boolean] = js.native
  /**
    * Change the slider's direction to become right-to-left
    * Default: false
    */
  var waitForAnimate: js.UndefOr[Boolean] = js.native
  /**
    * Set the zIndex values for slides, useful for IE9 and lower
    * Default: 1000
    */
  var zIndex: js.UndefOr[Double] = js.native
}

object JQuerySlickOptions {
  @scala.inline
  def apply(): JQuerySlickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQuerySlickOptions]
  }
  @scala.inline
  implicit class JQuerySlickOptionsOps[Self <: JQuerySlickOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessibility(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(js.undefined)
        ret
    }
    @scala.inline
    def withAdaptiveHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptiveHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdaptiveHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptiveHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendArrowsElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendArrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppendArrows(value: Element | js.Array[Element] | JQuery | String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendArrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendArrows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendArrows")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendDotsElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendDots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppendDots(value: Element | js.Array[Element] | JQuery | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendDots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendDots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendDots")(js.undefined)
        ret
    }
    @scala.inline
    def withArrows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrows")(js.undefined)
        ret
    }
    @scala.inline
    def withAsNavForElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asNavFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsNavFor(value: Element | JQuery | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asNavFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsNavFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asNavFor")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplay(value: Boolean): Self = {
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
    def withAutoplaySpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplaySpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplaySpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplaySpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterPadding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withCssEase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssEase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssEase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssEase")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomPaging(value: (/* slider */ js.Any, /* i */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customPaging")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCustomPaging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customPaging")(js.undefined)
        ret
    }
    @scala.inline
    def withDots(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dots")(js.undefined)
        ret
    }
    @scala.inline
    def withDotsClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotsClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotsClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotsClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeFriction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeFriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeFriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeFriction")(js.undefined)
        ret
    }
    @scala.inline
    def withFade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fade")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusOnChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOnChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOnChange")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusOnSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOnSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOnSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withInfinite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfinite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinite")(js.undefined)
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
    def withLazyLoad(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazyLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withNextArrowElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextArrow(value: Element | JQuery | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextArrow")(js.undefined)
        ret
    }
    @scala.inline
    def withPauseOnDotsHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnDotsHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseOnDotsHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnDotsHover")(js.undefined)
        ret
    }
    @scala.inline
    def withPauseOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withPauseOnHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseOnHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnHover")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevArrowElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevArrow(value: Element | JQuery | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevArrow")(js.undefined)
        ret
    }
    @scala.inline
    def withRespondTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("respondTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRespondTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("respondTo")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsive(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withRtl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(js.undefined)
        ret
    }
    @scala.inline
    def withSlide(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide")(js.undefined)
        ret
    }
    @scala.inline
    def withSlidesPerRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesPerRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlidesPerRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesPerRow")(js.undefined)
        ret
    }
    @scala.inline
    def withSlidesToScroll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesToScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlidesToScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesToScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withSlidesToShow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesToShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlidesToShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesToShow")(js.undefined)
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
    def withSwipe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeToSlide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeToSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeToSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeToSlide")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchMove")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCSS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCSS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCSS")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTransform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withVariableWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariableWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalSwiping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalSwiping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalSwiping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalSwiping")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForAnimate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForAnimate")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

