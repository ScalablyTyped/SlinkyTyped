package typingsSlinky.stripeV3.stripe

import typingsSlinky.stripeV3.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfirmCardSetupData extends StObject {
  
  /*
    * Pass an object to confirm using data collected by a card or
    * cardNumber Element or an with an existing token and to supply
    * additional data relevant to the PaymentMethod, such as billing
    * details:
    */
  var payment_method: js.UndefOr[String | `0`] = js.native
}
object ConfirmCardSetupData {
  
  @scala.inline
  def apply(): ConfirmCardSetupData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmCardSetupData]
  }
  
  @scala.inline
  implicit class ConfirmCardSetupDataMutableBuilder[Self <: ConfirmCardSetupData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayment_method(value: String | `0`): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
  }
}
