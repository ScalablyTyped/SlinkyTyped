package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.ExpressionWithTypeArguments
import typingsSlinky.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createExpressionWithTypeArguments")
@js.native
object createExpressionWithTypeArguments extends js.Object {
  
  def apply(typeArguments: js.UndefOr[scala.Nothing], expression: Expression): ExpressionWithTypeArguments = js.native
  /** @deprecated Use `factory.createExpressionWithTypeArguments` or the factory supplied by your transformation context instead. */
  def apply(typeArguments: js.Array[TypeNode], expression: Expression): ExpressionWithTypeArguments = js.native
}
