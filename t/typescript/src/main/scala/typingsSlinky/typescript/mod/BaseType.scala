package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.ObjectType
  - typingsSlinky.typescript.mod.IntersectionType
  - typingsSlinky.typescript.mod.TypeVariable
*/
trait BaseType extends js.Object

object BaseType {
  @scala.inline
  implicit def apply(value: IntersectionType): BaseType = value.asInstanceOf[BaseType]
  @scala.inline
  implicit def apply(value: ObjectType): BaseType = value.asInstanceOf[BaseType]
  @scala.inline
  implicit def apply(value: TypeVariable): BaseType = value.asInstanceOf[BaseType]
}

