package typingsSlinky.yup.mod

import typingsSlinky.std.Record
import typingsSlinky.yup.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaDescription extends SchemaFieldDescription {
  
  var fields: Record[String, SchemaFieldDescription] = js.native
  
  var label: String = js.native
  
  var meta: js.Object = js.native
  
  var tests: js.Array[Name] = js.native
  
  var `type`: String = js.native
}
object SchemaDescription {
  
  @scala.inline
  def apply(
    fields: Record[String, SchemaFieldDescription],
    label: String,
    meta: js.Object,
    tests: js.Array[Name],
    `type`: String
  ): SchemaDescription = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDescription]
  }
  
  @scala.inline
  implicit class SchemaDescriptionMutableBuilder[Self <: SchemaDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: Record[String, SchemaFieldDescription]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: js.Object): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTests(value: js.Array[Name]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestsVarargs(value: Name*): Self = StObject.set(x, "tests", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
