package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Block
import typingsSlinky.typescript.mod.ComputedPropertyName
import typingsSlinky.typescript.mod.Decorator
import typingsSlinky.typescript.mod.GetAccessorDeclaration
import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.Modifier
import typingsSlinky.typescript.mod.NumericLiteral
import typingsSlinky.typescript.mod.ParameterDeclaration
import typingsSlinky.typescript.mod.PrivateIdentifier
import typingsSlinky.typescript.mod.StringLiteral
import typingsSlinky.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createGetAccessor")
@js.native
object createGetAccessor extends js.Object {
  
  /** @deprecated Use `factory.createGetAccessorDeclaration` or the factory supplied by your transformation context instead. */
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: String | Identifier | StringLiteral | NumericLiteral | ComputedPropertyName | PrivateIdentifier,
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    body: js.UndefOr[Block]
  ): GetAccessorDeclaration = js.native
}
