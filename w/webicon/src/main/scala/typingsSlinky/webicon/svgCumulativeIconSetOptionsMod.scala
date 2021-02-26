package typingsSlinky.webicon

import typingsSlinky.webicon.iconSetOptionsMod.IconSetOptions
import typingsSlinky.webicon.webiconBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgCumulativeIconSetOptionsMod {
  
  @js.native
  trait SvgCumulativeIconSetOptions extends IconSetOptions {
    
    @JSName("cumulative")
    var cumulative_SvgCumulativeIconSetOptions: `true` = js.native
    
    /**
      * The amount of miliseconds to wait before downloading the icons.
      */
    var waitDuration: js.UndefOr[Double] = js.native
  }
  object SvgCumulativeIconSetOptions {
    
    @scala.inline
    def apply(cumulative: `true`): SvgCumulativeIconSetOptions = {
      val __obj = js.Dynamic.literal(cumulative = cumulative.asInstanceOf[js.Any])
      __obj.asInstanceOf[SvgCumulativeIconSetOptions]
    }
    
    @scala.inline
    implicit class SvgCumulativeIconSetOptionsMutableBuilder[Self <: SvgCumulativeIconSetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCumulative(value: `true`): Self = StObject.set(x, "cumulative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitDuration(value: Double): Self = StObject.set(x, "waitDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitDurationUndefined: Self = StObject.set(x, "waitDuration", js.undefined)
    }
  }
}
