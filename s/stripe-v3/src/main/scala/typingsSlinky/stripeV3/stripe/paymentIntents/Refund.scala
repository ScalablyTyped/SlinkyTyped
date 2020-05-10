package typingsSlinky.stripeV3.stripe.paymentIntents

import typingsSlinky.stripeV3.stripe.Metadata
import typingsSlinky.stripeV3.stripeV3Strings.canceled
import typingsSlinky.stripeV3.stripeV3Strings.duplicate
import typingsSlinky.stripeV3.stripeV3Strings.expired_or_canceled_card
import typingsSlinky.stripeV3.stripeV3Strings.failed
import typingsSlinky.stripeV3.stripeV3Strings.fraudulent
import typingsSlinky.stripeV3.stripeV3Strings.lost_or_stolen_card
import typingsSlinky.stripeV3.stripeV3Strings.pending
import typingsSlinky.stripeV3.stripeV3Strings.refund
import typingsSlinky.stripeV3.stripeV3Strings.requested_by_customer
import typingsSlinky.stripeV3.stripeV3Strings.succeeded
import typingsSlinky.stripeV3.stripeV3Strings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Refund extends js.Object {
  /**
    * Refund amount, in cents.
    */
  var amount: Double = js.native
  /**
    * Balance transaction that describes the impact on your account balance.
    */
  var balance_transaction: String | Null = js.native
  /**
    * ID of the charge that was refunded.
    */
  var charge: String = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String = js.native
  /**
    * An arbitrary string attached to the object. Often useful for
    * displaying to users. (Available on non-card refunds only)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * If the refund failed, this balance transaction describes the
    * adjustment made on your account balance that reverses the
    * initial balance transaction.
    */
  var failure_balance_transaction: js.UndefOr[String] = js.native
  /**
    * If the refund failed, the reason for refund failure if known
    */
  var failure_reason: js.UndefOr[lost_or_stolen_card | expired_or_canceled_card | unknown_] = js.native
  /**
    * Unique identifier for the object.
    */
  var id: String = js.native
  var metadata: Metadata = js.native
  /**
    * Value is "refund"
    */
  var `object`: refund = js.native
  /**
    * Reason for the refund
    */
  var reason: duplicate | fraudulent | requested_by_customer | Null = js.native
  /**
    * This is the transaction number that appears on email
    * receipts sent for this refund.
    */
  var receipt_number: String | Null = js.native
  /**
    * The transfer reversal that is associated with the refund.
    * Only present if the charge came from another Stripe account.
    * See the Connect documentation for details.
    */
  var source_transfer_reversal: String | Null = js.native
  /**
    * Status of the refund. For credit card refunds, this can be
    * pending, succeeded, or failed. For other types of refunds,
    * it can be pending, succeeded, failed, or canceled. Refer to
    * our refunds documentation for more details.
    */
  var status: pending | succeeded | failed | canceled = js.native
  /**
    * If the accompanying transfer was reversed, the transfer reversal object.
    * Only applicable if the charge was created using the destination parameter.
    */
  var transfer_reversal: String | Null = js.native
}

object Refund {
  @scala.inline
  def apply(
    amount: Double,
    charge: String,
    created: Double,
    currency: String,
    id: String,
    metadata: Metadata,
    `object`: refund,
    status: pending | succeeded | failed | canceled
  ): Refund = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], charge = charge.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Refund]
  }
  @scala.inline
  implicit class RefundOps[Self <: Refund] (val x: Self) extends AnyVal {
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
    def withCharge(value: String): Self = {
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
    def withMetadata(value: Metadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: refund): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: pending | succeeded | failed | canceled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBalance_transaction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance_transaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBalance_transactionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance_transaction")(null)
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
    def withFailure_balance_transaction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure_balance_transaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailure_balance_transaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure_balance_transaction")(js.undefined)
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
    def withReason(value: duplicate | fraudulent | requested_by_customer): Self = {
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
    def withReceipt_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receipt_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceipt_numberNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receipt_number")(null)
        ret
    }
    @scala.inline
    def withSource_transfer_reversal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_transfer_reversal")(value.asInstanceOf[js.Any])
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
    def withTransfer_reversalNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer_reversal")(null)
        ret
    }
  }
  
}

