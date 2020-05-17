package typingsSlinky.stripeV3.stripe.paymentIntents

import typingsSlinky.stripeV3.anon.Networkstatus
import typingsSlinky.stripeV3.anon.Stripereport
import typingsSlinky.stripeV3.stripe.BillingDetails
import typingsSlinky.stripeV3.stripe.List
import typingsSlinky.stripeV3.stripe.Metadata
import typingsSlinky.stripeV3.stripe.ShippingDetails
import typingsSlinky.stripeV3.stripe.Source
import typingsSlinky.stripeV3.stripe.paymentMethod.PaymentMethodDetails
import typingsSlinky.stripeV3.stripeV3Strings.charge
import typingsSlinky.stripeV3.stripeV3Strings.failed
import typingsSlinky.stripeV3.stripeV3Strings.pending
import typingsSlinky.stripeV3.stripeV3Strings.succeeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Charge extends js.Object {
  /**
    * Amount charged in cents/pence, positive integer or zero.
    */
  var amount: Double = js.native
  /**
    * Amount in cents/pence refunded (can be less than the amount attribute on the
    * charge if a partial refund was issued), positive integer or zero.
    */
  var amount_refunded: Double = js.native
  /**
    * ID of the Connect application that created the charge.
    */
  var application: String | Null = js.native
  /**
    * The application fee (if any) for the charge. See the Connect documentation
    * for details.
    */
  var application_fee: String | Null = js.native
  /**
    * The amount of the application fee (if any) for the charge. See the Connect
    * documentation for details.
    */
  var application_fee_amount: Double | Null = js.native
  /**
    * ID of the balance transaction that describes the impact of this charge on
    * your account balance (not including refunds or disputes).
    */
  var balance_transaction: String = js.native
  /**
    * Billing information associated with the payment method at the time of the transaction.
    */
  var billing_details: BillingDetails = js.native
  /**
    * If the charge was created without capturing, this boolean represents whether or not it is
    * still uncaptured or has since been captured.
    */
  var captured: Boolean = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  /**
    * Three-letter ISO currency code representing the currency in which the
    * charge was made.
    */
  var currency: String = js.native
  /**
    * ID of the customer this charge is for if one exists.
    */
  var customer: String | Null = js.native
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: String | Null = js.native
  /**
    * Details about the dispute if the charge has been disputed.
    */
  var dispute: String | Null = js.native
  /**
    * Error code explaining reason for charge failure if available (see the errors section for a list of
    * codes: https://stripe.com/docs/api#errors).
    */
  var failure_code: String | Null = js.native
  /**
    * Message to user further explaining reason for charge failure if available.
    */
  var failure_message: String | Null = js.native
  /**
    * Hash with information on fraud assessments for the charge.
    */
  var fraud_details: Stripereport = js.native
  /**
    * Unique identifier for the object.
    */
  var id: String = js.native
  /**
    * ID of the invoice this charge is for if one exists. [Expandable]
    */
  var invoice: String | Null = js.native
  /**
    * Has the value true if the object exists in live mode or the value false if
    * the object exists in test mode.
    */
  var livemode: Boolean = js.native
  var metadata: Metadata = js.native
  /**
    * Value is 'charge'
    */
  var `object`: charge = js.native
  /**
    * The Stripe account ID for which these funds are intended. Automatically
    * set if you use the destination parameter. For details, see [Creating
    * Separate Charges and Transfers]
    * <https://stripe.com/docs/connect/charges-transfers#on-behalf-of>.
    */
  var on_behalf_of: String | Null = js.native
  /**
    * ID of the order this charge is for if one exists.
    */
  var order: String | Null = js.native
  /**
    * Details about whether the payment was accepted, and why. See
    * understanding declines for details.
    */
  var outcome: Networkstatus | Null = js.native
  /**
    * true if the charge succeeded, or was successfully authorized for later capture.
    */
  var paid: Boolean = js.native
  /**
    * ID of the PaymentIntent associated with this charge, if one exists.
    */
  var payment_intent: String = js.native
  /**
    * ID of the payment method used in this charge.
    */
  var payment_method: String | Null = js.native
  var payment_method_details: PaymentMethodDetails = js.native
  /**
    * This is the email address that the receipt for this charge was sent to.
    */
  var receipt_email: String | Null = js.native
  /**
    * This is the transaction number that appears on email receipts sent for this charge.
    */
  var receipt_number: String | Null = js.native
  /**
    * This is the URL to view the receipt for this charge. The receipt is kept up-to-date to the
    * latest state of the charge, including any refunds. If the charge is for an Invoice, the
    * receipt will be stylized as an Invoice receipt.
    */
  var receipt_url: String = js.native
  /**
    * Whether or not the charge has been fully refunded. If the charge is only partially refunded,
    * this attribute will still be false.
    */
  var refunded: Boolean = js.native
  /**
    * A list of refunds that have been applied to the charge.
    */
  var refunds: List[Refund] = js.native
  /**
    * ID of the review associated with this charge if one exists.
    */
  var review: js.UndefOr[String | Null] = js.native
  /**
    * Shipping information for the charge.
    */
  var shipping: js.UndefOr[ShippingDetails | Null] = js.native
  /**
    * For most Stripe users, the source of every charge is a credit or debit card.
    * This hash is then the card object describing that card.
    */
  var source: js.UndefOr[Source] = js.native
  /**
    * The transfer ID which created this charge. Only present if the charge came
    * from another Stripe account. See the Connect documentation for details.
    */
  var source_transfer: String | Null = js.native
  /**
    * Extra information about a charge. This will appear on your customer’s
    * credit card statement.
    */
  var statement_descriptor: String | Null = js.native
  /**
    * The status of the payment is either "succeeded", "pending", or "failed".
    */
  var status: succeeded | pending | failed = js.native
  /**
    * ID of the transfer to the destination account (only applicable if the
    * charge was created using the destination parameter).
    */
  var transfer: js.UndefOr[String | Null] = js.native
  /**
    * A string that identifies this transaction as part of a group.
    * See the Connect documentation for details.
    */
  var transfer_group: js.UndefOr[String | Null] = js.native
}

