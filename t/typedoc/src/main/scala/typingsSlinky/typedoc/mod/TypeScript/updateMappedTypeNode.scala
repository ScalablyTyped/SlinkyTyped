package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.MappedTypeNode
import typingsSlinky.typescript.mod.MinusToken
import typingsSlinky.typescript.mod.PlusToken
import typingsSlinky.typescript.mod.QuestionToken
import typingsSlinky.typescript.mod.ReadonlyToken
import typingsSlinky.typescript.mod.TypeNode
import typingsSlinky.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateMappedTypeNode")
@js.native
object updateMappedTypeNode extends js.Object {
  
  def apply(
    node: MappedTypeNode,
    readonlyToken: js.UndefOr[MinusToken | PlusToken | ReadonlyToken],
    typeParameter: TypeParameterDeclaration
  ): MappedTypeNode = js.native
  def apply(
    node: MappedTypeNode,
    readonlyToken: js.UndefOr[MinusToken | PlusToken | ReadonlyToken],
    typeParameter: TypeParameterDeclaration,
    questionToken: MinusToken | PlusToken | QuestionToken
  ): MappedTypeNode = js.native
  def apply(
    node: MappedTypeNode,
    readonlyToken: js.UndefOr[MinusToken | PlusToken | ReadonlyToken],
    typeParameter: TypeParameterDeclaration,
    questionToken: js.UndefOr[MinusToken | PlusToken | QuestionToken],
    `type`: TypeNode
  ): MappedTypeNode = js.native
}
