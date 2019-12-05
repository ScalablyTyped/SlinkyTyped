package typingsSlinky.slickDashCarousel

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.slickDashCarousel.slickDashCarouselNumbers.`false`
import typingsSlinky.slickDashCarousel.slickDashCarouselStrings.MozTransform
import typingsSlinky.slickDashCarousel.slickDashCarouselStrings.MozTransition
import typingsSlinky.slickDashCarousel.slickDashCarouselStrings.OTransform
import typingsSlinky.slickDashCarousel.slickDashCarouselStrings.OTransition
import typingsSlinky.slickDashCarousel.slickDashCarouselStrings.`-moz-transform`
import typingsSlinky.slickDashCarousel.slickDashCarouselStrings.`-ms-transform`
import typingsSlinky.slickDashCarousel.slickDashCarouselStrings.`-o-transform`
import typingsSlinky.slickDashCarousel.slickDashCarouselStrings.`-webkit-transform`
import typingsSlinky.slickDashCarousel.slickDashCarouselStrings.left
import typingsSlinky.slickDashCarousel.slickDashCarouselStrings.min
import typingsSlinky.slickDashCarousel.slickDashCarouselStrings.mozHidden
import typingsSlinky.slickDashCarousel.slickDashCarouselStrings.mozvisibilitychange
import typingsSlinky.slickDashCarousel.slickDashCarouselStrings.msTransform
import typingsSlinky.slickDashCarousel.slickDashCarouselStrings.msTransition
import typingsSlinky.slickDashCarousel.slickDashCarouselStrings.slider
import typingsSlinky.slickDashCarousel.slickDashCarouselStrings.top
import typingsSlinky.slickDashCarousel.slickDashCarouselStrings.transform
import typingsSlinky.slickDashCarousel.slickDashCarouselStrings.transition
import typingsSlinky.slickDashCarousel.slickDashCarouselStrings.visibilitychange
import typingsSlinky.slickDashCarousel.slickDashCarouselStrings.webkitHidden
import typingsSlinky.slickDashCarousel.slickDashCarouselStrings.webkitTransform
import typingsSlinky.slickDashCarousel.slickDashCarouselStrings.webkitTransition
import typingsSlinky.slickDashCarousel.slickDashCarouselStrings.webkitvisibilitychange
import typingsSlinky.slickDashCarousel.slickDashCarouselStrings.window
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
  var hidden: mozHidden | webkitHidden | typingsSlinky.slickDashCarousel.slickDashCarouselStrings.hidden = js.native
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

