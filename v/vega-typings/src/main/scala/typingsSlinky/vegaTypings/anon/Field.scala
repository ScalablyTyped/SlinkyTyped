package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.encodeMod.BaseValueRef
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
  implicit class FieldOps[Self <: Field] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setField(value: typingsSlinky.vegaTypings.encodeMod.Field): Self = this.set("field", value.asInstanceOf[js.Any])
  }
}
