package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.onEventsMod._Update
import typingsSlinky.vegaTypings.transformMod.TransformField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exprMod {
  
  type Expr = String
  
  @js.native
  trait ExprRef
    extends TransformField
       with _Update {
    
    var expr: Expr = js.native
  }
  object ExprRef {
    
    @scala.inline
    def apply(expr: Expr): ExprRef = {
      val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExprRef]
    }
    
    @scala.inline
    implicit class ExprRefMutableBuilder[Self <: ExprRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpr(value: Expr): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    }
  }
}
