package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.ComputedPropertyName
import typingsSlinky.typescript.mod.Decorator
import typingsSlinky.typescript.mod.ExclamationToken
import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.Modifier
import typingsSlinky.typescript.mod.NumericLiteral
import typingsSlinky.typescript.mod.PrivateIdentifier
import typingsSlinky.typescript.mod.PropertyDeclaration
import typingsSlinky.typescript.mod.QuestionToken
import typingsSlinky.typescript.mod.StringLiteral
import typingsSlinky.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateProperty")
@js.native
object updateProperty extends js.Object {
  
  /** @deprecated Use `factory.updatePropertyDeclaration` or the factory supplied by your transformation context instead. */
  def apply(
    node: PropertyDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: String | Identifier | StringLiteral | NumericLiteral | ComputedPropertyName | PrivateIdentifier,
    questionOrExclamationToken: js.UndefOr[QuestionToken | ExclamationToken],
    `type`: js.UndefOr[TypeNode],
    initializer: js.UndefOr[Expression]
  ): PropertyDeclaration = js.native
}
