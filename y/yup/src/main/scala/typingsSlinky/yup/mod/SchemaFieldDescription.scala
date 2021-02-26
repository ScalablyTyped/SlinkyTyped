package typingsSlinky.yup.mod

import typingsSlinky.std.Record
import typingsSlinky.yup.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.yup.mod.SchemaDescription
  - typingsSlinky.yup.mod.SchemaFieldRefDescription
  - typingsSlinky.yup.mod.SchemaFieldInnerTypeDescription
*/
trait SchemaFieldDescription extends StObject
object SchemaFieldDescription {
  
  @scala.inline
  def SchemaDescription(
    fields: Record[String, SchemaFieldDescription],
    label: String,
    meta: js.Object,
    tests: js.Array[Name],
    `type`: String
  ): typingsSlinky.yup.mod.SchemaDescription = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.yup.mod.SchemaDescription]
  }
  
  @scala.inline
  def SchemaFieldInnerTypeDescription(label: String, meta: js.Object, tests: js.Array[Name], `type`: String): typingsSlinky.yup.mod.SchemaFieldInnerTypeDescription = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.yup.mod.SchemaFieldInnerTypeDescription]
  }
  
  @scala.inline
  def SchemaFieldRefDescription(key: String, `type`: typingsSlinky.yup.yupStrings.ref): typingsSlinky.yup.mod.SchemaFieldRefDescription = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.yup.mod.SchemaFieldRefDescription]
  }
}
