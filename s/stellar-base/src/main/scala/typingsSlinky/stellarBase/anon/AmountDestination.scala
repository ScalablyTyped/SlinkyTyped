package typingsSlinky.stellarBase.anon

import typingsSlinky.stellarBase.xdrMod.xdr.Int64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmountDestination extends js.Object {
  
  var amount: Int64 = js.native
  
  var destination: typingsSlinky.stellarBase.xdrMod.xdr.AccountId = js.native
}
object AmountDestination {
  
  @scala.inline
  def apply(amount: Int64, destination: typingsSlinky.stellarBase.xdrMod.xdr.AccountId): AmountDestination = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmountDestination]
  }
  
  @scala.inline
  implicit class AmountDestinationOps[Self <: AmountDestination] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: Int64): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination(value: typingsSlinky.stellarBase.xdrMod.xdr.AccountId): Self = this.set("destination", value.asInstanceOf[js.Any])
  }
}
