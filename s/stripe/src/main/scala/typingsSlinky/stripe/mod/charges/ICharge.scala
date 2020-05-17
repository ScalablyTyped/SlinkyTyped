package typingsSlinky.stripe.mod.charges

import typingsSlinky.stripe.anon.Address
import typingsSlinky.stripe.anon.Destination
import typingsSlinky.stripe.anon.Stripereport
import typingsSlinky.stripe.mod.IMetadata
import typingsSlinky.stripe.mod.IResourceObject
import typingsSlinky.stripe.mod.IShippingInformation
import typingsSlinky.stripe.mod.IStripeSource
import typingsSlinky.stripe.mod.accounts.IAccount
import typingsSlinky.stripe.mod.applicationFees.IApplicationFee
import typingsSlinky.stripe.mod.applications.IApplication
import typingsSlinky.stripe.mod.balance.IBalanceTransaction
import typingsSlinky.stripe.mod.customers.ICustomer
import typingsSlinky.stripe.mod.disputes.IDispute
import typingsSlinky.stripe.mod.invoices.IInvoice
import typingsSlinky.stripe.mod.orders.IOrder
import typingsSlinky.stripe.mod.reviews.IReview
import typingsSlinky.stripe.mod.transfers.ITransfer
import typingsSlinky.stripe.stripeStrings.charge
import typingsSlinky.stripe.stripeStrings.failed
import typingsSlinky.stripe.stripeStrings.pending
import typingsSlinky.stripe.stripeStrings.succeeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * To charge a credit or a debit card, you create a charge object. You can retrieve and refund individual
  * charges as well as list all charges. Charges are identified by a unique random ID.
  */
@js.native
trait ICharge extends IResourceObject {
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
    * ID of the Connect application that created the charge. [Expandable]
    */
  var application: js.UndefOr[String | IApplication | Null] = js.native
  /**
    * The application fee (if any) for the charge. See the Connect documentation
    * for details. [Expandable]
    */
  var application_fee: js.UndefOr[String | IApplicationFee | Null] = js.native
  /**
    * The amount of the application fee (if any) for the charge. See the Connect
    * documentation for details.
    */
  var application_fee_amount: js.UndefOr[Double | Null] = js.native
  /**
    * ID of the balance transaction that describes the impact of this charge on
    * your account balance (not including refunds or disputes). [Expandable]
    */
  var balance_transaction: String | IBalanceTransaction = js.native
  /**
    * Billing information associated with the payment method at the time of the transaction.
    */
  var billing_details: js.UndefOr[Address | Null] = js.native
  /**
    * If the charge was created without capturing, this boolean represents whether or not it is
    * still uncaptured or has since been captured.
    */
  var captured: Boolean = js.native
  var created: Double = js.native
  /**
    * Three-letter ISO currency code representing the currency in which the
    * charge was made.
    */
  var currency: String = js.native
  /**
    * ID of the customer this charge is for if one exists. [Expandable]
    */
  var customer: String | ICustomer | Null = js.native
  var description: js.UndefOr[String] = js.native
  /**
    * The account (if any) the charge was made on behalf of, with an automatic
    * transfer. See the [Connect documentation]
    * <https://stripe.com/docs/connect/destination-charges> for details.
    * [Expandable]
    */
  var destination: js.UndefOr[String | IAccount | Null] = js.native
  /**
    * Details about the dispute if the charge has been disputed. [Expandable]
    */
  var dispute: js.UndefOr[String | IDispute | Null] = js.native
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
    * ID of the invoice this charge is for if one exists. [Expandable]
    */
  var invoice: String | IInvoice | Null = js.native
  var livemode: Boolean = js.native
  var metadata: IMetadata = js.native
  /**
    * Value is 'charge'
    */
  @JSName("object")
  var object_ICharge: charge = js.native
  /**
    * The Stripe account ID for which these funds are intended. Automatically
    * set if you use the destination parameter. For details, see [Creating
    * Separate Charges and Transfers]
    * <https://stripe.com/docs/connect/charges-transfers#on-behalf-of>.
    */
  var on_behalf_of: js.UndefOr[String | Null] = js.native
  /**
    * ID of the order this charge is for if one exists. [Expandable]
    */
  var order: String | IOrder | Null = js.native
  /**
    * Details about whether the payment was accepted, and why. See
    * understanding declines for details. [Expandable]
    */
  var outcome: js.UndefOr[IOutcome] = js.native
  /**
    * true if the charge succeeded, or was successfully authorized for later capture.
    */
  var paid: Boolean = js.native
  /**
    * ID of the PaymentIntent associated with this charge, if one exists.
    */
  var payment_intent: js.UndefOr[String] = js.native
  /**
    * ID of the payment method used in this charge.
    */
  var payment_method: String | Null = js.native
  /**
    * Details about the payment method at the time of the transaction.
    */
  var payment_method_details: IPaymentMethodDetails | Null = js.native
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
  var refunds: IChargeRefunds = js.native
  /**
    * ID of the review associated with this charge if one exists. [Expandable]
    */
  var review: js.UndefOr[String | IReview | Null] = js.native
  /**
    * Shipping information for the charge.
    */
  var shipping: js.UndefOr[IShippingInformation | Null] = js.native
  /**
    * For most Stripe users, the source of every charge is a credit or debit card.
    * This hash is then the card object describing that card.
    * This value is null if this charge is associated with a Payment Intent instead of a Source.
    */
  var source: IStripeSource | Null = js.native
  /**
    * The transfer ID which created this charge. Only present if the charge came
    * from another Stripe account. See the Connect documentation for details.
    * [Expandable]
    */
  var source_transfer: String | ITransfer | Null = js.native
  /**
    * Extra information about a charge. This will appear on your customer’s
    * credit card statement.
    */
  var statement_descriptor: String | Null = js.native
  /**
    * Provides information about the charge that customers see on their statements.
    * Concatenated with the prefix (shortened descriptor) or statement descriptor that’s
    * set on the account to form the complete statement descriptor. Maximum 22 characters
    * for the concatenated descriptor.
    */
  var statement_descriptor_suffix: js.UndefOr[String | Null] = js.native
  /**
    * The status of the payment is either "succeeded", "pending", or "failed".
    */
  var status: succeeded | pending | failed = js.native
  /**
    * ID of the transfer to the destination account (only applicable if the
    * charge was created using the destination parameter). [Expandable]
    */
  var transfer: js.UndefOr[String | ITransfer] = js.native
  /**
    * An optional dictionary including the account to automatically transfer
    * to as part of a destination charge. See the Connect documentation for details.
    */
  var transfer_data: js.UndefOr[Destination | Null] = js.native
  /**
    * A string that identifies this transaction as part of a group.
    * See the [Connect documentation]
    * <https://stripe.com/docs/connect/charges-transfers#grouping-transactions>
    * for details.
    */
  var transfer_group: js.UndefOr[String | Null] = js.native
}

