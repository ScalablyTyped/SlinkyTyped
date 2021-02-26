package typingsSlinky.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSchema extends StObject {
  
  var Field: js.Array[FieldSchema] = js.native
}
object ListSchema {
  
  @scala.inline
  def apply(Field: js.Array[FieldSchema]): ListSchema = {
    val __obj = js.Dynamic.literal(Field = Field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchema]
  }
  
  @scala.inline
  implicit class ListSchemaMutableBuilder[Self <: ListSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: js.Array[FieldSchema]): Self = StObject.set(x, "Field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldVarargs(value: FieldSchema*): Self = StObject.set(x, "Field", js.Array(value :_*))
  }
}
