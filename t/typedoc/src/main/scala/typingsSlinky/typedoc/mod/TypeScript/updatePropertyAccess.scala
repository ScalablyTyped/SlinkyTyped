package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.PrivateIdentifier
import typingsSlinky.typescript.mod.PropertyAccessExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updatePropertyAccess")
@js.native
object updatePropertyAccess extends js.Object {
  
  /** @deprecated Use `factory.updatePropertyAccess` or the factory supplied by your transformation context instead. */
  def apply(node: PropertyAccessExpression, expression: Expression, name: Identifier): PropertyAccessExpression = js.native
  def apply(node: PropertyAccessExpression, expression: Expression, name: PrivateIdentifier): PropertyAccessExpression = js.native
}
