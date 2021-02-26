package typingsSlinky.stripe.mod

import typingsSlinky.stripe.mod.balance.IBalanceTransaction
import typingsSlinky.stripe.mod.cards.ICardHash
import typingsSlinky.stripe.stripeStrings.alipay_account
import typingsSlinky.stripe.stripeStrings.bank_account
import typingsSlinky.stripe.stripeStrings.bitcoin_receiver
import typingsSlinky.stripe.stripeStrings.canceled
import typingsSlinky.stripe.stripeStrings.card
import typingsSlinky.stripe.stripeStrings.failed
import typingsSlinky.stripe.stripeStrings.in_transit
import typingsSlinky.stripe.stripeStrings.paid
import typingsSlinky.stripe.stripeStrings.payout
import typingsSlinky.stripe.stripeStrings.pending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object payouts {
  
  @js.native
  trait IPayout extends IResourceObject {
    
    /**
      * Amount (in cents) to be transferred to your bank account or debit card
      */
    var amount: Double = js.native
    
    /**
      * Date the payout is expected to arrive in the bank. This factors in delays like weekends or bank holidays
      */
    var arrival_date: Double = js.native
    
    /**
      * Returns true if the payout was created by an automated payout schedule, and false if it was requested manually.
      */
    var automatic: Boolean = js.native
    
    /**
      * Balance transaction that describes the impact of this transfer on your account balance. [Expandable]
      */
    var balance_transaction: String | IBalanceTransaction = js.native
    
    /**
      * Time at which the object was created. Measured in seconds since the Unix epoch
      */
    var created: Double = js.native
    
    /**
      * Three-letter ISO currency code, in lowercase. Must be a supported currency.
      * https://stripe.com/docs/currencies
      */
    var currency: String = js.native
    
    /**
      * An arbitrary string attached to the object. Often useful for displaying to users
      */
    var description: String = js.native
    
    /**
      * ID of the bank account or card the payout was sent to. [Expandable]
      */
    var destination: String | typingsSlinky.stripe.mod.bankAccounts.IBankAccount | ICardHash = js.native
    
    /**
      * If the payout failed or was canceled, this will be the ID of the balance
      * transaction that reversed the initial balance transaction, and puts the
      * funds from the failed payout back in your balance. [Expandable]
      */
    var failure_balance_transaction: String | IBalanceTransaction = js.native
    
    /**
      * Error code explaining reason for payout failure if available. See Types of payout failures for a
      * list of failure codes: https://stripe.com/docs/api#payout_failures
      */
    var failure_code: String = js.native
    
    /**
      * Message to user further explaining reason for the payout failure if available
      */
    var failure_message: String = js.native
    
    /**
      * Flag indicating whether the object exists in live mode or test mode
      */
    var livemode: Boolean = js.native
    
    /**
      * Set of key/value pairs that you can attach to an object. It can be useful for storing additional
      * information about the object in a structured format.
      */
    var metadata: IMetadata = js.native
    
    /**
      * The method used to send this payout, which can be standard or instant. instant is only supported
      * for payouts to debit cards.
      */
    var method: PayoutMethods = js.native
    
    /**
      * Value is "payout"
      */
    @JSName("object")
    var object_IPayout: payout = js.native
    
    /**
      * The source balance this payout came from.
      * One of card, bank_account, bitcoin_receiver, or alipay_account
      */
    var source_type: alipay_account | bank_account | bitcoin_receiver | card = js.native
    
    /**
      * Extra information about a payout to be displayed on the user's bank statement
      */
    var statement_descriptor: String = js.native
    
    /**
      * Current status of the payout (paid, pending, in_transit, canceled or failed).
      * A payout will be pending until it is submitted to the bank, at which point it
      * becomes in_transit. It will then change to paid if the transaction goes through.
      * If it does not go through successfully, its status will change to failed or canceled.
      */
    var status: canceled | failed | in_transit | paid | pending = js.native
    
    /**
      * Can be bank_account or card.
      */
    var `type`: PayoutTypes = js.native
  }
  object IPayout {
    
    @scala.inline
    def apply(
      amount: Double,
      arrival_date: Double,
      automatic: Boolean,
      balance_transaction: String | IBalanceTransaction,
      created: Double,
      currency: String,
      description: String,
      destination: String | typingsSlinky.stripe.mod.bankAccounts.IBankAccount | ICardHash,
      failure_balance_transaction: String | IBalanceTransaction,
      failure_code: String,
      failure_message: String,
      id: String,
      livemode: Boolean,
      metadata: IMetadata,
      method: PayoutMethods,
      `object`: payout,
      source_type: alipay_account | bank_account | bitcoin_receiver | card,
      statement_descriptor: String,
      status: canceled | failed | in_transit | paid | pending,
      `type`: PayoutTypes
    ): IPayout = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], arrival_date = arrival_date.asInstanceOf[js.Any], automatic = automatic.asInstanceOf[js.Any], balance_transaction = balance_transaction.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], failure_balance_transaction = failure_balance_transaction.asInstanceOf[js.Any], failure_code = failure_code.asInstanceOf[js.Any], failure_message = failure_message.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], source_type = source_type.asInstanceOf[js.Any], statement_descriptor = statement_descriptor.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPayout]
    }
    
    @scala.inline
    implicit class IPayoutMutableBuilder[Self <: IPayout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrival_date(value: Double): Self = StObject.set(x, "arrival_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutomatic(value: Boolean): Self = StObject.set(x, "automatic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBalance_transaction(value: String | IBalanceTransaction): Self = StObject.set(x, "balance_transaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestination(value: String | typingsSlinky.stripe.mod.bankAccounts.IBankAccount | ICardHash): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailure_balance_transaction(value: String | IBalanceTransaction): Self = StObject.set(x, "failure_balance_transaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailure_code(value: String): Self = StObject.set(x, "failure_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailure_message(value: String): Self = StObject.set(x, "failure_message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: PayoutMethods): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: payout): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource_type(value: alipay_account | bank_account | bitcoin_receiver | card): Self = StObject.set(x, "source_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: canceled | failed | in_transit | paid | pending): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: PayoutTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPayoutCreationOptions extends IDataOptionsWithMetadata {
    
    /**
      * A positive integer in cents representing how much to payout.
      */
    var amount: Double = js.native
    
    /**
      * Three-letter ISO currency code, in lowercase. Must be a supported currency.
      * https://stripe.com/docs/currencies
      */
    var currency: String = js.native
    
    /**
      * An arbitrary string attached to the object. Often useful for displaying to users.
      * This can be unset by updating the value to null and then saving.
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      * The ID of a bank account or a card to send the payout to. If no destination is supplied,
      * the default external account for the specified currency will be used.
      */
    var destination: js.UndefOr[String] = js.native
    
    /**
      * The method used to send this payout, which can be standard or instant.
      * instant is only supported for payouts to debit cards.
      */
    var method: js.UndefOr[PayoutMethods] = js.native
    
    /**
      * The source balance to draw this payout from. Balances for different payment sources are
      * kept separately. You can find the amounts with the balances API.
      * Valid options are: alipay_account, bank_account, and card.
      */
    var source_type: js.UndefOr[alipay_account | bank_account | card] = js.native
    
    /**
      * A string to be displayed on the recipient’s bank or card statement. This may be at most 22 characters.
      * Attempting to use a statement_descriptor longer than 22 characters will return an error.
      * Note: Most banks will truncate this information and/or display it inconsistently. Some may not display it at all.
      */
    var statement_descriptor: js.UndefOr[String] = js.native
  }
  object IPayoutCreationOptions {
    
    @scala.inline
    def apply(amount: Double, currency: String): IPayoutCreationOptions = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPayoutCreationOptions]
    }
    
    @scala.inline
    implicit class IPayoutCreationOptionsMutableBuilder[Self <: IPayoutCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      @scala.inline
      def setMethod(value: PayoutMethods): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setSource_type(value: alipay_account | bank_account | card): Self = StObject.set(x, "source_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource_typeUndefined: Self = StObject.set(x, "source_type", js.undefined)
      
      @scala.inline
      def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatement_descriptorUndefined: Self = StObject.set(x, "statement_descriptor", js.undefined)
    }
  }
  
  @js.native
  trait IPayoutListOptions extends IListOptionsCreated {
    
    var arrival_date: js.UndefOr[String | IDateFilter] = js.native
    
    var destination: js.UndefOr[String] = js.native
    
    var status: js.UndefOr[canceled | failed | paid | pending] = js.native
  }
  object IPayoutListOptions {
    
    @scala.inline
    def apply(): IPayoutListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPayoutListOptions]
    }
    
    @scala.inline
    implicit class IPayoutListOptionsMutableBuilder[Self <: IPayoutListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrival_date(value: String | IDateFilter): Self = StObject.set(x, "arrival_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrival_dateUndefined: Self = StObject.set(x, "arrival_date", js.undefined)
      
      @scala.inline
      def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      @scala.inline
      def setStatus(value: canceled | failed | paid | pending): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.stripe.stripeStrings.instant
    - typingsSlinky.stripe.stripeStrings.standard
  */
  trait PayoutMethods extends StObject
  object PayoutMethods {
    
    @scala.inline
    def instant: typingsSlinky.stripe.stripeStrings.instant = "instant".asInstanceOf[typingsSlinky.stripe.stripeStrings.instant]
    
    @scala.inline
    def standard: typingsSlinky.stripe.stripeStrings.standard = "standard".asInstanceOf[typingsSlinky.stripe.stripeStrings.standard]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.stripe.stripeStrings.bank_account
    - typingsSlinky.stripe.stripeStrings.card
  */
  trait PayoutTypes extends StObject
  object PayoutTypes {
    
    @scala.inline
    def bank_account: typingsSlinky.stripe.stripeStrings.bank_account = "bank_account".asInstanceOf[typingsSlinky.stripe.stripeStrings.bank_account]
    
    @scala.inline
    def card: typingsSlinky.stripe.stripeStrings.card = "card".asInstanceOf[typingsSlinky.stripe.stripeStrings.card]
  }
}
