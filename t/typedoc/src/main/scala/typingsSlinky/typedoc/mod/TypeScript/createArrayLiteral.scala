package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.ArrayLiteralExpression
import typingsSlinky.typescript.mod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createArrayLiteral")
@js.native
object createArrayLiteral extends js.Object {
  
  /** @deprecated Use `factory.createArrayLiteral` or the factory supplied by your transformation context instead. */
  def apply(): ArrayLiteralExpression = js.native
  def apply(elements: js.UndefOr[scala.Nothing], multiLine: Boolean): ArrayLiteralExpression = js.native
  def apply(elements: js.Array[Expression]): ArrayLiteralExpression = js.native
  def apply(elements: js.Array[Expression], multiLine: Boolean): ArrayLiteralExpression = js.native
}
