package typingsSlinky.yosay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait MaxLength extends StObject {
    
    var maxLength: Double = js.native
  }
  object MaxLength {
    
    @scala.inline
    def apply(maxLength: Double): MaxLength = {
      val __obj = js.Dynamic.literal(maxLength = maxLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxLength]
    }
    
    @scala.inline
    implicit class MaxLengthMutableBuilder[Self <: MaxLength] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    }
  }
}
