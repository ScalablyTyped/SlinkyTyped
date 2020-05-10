package typingsSlinky.stripe.mod.bitcoinReceivers

import typingsSlinky.stripe.mod.IList
import typingsSlinky.stripe.mod.IMetadata
import typingsSlinky.stripe.mod.IResourceObject
import typingsSlinky.stripe.mod.IStripeSource
import typingsSlinky.stripe.stripeStrings.bitcoin_receiver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Bitcoin receiver wraps a Bitcoin address so that a customer can push a payment to you. This guide describes how to use
  * receivers to create Bitcoin payments.
  */
@js.native
trait IBitcoinReceiver
  extends IResourceObject
     with IStripeSource {
  /**
    * True when this bitcoin receiver has received a non-zero amount of bitcoin.
    */
  var active: Boolean = js.native
  /**
    * The amount of currency that you are collecting as payment.
    */
  var amount: Double = js.native
  /**
    * The amount of currency to which bitcoin_amount_received has been converted.
    */
  var amount_received: Double = js.native
  /**
    * The amount of bitcoin that the customer should send to fill the receiver. The bitcoin_amount is denominated in Satoshi:
    * there are 10^8 Satoshi in one bitcoin.
    */
  var bitcoin_amount: Double = js.native
  /**
    * The amount of bitcoin that has been sent by the customer to this receiver.
    */
  var bitcoin_amount_received: Double = js.native
  /**
    * This URI can be displayed to the customer as a clickable link (to activate their bitcoin client) or as a QR code (for mobile wallets).
    */
  var bitcoin_uri: Double = js.native
  var created: Double = js.native
  /**
    * Three-letter ISO currency code representing the currency to which the bitcoin will be converted.
    */
  var currency: String = js.native
  var customer: String = js.native
  var description: String = js.native
  /**
    * The customer's email address, set by the API call that creates the receiver.
    */
  var email: String = js.native
  /**
    * This flag is initially false and updates to true when the customer sends the bitcoin_amount to this receiver.
    */
  var filled: Boolean = js.native
  /**
    * A bitcoin address that is specific to this receiver. The customer can send bitcoin to this address to fill the receiver.
    */
  var inbound_address: String = js.native
  var livemode: Boolean = js.native
  var metadata: IMetadata = js.native
  /**
    * Value is "bitcoin_receiver"
    */
  @JSName("object")
  var object_IBitcoinReceiver: bitcoin_receiver = js.native
  /**
    * The ID of the payment created from the receiver, if any. Hidden when viewing the receiver with a publishable key.
    */
  var payment: String = js.native
  /**
    * The refund address for these bitcoin, if communicated by the customer.
    */
  var refund_address: String = js.native
  /**
    * A list with one entry for each time that the customer sent bitcoin to the receiver. Hidden when viewing the
    * receiver with a publishable key.
    */
  var transactions: IList[IBitcoinTransaction] = js.native
  /**
    * This receiver contains uncaptured funds that can be used for a payment or refunded.
    */
  var uncaptured_funds: Boolean = js.native
  var used_for_payment: Boolean = js.native
}

object IBitcoinReceiver {
  @scala.inline
  def apply(
    active: Boolean,
    amount: Double,
    amount_received: Double,
    bitcoin_amount: Double,
    bitcoin_amount_received: Double,
    bitcoin_uri: Double,
    created: Double,
    currency: String,
    customer: String,
    description: String,
    email: String,
    filled: Boolean,
    id: String,
    inbound_address: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: bitcoin_receiver,
    payment: String,
    refund_address: String,
    transactions: IList[IBitcoinTransaction],
    uncaptured_funds: Boolean,
    used_for_payment: Boolean
  ): IBitcoinReceiver = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], amount_received = amount_received.asInstanceOf[js.Any], bitcoin_amount = bitcoin_amount.asInstanceOf[js.Any], bitcoin_amount_received = bitcoin_amount_received.asInstanceOf[js.Any], bitcoin_uri = bitcoin_uri.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], filled = filled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inbound_address = inbound_address.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], payment = payment.asInstanceOf[js.Any], refund_address = refund_address.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any], uncaptured_funds = uncaptured_funds.asInstanceOf[js.Any], used_for_payment = used_for_payment.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitcoinReceiver]
  }
  @scala.inline
  implicit class IBitcoinReceiverOps[Self <: IBitcoinReceiver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmount_received(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount_received")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBitcoin_amount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitcoin_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBitcoin_amount_received(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitcoin_amount_received")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBitcoin_uri(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitcoin_uri")(value.asInstanceOf[js.Any])
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
    def withCustomer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInbound_address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inbound_address")(value.asInstanceOf[js.Any])
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
    def withObject(value: bitcoin_receiver): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefund_address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactions(value: IList[IBitcoinTransaction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUncaptured_funds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncaptured_funds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsed_for_payment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("used_for_payment")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

