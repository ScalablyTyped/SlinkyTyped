package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.BooleanLiteral
import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.NoSubstitutionTemplateLiteral
import typingsSlinky.typescript.mod.NumericLiteral
import typingsSlinky.typescript.mod.PseudoBigInt
import typingsSlinky.typescript.mod.StringLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createLiteral")
@js.native
object createLiteral extends js.Object {
  
  /** @deprecated Use `factory.createStringLiteral`, `factory.createStringLiteralFromNode`, `factory.createNumericLiteral`, `factory.createBigIntLiteral`, `factory.createTrue`, `factory.createFalse`, or the factory supplied by your transformation context instead. */
  def apply(value: String): StringLiteral = js.native
  /** @deprecated Use `factory.createStringLiteral`, `factory.createStringLiteralFromNode`, `factory.createNumericLiteral`, `factory.createBigIntLiteral`, `factory.createTrue`, `factory.createFalse`, or the factory supplied by your transformation context instead. */
  def apply(value: Boolean): BooleanLiteral = js.native
  /** @deprecated Use `factory.createStringLiteral`, `factory.createStringLiteralFromNode`, `factory.createNumericLiteral`, `factory.createBigIntLiteral`, `factory.createTrue`, `factory.createFalse`, or the factory supplied by your transformation context instead. */
  def apply(value: Double): NumericLiteral = js.native
  def apply(value: Identifier): StringLiteral = js.native
  def apply(value: NoSubstitutionTemplateLiteral): StringLiteral = js.native
  def apply(value: NumericLiteral): StringLiteral = js.native
  def apply(value: PseudoBigInt): NumericLiteral = js.native
  def apply(value: StringLiteral): StringLiteral = js.native
}
