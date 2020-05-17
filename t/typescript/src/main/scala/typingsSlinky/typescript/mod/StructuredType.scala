package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.ObjectType
  - typingsSlinky.typescript.mod.UnionType
  - typingsSlinky.typescript.mod.IntersectionType
*/
trait StructuredType extends js.Object

object StructuredType {
  @scala.inline
  implicit def apply(value: IntersectionType | UnionType): StructuredType = value.asInstanceOf[StructuredType]
  @scala.inline
  implicit def apply(value: ObjectType): StructuredType = value.asInstanceOf[StructuredType]
}

