package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.encodeMod.BaseValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Field
  extends BaseValueRef[js.Any] {
  
  var field: typingsSlinky.vegaTypings.encodeMod.Field = js.native
}
object Field {
  
  @scala.inline
  def apply(field: typingsSlinky.vegaTypings.encodeMod.Field): Field = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  
  @scala.inline
  implicit class FieldMutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: typingsSlinky.vegaTypings.encodeMod.Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
