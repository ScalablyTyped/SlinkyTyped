package typingsSlinky.waterline.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.waterline.mod.StringAttribute
  - typingsSlinky.waterline.mod.EmailAttribute
  - typingsSlinky.waterline.mod.IntegerAttribute
  - typingsSlinky.waterline.mod.FloatAttribute
  - typingsSlinky.waterline.mod.DateAttribute
  - typingsSlinky.waterline.mod.TimeAttribute
  - typingsSlinky.waterline.mod.DatetimeAttribute
  - typingsSlinky.waterline.mod.BooleanAttribute
  - typingsSlinky.waterline.mod.BinaryAttribute
  - typingsSlinky.waterline.mod.ArrayAttribute
  - typingsSlinky.waterline.mod.JsonAttribute
  - typingsSlinky.waterline.mod.OneToOneAttribute
  - typingsSlinky.waterline.mod.OneToManyAttribute
  - typingsSlinky.waterline.mod.ManyToManyAttribute
  - typingsSlinky.waterline.mod.FunctionAttribute
*/
trait Attribute extends js.Object

object Attribute {
  @scala.inline
  implicit def apply(value: ArrayAttribute): Attribute = value.asInstanceOf[Attribute]
  @scala.inline
  implicit def apply(value: BinaryAttribute): Attribute = value.asInstanceOf[Attribute]
  @scala.inline
  implicit def apply(value: BooleanAttribute): Attribute = value.asInstanceOf[Attribute]
  @scala.inline
  implicit def apply(value: DateAttribute): Attribute = value.asInstanceOf[Attribute]
  @scala.inline
  implicit def apply(value: DatetimeAttribute): Attribute = value.asInstanceOf[Attribute]
  @scala.inline
  implicit def apply(value: EmailAttribute): Attribute = value.asInstanceOf[Attribute]
  @scala.inline
  implicit def apply(value: FloatAttribute): Attribute = value.asInstanceOf[Attribute]
  @scala.inline
  implicit def apply(value: FunctionAttribute): Attribute = value.asInstanceOf[Attribute]
  @scala.inline
  implicit def apply(value: IntegerAttribute): Attribute = value.asInstanceOf[Attribute]
  @scala.inline
  implicit def apply(value: JsonAttribute): Attribute = value.asInstanceOf[Attribute]
  @scala.inline
  implicit def apply(value: ManyToManyAttribute): Attribute = value.asInstanceOf[Attribute]
  @scala.inline
  implicit def apply(value: OneToManyAttribute): Attribute = value.asInstanceOf[Attribute]
  @scala.inline
  implicit def apply(value: OneToOneAttribute): Attribute = value.asInstanceOf[Attribute]
  @scala.inline
  implicit def apply(value: String): Attribute = value.asInstanceOf[Attribute]
  @scala.inline
  implicit def apply(value: StringAttribute): Attribute = value.asInstanceOf[Attribute]
  @scala.inline
  implicit def apply(value: TimeAttribute): Attribute = value.asInstanceOf[Attribute]
}

