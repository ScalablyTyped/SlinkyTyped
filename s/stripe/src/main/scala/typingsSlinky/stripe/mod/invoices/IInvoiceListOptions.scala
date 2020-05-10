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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IInvoiceListOptionsOps[Self <: IInvoiceListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBilling(value: charge_automatically | send_invoice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBilling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing")(js.undefined)
        ret
    }
    @scala.inline
    def withCollection_method(value: charge_automatically | send_invoice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollection_method: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection_method")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: IDateFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(js.undefined)
        ret
    }
    @scala.inline
    def withDate(value: IDateFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withDue_date(value: IDateFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("due_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDue_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("due_date")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: draft | open | paid | uncollectible | void): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(js.undefined)
        ret
    }
  }
  
}

