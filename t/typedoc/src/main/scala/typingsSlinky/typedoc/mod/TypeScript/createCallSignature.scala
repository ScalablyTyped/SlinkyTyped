package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.CallSignatureDeclaration
import typingsSlinky.typescript.mod.ParameterDeclaration
import typingsSlinky.typescript.mod.TypeNode
import typingsSlinky.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createCallSignature")
@js.native
object createCallSignature extends js.Object {
  
  def apply(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[ParameterDeclaration]): CallSignatureDeclaration = js.native
  def apply(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): CallSignatureDeclaration = js.native
  /** @deprecated Use `factory.createCallSignature` or the factory supplied by your transformation context instead. */
  def apply(typeParameters: js.Array[TypeParameterDeclaration], parameters: js.Array[ParameterDeclaration]): CallSignatureDeclaration = js.native
  def apply(
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): CallSignatureDeclaration = js.native
}
