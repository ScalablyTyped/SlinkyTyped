package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "updateConstructSignature")
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
