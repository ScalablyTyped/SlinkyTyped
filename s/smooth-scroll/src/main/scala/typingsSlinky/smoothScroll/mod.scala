package typingsSlinky.smoothScroll

import org.scalajs.dom.raw.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("smooth-scroll", JSImport.Namespace)
  @js.native
  class ^ () extends SmoothScroll {
    def this(selector: String) = this()
    def this(selector: js.UndefOr[scala.Nothing], options: Options) = this()
    def this(selector: String, options: Options) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.smoothScroll.smoothScrollStrings.Linear
    - typingsSlinky.smoothScroll.smoothScrollStrings.easeInQuad
    - typingsSlinky.smoothScroll.smoothScrollStrings.easeInCubic
    - typingsSlinky.smoothScroll.smoothScrollStrings.easeInQuart
    - typingsSlinky.smoothScroll.smoothScrollStrings.easeInQuint
    - typingsSlinky.smoothScroll.smoothScrollStrings.easeInOutQuad
    - typingsSlinky.smoothScroll.smoothScrollStrings.easeInOutCubic
    - typingsSlinky.smoothScroll.smoothScrollStrings.easeInOutQuart
    - typingsSlinky.smoothScroll.smoothScrollStrings.easeInOutQuint
    - typingsSlinky.smoothScroll.smoothScrollStrings.easeOutQuad
    - typingsSlinky.smoothScroll.smoothScrollStrings.easeOutCubic
    - typingsSlinky.smoothScroll.smoothScrollStrings.easeOutQuart
    - typingsSlinky.smoothScroll.smoothScrollStrings.easeOutQuint
  */
  trait Easing extends StObject
  object Easing {
    
    @scala.inline
    def Linear: typingsSlinky.smoothScroll.smoothScrollStrings.Linear = "Linear".asInstanceOf[typingsSlinky.smoothScroll.smoothScrollStrings.Linear]
    
    @scala.inline
    def easeInCubic: typingsSlinky.smoothScroll.smoothScrollStrings.easeInCubic = "easeInCubic".asInstanceOf[typingsSlinky.smoothScroll.smoothScrollStrings.easeInCubic]
    
    @scala.inline
    def easeInOutCubic: typingsSlinky.smoothScroll.smoothScrollStrings.easeInOutCubic = "easeInOutCubic".asInstanceOf[typingsSlinky.smoothScroll.smoothScrollStrings.easeInOutCubic]
    
    @scala.inline
    def easeInOutQuad: typingsSlinky.smoothScroll.smoothScrollStrings.easeInOutQuad = "easeInOutQuad".asInstanceOf[typingsSlinky.smoothScroll.smoothScrollStrings.easeInOutQuad]
    
    @scala.inline
    def easeInOutQuart: typingsSlinky.smoothScroll.smoothScrollStrings.easeInOutQuart = "easeInOutQuart".asInstanceOf[typingsSlinky.smoothScroll.smoothScrollStrings.easeInOutQuart]
    
    @scala.inline
    def easeInOutQuint: typingsSlinky.smoothScroll.smoothScrollStrings.easeInOutQuint = "easeInOutQuint".asInstanceOf[typingsSlinky.smoothScroll.smoothScrollStrings.easeInOutQuint]
    
    @scala.inline
    def easeInQuad: typingsSlinky.smoothScroll.smoothScrollStrings.easeInQuad = "easeInQuad".asInstanceOf[typingsSlinky.smoothScroll.smoothScrollStrings.easeInQuad]
    
    @scala.inline
    def easeInQuart: typingsSlinky.smoothScroll.smoothScrollStrings.easeInQuart = "easeInQuart".asInstanceOf[typingsSlinky.smoothScroll.smoothScrollStrings.easeInQuart]
    
    @scala.inline
    def easeInQuint: typingsSlinky.smoothScroll.smoothScrollStrings.easeInQuint = "easeInQuint".asInstanceOf[typingsSlinky.smoothScroll.smoothScrollStrings.easeInQuint]
    
    @scala.inline
    def easeOutCubic: typingsSlinky.smoothScroll.smoothScrollStrings.easeOutCubic = "easeOutCubic".asInstanceOf[typingsSlinky.smoothScroll.smoothScrollStrings.easeOutCubic]
    
    @scala.inline
    def easeOutQuad: typingsSlinky.smoothScroll.smoothScrollStrings.easeOutQuad = "easeOutQuad".asInstanceOf[typingsSlinky.smoothScroll.smoothScrollStrings.easeOutQuad]
    
    @scala.inline
    def easeOutQuart: typingsSlinky.smoothScroll.smoothScrollStrings.easeOutQuart = "easeOutQuart".asInstanceOf[typingsSlinky.smoothScroll.smoothScrollStrings.easeOutQuart]
    
    @scala.inline
    def easeOutQuint: typingsSlinky.smoothScroll.smoothScrollStrings.easeOutQuint = "easeOutQuint".asInstanceOf[typingsSlinky.smoothScroll.smoothScrollStrings.easeOutQuint]
  }
  
  @js.native
  trait Options extends StObject {
    
    var clip: js.UndefOr[Boolean] = js.native
    
    var customEasing: js.UndefOr[js.Function1[/* time */ Double, Double]] = js.native
    
    var durationMax: js.UndefOr[Double | Null] = js.native
    
    var durationMin: js.UndefOr[Double | Null] = js.native
    
    var easing: js.UndefOr[Easing] = js.native
    
    // Custom Events
    var emitEvents: js.UndefOr[Boolean] = js.native
    
    var header: js.UndefOr[String] = js.native
    
    // Selectors
    var ignore: js.UndefOr[String] = js.native
    
    var offset: js.UndefOr[
        Double | (js.Function2[
          /* anchor */ js.UndefOr[Element | Double | Null], 
          /* toggle */ js.UndefOr[Element | Null], 
          Double
        ])
      ] = js.native
    
    var popstate: js.UndefOr[Boolean] = js.native
    
    // Speed & Easing
    var speed: js.UndefOr[Double] = js.native
    
    var speedAsDuration: js.UndefOr[Boolean] = js.native
    
    var topOnEmptyHash: js.UndefOr[Boolean] = js.native
    
    // History
    var updateURL: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClip(value: Boolean): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      @scala.inline
      def setCustomEasing(value: /* time */ Double => Double): Self = StObject.set(x, "customEasing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomEasingUndefined: Self = StObject.set(x, "customEasing", js.undefined)
      
      @scala.inline
      def setDurationMax(value: Double): Self = StObject.set(x, "durationMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationMaxNull: Self = StObject.set(x, "durationMax", null)
      
      @scala.inline
      def setDurationMaxUndefined: Self = StObject.set(x, "durationMax", js.undefined)
      
      @scala.inline
      def setDurationMin(value: Double): Self = StObject.set(x, "durationMin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationMinNull: Self = StObject.set(x, "durationMin", null)
      
      @scala.inline
      def setDurationMinUndefined: Self = StObject.set(x, "durationMin", js.undefined)
      
      @scala.inline
      def setEasing(value: Easing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setEmitEvents(value: Boolean): Self = StObject.set(x, "emitEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitEventsUndefined: Self = StObject.set(x, "emitEvents", js.undefined)
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setIgnore(value: String): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setOffset(
        value: Double | (js.Function2[
              /* anchor */ js.UndefOr[Element | Double | Null], 
              /* toggle */ js.UndefOr[Element | Null], 
              Double
            ])
      ): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetFunction2(
        value: (/* anchor */ js.UndefOr[Element | Double | Null], /* toggle */ js.UndefOr[Element | Null]) => Double
      ): Self = StObject.set(x, "offset", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPopstate(value: Boolean): Self = StObject.set(x, "popstate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopstateUndefined: Self = StObject.set(x, "popstate", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedAsDuration(value: Boolean): Self = StObject.set(x, "speedAsDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedAsDurationUndefined: Self = StObject.set(x, "speedAsDuration", js.undefined)
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      @scala.inline
      def setTopOnEmptyHash(value: Boolean): Self = StObject.set(x, "topOnEmptyHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopOnEmptyHashUndefined: Self = StObject.set(x, "topOnEmptyHash", js.undefined)
      
      @scala.inline
      def setUpdateURL(value: Boolean): Self = StObject.set(x, "updateURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateURLUndefined: Self = StObject.set(x, "updateURL", js.undefined)
    }
  }
  
  @js.native
  trait SmoothScroll extends StObject {
    
    def animateScroll(): Unit = js.native
    def animateScroll(anchor: Element): Unit = js.native
    def animateScroll(anchor: Element, toggle: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
    def animateScroll(anchor: Element, toggle: Element): Unit = js.native
    def animateScroll(anchor: Element, toggle: Element, options: Options): Unit = js.native
    def animateScroll(anchor: Element, toggle: Null, options: Options): Unit = js.native
    def animateScroll(anchor: Double): Unit = js.native
    def animateScroll(anchor: Double, toggle: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
    def animateScroll(anchor: Double, toggle: Element): Unit = js.native
    def animateScroll(anchor: Double, toggle: Element, options: Options): Unit = js.native
    def animateScroll(anchor: Double, toggle: Null, options: Options): Unit = js.native
    def animateScroll(anchor: Null, toggle: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
    def animateScroll(anchor: Null, toggle: Element): Unit = js.native
    def animateScroll(anchor: Null, toggle: Element, options: Options): Unit = js.native
    def animateScroll(anchor: Null, toggle: Null, options: Options): Unit = js.native
    
    def cancelScroll(): Unit = js.native
    def cancelScroll(noEvent: Boolean): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def init(): Unit = js.native
    def init(options: Options): Unit = js.native
  }
}
