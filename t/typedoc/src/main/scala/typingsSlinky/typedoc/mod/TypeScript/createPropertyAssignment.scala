package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.ComputedPropertyName
import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.NumericLiteral
import typingsSlinky.typescript.mod.PrivateIdentifier
import typingsSlinky.typescript.mod.PropertyAssignment
import typingsSlinky.typescript.mod.StringLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createPropertyAssignment")
@js.native
object createPropertyAssignment extends js.Object {
  
  /** @deprecated Use `factory.createPropertyAssignment` or the factory supplied by your transformation context instead. */
  def apply(name: String, initializer: Expression): PropertyAssignment = js.native
  def apply(name: ComputedPropertyName, initializer: Expression): PropertyAssignment = js.native
  def apply(name: Identifier, initializer: Expression): PropertyAssignment = js.native
  def apply(name: NumericLiteral, initializer: Expression): PropertyAssignment = js.native
  def apply(name: PrivateIdentifier, initializer: Expression): PropertyAssignment = js.native
  def apply(name: StringLiteral, initializer: Expression): PropertyAssignment = js.native
}
