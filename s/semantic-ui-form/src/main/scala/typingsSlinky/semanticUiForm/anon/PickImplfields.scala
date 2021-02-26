package typingsSlinky.semanticUiForm.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.semanticUiForm.SemanticUI.Form.Field
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.FormSettings._Impl, 'fields'> */
@js.native
trait PickImplfields extends StObject {
  
  var fields: StringDictionary[String | js.Array[String] | Field] = js.native
}
object PickImplfields {
  
  @scala.inline
  def apply(fields: StringDictionary[String | js.Array[String] | Field]): PickImplfields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplfields]
  }
  
  @scala.inline
  implicit class PickImplfieldsMutableBuilder[Self <: PickImplfields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: StringDictionary[String | js.Array[String] | Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
  }
}
