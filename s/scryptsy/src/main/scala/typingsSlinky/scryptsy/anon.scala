package typingsSlinky.scryptsy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Current extends StObject {
    
    var current: Double = js.native
    
    var percent: Double = js.native
    
    var total: Double = js.native
  }
  object Current {
    
    @scala.inline
    def apply(current: Double, percent: Double, total: Double): Current = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Current]
    }
    
    @scala.inline
    implicit class CurrentMutableBuilder[Self <: Current] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
