package typingsSlinky.stripe.mod.refunds

import typingsSlinky.stripe.mod.IMetadata
import typingsSlinky.stripe.mod.balance.IBalanceTransaction
import typingsSlinky.stripe.mod.charges.ICharge
import typingsSlinky.stripe.stripeStrings.canceled
import typingsSlinky.stripe.stripeStrings.expired_or_canceled_card
import typingsSlinky.stripe.stripeStrings.failed
import typingsSlinky.stripe.stripeStrings.lost_or_stolen_card
import typingsSlinky.stripe.stripeStrings.pending
import typingsSlinky.stripe.stripeStrings.succeeded
import typingsSlinky.stripe.stripeStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRefund extends js.Object {
  /**
    * Amount in cents/pence.
    */
  var amount: Double = js.native
  /**
    * Balance transaction that describes the impact of this reversal on your account balance.
    */
  var balance_transaction: String | IBalanceTransaction = js.native
  /**
    * ID of the charge that was refunded. [Expandable]
    */
  var charge: String | ICharge = js.native
  var created: Double = js.native
  /**
    * Three-letter ISO currency code representing the currency in which the charge was made.
    */
  var currency: String = js.native
  var description: js.UndefOr[String] = js.native
  /**
    * If the refund failed, the reason for refund failure if known.
    */
  var failure_reason: js.UndefOr[lost_or_stolen_card | expired_or_canceled_card | unknown_] = js.native
  var id: String = js.native
  /**
    * A set of key/value pairs that you can attach to the object. It can be useful
    * for storing additional information in a structured format.
    */
  var metadata: IMetadata = js.native
  /**
    * Value is 'refund'
    */
  var `object`: String = js.native
  /**
    * Reason for the refund. If set, possible values are "duplicate", "fraudulent", and "requested_by_customer".
    */
  var reason: String = js.native
  /**
    * This is the transaction number that appears on email receipts sent for this refund.
    */
  var receipt_number: String = js.native
  /**
    * The transfer reversal that is associated with the refund. Only present if the charge
    * came from another Stripe account. See the Connect documentation for details.
    */
  var source_transfer_reversal: js.UndefOr[String | Null] = js.native
  /**
    * Status of the refund. For credit card refunds, this can be succeeded or failed.
    * For other types of refunds, it can be pending, succeeded, failed, or canceled.
    */
  var status: pending | succeeded | failed | canceled = js.native
  /**
    * If the accompanying transfer was reversed, the transfer reversal object. Only
    * applicable if the charge was created using the destination parameter.
    */
  var transfer_reversal: js.UndefOr[String | Null] = js.native
}

object IRefund {
  @scala.inline
  def apply(
    amount: Double,
    balance_transaction: String | IBalanceTransaction,
    charge: String | ICharge,
    created: Double,
    currency: String,
    id: String,
    metadata: IMetadata,
    `object`: String,
    reason: String,
    receipt_number: String,
    status: pending | succeeded | failed | canceled
  ): IRefund = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], balance_transaction = balance_transaction.asInstanceOf[js.Any], charge = charge.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], receipt_number = receipt_number.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRefund]
  }
  @scala.inline
  implicit class IRefundOps[Self <: IRefund] (val x: Self) extends AnyVal {
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
    def withBalance_transaction(value: String | IBalanceTransaction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance_transaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharge(value: String | ICharge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charge")(value.asInstanceOf[js.Any])
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: IMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceipt_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receipt_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: pending | succeeded | failed | canceled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
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
    def withFailure_reason(value: lost_or_stolen_card | expired_or_canceled_card | unknown_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure_reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailure_reason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure_reason")(js.undefined)
        ret
    }
    @scala.inline
    def withSource_transfer_reversal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_transfer_reversal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource_transfer_reversal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_transfer_reversal")(js.undefined)
        ret
    }
    @scala.inline
    def withSource_transfer_reversalNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_transfer_reversal")(null)
        ret
    }
    @scala.inline
    def withTransfer_reversal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer_reversal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransfer_reversal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer_reversal")(js.undefined)
        ret
    }
    @scala.inline
    def withTransfer_reversalNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer_reversal")(null)
        ret
    }
  }
  
}

