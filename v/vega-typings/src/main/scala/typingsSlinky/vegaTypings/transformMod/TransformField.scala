package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.exprMod.Expr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.signalMod.SignalRef
  - typingsSlinky.vegaTypings.transformMod.FieldParam
  - typingsSlinky.vegaTypings.exprMod.ExprRef
*/
trait TransformField extends js.Object
object TransformField {
  
  @scala.inline
  def SignalRef(signal: String): TransformField = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformField]
  }
  
  @scala.inline
  def FieldParam(field: String): TransformField = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformField]
  }
  
  @scala.inline
  def ExprRef(expr: Expr): TransformField = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformField]
  }
}
