package typingsSlinky.yup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.yup.mod.MixedSchemaConstructor
  - typingsSlinky.yup.mod.StringSchemaConstructor
  - typingsSlinky.yup.mod.NumberSchemaConstructor
  - typingsSlinky.yup.mod.BooleanSchemaConstructor
  - typingsSlinky.yup.mod.DateSchemaConstructor
  - typingsSlinky.yup.mod.ArraySchemaConstructor
  - typingsSlinky.yup.mod.ObjectSchemaConstructor
*/
trait AnySchemaConstructor extends js.Object

object AnySchemaConstructor {
  @scala.inline
  implicit def apply(value: ArraySchemaConstructor): AnySchemaConstructor = value.asInstanceOf[AnySchemaConstructor]
  @scala.inline
  implicit def apply(value: BooleanSchemaConstructor): AnySchemaConstructor = value.asInstanceOf[AnySchemaConstructor]
  @scala.inline
  implicit def apply(value: DateSchemaConstructor): AnySchemaConstructor = value.asInstanceOf[AnySchemaConstructor]
  @scala.inline
  implicit def apply(value: MixedSchemaConstructor): AnySchemaConstructor = value.asInstanceOf[AnySchemaConstructor]
  @scala.inline
  implicit def apply(value: NumberSchemaConstructor): AnySchemaConstructor = value.asInstanceOf[AnySchemaConstructor]
  @scala.inline
  implicit def apply(value: ObjectSchemaConstructor): AnySchemaConstructor = value.asInstanceOf[AnySchemaConstructor]
  @scala.inline
  implicit def apply(value: StringSchemaConstructor): AnySchemaConstructor = value.asInstanceOf[AnySchemaConstructor]
}

