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

@js.native
trait StringFormat extends SchemaFormatConstraints {
  var format: js.UndefOr[_empty | byte | binary | date | `date-time` | password] = js.native
  var `type`: string = js.native
}

object StringFormat {
  @scala.inline
  def apply(`type`: string): StringFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringFormat]
  }
  @scala.inline
  implicit class StringFormatOps[Self <: StringFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: _empty | byte | binary | date | `date-time` | password): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
  }
  
}

