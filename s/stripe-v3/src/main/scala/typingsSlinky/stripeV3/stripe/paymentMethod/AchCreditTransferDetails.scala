package typingsSlinky.stripeV3.stripe.paymentMethod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AchCreditTransferDetails extends StObject {
  
  var account_number: String = js.native
  
  var bank_name: String = js.native
  
  var routing_number: String = js.native
  
  var swift_coode: String = js.native
}
object AchCreditTransferDetails {
  
  @scala.inline
  def apply(account_number: String, bank_name: String, routing_number: String, swift_coode: String): AchCreditTransferDetails = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any], swift_coode = swift_coode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AchCreditTransferDetails]
  }
  
  @scala.inline
  implicit class AchCreditTransferDetailsMutableBuilder[Self <: AchCreditTransferDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount_number(value: String): Self = StObject.set(x, "account_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBank_name(value: String): Self = StObject.set(x, "bank_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouting_number(value: String): Self = StObject.set(x, "routing_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwift_coode(value: String): Self = StObject.set(x, "swift_coode", value.asInstanceOf[js.Any])
  }
}
