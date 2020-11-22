package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.ConstructorTypeNode
import typingsSlinky.typescript.mod.NodeArray
import typingsSlinky.typescript.mod.ParameterDeclaration
import typingsSlinky.typescript.mod.TypeNode
import typingsSlinky.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateConstructorTypeNode")
@js.native
object updateConstructorTypeNode extends js.Object {
  
  def apply(
    node: ConstructorTypeNode,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructorTypeNode = js.native
  /** @deprecated Use `factory.updateConstructorTypeNode` or the factory supplied by your transformation context instead. */
  def apply(
    node: ConstructorTypeNode,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructorTypeNode = js.native
}
