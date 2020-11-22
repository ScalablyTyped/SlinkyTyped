package typingsSlinky.seatsio.Seatsio

import typingsSlinky.seatsio.anon.LabelPrice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PricingConfigMulti extends PricingConfig {
  
  var category: String = js.native
  
  var ticketTypes: js.Array[LabelPrice] = js.native
}
object PricingConfigMulti {
  
  @scala.inline
  def apply(category: String, ticketTypes: js.Array[LabelPrice]): PricingConfigMulti = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], ticketTypes = ticketTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PricingConfigMulti]
  }
  
  @scala.inline
  implicit class PricingConfigMultiOps[Self <: PricingConfigMulti] (val x: Self) extends AnyVal {
    
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicketTypesVarargs(value: LabelPrice*): Self = this.set("ticketTypes", js.Array(value :_*))
    
    @scala.inline
    def setTicketTypes(value: js.Array[LabelPrice]): Self = this.set("ticketTypes", value.asInstanceOf[js.Any])
  }
}
