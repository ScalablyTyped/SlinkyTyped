package typingsSlinky.sparqljs.mod

import typingsSlinky.sparqljs.sparqljsStrings.aggregate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregateExpression
  extends BaseExpression
     with Expression {
  var aggregation: String = js.native
  var expression: Expression = js.native
  var separator: js.UndefOr[String] = js.native
  @JSName("type")
  var type_AggregateExpression: aggregate = js.native
}

object AggregateExpression {
  @scala.inline
  def apply(aggregation: String, expression: Expression, `type`: aggregate): AggregateExpression = {
    val __obj = js.Dynamic.literal(aggregation = aggregation.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateExpression]
  }
  @scala.inline
  implicit class AggregateExpressionOps[Self <: AggregateExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpression(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: aggregate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
  }
  
}

