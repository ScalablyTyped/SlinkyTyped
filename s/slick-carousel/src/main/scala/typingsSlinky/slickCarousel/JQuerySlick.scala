package typingsSlinky.slickCarousel

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.slickCarousel.slickCarouselBooleans.`false`
import typingsSlinky.slickCarousel.slickCarouselStrings.MozTransform
import typingsSlinky.slickCarousel.slickCarouselStrings.MozTransition
import typingsSlinky.slickCarousel.slickCarouselStrings.OTransform
import typingsSlinky.slickCarousel.slickCarouselStrings.OTransition
import typingsSlinky.slickCarousel.slickCarouselStrings.`-moz-transform`
import typingsSlinky.slickCarousel.slickCarouselStrings.`-ms-transform`
import typingsSlinky.slickCarousel.slickCarouselStrings.`-o-transform`
import typingsSlinky.slickCarousel.slickCarouselStrings.`-webkit-transform`
import typingsSlinky.slickCarousel.slickCarouselStrings.hidden
import typingsSlinky.slickCarousel.slickCarouselStrings.left
import typingsSlinky.slickCarousel.slickCarouselStrings.min
import typingsSlinky.slickCarousel.slickCarouselStrings.mozHidden
import typingsSlinky.slickCarousel.slickCarouselStrings.mozvisibilitychange
import typingsSlinky.slickCarousel.slickCarouselStrings.msTransform
import typingsSlinky.slickCarousel.slickCarouselStrings.msTransition
import typingsSlinky.slickCarousel.slickCarouselStrings.slider
import typingsSlinky.slickCarousel.slickCarouselStrings.top
import typingsSlinky.slickCarousel.slickCarouselStrings.transform
import typingsSlinky.slickCarousel.slickCarouselStrings.transition
import typingsSlinky.slickCarousel.slickCarouselStrings.visibilitychange
import typingsSlinky.slickCarousel.slickCarouselStrings.webkitHidden
import typingsSlinky.slickCarousel.slickCarouselStrings.webkitTransform
import typingsSlinky.slickCarousel.slickCarouselStrings.webkitTransition
import typingsSlinky.slickCarousel.slickCarouselStrings.webkitvisibilitychange
import typingsSlinky.slickCarousel.slickCarouselStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuerySlick extends JQuerySlickInitials {
  /**
    * Default: $(element)
    */
  @JSName("$slider")
  var $slider: JQuery = js.native
  /**
    * Default: null
    */
  @JSName("$slidesCache")
  var $slidesCache: JQuery | Null = js.native
  /**
    * Default: null
    */
  var activeBreakpoint: Double | Null = js.native
  /**
    * Default: null
    */
  var animProp: Null = js.native
  /**
    * Default: null
    */
  var animType: OTransform | MozTransform | webkitTransform | msTransform | transform | `false` | Null = js.native
  /**
    * Default: {}
    */
  var breakpointSettings: NumberDictionary[JQuerySlickOptions] = js.native
  /**
    * Default: []
    */
  var breakpoints: js.Array[Double] = js.native
  /**
    * Default: false
    */
  var cssTransitions: Boolean = js.native
  var defaults: JQuerySlickOptions = js.native
  /**
    * Default: false
    */
  var focussed: Boolean = js.native
  /**
    * Default: 'hidden'
    */
  var hidden: mozHidden | webkitHidden | typingsSlinky.slickCarousel.slickCarouselStrings.hidden = js.native
  var initials: JQuerySlickInitials = js.native
  /**
    * Default: false
    */
  var interrupted: Boolean = js.native
  var options: JQuerySlickOptions = js.native
  var originalSettings: JQuerySlickOptions = js.native
  /**
    * Default: true
    */
  var paused: Boolean = js.native
  /**
    * Default: null
    */
  var positionProp: top | left | Null = js.native
  /**
    * Default: null
    */
  var respondTo: window | slider | min | Null = js.native
  /**
    * Default: 1
    */
  var rowCount: Double = js.native
  /**
    * Default: true
    */
  var shouldClick: Boolean = js.native
  /**
    * Default: null
    */
  var transformType: `-o-transform` | `-moz-transform` | `-webkit-transform` | `-ms-transform` | transition | Null = js.native
  /**
    * Default: null
    */
  var transitionType: OTransition | MozTransition | webkitTransition | msTransition | transition | Null = js.native
  /**
    * Default: 'visibilitychange'
    */
  var visibilityChange: visibilitychange | mozvisibilitychange | webkitvisibilitychange = js.native
  /**
    * Default: null
    */
  var windowTimer: Double | Null = js.native
  /**
    * Default: 0
    */
  var windowWidth: Double = js.native
}

