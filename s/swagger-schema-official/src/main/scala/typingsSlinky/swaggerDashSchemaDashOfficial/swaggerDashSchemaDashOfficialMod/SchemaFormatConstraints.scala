package typingsSlinky.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod

import typingsSlinky.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.Empty
import typingsSlinky.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.`date-time`
import typingsSlinky.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.binary
import typingsSlinky.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.byte
import typingsSlinky.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.date
import typingsSlinky.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.double
import typingsSlinky.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.float
import typingsSlinky.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.int32
import typingsSlinky.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.int64
import typingsSlinky.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.integer
import typingsSlinky.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.number
import typingsSlinky.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.password
import typingsSlinky.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod.GenericFormat
  - typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod.IntegerFormat
  - typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod.NumberFormat
  - typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod.StringFormat
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
  def StringFormat(`type`: string, format: Empty | byte | binary | date | `date-time` | password = null): SchemaFormatConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFormatConstraints]
  }
}

