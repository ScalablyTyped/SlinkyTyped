package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.SyntaxKind.IntersectionType
import typingsSlinky.typescript.mod.SyntaxKind.UnionType
import typingsSlinky.typescript.mod.TypeNode
import typingsSlinky.typescript.mod.UnionOrIntersectionTypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createUnionOrIntersectionTypeNode")
@js.native
object createUnionOrIntersectionTypeNode extends js.Object {
  
  def apply(kind: IntersectionType, types: js.Array[TypeNode]): UnionOrIntersectionTypeNode = js.native
  def apply(kind: UnionType, types: js.Array[TypeNode]): UnionOrIntersectionTypeNode = js.native
}
