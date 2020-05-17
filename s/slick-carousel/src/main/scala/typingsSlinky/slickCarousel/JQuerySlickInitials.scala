package typingsSlinky.slickCarousel

import typingsSlinky.slickCarousel.anon.CurX
import typingsSlinky.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuerySlickInitials extends js.Object {
  /**
    * jQuery instance that contains the "dots".
    * Default: null
    */
  @JSName("$dots")
  var $dots: JQuery | Null = js.native
  /**
    * jQuery instance that contains the "list".
    * Default: null
    */
  @JSName("$list")
  var $list: Null = js.native
  /**
    * jQuery instance that contains the "next arrow".
    * Default: null
    */
  @JSName("$nextArrow")
  var $nextArrow: JQuery | Null = js.native
  /**
    * jQuery instance that contains the "prev arrow".
    * Default: null
    */
  @JSName("$prevArrow")
  var $prevArrow: JQuery | Null = js.native
  /**
    * jQuery instance that contains the "slide track".
    * Default: null
    */
  @JSName("$slideTrack")
  var $slideTrack: JQuery | Null = js.native
  /**
    * jQuery instance that contains the "slides".
    * Default: null
    */
  @JSName("$slides")
  var $slides: JQuery | Null = js.native
  /**
    * When there is an animation running.
    * Default: false
    */
  var animating: Boolean = js.native
  /**
    * Internal `setInterval` identifier.
    * Default: null
    */
  var autoPlayTimer: Double | Null = js.native
  /**
    * The current direction (`0` for left and down, `1` for right and up).
    * Default: 0
    */
  var currentDirection: Double = js.native
  /**
    * Default: null
    */
  var currentLeft: Double | Null = js.native
  /**
    * The index of the current slide.
    * Default: 0
    */
  var currentSlide: Double = js.native
  /**
    * The direction (`0` for left and down, `1` for right and up).
    * Default: null
    */
  var direction: Double = js.native
  /**
    * When they user is dragging a slide.
    * Default: false
    */
  var dragging: Boolean = js.native
  /**
    * The list's height in pixels.
    * Default: null
    */
  var listHeight: Double | Null = js.native
  /**
    * The list's width in pixels.
    * Default: null
    */
  var listWidth: Double | Null = js.native
  /**
    * (actually it's not used in Slick, so I don't know what it is...)
    * Default: 0
    */
  var loadIndex: Double = js.native
  /**
    * When they user is scrolling a slide.
    * Default: false
    */
  var scrolling: Boolean = js.native
  /**
    * The number of slides.
    * Default: null
    */
  var slideCount: Double | Null = js.native
  /**
    * Slide offset in pixels.
    * Default: 0
    */
  var slideOffset: Double = js.native
  /**
    * The slide's width in pixels.
    * Default: null
    */
  var slideWidth: Number | Null = js.native
  /**
    * When the slider is sliding.
    * Default: false
    */
  var sliding: Boolean = js.native
  /**
    * Default: null
    */
  var swipeLeft: Double | Null = js.native
  /**
    * Default: false
    */
  var swiping: Boolean = js.native
  /**
    * Object that contains properties relative to "touch" behavior.
    */
  var touchObject: CurX = js.native
  /**
    * Default: false
    */
  var transformsEnabled: Boolean = js.native
  /**
    * Default: false
    */
  var unslicked: Boolean = js.native
}

object JQuerySlickInitials {
  @scala.inline
  def apply(
    $list: Null,
    animating: Boolean,
    currentDirection: Double,
    currentSlide: Double,
    direction: Double,
    dragging: Boolean,
    loadIndex: Double,
    scrolling: Boolean,
    slideOffset: Double,
    sliding: Boolean,
    swiping: Boolean,
    touchObject: CurX,
    transformsEnabled: Boolean,
    unslicked: Boolean
  ): JQuerySlickInitials = {
    val __obj = js.Dynamic.literal($list = $list.asInstanceOf[js.Any], animating = animating.asInstanceOf[js.Any], currentDirection = currentDirection.asInstanceOf[js.Any], currentSlide = currentSlide.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], loadIndex = loadIndex.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any], slideOffset = slideOffset.asInstanceOf[js.Any], sliding = sliding.asInstanceOf[js.Any], swiping = swiping.asInstanceOf[js.Any], touchObject = touchObject.asInstanceOf[js.Any], transformsEnabled = transformsEnabled.asInstanceOf[js.Any], unslicked = unslicked.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuerySlickInitials]
  }
  @scala.inline
  implicit class JQuerySlickInitialsOps[Self <: JQuerySlickInitials] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$list(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentDirection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentSlide(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSliding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwiping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swiping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchObject(value: CurX): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnslicked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unslicked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$dots(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$dots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$dotsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$dots")(null)
        ret
    }
    @scala.inline
    def with$nextArrow(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$nextArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$nextArrowNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$nextArrow")(null)
        ret
    }
    @scala.inline
    def with$prevArrow(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$prevArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$prevArrowNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$prevArrow")(null)
        ret
    }
    @scala.inline
    def with$slideTrack(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$slideTrack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$slideTrackNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$slideTrack")(null)
        ret
    }
    @scala.inline
    def with$slides(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$slides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$slidesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$slides")(null)
        ret
    }
    @scala.inline
    def withAutoPlayTimer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlayTimer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoPlayTimerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlayTimer")(null)
        ret
    }
    @scala.inline
    def withCurrentLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentLeftNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentLeft")(null)
        ret
    }
    @scala.inline
    def withListHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListHeightNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listHeight")(null)
        ret
    }
    @scala.inline
    def withListWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListWidthNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listWidth")(null)
        ret
    }
    @scala.inline
    def withSlideCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideCountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideCount")(null)
        ret
    }
    @scala.inline
    def withSlideWidth(value: Number): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideWidthNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideWidth")(null)
        ret
    }
    @scala.inline
    def withSwipeLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipeLeftNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeLeft")(null)
        ret
    }
  }
  
}