object JQuerySlick {
  @scala.inline
  def apply(
    $list: Null,
    $slider: JQuery,
    animProp: Null,
    animating: Boolean,
    breakpointSettings: NumberDictionary[JQuerySlickOptions],
    breakpoints: js.Array[Double],
    cssTransitions: Boolean,
    currentDirection: Double,
    currentSlide: Double,
    defaults: JQuerySlickOptions,
    direction: Double,
    dragging: Boolean,
    focussed: Boolean,
    hidden: mozHidden | webkitHidden | hidden,
    initials: JQuerySlickInitials,
    interrupted: Boolean,
    loadIndex: Double,
    options: JQuerySlickOptions,
    originalSettings: JQuerySlickOptions,
    paused: Boolean,
    rowCount: Double,
    scrolling: Boolean,
    shouldClick: Boolean,
    slideOffset: Double,
    sliding: Boolean,
    swiping: Boolean,
    touchObject: AnonCurX,
    transformsEnabled: Boolean,
    unslicked: Boolean,
    visibilityChange: visibilitychange | mozvisibilitychange | webkitvisibilitychange,
    windowWidth: Double
  ): JQuerySlick = {
    val __obj = js.Dynamic.literal($list = $list.asInstanceOf[js.Any], $slider = $slider.asInstanceOf[js.Any], animProp = animProp.asInstanceOf[js.Any], animating = animating.asInstanceOf[js.Any], breakpointSettings = breakpointSettings.asInstanceOf[js.Any], breakpoints = breakpoints.asInstanceOf[js.Any], cssTransitions = cssTransitions.asInstanceOf[js.Any], currentDirection = currentDirection.asInstanceOf[js.Any], currentSlide = currentSlide.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], focussed = focussed.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], initials = initials.asInstanceOf[js.Any], interrupted = interrupted.asInstanceOf[js.Any], loadIndex = loadIndex.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], originalSettings = originalSettings.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any], shouldClick = shouldClick.asInstanceOf[js.Any], slideOffset = slideOffset.asInstanceOf[js.Any], sliding = sliding.asInstanceOf[js.Any], swiping = swiping.asInstanceOf[js.Any], touchObject = touchObject.asInstanceOf[js.Any], transformsEnabled = transformsEnabled.asInstanceOf[js.Any], unslicked = unslicked.asInstanceOf[js.Any], visibilityChange = visibilityChange.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuerySlick]
  }
  @scala.inline
  implicit class JQuerySlickOps[Self <: JQuerySlick] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$slider(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$slider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimProp(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBreakpointSettings(value: NumberDictionary[JQuerySlickOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpointSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBreakpoints(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCssTransitions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssTransitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaults(value: JQuerySlickOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocussed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focussed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHidden(value: mozHidden | webkitHidden | hidden): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitials(value: JQuerySlickInitials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterrupted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interrupted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: JQuerySlickOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalSettings(value: JQuerySlickOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibilityChange(value: visibilitychange | mozvisibilitychange | webkitvisibilitychange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibilityChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$slidesCache(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$slidesCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$slidesCacheNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$slidesCache")(null)
        ret
    }
    @scala.inline
    def withActiveBreakpoint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeBreakpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveBreakpointNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeBreakpoint")(null)
        ret
    }
    @scala.inline
    def withAnimType(value: OTransform | MozTransform | webkitTransform | msTransform | transform | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animType")(null)
        ret
    }
    @scala.inline
    def withPositionProp(value: top | left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionPropNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionProp")(null)
        ret
    }
    @scala.inline
    def withRespondTo(value: window | slider | min): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("respondTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRespondToNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("respondTo")(null)
        ret
    }
    @scala.inline
    def withTransformType(value: `-o-transform` | `-moz-transform` | `-webkit-transform` | `-ms-transform` | transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformType")(null)
        ret
    }
    @scala.inline
    def withTransitionType(value: OTransition | MozTransition | webkitTransition | msTransition | transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitionTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionType")(null)
        ret
    }
    @scala.inline
    def withWindowTimer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowTimer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowTimerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowTimer")(null)
        ret
    }
  }
  
}

