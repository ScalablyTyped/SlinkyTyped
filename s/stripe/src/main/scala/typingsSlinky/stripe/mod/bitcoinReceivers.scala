package typingsSlinky.stripe.mod

import typingsSlinky.stripe.stripeStrings.bitcoin_receiver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bitcoinReceivers {
  
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
    implicit class IBitcoinReceiverMutableBuilder[Self <: IBitcoinReceiver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmount_received(value: Double): Self = StObject.set(x, "amount_received", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitcoin_amount(value: Double): Self = StObject.set(x, "bitcoin_amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitcoin_amount_received(value: Double): Self = StObject.set(x, "bitcoin_amount_received", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitcoin_uri(value: Double): Self = StObject.set(x, "bitcoin_uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilled(value: Boolean): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInbound_address(value: String): Self = StObject.set(x, "inbound_address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: bitcoin_receiver): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayment(value: String): Self = StObject.set(x, "payment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefund_address(value: String): Self = StObject.set(x, "refund_address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactions(value: IList[IBitcoinTransaction]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUncaptured_funds(value: Boolean): Self = StObject.set(x, "uncaptured_funds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsed_for_payment(value: Boolean): Self = StObject.set(x, "used_for_payment", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IBitcoinReceiverCreationOptions extends IDataOptionsWithMetadata {
    
    /**
      * The amount of currency that you will be paid.
      */
    var amount: Double = js.native
    
    /**
      * The currency to which the bitcoin will be converted. You will be paid out in this currency. Only USD is currently supported.
      */
    var currency: String = js.native
    
    var description: js.UndefOr[String] = js.native
    
    /**
      * The email address of the customer.
      */
    var email: String = js.native
    
    /**
      * A flag that indicates whether you would like Stripe to automatically handle refunds for any mispayments to the receiver.
      */
    var refund_mispayments: js.UndefOr[Boolean] = js.native
  }
  object IBitcoinReceiverCreationOptions {
    
    @scala.inline
    def apply(amount: Double, currency: String, email: String): IBitcoinReceiverCreationOptions = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBitcoinReceiverCreationOptions]
    }
    
    @scala.inline
    implicit class IBitcoinReceiverCreationOptionsMutableBuilder[Self <: IBitcoinReceiverCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefund_mispayments(value: Boolean): Self = StObject.set(x, "refund_mispayments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefund_mispaymentsUndefined: Self = StObject.set(x, "refund_mispayments", js.undefined)
    }
  }
  
  @js.native
  trait IBitcoinReceiverListOptions extends IListOptions {
    
    /**
      * Filter for active receivers.
      */
    var active: js.UndefOr[Boolean] = js.native
    
    /**
      * Filter for filled receivers.
      */
    var filled: js.UndefOr[Boolean] = js.native
    
    /**
      * Filter for receivers with uncaptured funds.
      */
    var uncaptured_funds: js.UndefOr[Boolean] = js.native
  }
  object IBitcoinReceiverListOptions {
    
    @scala.inline
    def apply(): IBitcoinReceiverListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBitcoinReceiverListOptions]
    }
    
    @scala.inline
    implicit class IBitcoinReceiverListOptionsMutableBuilder[Self <: IBitcoinReceiverListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setFilled(value: Boolean): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilledUndefined: Self = StObject.set(x, "filled", js.undefined)
      
      @scala.inline
      def setUncaptured_funds(value: Boolean): Self = StObject.set(x, "uncaptured_funds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUncaptured_fundsUndefined: Self = StObject.set(x, "uncaptured_funds", js.undefined)
    }
  }
  
  @js.native
  trait IBitcoinTransaction extends IResourceObject {
    
    /**
      * The amount of currency that the transaction was converted to in real-time.
      */
    var amount: Double = js.native
    
    /**
      * The amount of bitcoin contained in the transaction.
      */
    var bitcoin_amount: Double = js.native
    
    var created: Double = js.native
    
    /**
      * The currency to which this transaction was converted.
      */
    var currency: String = js.native
    
    /**
      * The receiver to which this transaction was sent.
      */
    var receiver: String = js.native
  }
  object IBitcoinTransaction {
    
    @scala.inline
    def apply(
      amount: Double,
      bitcoin_amount: Double,
      created: Double,
      currency: String,
      id: String,
      `object`: String,
      receiver: String
    ): IBitcoinTransaction = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], bitcoin_amount = bitcoin_amount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], receiver = receiver.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBitcoinTransaction]
    }
    
    @scala.inline
    implicit class IBitcoinTransactionMutableBuilder[Self <: IBitcoinTransaction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitcoin_amount(value: Double): Self = StObject.set(x, "bitcoin_amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiver(value: String): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    }
  }
}
