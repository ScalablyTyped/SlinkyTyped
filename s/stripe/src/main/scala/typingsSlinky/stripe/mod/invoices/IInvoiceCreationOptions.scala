package typingsSlinky.stripe.mod.invoices

import typingsSlinky.stripe.anon.Name
import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import typingsSlinky.stripe.stripeStrings.charge_automatically
import typingsSlinky.stripe.stripeStrings.send_invoice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IInvoiceCreationOptionsOps[Self <: IInvoiceCreationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication_fee(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application_fee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplication_fee: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application_fee")(js.undefined)
        ret
    }
    @scala.inline
    def withAuto_advance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_advance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuto_advance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_advance")(js.undefined)
        ret
    }
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
    def withCustom_fields(value: js.Array[Name]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_fields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_fields")(js.undefined)
        ret
    }
    @scala.inline
    def withDays_until_due(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days_until_due")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDays_until_due: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days_until_due")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_source(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_source: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_source")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDue_dateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("due_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDue_date(value: js.Date | Double): Self = {
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
    def withFooter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(null)
        ret
    }
    @scala.inline
    def withStatement_descriptor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement_descriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatement_descriptor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement_descriptor")(js.undefined)
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
    @scala.inline
    def withTax_percent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTax_percent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_percent")(js.undefined)
        ret
    }
  }
  
}

