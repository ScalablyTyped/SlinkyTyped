package typingsSlinky.stripe.mod.invoiceItems

import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class InvoiceItemUpdateOptionsOps[Self <: InvoiceItemUpdateOptions] (val x: Self) extends AnyVal {
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
    def withoutAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(js.undefined)
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
    def withDiscountable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discountable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscountable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discountable")(js.undefined)
        ret
    }
  }
  
}

