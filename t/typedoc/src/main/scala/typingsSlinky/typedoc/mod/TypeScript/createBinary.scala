package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.BinaryExpression
import typingsSlinky.typescript.mod.BinaryOperator
import typingsSlinky.typescript.mod.BinaryOperatorToken
import typingsSlinky.typescript.mod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createBinary")
@js.native
object createBinary extends js.Object {
  def apply(left: Expression, operator: BinaryOperatorToken, right: Expression): BinaryExpression = js.native
  def apply(left: Expression, operator: BinaryOperator, right: Expression): BinaryExpression = js.native
}

