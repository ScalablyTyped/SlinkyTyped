package typingsSlinky.yup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.yup.mod.SchemaDescription
  - typingsSlinky.yup.mod.SchemaFieldRefDescription
  - typingsSlinky.yup.mod.SchemaFieldInnerTypeDescription
*/
trait SchemaFieldDescription extends js.Object

object SchemaFieldDescription {
  @scala.inline
  implicit def apply(value: SchemaDescription): SchemaFieldDescription = value.asInstanceOf[SchemaFieldDescription]
  @scala.inline
  implicit def apply(value: SchemaFieldInnerTypeDescription): SchemaFieldDescription = value.asInstanceOf[SchemaFieldDescription]
  @scala.inline
  implicit def apply(value: SchemaFieldRefDescription): SchemaFieldDescription = value.asInstanceOf[SchemaFieldDescription]
}

