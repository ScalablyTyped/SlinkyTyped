package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.TypeNode
import typingsSlinky.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createTypeParameterDeclaration")
@js.native
object createTypeParameterDeclaration extends js.Object {
  
  /** @deprecated Use `factory.createTypeParameterDeclaration` or the factory supplied by your transformation context instead. */
  def apply(name: String): TypeParameterDeclaration = js.native
  def apply(name: String, constraint: js.UndefOr[scala.Nothing], defaultType: TypeNode): TypeParameterDeclaration = js.native
  def apply(name: String, constraint: TypeNode): TypeParameterDeclaration = js.native
  def apply(name: String, constraint: TypeNode, defaultType: TypeNode): TypeParameterDeclaration = js.native
  def apply(name: Identifier): TypeParameterDeclaration = js.native
  def apply(name: Identifier, constraint: js.UndefOr[scala.Nothing], defaultType: TypeNode): TypeParameterDeclaration = js.native
  def apply(name: Identifier, constraint: TypeNode): TypeParameterDeclaration = js.native
  def apply(name: Identifier, constraint: TypeNode, defaultType: TypeNode): TypeParameterDeclaration = js.native
}
