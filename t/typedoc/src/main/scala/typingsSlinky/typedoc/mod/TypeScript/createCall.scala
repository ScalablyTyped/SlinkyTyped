package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.CallExpression
import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createCall")
@js.native
object createCall extends js.Object {
  
  def apply(expression: Expression): CallExpression = js.native
  def apply(
    expression: Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    argumentsArray: js.Array[Expression]
  ): CallExpression = js.native
  def apply(expression: Expression, typeArguments: js.Array[TypeNode]): CallExpression = js.native
  def apply(expression: Expression, typeArguments: js.Array[TypeNode], argumentsArray: js.Array[Expression]): CallExpression = js.native
}
