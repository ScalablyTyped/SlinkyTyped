package typingsSlinky.swaggerSchemaOfficial.mod

import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings._empty
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.`date-time`
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.binary
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.byte
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.date
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.password
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class StringFormatMutableBuilder[Self <: StringFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: _empty | byte | binary | date | `date-time` | password): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
