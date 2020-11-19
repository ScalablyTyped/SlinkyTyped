package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.FunctionTypeNode
import typingsSlinky.typescript.mod.ParameterDeclaration
import typingsSlinky.typescript.mod.TypeNode
import typingsSlinky.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createFunctionTypeNode")
@js.native
object createFunctionTypeNode extends js.Object {
  
  def apply(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[ParameterDeclaration]): FunctionTypeNode = js.native
  def apply(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): FunctionTypeNode = js.native
  def apply(typeParameters: js.Array[TypeParameterDeclaration], parameters: js.Array[ParameterDeclaration]): FunctionTypeNode = js.native
  def apply(
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): FunctionTypeNode = js.native
}
