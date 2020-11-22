package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Decorator
import typingsSlinky.typescript.mod.ExportAssignment
import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.Modifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateExportAssignment")
@js.native
object updateExportAssignment extends js.Object {
  
  def apply(
    node: ExportAssignment,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    expression: Expression
  ): ExportAssignment = js.native
  def apply(
    node: ExportAssignment,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    expression: Expression
  ): ExportAssignment = js.native
  def apply(
    node: ExportAssignment,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    expression: Expression
  ): ExportAssignment = js.native
  /** @deprecated Use `factory.updateExportAssignment` or the factory supplied by your transformation context instead. */
  def apply(
    node: ExportAssignment,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    expression: Expression
  ): ExportAssignment = js.native
}
