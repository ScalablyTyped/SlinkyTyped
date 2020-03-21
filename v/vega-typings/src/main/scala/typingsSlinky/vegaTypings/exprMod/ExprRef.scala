package typingsSlinky.vegaTypings.exprMod

import typingsSlinky.vegaTypings.onEventsMod._Update
import typingsSlinky.vegaTypings.transformMod.TransformField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExprRef
  extends TransformField
     with _Update {
  var expr: Expr
}

object ExprRef {
  @scala.inline
  def apply(expr: Expr): ExprRef = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExprRef]
  }
}

