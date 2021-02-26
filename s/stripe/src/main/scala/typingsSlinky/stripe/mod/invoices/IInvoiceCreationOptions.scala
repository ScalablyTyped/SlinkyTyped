package typingsSlinky.stripe.mod.invoices

import typingsSlinky.stripe.anon.Name
import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import typingsSlinky.stripe.stripeStrings.charge_automatically
import typingsSlinky.stripe.stripeStrings.send_invoice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInvoiceCreationOptions extends IDataOptionsWithMetadata {
  
  /**
    * A fee in pence that will be applied to the invoice and transferred to the application owner’s Stripe account.
    * The request must be made with an OAuth key or the Stripe-Account header in order to take an application fee.
    * For more information, see the application fees documentation.
    */
  var application_fee: js.UndefOr[Double] = js.native
  
  /**
    * Controls whether Stripe will perform
    * [automatic collection](https://stripe.com/docs/billing/invoices/workflow/#auto_advance)
    * of the invoice. When `false`, the invoice’s state will not automatically advance
    * without an explicit action.
    */
  var auto_advance: js.UndefOr[Boolean] = js.native
  
  /**
    * @deprecated Use collection_method instead
    */
  var billing: js.UndefOr[charge_automatically | send_invoice] = js.native
  
  /**
    * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe
    * will attempt to pay this invoice using the default source attached to the customer.
    * When sending an invoice, Stripe will email this invoice to the customer with payment
    * instructions. Defaults to charge_automatically.
    */
  var collection_method: js.UndefOr[charge_automatically | send_invoice] = js.native
  
  /**
    * A list of up to 4 custom fields to be displayed on the invoice.
    */
  var custom_fields: js.UndefOr[js.Array[Name]] = js.native
  
  var customer: String = js.native
  
  /**
    * The number of days from when the invoice is created until it is due. Valid only for
    * invoices where `billing=send_invoice`.
    */
  var days_until_due: js.UndefOr[Double] = js.native
  
  /**
    * ID of the default payment source for the invoice. It must belong to the customer
    * associated with the invoice and be in a chargeable state. If not set, defaults to the
    * subscription’s default source, if any, or to the customer’s default source.
    */
  var default_source: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  /**
    * The date on which payment for this invoice is due. Valid only for invoices where
    * `billing=send_invoice`;
    */
  var due_date: js.UndefOr[js.Date | Double] = js.native
  
  /**
    * Footer to be displayed on the invoice. This can be unset by updating the value to
    * `null` and then saving.
    */
  var footer: js.UndefOr[String | Null] = js.native
  
  /**
    * Extra information about a charge for the customer’s credit card statement.
    */
  var statement_descriptor: js.UndefOr[String] = js.native
  
  /**
    * The ID of the subscription to invoice, if any. If not set, the created invoice will
    * include all pending invoice items for the customer. If set, the created invoice will
    * exclude pending invoice items that pertain to other subscriptions. The subscription’s
    * billing cycle and regular subscription events won’t be affected.
    */
  var subscription: js.UndefOr[String] = js.native
  
  /**
    * The percent tax rate applied to the invoice, represented as a decimal number.
    */
  var tax_percent: js.UndefOr[Double] = js.native
}
object IInvoiceCreationOptions {
  
  @scala.inline
  def apply(customer: String): IInvoiceCreationOptions = {
    val __obj = js.Dynamic.literal(customer = customer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvoiceCreationOptions]
  }
  
  @scala.inline
  implicit class IInvoiceCreationOptionsMutableBuilder[Self <: IInvoiceCreationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication_fee(value: Double): Self = StObject.set(x, "application_fee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication_feeUndefined: Self = StObject.set(x, "application_fee", js.undefined)
    
    @scala.inline
    def setAuto_advance(value: Boolean): Self = StObject.set(x, "auto_advance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuto_advanceUndefined: Self = StObject.set(x, "auto_advance", js.undefined)
    
    @scala.inline
    def setBilling(value: charge_automatically | send_invoice): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingUndefined: Self = StObject.set(x, "billing", js.undefined)
    
    @scala.inline
    def setCollection_method(value: charge_automatically | send_invoice): Self = StObject.set(x, "collection_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollection_methodUndefined: Self = StObject.set(x, "collection_method", js.undefined)
    
    @scala.inline
    def setCustom_fields(value: js.Array[Name]): Self = StObject.set(x, "custom_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_fieldsUndefined: Self = StObject.set(x, "custom_fields", js.undefined)
    
    @scala.inline
    def setCustom_fieldsVarargs(value: Name*): Self = StObject.set(x, "custom_fields", js.Array(value :_*))
    
    @scala.inline
    def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDays_until_due(value: Double): Self = StObject.set(x, "days_until_due", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDays_until_dueUndefined: Self = StObject.set(x, "days_until_due", js.undefined)
    
    @scala.inline
    def setDefault_source(value: String): Self = StObject.set(x, "default_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_sourceUndefined: Self = StObject.set(x, "default_source", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDue_date(value: js.Date | Double): Self = StObject.set(x, "due_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDue_dateDate(value: js.Date): Self = StObject.set(x, "due_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDue_dateUndefined: Self = StObject.set(x, "due_date", js.undefined)
    
    @scala.inline
    def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterNull: Self = StObject.set(x, "footer", null)
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatement_descriptorUndefined: Self = StObject.set(x, "statement_descriptor", js.undefined)
    
    @scala.inline
    def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    @scala.inline
    def setTax_percent(value: Double): Self = StObject.set(x, "tax_percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTax_percentUndefined: Self = StObject.set(x, "tax_percent", js.undefined)
  }
}
