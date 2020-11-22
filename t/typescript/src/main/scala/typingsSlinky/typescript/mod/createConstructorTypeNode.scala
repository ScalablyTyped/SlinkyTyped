package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createConstructorTypeNode")
@js.native
object createConstructorTypeNode extends js.Object {
  
  def apply(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructorTypeNode = js.native
  /** @deprecated Use `factory.createConstructorTypeNode` or the factory supplied by your transformation context instead. */
  def apply(
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructorTypeNode = js.native
}
