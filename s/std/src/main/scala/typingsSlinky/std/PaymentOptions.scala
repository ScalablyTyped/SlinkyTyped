package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentOptions extends StObject {
  
  var requestPayerEmail: js.UndefOr[scala.Boolean] = js.native
  
  var requestPayerName: js.UndefOr[scala.Boolean] = js.native
  
  var requestPayerPhone: js.UndefOr[scala.Boolean] = js.native
  
  var requestShipping: js.UndefOr[scala.Boolean] = js.native
  
  var shippingType: js.UndefOr[java.lang.String] = js.native
}
object PaymentOptions {
  
  @scala.inline
  def apply(): PaymentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentOptions]
  }
  
  @scala.inline
  implicit class PaymentOptionsMutableBuilder[Self <: PaymentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestPayerEmail(value: scala.Boolean): Self = StObject.set(x, "requestPayerEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestPayerEmailUndefined: Self = StObject.set(x, "requestPayerEmail", js.undefined)
    
    @scala.inline
    def setRequestPayerName(value: scala.Boolean): Self = StObject.set(x, "requestPayerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestPayerNameUndefined: Self = StObject.set(x, "requestPayerName", js.undefined)
    
    @scala.inline
    def setRequestPayerPhone(value: scala.Boolean): Self = StObject.set(x, "requestPayerPhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestPayerPhoneUndefined: Self = StObject.set(x, "requestPayerPhone", js.undefined)
    
    @scala.inline
    def setRequestShipping(value: scala.Boolean): Self = StObject.set(x, "requestShipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestShippingUndefined: Self = StObject.set(x, "requestShipping", js.undefined)
    
    @scala.inline
    def setShippingType(value: java.lang.String): Self = StObject.set(x, "shippingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingTypeUndefined: Self = StObject.set(x, "shippingType", js.undefined)
  }
}
