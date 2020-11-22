package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.CallExpression
import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateCall")
@js.native
object updateCall extends js.Object {
  
  def apply(
    node: CallExpression,
    expression: Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    argumentsArray: js.Array[Expression]
  ): CallExpression = js.native
  /** @deprecated Use `factory.updateCall` or the factory supplied by your transformation context instead. */
  def apply(
    node: CallExpression,
    expression: Expression,
    typeArguments: js.Array[TypeNode],
    argumentsArray: js.Array[Expression]
  ): CallExpression = js.native
}
