package typingsSlinky.seatsio.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Amount extends js.Object {
  
  var amount: js.UndefOr[Double] = js.native
  
  var id: String = js.native
  
  var ticketType: js.UndefOr[String] = js.native
}
object Amount {
  
  @scala.inline
  def apply(id: String): Amount = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amount]
  }
  
  @scala.inline
  implicit class AmountOps[Self <: Amount] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
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
