package typingsSlinky.stripe.mod.invoiceItems

import typingsSlinky.stripe.mod.IListOptionsCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class InvoiceItemListOptionsOps[Self <: InvoiceItemListOptions] (val x: Self) extends AnyVal {
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
    def withoutCustomer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(js.undefined)
        ret
    }
    @scala.inline
    def withInvoice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvoice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice")(js.undefined)
        ret
    }
    @scala.inline
    def withPending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending")(js.undefined)
        ret
    }
  }
  
}

