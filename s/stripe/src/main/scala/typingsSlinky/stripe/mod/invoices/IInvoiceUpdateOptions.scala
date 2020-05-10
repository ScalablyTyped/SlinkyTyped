package typingsSlinky.stripe.mod.invoices

import typingsSlinky.stripe.AnonName
import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInvoiceUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * A fee in pence that will be applied to the invoice and transferred to the application owner’s Stripe account.
    * The request must be made with an OAuth key or the Stripe-Account header in order to take an application fee.
    * For more information, see the application fees documentation.
    */
  var application_fee: js.UndefOr[Double] = js.native
  /**
    * Controls whether Stripe will perform
    * [automatic collection](https://stripe.com/docs/billing/invoices/workflow/#auto_advance)
    * of the invoice.
    */
  var auto_advance: js.UndefOr[Boolean] = js.native
  /**
    * Boolean representing whether an invoice is closed or not. To close an invoice, pass true.
    */
  var closed: js.UndefOr[Boolean] = js.native
  /**
    * A list of up to 4 custom fields to be displayed on the invoice.
    */
  var custom_fields: js.UndefOr[js.Array[AnonName]] = js.native
  /**
    * The number of days from which the invoice is created until it is due. Only valid for
    * invoices where billing=send_invoice. This field can only be updated on draft
    * invoices.
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
    * The date on which payment for this invoice is due. Only valid for invoices where
    * `billing=send_invoice`. This field can only be updated on draft invoices.
    */
  var due_date: js.UndefOr[js.Date | Double] = js.native
  /**
    * Footer to be displayed on the invoice. This can be unset by updating the value to
    * `null` and then saving.
    */
  var footer: js.UndefOr[String | Null] = js.native
  /**
    * Boolean representing whether an invoice is forgiven or not. To forgive an invoice, pass true. Forgiving an invoice
    * instructs us to update the subscription status as if the invoice were successfully paid. Once an invoice has been
    * forgiven, it cannot be unforgiven or reopened.
    */
  var forgiven: js.UndefOr[Boolean] = js.native
  /**
    * Extra information about a charge for the customer’s credit card statement.
    */
  var statement_descriptor: js.UndefOr[String] = js.native
  /**
    * The percent tax rate applied to the invoice, represented as a non-negative decimal
    * number (with at most four decimal places) between 0 and 100. To unset a
    * previously-set value, pass an empty string. This field can be updated only on draft
    * invoices.
    */
  var tax_percent: js.UndefOr[Double] = js.native
}

object IInvoiceUpdateOptions {
  @scala.inline
  def apply(): IInvoiceUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInvoiceUpdateOptions]
  }
  @scala.inline
  implicit class IInvoiceUpdateOptionsOps[Self <: IInvoiceUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withClosed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom_fields(value: js.Array[AnonName]): Self = {
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
    def withForgiven(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forgiven")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForgiven: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forgiven")(js.undefined)
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

