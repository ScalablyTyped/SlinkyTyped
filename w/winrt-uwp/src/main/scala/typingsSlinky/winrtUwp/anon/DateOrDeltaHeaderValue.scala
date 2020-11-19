package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpDateOrDeltaHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateOrDeltaHeaderValue extends js.Object {
  
  /** The HttpDateOrDeltaHeaderValue version of the string. */ var dateOrDeltaHeaderValue: HttpDateOrDeltaHeaderValue = js.native
  
  /** true if input is valid HttpDateOrDeltaHeaderValue information; otherwise, false. */ var returnValue: Boolean = js.native
}
object DateOrDeltaHeaderValue {
  
  @scala.inline
  def apply(dateOrDeltaHeaderValue: HttpDateOrDeltaHeaderValue, returnValue: Boolean): DateOrDeltaHeaderValue = {
    val __obj = js.Dynamic.literal(dateOrDeltaHeaderValue = dateOrDeltaHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateOrDeltaHeaderValue]
  }
  
  @scala.inline
  implicit class DateOrDeltaHeaderValueOps[Self <: DateOrDeltaHeaderValue] (val x: Self) extends AnyVal {
    
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
    def setDateOrDeltaHeaderValue(value: HttpDateOrDeltaHeaderValue): Self = this.set("dateOrDeltaHeaderValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Boolean): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
}
