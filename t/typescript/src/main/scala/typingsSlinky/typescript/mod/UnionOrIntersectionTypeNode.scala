package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.UnionTypeNode
  - typingsSlinky.typescript.mod.IntersectionTypeNode
*/
trait UnionOrIntersectionTypeNode extends js.Object

object UnionOrIntersectionTypeNode {
  @scala.inline
  implicit def apply(value: IntersectionTypeNode): UnionOrIntersectionTypeNode = value.asInstanceOf[UnionOrIntersectionTypeNode]
  @scala.inline
  implicit def apply(value: UnionTypeNode): UnionOrIntersectionTypeNode = value.asInstanceOf[UnionOrIntersectionTypeNode]
}

