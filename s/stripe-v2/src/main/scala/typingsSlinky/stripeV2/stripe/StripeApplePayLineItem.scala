package typingsSlinky.stripeV2.stripe

import typingsSlinky.stripeV2.stripeV2Strings.`final`
import typingsSlinky.stripeV2.stripeV2Strings.pending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/reference/applepayjs/1916082-applepay_js_data_types
@js.native
trait StripeApplePayLineItem extends StObject {
  
  var amount: Double = js.native
  
  var label: String = js.native
  
  var `type`: pending | `final` = js.native
}
object StripeApplePayLineItem {
  
  @scala.inline
  def apply(amount: Double, label: String, `type`: pending | `final`): StripeApplePayLineItem = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeApplePayLineItem]
  }
  
  @scala.inline
  implicit class StripeApplePayLineItemMutableBuilder[Self <: StripeApplePayLineItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: pending | `final`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
