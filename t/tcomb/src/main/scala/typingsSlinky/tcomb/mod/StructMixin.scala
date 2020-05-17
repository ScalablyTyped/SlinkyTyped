package typingsSlinky.tcomb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tcomb.mod.StructProps
  - typingsSlinky.tcomb.mod.Struct_[js.Any]
  - typingsSlinky.tcomb.mod.Interface_[js.Any]
*/
trait StructMixin extends js.Object

object StructMixin {
  @scala.inline
  implicit def apply(value: Interface_[js.Any]): StructMixin = value.asInstanceOf[StructMixin]
  @scala.inline
  implicit def apply(value: StructProps): StructMixin = value.asInstanceOf[StructMixin]
  @scala.inline
  implicit def apply(value: Struct_[js.Any]): StructMixin = value.asInstanceOf[StructMixin]
}

