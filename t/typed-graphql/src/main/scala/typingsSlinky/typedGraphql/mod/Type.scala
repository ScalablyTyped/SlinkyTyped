package typingsSlinky.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Type Reference
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typedGraphql.mod.NamedType
  - typingsSlinky.typedGraphql.mod.ListType
  - typingsSlinky.typedGraphql.mod.NonNullType
*/
trait Type extends js.Object

object Type {
  @scala.inline
  implicit def apply(value: ListType): Type = value.asInstanceOf[Type]
  @scala.inline
  implicit def apply(value: NamedType): Type = value.asInstanceOf[Type]
  @scala.inline
  implicit def apply(value: NonNullType): Type = value.asInstanceOf[Type]
}

