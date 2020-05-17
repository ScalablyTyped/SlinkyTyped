package typingsSlinky.sqlBricks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhereGroup extends WhereExpression {
  var expressions: js.Array[WhereExpression] = js.native
  var op: js.UndefOr[String] = js.native
}

object WhereGroup {
  @scala.inline
  def apply(expressions: js.Array[WhereExpression]): WhereGroup = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhereGroup]
  }
  @scala.inline
  implicit class WhereGroupOps[Self <: WhereGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpressions(value: js.Array[WhereExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("op")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("op")(js.undefined)
        ret
    }
  }
  
}

