package typingsSlinky.stripe.mod.creditNotes

import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICreditNoteCreationOptions extends IDataOptionsWithMetadata {
  var amount: Double = js.native
  /**
    * The amount to credit the customer’s balance.
    * It will be automatically applied to their next invoice.
    */
  var credit_amount: js.UndefOr[Double] = js.native
  var invoice: String = js.native
  /**
    * The credit note’s memo appears on the credit note PDF. This can be unset by updating the value to nil and then saving.
    */
  var memo: js.UndefOr[String] = js.native
  /**
    * Reason for issuing this credit note, one of duplicate, fraudulent, order_change, or product_unsatisfactory.
    */
  var reason: js.UndefOr[CreditNoteReason] = js.native
  /**
    * ID of an existing refund to link this credit note to.
    */
  var refund: js.UndefOr[String] = js.native
  /**
    * The amount to refund. If set, a refund will be created for the charge associated with the invoice.
    */
  var refund_amount: js.UndefOr[Double] = js.native
}

object ICreditNoteCreationOptions {
  @scala.inline
  def apply(amount: Double, invoice: String): ICreditNoteCreationOptions = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], invoice = invoice.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreditNoteCreationOptions]
  }
  @scala.inline
  implicit class ICreditNoteCreationOptionsOps[Self <: ICreditNoteCreationOptions] (val x: Self) extends AnyVal {
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
    def withInvoice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCredit_amount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credit_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredit_amount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credit_amount")(js.undefined)
        ret
    }
    @scala.inline
    def withMemo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memo")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: CreditNoteReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
    @scala.inline
    def withRefund(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefund: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund")(js.undefined)
        ret
    }
    @scala.inline
    def withRefund_amount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefund_amount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_amount")(js.undefined)
        ret
    }
  }
  
}

