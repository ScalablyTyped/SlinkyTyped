package typingsSlinky.stripe.mod.creditNotes

import typingsSlinky.stripe.mod.IMetadata
import typingsSlinky.stripe.mod.IResourceObject
import typingsSlinky.stripe.mod.balance.IBalanceTransaction
import typingsSlinky.stripe.mod.customers.ICustomer
import typingsSlinky.stripe.mod.invoices.IInvoice
import typingsSlinky.stripe.mod.refunds.IRefund
import typingsSlinky.stripe.stripeStrings.credit_note
import typingsSlinky.stripe.stripeStrings.issued
import typingsSlinky.stripe.stripeStrings.post_payment
import typingsSlinky.stripe.stripeStrings.pre_payment
import typingsSlinky.stripe.stripeStrings.void
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Credit notes are documents that decrease the amount owed on a specified invoice.
  * Credit notes are the only way to adjust the amount of an invoice once it's been finalized
  * (other than voiding and recreating the invoice from scratch).
  */
@js.native
trait ICreditNote extends IResourceObject {
  /**
    * The integer amount in cents representing the total amount of the credit note.
    */
  var amount: Double = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String = js.native
  /**
    * ID of the customer. [Expandable]
    */
  var customer: String | ICustomer = js.native
  /**
    * Customer balance transaction related to this credit note. [Expandable]
    */
  var customer_balance_transaction: String | IBalanceTransaction = js.native
  /**
    * ID of the invoice. [Expandable]
    */
  var invoice: String | IInvoice = js.native
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean = js.native
  /**
    * Customer-facing text that appears on the credit note PDF.
    */
  var memo: String | Null = js.native
  /**
    * Set of key-value pairs that you can attach to an object.
    * This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: IMetadata = js.native
  /**
    * A unique number that identifies this particular credit note.
    * It appears on the PDF of the credit note and its associated invoice.
    */
  var number: String = js.native
  /**
    * Value is "credit_note"
    */
  @JSName("object")
  var object_ICreditNote: credit_note = js.native
  /**
    * The link to download the PDF of the credit note.
    */
  var pdf: String = js.native
  /**
    * Reason for issuing this credit note, one of duplicate, fraudulent, order_change, or product_unsatisfactory
    */
  var reason: CreditNoteReason | Null = js.native
  /**
    * Refund related to this credit note. [Expandable]
    */
  var refund: String | Null | IRefund = js.native
  /**
    * Status of this credit note, one of issued or void.
    */
  var status: issued | void = js.native
  /**
    * Type of this credit note, one of post_payment or pre_payment.
    * A pre_payment credit note means it was issued when the invoice was open.
    * A post_payment credit note means it was issued when the invoice was paid.
    */
  var `type`: post_payment | pre_payment = js.native
}

object ICreditNote {
  @scala.inline
  def apply(
    amount: Double,
    created: Double,
    currency: String,
    customer: String | ICustomer,
    customer_balance_transaction: String | IBalanceTransaction,
    id: String,
    invoice: String | IInvoice,
    livemode: Boolean,
    metadata: IMetadata,
    number: String,
    `object`: credit_note,
    pdf: String,
    status: issued | void,
    `type`: post_payment | pre_payment
  ): ICreditNote = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], customer_balance_transaction = customer_balance_transaction.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invoice = invoice.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], pdf = pdf.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreditNote]
  }
  @scala.inline
  implicit class ICreditNoteOps[Self <: ICreditNote] (val x: Self) extends AnyVal {
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
    def withCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
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
    def withCustomer_balance_transaction(value: String | IBalanceTransaction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer_balance_transaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvoice(value: String | IInvoice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice")(value.asInstanceOf[js.Any])
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
    def withNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: credit_note): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPdf(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: issued | void): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: post_payment | pre_payment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memo")(null)
        ret
    }
    @scala.inline
    def withReason(value: CreditNoteReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReasonNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(null)
        ret
    }
    @scala.inline
    def withRefund(value: String | IRefund): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefundNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund")(null)
        ret
    }
  }
  
}

