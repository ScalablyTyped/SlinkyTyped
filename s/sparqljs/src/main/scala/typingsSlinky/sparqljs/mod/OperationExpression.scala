package typingsSlinky.sparqljs.mod

import typingsSlinky.sparqljs.sparqljsStrings.operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationExpression
  extends BaseExpression
     with Expression {
  var args: js.Array[Expression] = js.native
  var operator: String = js.native
  @JSName("type")
  var type_OperationExpression: operation = js.native
}

object OperationExpression {
  @scala.inline
  def apply(args: js.Array[Expression], operator: String, `type`: operation): OperationExpression = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationExpression]
  }
  @scala.inline
  implicit class OperationExpressionOps[Self <: OperationExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[Expression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: operation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

