package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.QualifiedName
import typingsSlinky.typescript.mod.TypeNode
import typingsSlinky.typescript.mod.TypeReferenceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createTypeReferenceNode")
@js.native
object createTypeReferenceNode extends js.Object {
  
  /** @deprecated Use `factory.createTypeReferenceNode` or the factory supplied by your transformation context instead. */
  def apply(typeName: String): TypeReferenceNode = js.native
  def apply(typeName: String, typeArguments: js.Array[TypeNode]): TypeReferenceNode = js.native
  def apply(typeName: Identifier): TypeReferenceNode = js.native
  def apply(typeName: Identifier, typeArguments: js.Array[TypeNode]): TypeReferenceNode = js.native
  def apply(typeName: QualifiedName): TypeReferenceNode = js.native
  def apply(typeName: QualifiedName, typeArguments: js.Array[TypeNode]): TypeReferenceNode = js.native
}
