package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.ForInitializer
import typingsSlinky.typescript.mod.ForStatement
import typingsSlinky.typescript.mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createFor")
@js.native
object createFor extends js.Object {
  
  def apply(
    initializer: js.UndefOr[scala.Nothing],
    condition: js.UndefOr[scala.Nothing],
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  def apply(
    initializer: js.UndefOr[scala.Nothing],
    condition: js.UndefOr[scala.Nothing],
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
  def apply(
    initializer: js.UndefOr[scala.Nothing],
    condition: Expression,
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  def apply(
    initializer: js.UndefOr[scala.Nothing],
    condition: Expression,
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
  def apply(
    initializer: ForInitializer,
    condition: js.UndefOr[scala.Nothing],
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  def apply(
    initializer: ForInitializer,
    condition: js.UndefOr[scala.Nothing],
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
  def apply(
    initializer: ForInitializer,
    condition: Expression,
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  def apply(initializer: ForInitializer, condition: Expression, incrementor: Expression, statement: Statement): ForStatement = js.native
}
