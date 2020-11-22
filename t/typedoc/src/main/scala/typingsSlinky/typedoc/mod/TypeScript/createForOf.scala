package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.AwaitKeyword
import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.ForInitializer
import typingsSlinky.typescript.mod.ForOfStatement
import typingsSlinky.typescript.mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createForOf")
@js.native
object createForOf extends js.Object {
  
  def apply(
    awaitModifier: js.UndefOr[scala.Nothing],
    initializer: ForInitializer,
    expression: Expression,
    statement: Statement
  ): ForOfStatement = js.native
  /** @deprecated Use `factory.createForOf` or the factory supplied by your transformation context instead. */
  def apply(
    awaitModifier: AwaitKeyword,
    initializer: ForInitializer,
    expression: Expression,
    statement: Statement
  ): ForOfStatement = js.native
}
