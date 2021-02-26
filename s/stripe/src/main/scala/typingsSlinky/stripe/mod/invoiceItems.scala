package typingsSlinky.stripe.mod

import typingsSlinky.stripe.mod.customers.ICustomer
import typingsSlinky.stripe.mod.invoices.IInvoice
import typingsSlinky.stripe.mod.invoices.IPeriod
import typingsSlinky.stripe.mod.plans.IPlan
import typingsSlinky.stripe.mod.subscriptions.ISubscription
import typingsSlinky.stripe.stripeStrings.invoiceitem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invoiceItems {
  
  @js.native
  trait InvoiceItem extends IResourceObject {
    
    var amount: Double = js.native
    
    var currency: String = js.native
    
    var customer: String | ICustomer = js.native
    
    var date: Double = js.native
    
    var description: String = js.native
    
    /**
      * If true, discounts will apply to this invoice item. Always false for prorations.
      */
    var discountable: Boolean = js.native
    
    /**
      * If null, the invoice item is pending and will be included in the upcoming invoice. [Expandable]
      */
    var invoice: String | IInvoice | Null = js.native
    
    var livemode: Boolean = js.native
    
    var metadata: IMetadata = js.native
    
    /**
      * Value is "invoiceitem"
      */
    @JSName("object")
    var object_InvoiceItem: invoiceitem = js.native
    
    var period: IPeriod = js.native
    
    /**
      * If the invoice item is a proration, the plan of the subscription that the proration was computed for.
      */
    var plan: IPlan = js.native
    
    /**
      * Whether or not the invoice item was created automatically as a proration adjustment when the customer switched plans
      */
    var proration: Boolean = js.native
    
    /**
      * If the invoice item is a proration, the quantity of the subscription that the proration was computed for.
      */
    var quantity: Double = js.native
    
    /**
      * The subscription that this invoice item has been created for, if any.
      */
    var subscription: String | ISubscription = js.native
  }
  object InvoiceItem {
    
    @scala.inline
    def apply(
      amount: Double,
      currency: String,
      customer: String | ICustomer,
      date: Double,
      description: String,
      discountable: Boolean,
      id: String,
      livemode: Boolean,
      metadata: IMetadata,
      `object`: invoiceitem,
      period: IPeriod,
      plan: IPlan,
      proration: Boolean,
      quantity: Double,
      subscription: String | ISubscription
    ): InvoiceItem = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], discountable = discountable.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], proration = proration.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvoiceItem]
    }
    
    @scala.inline
    implicit class InvoiceItemMutableBuilder[Self <: InvoiceItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomer(value: String | ICustomer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiscountable(value: Boolean): Self = StObject.set(x, "discountable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvoice(value: String | IInvoice): Self = StObject.set(x, "invoice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvoiceNull: Self = StObject.set(x, "invoice", null)
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: invoiceitem): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeriod(value: IPeriod): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlan(value: IPlan): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProration(value: Boolean): Self = StObject.set(x, "proration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscription(value: String | ISubscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InvoiceItemCreationOptions extends IDataOptionsWithMetadata {
    
    /**
      * The integer amount in cents of the charge to be applied to the upcoming invoice. If you want to apply a credit to the customer’s
      * account, pass a negative amount.
      */
    var amount: js.UndefOr[Double] = js.native
    
    /**
      * 3-letter ISO code for currency.
      */
    var currency: String = js.native
    
    /**
      * The ID of the customer who will be billed when this invoice item is billed.
      */
    var customer: String = js.native
    
    /**
      * An arbitrary string which you can attach to the invoice item. The description is displayed in the invoice for easy tracking.
      * This can be unset by updating the value to null and then saving.
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      * Controls whether discounts apply to this invoice item. Defaults to false for prorations or negative invoice items, and true for
      * all other invoice items.
      */
    var discountable: js.UndefOr[Boolean] = js.native
    
    /**
      * The ID of an existing invoice to add this invoice item to. When left blank, the invoice item will be added to the next upcoming
      * scheduled invoice. Use this when adding invoice items in response to an invoice.created webhook. You cannot add an invoice item
      * to an invoice that has already been paid, attempted or closed.
      */
    var invoice: js.UndefOr[String] = js.native
    
    /**
      * Non-negative integer. The quantity of units for the invoice item.
      */
    var quantity: js.UndefOr[Double] = js.native
    
    /**
      * The ID of a subscription to add this invoice item to. When left blank, the invoice item will be be added to the next upcoming
      * scheduled invoice. When set, scheduled invoices for subscriptions other than the specified subscription will ignore the invoice
      * item. Use this when you want to express that an invoice item has been accrued within the context of a particular subscription.
      */
    var subscription: js.UndefOr[String] = js.native
    
    /**
      * The integer unit amount in cents of the charge to be applied to the upcoming invoice. This unit_amount will be multiplied by
      * the quantity to get the full amount. If you want to apply a credit to the customer’s account, pass a negative unit_amount.
      */
    var unit_amount: js.UndefOr[Double] = js.native
  }
  object InvoiceItemCreationOptions {
    
    @scala.inline
    def apply(currency: String, customer: String): InvoiceItemCreationOptions = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvoiceItemCreationOptions]
    }
    
    @scala.inline
    implicit class InvoiceItemCreationOptionsMutableBuilder[Self <: InvoiceItemCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDiscountable(value: Boolean): Self = StObject.set(x, "discountable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiscountableUndefined: Self = StObject.set(x, "discountable", js.undefined)
      
      @scala.inline
      def setInvoice(value: String): Self = StObject.set(x, "invoice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvoiceUndefined: Self = StObject.set(x, "invoice", js.undefined)
      
      @scala.inline
      def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
      
      @scala.inline
      def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
      
      @scala.inline
      def setUnit_amount(value: Double): Self = StObject.set(x, "unit_amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnit_amountUndefined: Self = StObject.set(x, "unit_amount", js.undefined)
    }
  }
  
  @js.native
  trait InvoiceItemListOptions extends IListOptionsCreated {
    
    /**
      * The identifier of the customer whose invoice items to return. If none is provided, all invoice items will be returned.
      */
    var customer: js.UndefOr[String] = js.native
    
    /**
      * Only return invoice items belonging to this invoice. If none is provided, all invoice items will be returned. If specifying an invoice, no customer identifier is needed.
      */
    var invoice: js.UndefOr[String] = js.native
    
    /**
      * Set to true to only show pending invoice items, which are not yet attached to any invoices. Set to false to only show
      * invoice items already attached to invoices. If unspecified, no filter is applied.
      */
    var pending: js.UndefOr[Boolean] = js.native
  }
  object InvoiceItemListOptions {
    
    @scala.inline
    def apply(): InvoiceItemListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvoiceItemListOptions]
    }
    
    @scala.inline
    implicit class InvoiceItemListOptionsMutableBuilder[Self <: InvoiceItemListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
      
      @scala.inline
      def setInvoice(value: String): Self = StObject.set(x, "invoice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvoiceUndefined: Self = StObject.set(x, "invoice", js.undefined)
      
      @scala.inline
      def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
    }
  }
  
  @js.native
  trait InvoiceItemUpdateOptions extends IDataOptionsWithMetadata {
    
    /**
      * The integer amount in cents/pence of the charge to be applied to the upcoming invoice. If you want to apply a credit to the customer's
      * account, pass a negative amount.
      */
    var amount: js.UndefOr[Double] = js.native
    
    /**
      * An arbitrary string which you can attach to the invoice item. The description is displayed in the invoice for easy tracking. This can be
      * unset by updating the value to null and then saving.
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      * Controls whether discounts apply to this invoice item. Defaults to false for prorations or negative invoice items, and true for all other
      * invoice items. Cannot be set to true for prorations.
      */
    var discountable: js.UndefOr[Boolean] = js.native
  }
  object InvoiceItemUpdateOptions {
    
    @scala.inline
    def apply(): InvoiceItemUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvoiceItemUpdateOptions]
    }
    
    @scala.inline
    implicit class InvoiceItemUpdateOptionsMutableBuilder[Self <: InvoiceItemUpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDiscountable(value: Boolean): Self = StObject.set(x, "discountable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiscountableUndefined: Self = StObject.set(x, "discountable", js.undefined)
    }
  }
}
