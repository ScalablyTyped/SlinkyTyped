package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.exprMod.Expr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.signalMod.SignalRef
  - typingsSlinky.vegaTypings.transformMod.FieldParam
  - typingsSlinky.vegaTypings.exprMod.ExprRef
*/
trait TransformField extends StObject
object TransformField {
  
  @scala.inline
  def ExprRef(expr: Expr): typingsSlinky.vegaTypings.exprMod.ExprRef = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.exprMod.ExprRef]
  }
  
  @scala.inline
  def FieldParam(field: String): typingsSlinky.vegaTypings.transformMod.FieldParam = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.transformMod.FieldParam]
  }
  
  @scala.inline
  def SignalRef(signal: String): typingsSlinky.vegaTypings.signalMod.SignalRef = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.signalMod.SignalRef]
  }
}
