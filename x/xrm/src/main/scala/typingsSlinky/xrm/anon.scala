package typingsSlinky.xrm

import typingsSlinky.xrm.XrmEnum.StageCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait GetValue extends StObject {
    
    def getValue(): StageCategory = js.native
  }
  object GetValue {
    
    @scala.inline
    def apply(getValue: () => StageCategory): GetValue = {
      val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue))
      __obj.asInstanceOf[GetValue]
    }
    
    @scala.inline
    implicit class GetValueMutableBuilder[Self <: GetValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetValue(value: () => StageCategory): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    }
  }
}
