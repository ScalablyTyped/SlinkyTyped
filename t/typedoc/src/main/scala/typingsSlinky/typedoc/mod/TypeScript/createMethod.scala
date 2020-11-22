package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.AsteriskToken
import typingsSlinky.typescript.mod.Block
import typingsSlinky.typescript.mod.ComputedPropertyName
import typingsSlinky.typescript.mod.Decorator
import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.MethodDeclaration
import typingsSlinky.typescript.mod.Modifier
import typingsSlinky.typescript.mod.NumericLiteral
import typingsSlinky.typescript.mod.ParameterDeclaration
import typingsSlinky.typescript.mod.PrivateIdentifier
import typingsSlinky.typescript.mod.QuestionToken
import typingsSlinky.typescript.mod.StringLiteral
import typingsSlinky.typescript.mod.TypeNode
import typingsSlinky.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createMethod")
@js.native
object createMethod extends js.Object {
  
  /** @deprecated Use `factory.createMethodDeclaration` or the factory supplied by your transformation context instead. */
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: String | Identifier | StringLiteral | NumericLiteral | ComputedPropertyName | PrivateIdentifier,
    questionToken: js.UndefOr[QuestionToken],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    body: js.UndefOr[Block]
  ): MethodDeclaration = js.native
}
