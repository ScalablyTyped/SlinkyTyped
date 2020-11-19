package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.AwaitKeywordToken
import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.ForInitializer
import typingsSlinky.typescript.mod.ForOfStatement
import typingsSlinky.typescript.mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateForOf")
@js.native
object updateForOf extends js.Object {
  
  def apply(
    node: ForOfStatement,
    awaitModifier: js.UndefOr[scala.Nothing],
    initializer: ForInitializer,
    expression: Expression,
    statement: Statement
  ): ForOfStatement = js.native
  def apply(
    node: ForOfStatement,
    awaitModifier: AwaitKeywordToken,
    initializer: ForInitializer,
    expression: Expression,
    statement: Statement
  ): ForOfStatement = js.native
}
