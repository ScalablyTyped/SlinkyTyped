package typingsSlinky.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnionTypeNode
  extends TypeNode
     with UnionOrIntersectionTypeNode {
  @JSName("kind")
  var kind_UnionTypeNode: typingsSlinky.typescript.typescriptMod.SyntaxKind.UnionType = js.native
  var types: NodeArray[TypeNode] = js.native
}

