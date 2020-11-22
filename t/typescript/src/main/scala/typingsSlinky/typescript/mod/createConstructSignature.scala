package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createConstructSignature")
@js.native
object createConstructSignature extends js.Object {
  
  def apply(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[ParameterDeclaration]): ConstructSignatureDeclaration = js.native
  def apply(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructSignatureDeclaration = js.native
  /** @deprecated Use `factory.createConstructSignature` or the factory supplied by your transformation context instead. */
  def apply(typeParameters: js.Array[TypeParameterDeclaration], parameters: js.Array[ParameterDeclaration]): ConstructSignatureDeclaration = js.native
  def apply(
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructSignatureDeclaration = js.native
}
