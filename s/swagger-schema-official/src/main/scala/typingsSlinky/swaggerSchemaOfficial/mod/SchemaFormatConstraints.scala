package typingsSlinky.swaggerSchemaOfficial.mod

import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings._empty
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.`date-time`
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.binary
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.byte
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.date
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.double
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.float
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.int32
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.int64
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.integer
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.number
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.password
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.string
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
  def GenericFormat(format: String = null, `type`: ParameterType = null): SchemaFormatConstraints = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFormatConstraints]
  }
  @scala.inline
  def IntegerFormat(`type`: integer, format: int32 | int64 = null): SchemaFormatConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFormatConstraints]
  }
  @scala.inline
  def NumberFormat(`type`: number, format: float | double = null): SchemaFormatConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFormatConstraints]
  }
  @scala.inline
  def StringFormat(`type`: string, format: _empty | byte | binary | date | `date-time` | password = null): SchemaFormatConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFormatConstraints]
  }
}

