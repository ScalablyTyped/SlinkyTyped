package typingsSlinky.stripe.mod.paymentMethods

import typingsSlinky.stripe.stripeStrings.failed
import typingsSlinky.stripe.stripeStrings.pass
import typingsSlinky.stripe.stripeStrings.unavailable
import typingsSlinky.stripe.stripeStrings.unchecked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardChecks extends StObject {
  
  /**
    * If a address line1 was provided, results of the check, one of `pass`, `failed`, `unavailable` or `unchecked`.
    */
  var address_line1_check: pass | failed | unavailable | unchecked | Null = js.native
  
  /**
    * If a address postal code was provided, results of the check, one of `pass`, `failed`, `unavailable` or `unchecked`.
    */
  var address_postal_code_check: pass | failed | unavailable | unchecked | Null = js.native
  
  /**
    * If a CVC was provided, results of the check, one of `pass`, `failed`, `unavailable` or `unchecked`.
    */
  var cvc_check: pass | failed | unavailable | unchecked | Null = js.native
}
object CardChecks {
  
  @scala.inline
  def apply(): CardChecks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardChecks]
  }
  
  @scala.inline
  implicit class CardChecksMutableBuilder[Self <: CardChecks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress_line1_check(value: pass | failed | unavailable | unchecked): Self = StObject.set(x, "address_line1_check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_line1_checkNull: Self = StObject.set(x, "address_line1_check", null)
    
    @scala.inline
    def setAddress_postal_code_check(value: pass | failed | unavailable | unchecked): Self = StObject.set(x, "address_postal_code_check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_postal_code_checkNull: Self = StObject.set(x, "address_postal_code_check", null)
    
    @scala.inline
    def setCvc_check(value: pass | failed | unavailable | unchecked): Self = StObject.set(x, "cvc_check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCvc_checkNull: Self = StObject.set(x, "cvc_check", null)
  }
}
