package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.ConstructSignatureDeclaration
import typingsSlinky.typescript.mod.NodeArray
import typingsSlinky.typescript.mod.ParameterDeclaration
import typingsSlinky.typescript.mod.TypeNode
import typingsSlinky.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateConstructSignature")
@js.native
object updateConstructSignature extends js.Object {
  
  def apply(
    node: ConstructSignatureDeclaration,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration]
  ): ConstructSignatureDeclaration = js.native
  def apply(
    node: ConstructSignatureDeclaration,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructSignatureDeclaration = js.native
  /** @deprecated Use `factory.updateConstructSignature` or the factory supplied by your transformation context instead. */
  def apply(
    node: ConstructSignatureDeclaration,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration]
  ): ConstructSignatureDeclaration = js.native
  def apply(
    node: ConstructSignatureDeclaration,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructSignatureDeclaration = js.native
}
