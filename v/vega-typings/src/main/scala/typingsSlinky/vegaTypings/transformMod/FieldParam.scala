package typingsSlinky.vegaTypings.transformMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldParam extends TransformField {
  
  var field: String = js.native
}
object FieldParam {
  
  @scala.inline
  def apply(field: String): FieldParam = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldParam]
  }
  
  @scala.inline
  implicit class FieldParamMutableBuilder[Self <: FieldParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
