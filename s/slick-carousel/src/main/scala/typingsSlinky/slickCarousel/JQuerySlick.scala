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

