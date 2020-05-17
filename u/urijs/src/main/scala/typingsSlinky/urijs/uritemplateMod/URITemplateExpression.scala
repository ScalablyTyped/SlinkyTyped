package typingsSlinky.urijs.uritemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait URITemplateExpression extends URITemplatePart {
  var expression: String = js.native
  var operator: String = js.native
  var variables: js.Array[URITemplateVariable] = js.native
}

object URITemplateExpression {
  @scala.inline
  def apply(expression: String, operator: String, variables: js.Array[URITemplateVariable]): URITemplateExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[URITemplateExpression]
  }
  @scala.inline
  implicit class URITemplateExpressionOps[Self <: URITemplateExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: js.Array[URITemplateVariable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

