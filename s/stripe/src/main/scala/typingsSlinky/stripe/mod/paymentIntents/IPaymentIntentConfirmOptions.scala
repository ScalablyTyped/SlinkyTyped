package typingsSlinky.stripe.mod.paymentIntents

import typingsSlinky.stripe.mod.IShippingInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPaymentIntentConfirmOptions extends StObject {
  
  /**
    * The client secret of this PaymentIntent. Used for client-side retrieval using a publishable key. Please refer to dynamic authentication guide on how client_secret should be handled. Required if using Publishable Key!
    */
  var client_secret: js.UndefOr[String] = js.native
  
  /**
    * Set to true to indicate that the customer is not in your checkout flow during this payment attempt, and therefore is unable to authenticate. This parameter is intended for scenarios where you collect card details and charge them later.
    */
  var off_session: js.UndefOr[Boolean] = js.native
  
  /**
    * ID of the payment method (a PaymentMethod, Card, BankAccount, or saved Source object) to attach to this PaymentIntent.
    */
  var payment_method: js.UndefOr[String] = js.native
  
  /**
    * Payment-method-specific configuration for this PaymentIntent.
    */
  var payment_method_options: js.UndefOr[IPaymentMethodOptions] = js.native
  
  /**
    * The list of payment method types that this PaymentIntent is allowed to use.
    */
  var payment_method_types: js.UndefOr[js.Array[PaymentIntentPaymentMethodType]] = js.native
  
  /**
    * Email address that the receipt for the resulting payment will be sent to.
    */
  var receipt_email: js.UndefOr[String | Null] = js.native
  
  /**
    * The URL to redirect your customer back to after they authenticate or cancel their payment on the payment method’s app or site. If you’d prefer to redirect to a mobile application, you can alternatively supply an application URI scheme. This parameter is only used for cards and other redirect-based payment methods.
    */
  var return_url: js.UndefOr[String] = js.native
  
  /**
    * Set to `true` to save this PaymentIntent’s payment method to the associated Customer, if the payment method is not already attached. This parameter only applies to the payment method passed in the same request or the current payment method attached to the PaymentIntent and must be specified again if a new payment method is added.
    */
  var save_payment_method: js.UndefOr[Boolean] = js.native
  
  /*
    * Indicates that you intend to make future payments with this PaymentIntent’s payment method.
    */
  var setup_future_usage: js.UndefOr[PaymentIntentFutureUsageType] = js.native
  
  /**
    * Shipping information for this PaymentIntent.
    */
  var shipping: js.UndefOr[IShippingInformation | Null] = js.native
}
object IPaymentIntentConfirmOptions {
  
  @scala.inline
  def apply(): IPaymentIntentConfirmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaymentIntentConfirmOptions]
  }
  
  @scala.inline
  implicit class IPaymentIntentConfirmOptionsMutableBuilder[Self <: IPaymentIntentConfirmOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_secretUndefined: Self = StObject.set(x, "client_secret", js.undefined)
    
    @scala.inline
    def setOff_session(value: Boolean): Self = StObject.set(x, "off_session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOff_sessionUndefined: Self = StObject.set(x, "off_session", js.undefined)
    
    @scala.inline
    def setPayment_method(value: String): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
    
    @scala.inline
    def setPayment_method_options(value: IPaymentMethodOptions): Self = StObject.set(x, "payment_method_options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_method_optionsUndefined: Self = StObject.set(x, "payment_method_options", js.undefined)
    
    @scala.inline
    def setPayment_method_types(value: js.Array[PaymentIntentPaymentMethodType]): Self = StObject.set(x, "payment_method_types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_method_typesUndefined: Self = StObject.set(x, "payment_method_types", js.undefined)
    
    @scala.inline
    def setPayment_method_typesVarargs(value: PaymentIntentPaymentMethodType*): Self = StObject.set(x, "payment_method_types", js.Array(value :_*))
    
    @scala.inline
    def setReceipt_email(value: String): Self = StObject.set(x, "receipt_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceipt_emailNull: Self = StObject.set(x, "receipt_email", null)
    
    @scala.inline
    def setReceipt_emailUndefined: Self = StObject.set(x, "receipt_email", js.undefined)
    
    @scala.inline
    def setReturn_url(value: String): Self = StObject.set(x, "return_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_urlUndefined: Self = StObject.set(x, "return_url", js.undefined)
    
    @scala.inline
    def setSave_payment_method(value: Boolean): Self = StObject.set(x, "save_payment_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSave_payment_methodUndefined: Self = StObject.set(x, "save_payment_method", js.undefined)
    
    @scala.inline
    def setSetup_future_usage(value: PaymentIntentFutureUsageType): Self = StObject.set(x, "setup_future_usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetup_future_usageUndefined: Self = StObject.set(x, "setup_future_usage", js.undefined)
    
    @scala.inline
    def setShipping(value: IShippingInformation): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingNull: Self = StObject.set(x, "shipping", null)
    
    @scala.inline
    def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
  }
}
