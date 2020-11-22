package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.MappedTypeNode
import typingsSlinky.typescript.mod.MinusToken
import typingsSlinky.typescript.mod.PlusToken
import typingsSlinky.typescript.mod.QuestionToken
import typingsSlinky.typescript.mod.ReadonlyKeyword
import typingsSlinky.typescript.mod.TypeNode
import typingsSlinky.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createMappedTypeNode")
@js.native
object createMappedTypeNode extends js.Object {
  
  /** @deprecated Use `factory.createMappedTypeNode` or the factory supplied by your transformation context instead. */
  def apply(
    readonlyToken: js.UndefOr[ReadonlyKeyword | PlusToken | MinusToken],
    typeParameter: TypeParameterDeclaration,
    nameType: js.UndefOr[TypeNode],
    questionToken: js.UndefOr[QuestionToken | PlusToken | MinusToken],
    `type`: js.UndefOr[TypeNode]
  ): MappedTypeNode = js.native
}
