package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.ExpressionWithTypeArguments
import typingsSlinky.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateExpressionWithTypeArguments")
@js.native
object updateExpressionWithTypeArguments extends js.Object {
  
  def apply(
    node: ExpressionWithTypeArguments,
    typeArguments: js.UndefOr[scala.Nothing],
    expression: Expression
  ): ExpressionWithTypeArguments = js.native
  def apply(node: ExpressionWithTypeArguments, typeArguments: js.Array[TypeNode], expression: Expression): ExpressionWithTypeArguments = js.native
}
