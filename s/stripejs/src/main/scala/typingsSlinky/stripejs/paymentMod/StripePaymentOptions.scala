package typingsSlinky.stripejs.paymentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StripePaymentOptions extends UpdateOptions {
  
  /**
    * The two letter code representing your country
    * @example 'US'
    */
  var country: String = js.native
  
  /**
    * Whether or not the form should ask for the payer's email address
    * @default false
    */
  var requestPayerEmail: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not the form should ask for the payer's name
    * @default false
    */
  var requestPayerName: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not the form should ask for the payer's phone number
    * @default false
    */
  var requestPayerPhone: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not a shipping address should be requested
    * NOTE: Setting this to true requires `shippingOptions` to be set with at least one option!
    * @see shippingOptions
    */
  var requestShipping: js.UndefOr[Boolean] = js.native
}
object StripePaymentOptions {
  
  @scala.inline
  def apply(country: String, currency: String, total: PaymentItem): StripePaymentOptions = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripePaymentOptions]
  }
  
  @scala.inline
  implicit class StripePaymentOptionsOps[Self <: StripePaymentOptions] (val x: Self) extends AnyVal {
    
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestPayerEmail(value: Boolean): Self = this.set("requestPayerEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestPayerEmail: Self = this.set("requestPayerEmail", js.undefined)
    
    @scala.inline
    def setRequestPayerName(value: Boolean): Self = this.set("requestPayerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestPayerName: Self = this.set("requestPayerName", js.undefined)
    
    @scala.inline
    def setRequestPayerPhone(value: Boolean): Self = this.set("requestPayerPhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestPayerPhone: Self = this.set("requestPayerPhone", js.undefined)
    
    @scala.inline
    def setRequestShipping(value: Boolean): Self = this.set("requestShipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestShipping: Self = this.set("requestShipping", js.undefined)
  }
}
