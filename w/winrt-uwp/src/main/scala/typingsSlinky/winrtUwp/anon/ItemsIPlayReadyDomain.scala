package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Media.Protection.PlayReady.IPlayReadyDomain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsIPlayReadyDomain extends js.Object {
  
  /** The items in the collection. */ var items: IPlayReadyDomain = js.native
  
  /** The number of items in the collection. */ var returnValue: Double = js.native
}
object ItemsIPlayReadyDomain {
  
  @scala.inline
  def apply(items: IPlayReadyDomain, returnValue: Double): ItemsIPlayReadyDomain = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsIPlayReadyDomain]
  }
  
  @scala.inline
  implicit class ItemsIPlayReadyDomainOps[Self <: ItemsIPlayReadyDomain] (val x: Self) extends AnyVal {
    
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
    def setItems(value: IPlayReadyDomain): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Double): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
}
