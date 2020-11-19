package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.PartiallyEmittedExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createPartiallyEmittedExpression")
@js.native
object createPartiallyEmittedExpression extends js.Object {
  
  /**
    * Creates a synthetic expression to act as a placeholder for a not-emitted expression in
    * order to preserve comments or sourcemap positions.
    *
    * @param expression The inner expression to emit.
    * @param original The original outer expression.
    * @param location The location for the expression. Defaults to the positions from "original" if provided.
    */
  def apply(expression: Expression): PartiallyEmittedExpression = js.native
  def apply(expression: Expression, original: Node): PartiallyEmittedExpression = js.native
}
