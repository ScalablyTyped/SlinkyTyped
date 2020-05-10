package typingsSlinky.vegaTypings.exprMod

import typingsSlinky.vegaTypings.onEventsMod._Update
import typingsSlinky.vegaTypings.transformMod.TransformField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ExprRefOps[Self <: ExprRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpr(value: Expr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expr")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

