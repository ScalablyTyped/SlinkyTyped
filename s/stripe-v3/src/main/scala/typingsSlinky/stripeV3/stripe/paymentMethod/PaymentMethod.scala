package typingsSlinky.stripeV3.stripe.paymentMethod

import typingsSlinky.stripeV3.stripe.BillingDetails
import typingsSlinky.stripeV3.stripe.Metadata
import typingsSlinky.stripeV3.stripeV3Strings.payment_method
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentMethod extends StObject {
  
  /**
    * Billing information associated with the PaymentMethod that may be
    * used or required by particular types of payment methods.
    */
  var billing_details: BillingDetails = js.native
  
  /**
    * If this is a card PaymentMethod, this hash contains details about the card.
    */
  var card: js.UndefOr[PaymentMethodCard] = js.native
  
  /**
    * If this is an card_present PaymentMethod, this hash contains details
    * about the Card Present payment method.
    */
  var card_present: js.UndefOr[js.Any] = js.native
  
  /**
    * Time at which the object was created. Measured in seconds since the
    * Unix epoch.
    */
  var created: Double = js.native
  
  /**
    * The ID of the Customer to which this PaymentMethod is saved.
    * This will not be set when the PaymentMethod has not been saved to a Customer.
    */
  var customer: String | Null = js.native
  
  /**
    * The unique identifier for the object
    */
  var id: String = js.native
  
  /**
    * Has the value true if the object exists in live mode or the value
    * false if the object exists in test mode.
    */
  var livemode: Boolean = js.native
  
  var metadata: Metadata = js.native
  
  /**
    * Value is "payment_method"
    */
  var `object`: payment_method = js.native
  
  /**
    * The type of the PaymentMethod. An additional hash is included on the
    * PaymentMethod with a name matching this value. It contains additional
    * information specific to the PaymentMethod type.
    */
  var `type`: String = js.native
}
object PaymentMethod {
  
  @scala.inline
  def apply(
    billing_details: BillingDetails,
    created: Double,
    id: String,
    livemode: Boolean,
    metadata: Metadata,
    `object`: payment_method,
    `type`: String
  ): PaymentMethod = {
    val __obj = js.Dynamic.literal(billing_details = billing_details.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethod]
  }
  
  @scala.inline
  implicit class PaymentMethodMutableBuilder[Self <: PaymentMethod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBilling_details(value: BillingDetails): Self = StObject.set(x, "billing_details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCard(value: PaymentMethodCard): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    @scala.inline
    def setCard_present(value: js.Any): Self = StObject.set(x, "card_present", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCard_presentUndefined: Self = StObject.set(x, "card_present", js.undefined)
    
    @scala.inline
    def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerNull: Self = StObject.set(x, "customer", null)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: payment_method): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
