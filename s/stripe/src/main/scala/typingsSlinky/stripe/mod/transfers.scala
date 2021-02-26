package typingsSlinky.stripe.mod

import typingsSlinky.stripe.mod.accounts.IAccount
import typingsSlinky.stripe.mod.balance.IBalanceTransaction
import typingsSlinky.stripe.mod.cards.ICardHash
import typingsSlinky.stripe.mod.charges.ICharge
import typingsSlinky.stripe.mod.resources.TransferReversals
import typingsSlinky.stripe.mod.transferReversals.IReversal
import typingsSlinky.stripe.stripeStrings.bank_account
import typingsSlinky.stripe.stripeStrings.card
import typingsSlinky.stripe.stripeStrings.stripe_account
import typingsSlinky.stripe.stripeStrings.transfer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transfers {
  
  @js.native
  trait ITransfer extends IResourceObject {
    
    /**
      * Amount (in cents) to be transferred to your bank account
      */
    var amount: Double = js.native
    
    /**
      * Amount in cents reversed (can be less than the amount attribute on the transfer if a partial reversal was issued).
      */
    var amount_reversed: Double = js.native
    
    var application_fee: String = js.native
    
    /**
      * Balance transaction that describes the impact of this transfer on your account balance. [Expandable]
      */
    var balance_transaction: String | IBalanceTransaction = js.native
    
    /**
      * Time that this record of the transfer was first created.
      */
    var created: Double = js.native
    
    /**
      * Three-letter ISO currency code representing the currency.
      */
    var currency: String = js.native
    
    /**
      * Date the transfer is scheduled to arrive in the bank. This factors in delays like weekends or bank holidays.
      */
    var date: Double = js.native
    
    /**
      * Internal-only description of the transfer
      */
    var description: String = js.native
    
    /**
      * ID of the bank account, card, or Stripe account the transfer was sent to. [Expandable]
      */
    var destination: String | typingsSlinky.stripe.mod.bankAccounts.IBankAccount | ICardHash | IAccount = js.native
    
    /**
      * If the destination is a Stripe account, this will be the ID of the
      * payment that the destination account received for the transfer. [Expandable]
      */
    var destination_payment: String = js.native
    
    /**
      * Error code explaining reason for transfer failure if available. See Types of transfer failures for a
      * list of failure codes: https://stripe.com/docs/api#transfer_failures
      */
    var failure_code: String = js.native
    
    /**
      * Message to user further explaining reason for transfer failure if available.
      */
    var failure_message: String = js.native
    
    var livemode: Boolean = js.native
    
    var metadata: IMetadata = js.native
    
    /**
      * Value is "transfer"
      */
    @JSName("object")
    var object_ITransfer: transfer = js.native
    
    /**
      * A list of reversals that have been applied to the transfer.
      */
    var reversals: ITransferReversals = js.native
    
    /**
      * Whether or not the transfer has been fully reversed. If the transfer is only partially reversed, this attribute
      * will still be false.
      */
    var reversed: Boolean = js.native
    
    /**
      * ID of the charge (or other transaction) that was used to fund the
      * transfer. If null, the transfer was funded from the available
      * balance. [Expandable]
      */
    var source_transaction: String | ICharge = js.native
    
    /**
      * The source balance this transfer came from.
      * One of card, bank_account, bitcoin_receiver, or alipay_account
      */
    var source_type: SourceTypes = js.native
    
    /**
      * Extra information about a transfer to be displayed on the user's bank statement.
      */
    var statement_descriptor: String = js.native
    
    /**
      * Current status of the transfer (paid, pending, in_transit, canceled or failed).
      * A transfer will be pending until it is submitted to the bank, at which point
      * it becomes in_transit. It will then change to paid if the transaction goes
      * through. If it does not go through successfully, its status will change to
      * failed or canceled.
      */
    var status: Statuses = js.native
    
    /**
      * A string that identifies this transaction as part of a group.
      */
    var transfer_group: String | Null = js.native
    
    /**
      *  Can be card, bank_account, or stripe_account.
      */
    var `type`: card | bank_account | stripe_account = js.native
  }
  object ITransfer {
    
    @scala.inline
    def apply(
      amount: Double,
      amount_reversed: Double,
      application_fee: String,
      balance_transaction: String | IBalanceTransaction,
      created: Double,
      currency: String,
      date: Double,
      description: String,
      destination: String | typingsSlinky.stripe.mod.bankAccounts.IBankAccount | ICardHash | IAccount,
      destination_payment: String,
      failure_code: String,
      failure_message: String,
      id: String,
      livemode: Boolean,
      metadata: IMetadata,
      `object`: transfer,
      reversals: ITransferReversals,
      reversed: Boolean,
      source_transaction: String | ICharge,
      source_type: SourceTypes,
      statement_descriptor: String,
      status: Statuses,
      `type`: card | bank_account | stripe_account
    ): ITransfer = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], amount_reversed = amount_reversed.asInstanceOf[js.Any], application_fee = application_fee.asInstanceOf[js.Any], balance_transaction = balance_transaction.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], destination_payment = destination_payment.asInstanceOf[js.Any], failure_code = failure_code.asInstanceOf[js.Any], failure_message = failure_message.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], reversals = reversals.asInstanceOf[js.Any], reversed = reversed.asInstanceOf[js.Any], source_transaction = source_transaction.asInstanceOf[js.Any], source_type = source_type.asInstanceOf[js.Any], statement_descriptor = statement_descriptor.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITransfer]
    }
    
    @scala.inline
    implicit class ITransferMutableBuilder[Self <: ITransfer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmount_reversed(value: Double): Self = StObject.set(x, "amount_reversed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplication_fee(value: String): Self = StObject.set(x, "application_fee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBalance_transaction(value: String | IBalanceTransaction): Self = StObject.set(x, "balance_transaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestination(value: String | typingsSlinky.stripe.mod.bankAccounts.IBankAccount | ICardHash | IAccount): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestination_payment(value: String): Self = StObject.set(x, "destination_payment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailure_code(value: String): Self = StObject.set(x, "failure_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailure_message(value: String): Self = StObject.set(x, "failure_message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: transfer): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReversals(value: ITransferReversals): Self = StObject.set(x, "reversals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource_transaction(value: String | ICharge): Self = StObject.set(x, "source_transaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource_type(value: SourceTypes): Self = StObject.set(x, "source_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Statuses): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransfer_group(value: String): Self = StObject.set(x, "transfer_group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransfer_groupNull: Self = StObject.set(x, "transfer_group", null)
      
      @scala.inline
      def setType(value: card | bank_account | stripe_account): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITransferCreationOptions extends IDataOptionsWithMetadata {
    
    /**
      * A positive integer in cents/pence representing how much to transfer.
      */
    var amount: Double = js.native
    
    /**
      * 3-letter ISO code for currency.
      */
    var currency: String = js.native
    
    /**
      * An arbitrary string attached to the object. Often useful for
      * displaying to users. This can be unset by updating the value
      * to null and then saving.
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      * The id of a bank account or a card to send the transfer to, or the
      * string "default_for_currency" to use the default external
      * account for the specified currency.
      *
      * If you use Stripe Connect, this can be the the id of a connected
      * Stripe account; see the details about when such transfers are
      * permitted.
      */
    var destination: String = js.native
    
    /**
      * You can use this parameter to transfer funds from a charge (or
      * other transaction) before they are added to your available
      * balance. A pending balance will transfer immediately but the
      * funds will not become available until the original charge
      * becomes available. See the Connect documentation for details.
      */
    var source_transaction: js.UndefOr[String] = js.native
    
    /**
      * The source balance to use for this transfer. One of bank_account
      * or card. For most users, this will default to card.
      */
    var source_type: js.UndefOr[SourceTypes] = js.native
    
    /**
      * A string that identifies this transaction as part of a group.
      * See the Connect documentation for details.
      */
    var transfer_group: js.UndefOr[String] = js.native
  }
  object ITransferCreationOptions {
    
    @scala.inline
    def apply(amount: Double, currency: String, destination: String): ITransferCreationOptions = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITransferCreationOptions]
    }
    
    @scala.inline
    implicit class ITransferCreationOptionsMutableBuilder[Self <: ITransferCreationOptions] (val x: Self) extends AnyVal {
      
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
      def setSource_transaction(value: String): Self = StObject.set(x, "source_transaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource_transactionUndefined: Self = StObject.set(x, "source_transaction", js.undefined)
      
      @scala.inline
      def setSource_type(value: SourceTypes): Self = StObject.set(x, "source_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource_typeUndefined: Self = StObject.set(x, "source_type", js.undefined)
      
      @scala.inline
      def setTransfer_group(value: String): Self = StObject.set(x, "transfer_group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransfer_groupUndefined: Self = StObject.set(x, "transfer_group", js.undefined)
    }
  }
  
  @js.native
  trait ITransferListOptions extends IListOptionsCreated {
    
    var date: js.UndefOr[IDateFilter] = js.native
    
    /**
      * Only return transfers for the destination specified by this
      * account ID.
      */
    var destination: js.UndefOr[String] = js.native
    
    /**
      * Only return transfers with the specified transfer group.
      */
    var transfer_group: js.UndefOr[String | Null] = js.native
  }
  object ITransferListOptions {
    
    @scala.inline
    def apply(): ITransferListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITransferListOptions]
    }
    
    @scala.inline
    implicit class ITransferListOptionsMutableBuilder[Self <: ITransferListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: IDateFilter): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      @scala.inline
      def setTransfer_group(value: String): Self = StObject.set(x, "transfer_group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransfer_groupNull: Self = StObject.set(x, "transfer_group", null)
      
      @scala.inline
      def setTransfer_groupUndefined: Self = StObject.set(x, "transfer_group", js.undefined)
    }
  }
  
  @js.native
  trait ITransferReversals
    extends TransferReversals
       with IList[IReversal]
  
  @js.native
  trait ITransferUpdateOptions extends IDataOptionsWithMetadata {
    
    /**
      * An arbitrary string which you can attach to a transfer object. It is
      * displayed when in the web interface alongside the transfer. This
      * can be unset by updating the value to null and then saving.
      */
    var description: js.UndefOr[String] = js.native
  }
  object ITransferUpdateOptions {
    
    @scala.inline
    def apply(): ITransferUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITransferUpdateOptions]
    }
    
    @scala.inline
    implicit class ITransferUpdateOptionsMutableBuilder[Self <: ITransferUpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.stripe.stripeStrings.alipay_account
    - typingsSlinky.stripe.stripeStrings.bank_account
    - typingsSlinky.stripe.stripeStrings.bitcoin_receiver
    - typingsSlinky.stripe.stripeStrings.card
  */
  trait SourceTypes extends StObject
  object SourceTypes {
    
    @scala.inline
    def alipay_account: typingsSlinky.stripe.stripeStrings.alipay_account = "alipay_account".asInstanceOf[typingsSlinky.stripe.stripeStrings.alipay_account]
    
    @scala.inline
    def bank_account: typingsSlinky.stripe.stripeStrings.bank_account = "bank_account".asInstanceOf[typingsSlinky.stripe.stripeStrings.bank_account]
    
    @scala.inline
    def bitcoin_receiver: typingsSlinky.stripe.stripeStrings.bitcoin_receiver = "bitcoin_receiver".asInstanceOf[typingsSlinky.stripe.stripeStrings.bitcoin_receiver]
    
    @scala.inline
    def card: typingsSlinky.stripe.stripeStrings.card = "card".asInstanceOf[typingsSlinky.stripe.stripeStrings.card]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.stripe.stripeStrings.pending
    - typingsSlinky.stripe.stripeStrings.paid
    - typingsSlinky.stripe.stripeStrings.failed
    - typingsSlinky.stripe.stripeStrings.in_transit
    - typingsSlinky.stripe.stripeStrings.canceled
  */
  trait Statuses extends StObject
  object Statuses {
    
    @scala.inline
    def canceled: typingsSlinky.stripe.stripeStrings.canceled = "canceled".asInstanceOf[typingsSlinky.stripe.stripeStrings.canceled]
    
    @scala.inline
    def failed: typingsSlinky.stripe.stripeStrings.failed = "failed".asInstanceOf[typingsSlinky.stripe.stripeStrings.failed]
    
    @scala.inline
    def in_transit: typingsSlinky.stripe.stripeStrings.in_transit = "in_transit".asInstanceOf[typingsSlinky.stripe.stripeStrings.in_transit]
    
    @scala.inline
    def paid: typingsSlinky.stripe.stripeStrings.paid = "paid".asInstanceOf[typingsSlinky.stripe.stripeStrings.paid]
    
    @scala.inline
    def pending: typingsSlinky.stripe.stripeStrings.pending = "pending".asInstanceOf[typingsSlinky.stripe.stripeStrings.pending]
  }
}
