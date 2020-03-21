package typingsSlinky.swaggerSchemaOfficial.mod

import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings._empty
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.`date-time`
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.binary
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.byte
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.date
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.password
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringFormat extends SchemaFormatConstraints {
  var format: js.UndefOr[_empty | byte | binary | date | `date-time` | password] = js.undefined
  var `type`: string
}

object StringFormat {
  @scala.inline
  def apply(`type`: string, format: _empty | byte | binary | date | `date-time` | password = null): StringFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringFormat]
  }
}

