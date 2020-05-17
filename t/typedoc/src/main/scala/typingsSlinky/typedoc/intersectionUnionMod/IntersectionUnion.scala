package typingsSlinky.typedoc.intersectionUnionMod

import typingsSlinky.typedoc.modelsMod.IntersectionType
import typingsSlinky.typedoc.modelsMod.UnionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typedoc.modelsMod.IntersectionType
  - typingsSlinky.typedoc.modelsMod.UnionType
*/
trait IntersectionUnion extends js.Object

object IntersectionUnion {
  @scala.inline
  implicit def apply(value: IntersectionType): IntersectionUnion = value.asInstanceOf[IntersectionUnion]
  @scala.inline
  implicit def apply(value: UnionType): IntersectionUnion = value.asInstanceOf[IntersectionUnion]
}

