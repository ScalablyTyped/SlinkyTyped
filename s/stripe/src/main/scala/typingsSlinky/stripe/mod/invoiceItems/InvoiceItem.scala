package typingsSlinky.stripe.mod.invoiceItems

import typingsSlinky.stripe.mod.IMetadata
import typingsSlinky.stripe.mod.IResourceObject
import typingsSlinky.stripe.mod.customers.ICustomer
import typingsSlinky.stripe.mod.invoices.IInvoice
import typingsSlinky.stripe.mod.invoices.IPeriod
import typingsSlinky.stripe.mod.plans.IPlan
import typingsSlinky.stripe.mod.subscriptions.ISubscription
import typingsSlinky.stripe.stripeStrings.invoiceitem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class InvoiceItemOps[Self <: InvoiceItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomer(value: String | ICustomer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscountable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discountable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLivemode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("livemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: IMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: invoiceitem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeriod(value: IPeriod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlan(value: IPlan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuantity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscription(value: String | ISubscription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvoice(value: String | IInvoice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvoiceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice")(null)
        ret
    }
  }
  
}

