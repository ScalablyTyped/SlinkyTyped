package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnionTypeNode
  extends TypeNode
     with UnionOrIntersectionTypeNode {
  
  @JSName("kind")
  val kind_UnionTypeNode: typingsSlinky.typescript.mod.SyntaxKind.UnionType = js.native
  
  val types: NodeArray[TypeNode] = js.native
}
