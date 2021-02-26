package typingsSlinky.stripe.anon

import typingsSlinky.stripe.stripeStrings.email
import typingsSlinky.stripe.stripeStrings.manual
import typingsSlinky.stripe.stripeStrings.none
import typingsSlinky.stripe.stripeStrings.one_time
import typingsSlinky.stripe.stripeStrings.scheduled
import typingsSlinky.stripe.stripeStrings.variable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Currency extends StObject {
  
  var acceptance: js.UndefOr[Online] = js.native
  
  var amount: js.UndefOr[Double | Null] = js.native
  
  var currency: js.UndefOr[String] = js.native
  
  var interval: js.UndefOr[one_time | scheduled | variable] = js.native
  
  var notification_method: js.UndefOr[email | manual | none] = js.native
}
object Currency {
  
  @scala.inline
  def apply(): Currency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Currency]
  }
  
  @scala.inline
  implicit class CurrencyMutableBuilder[Self <: Currency] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptance(value: Online): Self = StObject.set(x, "acceptance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptanceUndefined: Self = StObject.set(x, "acceptance", js.undefined)
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountNull: Self = StObject.set(x, "amount", null)
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setInterval(value: one_time | scheduled | variable): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setNotification_method(value: email | manual | none): Self = StObject.set(x, "notification_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification_methodUndefined: Self = StObject.set(x, "notification_method", js.undefined)
  }
}
