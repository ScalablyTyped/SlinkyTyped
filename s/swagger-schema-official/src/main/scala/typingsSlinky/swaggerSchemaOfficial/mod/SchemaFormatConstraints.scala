package typingsSlinky.swaggerSchemaOfficial.mod

import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.integer
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.number
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.swaggerSchemaOfficial.mod.GenericFormat
  - typingsSlinky.swaggerSchemaOfficial.mod.IntegerFormat
  - typingsSlinky.swaggerSchemaOfficial.mod.NumberFormat
  - typingsSlinky.swaggerSchemaOfficial.mod.StringFormat
*/
trait SchemaFormatConstraints extends StObject
object SchemaFormatConstraints {
  
  @scala.inline
  def GenericFormat(): typingsSlinky.swaggerSchemaOfficial.mod.GenericFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsSlinky.swaggerSchemaOfficial.mod.GenericFormat]
  }
  
  @scala.inline
  def IntegerFormat(`type`: integer): typingsSlinky.swaggerSchemaOfficial.mod.IntegerFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.swaggerSchemaOfficial.mod.IntegerFormat]
  }
  
  @scala.inline
  def NumberFormat(`type`: number): typingsSlinky.swaggerSchemaOfficial.mod.NumberFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.swaggerSchemaOfficial.mod.NumberFormat]
  }
  
  @scala.inline
  def StringFormat(`type`: string): typingsSlinky.swaggerSchemaOfficial.mod.StringFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.swaggerSchemaOfficial.mod.StringFormat]
  }
}
