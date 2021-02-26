package typingsSlinky.viewabilityHelper

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("viewability-helper", "ViewabilityHelper")
  @js.native
  class ViewabilityHelper protected () extends StObject {
    def this(element: Element, callback: js.Function0[Unit]) = this()
    def this(element: HTMLElement, callback: js.Function0[Unit]) = this()
    def this(element: Element, callback: js.Function0[Unit], options: Options) = this()
    def this(element: HTMLElement, callback: js.Function0[Unit], options: Options) = this()
    
    def observe(): Unit = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var callbackParams: js.UndefOr[js.Array[_]] = js.native
    
    var intersectionPercentage: js.UndefOr[Double] = js.native
    
    var rootMargin: js.UndefOr[String] = js.native
    
    var scrollDimmer: js.UndefOr[Double] = js.native
    
    var threshold: js.UndefOr[js.Array[Double]] = js.native
    
    var unobserve: js.UndefOr[Boolean] = js.native
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
      def setCallbackParams(value: js.Array[_]): Self = StObject.set(x, "callbackParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackParamsUndefined: Self = StObject.set(x, "callbackParams", js.undefined)
      
      @scala.inline
      def setCallbackParamsVarargs(value: js.Any*): Self = StObject.set(x, "callbackParams", js.Array(value :_*))
      
      @scala.inline
      def setIntersectionPercentage(value: Double): Self = StObject.set(x, "intersectionPercentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntersectionPercentageUndefined: Self = StObject.set(x, "intersectionPercentage", js.undefined)
      
      @scala.inline
      def setRootMargin(value: String): Self = StObject.set(x, "rootMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootMarginUndefined: Self = StObject.set(x, "rootMargin", js.undefined)
      
      @scala.inline
      def setScrollDimmer(value: Double): Self = StObject.set(x, "scrollDimmer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollDimmerUndefined: Self = StObject.set(x, "scrollDimmer", js.undefined)
      
      @scala.inline
      def setThreshold(value: js.Array[Double]): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      @scala.inline
      def setThresholdVarargs(value: Double*): Self = StObject.set(x, "threshold", js.Array(value :_*))
      
      @scala.inline
      def setUnobserve(value: Boolean): Self = StObject.set(x, "unobserve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnobserveUndefined: Self = StObject.set(x, "unobserve", js.undefined)
    }
  }
}
