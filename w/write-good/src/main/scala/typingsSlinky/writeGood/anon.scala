package typingsSlinky.writeGood

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Explanation extends StObject {
    
    var explanation: String = js.native
    
    var fn: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WriteGood */ js.Any = js.native
  }
  object Explanation {
    
    @scala.inline
    def apply(
      explanation: String,
      fn: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WriteGood */ js.Any
    ): Explanation = {
      val __obj = js.Dynamic.literal(explanation = explanation.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
      __obj.asInstanceOf[Explanation]
    }
    
    @scala.inline
    implicit class ExplanationMutableBuilder[Self <: Explanation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFn(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WriteGood */ js.Any): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    }
  }
}
