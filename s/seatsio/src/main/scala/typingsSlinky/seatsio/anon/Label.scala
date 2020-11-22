package typingsSlinky.seatsio.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Label extends js.Object {
  
  var amount: js.UndefOr[Double] = js.native
  
  var label: String = js.native
  
  var ticketType: js.UndefOr[String] = js.native
}
object Label {
  
  @scala.inline
  def apply(label: String): Label = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  
  @scala.inline
  implicit class LabelOps[Self <: Label] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    
    @scala.inline
    def setTicketType(value: String): Self = this.set("ticketType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicketType: Self = this.set("ticketType", js.undefined)
  }
}
