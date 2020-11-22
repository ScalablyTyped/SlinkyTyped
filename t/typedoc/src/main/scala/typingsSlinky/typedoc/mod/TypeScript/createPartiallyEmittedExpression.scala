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
  
  /** @deprecated Use `factory.createPartiallyEmittedExpression` or the factory supplied by your transformation context instead. */
  def apply(expression: Expression): PartiallyEmittedExpression = js.native
  def apply(expression: Expression, original: Node): PartiallyEmittedExpression = js.native
}
