package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.TypeNode
import typingsSlinky.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateTypeParameterDeclaration")
@js.native
object updateTypeParameterDeclaration extends js.Object {
  
  def apply(node: TypeParameterDeclaration, name: Identifier): TypeParameterDeclaration = js.native
  def apply(
    node: TypeParameterDeclaration,
    name: Identifier,
    constraint: js.UndefOr[scala.Nothing],
    defaultType: TypeNode
  ): TypeParameterDeclaration = js.native
  def apply(node: TypeParameterDeclaration, name: Identifier, constraint: TypeNode): TypeParameterDeclaration = js.native
  def apply(node: TypeParameterDeclaration, name: Identifier, constraint: TypeNode, defaultType: TypeNode): TypeParameterDeclaration = js.native
}
