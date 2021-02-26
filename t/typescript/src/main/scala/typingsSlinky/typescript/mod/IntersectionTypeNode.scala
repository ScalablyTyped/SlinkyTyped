package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntersectionTypeNode
  extends TypeNode
     with UnionOrIntersectionTypeNode {
  
  @JSName("kind")
  val kind_IntersectionTypeNode: typingsSlinky.typescript.mod.SyntaxKind.IntersectionType = js.native
  
  val types: NodeArray[TypeNode] = js.native
}
