package typingsSlinky.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod

import typingsSlinky.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.Empty
import typingsSlinky.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.`date-time`
import typingsSlinky.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.binary
import typingsSlinky.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.byte
import typingsSlinky.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.date
import typingsSlinky.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.password
import typingsSlinky.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringFormat extends SchemaFormatConstraints {
  var format: js.UndefOr[Empty | byte | binary | date | `date-time` | password] = js.undefined
  var `type`: string
}

object StringFormat {
  @scala.inline
  def apply(`type`: string, format: Empty | byte | binary | date | `date-time` | password = null): StringFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringFormat]
  }
}