object ICharge {
  @scala.inline
  def apply(
    amount: Double,
    amount_refunded: Double,
    balance_transaction: String | IBalanceTransaction,
    captured: Boolean,
    created: Double,
    currency: String,
    fraud_details: Stripereport,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: charge,
    paid: Boolean,
    receipt_url: String,
    refunded: Boolean,
    refunds: IChargeRefunds,
    status: succeeded | pending | failed
  ): ICharge = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], amount_refunded = amount_refunded.asInstanceOf[js.Any], balance_transaction = balance_transaction.asInstanceOf[js.Any], captured = captured.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], fraud_details = fraud_details.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], paid = paid.asInstanceOf[js.Any], receipt_url = receipt_url.asInstanceOf[js.Any], refunded = refunded.asInstanceOf[js.Any], refunds = refunds.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICharge]
  }
  @scala.inline
  implicit class IChargeOps[Self <: ICharge] (val x: Self) extends AnyVal {
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
    def withBalance_transaction(value: String | IBalanceTransaction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance_transaction")(value.asInstanceOf[js.Any])
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
    def withRefunds(value: IChargeRefunds): Self = {
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
    def withApplication(value: String | IApplication): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(null)
        ret
    }
    @scala.inline
    def withApplication_fee(value: String | IApplicationFee): Self = {
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
    def withoutApplication_fee_amount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application_fee_amount")(js.undefined)
        ret
    }
    @scala.inline
    def withApplication_fee_amountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application_fee_amount")(null)
        ret
    }
    @scala.inline
    def withBilling_details(value: Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBilling_details: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_details")(js.undefined)
        ret
    }
    @scala.inline
    def withBilling_detailsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_details")(null)
        ret
    }
    @scala.inline
    def withCustomer(value: String | ICustomer): Self = {
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
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: String | IAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(null)
        ret
    }
    @scala.inline
    def withDispute(value: String | IDispute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDispute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispute")(js.undefined)
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
    def withInvoice(value: String | IInvoice): Self = {
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
    def withoutOn_behalf_of: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_behalf_of")(js.undefined)
        ret
    }
    @scala.inline
    def withOn_behalf_ofNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_behalf_of")(null)
        ret
    }
    @scala.inline
    def withOrder(value: String | IOrder): Self = {
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
    def withOutcome(value: IOutcome): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutcome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcome")(js.undefined)
        ret
    }
    @scala.inline
    def withPayment_intent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_intent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayment_intent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_intent")(js.undefined)
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
    def withPayment_method_details(value: IPaymentMethodDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method_details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayment_method_detailsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method_details")(null)
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
    def withReview(value: String | IReview): Self = {
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
    def withShipping(value: IShippingInformation): Self = {
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
    def withSource(value: IStripeSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(null)
        ret
    }
    @scala.inline
    def withSource_transfer(value: String | ITransfer): Self = {
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
    def withStatement_descriptor_suffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement_descriptor_suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatement_descriptor_suffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement_descriptor_suffix")(js.undefined)
        ret
    }
    @scala.inline
    def withStatement_descriptor_suffixNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement_descriptor_suffix")(null)
        ret
    }
    @scala.inline
    def withTransfer(value: String | ITransfer): Self = {
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
    def withTransfer_data(value: Destination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransfer_data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer_data")(js.undefined)
        ret
    }
    @scala.inline
    def withTransfer_dataNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer_data")(null)
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

