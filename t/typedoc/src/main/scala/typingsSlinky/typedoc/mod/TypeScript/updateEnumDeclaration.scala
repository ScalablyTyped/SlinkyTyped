package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Decorator
import typingsSlinky.typescript.mod.EnumDeclaration
import typingsSlinky.typescript.mod.EnumMember
import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.Modifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateEnumDeclaration")
@js.native
object updateEnumDeclaration extends js.Object {
  
  def apply(
    node: EnumDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def apply(
    node: EnumDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def apply(
    node: EnumDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  /** @deprecated Use `factory.updateEnumDeclaration` or the factory supplied by your transformation context instead. */
  def apply(
    node: EnumDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
}
