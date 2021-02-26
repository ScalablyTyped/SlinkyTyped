package typingsSlinky.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Amountgte extends StObject {
  
  /**
    * Monetary threshold that triggers the subscription to create an invoice.
    */
  var amount_gte: Double = js.native
  
  /**
    * Indicates if the billing_cycle_anchor should be reset when a threshold is reached. If true, billing_cycle_anchor
    * will be updated to the date/time the threshold was last reached; otherwise, the value will remain unchanged.
    * This value may not be true if the subscription contains items with plans that have aggregate_usage=last_ever.
    */
  var reset_billing_cycle_anchor: Boolean = js.native
}
object Amountgte {
  
  @scala.inline
  def apply(amount_gte: Double, reset_billing_cycle_anchor: Boolean): Amountgte = {
    val __obj = js.Dynamic.literal(amount_gte = amount_gte.asInstanceOf[js.Any], reset_billing_cycle_anchor = reset_billing_cycle_anchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amountgte]
  }
  
  @scala.inline
  implicit class AmountgteMutableBuilder[Self <: Amountgte] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount_gte(value: Double): Self = StObject.set(x, "amount_gte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset_billing_cycle_anchor(value: Boolean): Self = StObject.set(x, "reset_billing_cycle_anchor", value.asInstanceOf[js.Any])
  }
}
