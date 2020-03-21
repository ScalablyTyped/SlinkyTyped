package typingsSlinky.swaggerSchemaOfficial.mod

import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.double
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.float
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFormat extends SchemaFormatConstraints {
  var format: js.UndefOr[float | double] = js.undefined
  var `type`: number
}

object NumberFormat {
  @scala.inline
  def apply(`type`: number, format: float | double = null): NumberFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormat]
  }
}