object Charge {
  @scala.inline
  def apply(
    amount: Double,
    amount_refunded: Double,
    balance_transaction: String,
    billing_details: BillingDetails,
    captured: Boolean,
    created: Double,
    currency: String,
    fraud_details: Stripereport,
    id: String,
    livemode: Boolean,
    metadata: Metadata,
    `object`: charge,
    paid: Boolean,
    payment_intent: String,
    payment_method_details: PaymentMethodDetails,
    receipt_url: String,
    refunded: Boolean,
    refunds: List[Refund],
    status: succeeded | pending | failed
  ): Charge = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], amount_refunded = amount_refunded.asInstanceOf[js.Any], balance_transaction = balance_transaction.asInstanceOf[js.Any], billing_details = billing_details.asInstanceOf[js.Any], captured = captured.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], fraud_details = fraud_details.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], paid = paid.asInstanceOf[js.Any], payment_intent = payment_intent.asInstanceOf[js.Any], payment_method_details = payment_method_details.asInstanceOf[js.Any], receipt_url = receipt_url.asInstanceOf[js.Any], refunded = refunded.asInstanceOf[js.Any], refunds = refunds.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Charge]
  }
  @scala.inline
  implicit class ChargeOps[Self <: Charge] (val x: Self) extends AnyVal {
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
    def withAmount_refunded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount_refunded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBalance_transaction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance_transaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBilling_details(value: BillingDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaptured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captured")(value.asInstanceOf[js.Any])
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
    def withFraud_details(value: Stripereport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fraud_details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLivemode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("livemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: Metadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: charge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayment_intent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_intent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayment_method_details(value: PaymentMethodDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method_details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceipt_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receipt_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefunded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refunded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefunds(value: List[Refund]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refunds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: succeeded | pending | failed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(null)
        ret
    }
    @scala.inline
    def withApplication_fee(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application_fee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication_feeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application_fee")(null)
        ret
    }
    @scala.inline
    def withApplication_fee_amount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application_fee_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication_fee_amountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application_fee_amount")(null)
        ret
    }
    @scala.inline
    def withCustomer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(null)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescriptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(null)
        ret
    }
    @scala.inline
    def withDispute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisputeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispute")(null)
        ret
    }
    @scala.inline
    def withFailure_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailure_codeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure_code")(null)
        ret
    }
    @scala.inline
    def withFailure_message(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailure_messageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure_message")(null)
        ret
    }
    @scala.inline
    def withInvoice(value: String): Self = {
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
    @scala.inline
    def withOn_behalf_of(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_behalf_of")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOn_behalf_ofNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_behalf_of")(null)
        ret
    }
    @scala.inline
    def withOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(null)
        ret
    }
    @scala.inline
    def withOutcome(value: Networkstatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutcomeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcome")(null)
        ret
    }
    @scala.inline
    def withPayment_method(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayment_methodNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method")(null)
        ret
    }
    @scala.inline
    def withReceipt_email(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receipt_email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceipt_emailNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receipt_email")(null)
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
    def withReview(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review")(js.undefined)
        ret
    }
    @scala.inline
    def withReviewNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review")(null)
        ret
    }
    @scala.inline
    def withShipping(value: ShippingDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(null)
        ret
    }
    @scala.inline
    def withSource(value: Source): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withSource_transfer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_transfer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource_transferNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_transfer")(null)
        ret
    }
    @scala.inline
    def withStatement_descriptor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement_descriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatement_descriptorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement_descriptor")(null)
        ret
    }
    @scala.inline
    def withTransfer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransfer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer")(js.undefined)
        ret
    }
    @scala.inline
    def withTransferNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer")(null)
        ret
    }
    @scala.inline
    def withTransfer_group(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer_group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransfer_group: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer_group")(js.undefined)
        ret
    }
    @scala.inline
    def withTransfer_groupNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer_group")(null)
        ret
    }
  }
  
}

