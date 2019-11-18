package typingsSlinky.typescript

import typingsSlinky.typescript.typescriptMod.Identifier
import typingsSlinky.typescript.typescriptMod.PropertyAccessEntityNameExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expression extends js.Object {
  var expression: Identifier | PropertyAccessEntityNameExpression
}

object Anon_Expression {
  @scala.inline
  def apply(expression: Identifier | PropertyAccessEntityNameExpression): Anon_Expression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Expression]
  }
}

