package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpConnectionOptionHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsHttpConnectionOptionHeaderValue extends js.Object {
  
  /** An array of HttpConnectionOptionHeaderValue items that start at startIndex in the HttpConnectionOptionHeaderValueCollection . */ var items: HttpConnectionOptionHeaderValue = js.native
  
  /** The number of HttpConnectionOptionHeaderValue items retrieved. */ var returnValue: Double = js.native
}
object ItemsHttpConnectionOptionHeaderValue {
  
  @scala.inline
  def apply(items: HttpConnectionOptionHeaderValue, returnValue: Double): ItemsHttpConnectionOptionHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpConnectionOptionHeaderValue]
  }
  
  @scala.inline
  implicit class ItemsHttpConnectionOptionHeaderValueOps[Self <: ItemsHttpConnectionOptionHeaderValue] (val x: Self) extends AnyVal {
    
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
    def setItems(value: HttpConnectionOptionHeaderValue): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Double): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
}
