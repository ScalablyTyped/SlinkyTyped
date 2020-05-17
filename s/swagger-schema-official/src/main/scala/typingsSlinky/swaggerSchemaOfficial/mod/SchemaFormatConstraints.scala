package typingsSlinky.swaggerSchemaOfficial.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.swaggerSchemaOfficial.mod.GenericFormat
  - typingsSlinky.swaggerSchemaOfficial.mod.IntegerFormat
  - typingsSlinky.swaggerSchemaOfficial.mod.NumberFormat
  - typingsSlinky.swaggerSchemaOfficial.mod.StringFormat
*/
trait SchemaFormatConstraints extends js.Object

object SchemaFormatConstraints {
  @scala.inline
  implicit def apply(value: GenericFormat): SchemaFormatConstraints = value.asInstanceOf[SchemaFormatConstraints]
  @scala.inline
  implicit def apply(value: IntegerFormat): SchemaFormatConstraints = value.asInstanceOf[SchemaFormatConstraints]
  @scala.inline
  implicit def apply(value: NumberFormat): SchemaFormatConstraints = value.asInstanceOf[SchemaFormatConstraints]
  @scala.inline
  implicit def apply(value: StringFormat): SchemaFormatConstraints = value.asInstanceOf[SchemaFormatConstraints]
}

