package typingsSlinky.stripe.mod.invoices

import typingsSlinky.stripe.mod.IDateFilter
import typingsSlinky.stripe.mod.IListOptions
import typingsSlinky.stripe.stripeStrings.charge_automatically
import typingsSlinky.stripe.stripeStrings.draft
import typingsSlinky.stripe.stripeStrings.open
import typingsSlinky.stripe.stripeStrings.paid
import typingsSlinky.stripe.stripeStrings.send_invoice
import typingsSlinky.stripe.stripeStrings.uncollectible
import typingsSlinky.stripe.stripeStrings.void
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInvoiceListOptions extends IListOptions {
  
  /**
    * The billing mode of the invoice to retrieve. Either `charge_automatically` or `send_invoice`
    * This field has been renamed to collection_method and will be removed in a future API version.
    */
  var billing: js.UndefOr[charge_automatically | send_invoice] = js.native
  
  /**
    * Either charge_automatically, or send_invoice. When charging automatically, Stripe will attempt to pay
    * this invoice using the default source attached to the customer. When sending an invoice, Stripe will
    * email this invoice to the customer with payment instructions.
    */
  var collection_method: js.UndefOr[charge_automatically | send_invoice] = js.native
  
  /**
    * A filter on the list based on the object created field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var created: js.UndefOr[IDateFilter] = js.native
  
  /**
    * The identifier of the customer whose invoices to return. If none is provided, all invoices will be returned.
    */
  var customer: js.UndefOr[String] = js.native
  
  /**
    * @deprecated Use created property instead as of api version 2019-03-14.
    */
  var date: js.UndefOr[IDateFilter] = js.native
  
  /**
    * A filter on the list based on the object due_date field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var due_date: js.UndefOr[IDateFilter] = js.native
  
  /**
    * The status of the invoice, one of draft, open, paid, uncollectible, or void.
    */
  var status: js.UndefOr[draft | open | paid | uncollectible | void] = js.native
  
  /**
    * Only return invoices for the subscription specified by this subscription ID
    */
  var subscription: js.UndefOr[String] = js.native
}
object IInvoiceListOptions {
  
  @scala.inline
  def apply(): IInvoiceListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInvoiceListOptions]
  }
  
  @scala.inline
  implicit class IInvoiceListOptionsMutableBuilder[Self <: IInvoiceListOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBilling(value: charge_automatically | send_invoice): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingUndefined: Self = StObject.set(x, "billing", js.undefined)
    
    @scala.inline
    def setCollection_method(value: charge_automatically | send_invoice): Self = StObject.set(x, "collection_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollection_methodUndefined: Self = StObject.set(x, "collection_method", js.undefined)
    
    @scala.inline
    def setCreated(value: IDateFilter): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    @scala.inline
    def setDate(value: IDateFilter): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDue_date(value: IDateFilter): Self = StObject.set(x, "due_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDue_dateUndefined: Self = StObject.set(x, "due_date", js.undefined)
    
    @scala.inline
    def setStatus(value: draft | open | paid | uncollectible | void): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
