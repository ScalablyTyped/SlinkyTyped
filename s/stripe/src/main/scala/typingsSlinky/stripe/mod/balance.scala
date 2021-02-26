package typingsSlinky.stripe.mod

import typingsSlinky.stripe.anon.Alipayaccount
import typingsSlinky.stripe.anon.Amount
import typingsSlinky.stripe.mod.transfers.ITransfer
import typingsSlinky.stripe.stripeStrings.adjustment
import typingsSlinky.stripe.stripeStrings.application_fee
import typingsSlinky.stripe.stripeStrings.application_fee_refund
import typingsSlinky.stripe.stripeStrings.charge
import typingsSlinky.stripe.stripeStrings.network_cost
import typingsSlinky.stripe.stripeStrings.payment
import typingsSlinky.stripe.stripeStrings.payout
import typingsSlinky.stripe.stripeStrings.payout_failure
import typingsSlinky.stripe.stripeStrings.refund
import typingsSlinky.stripe.stripeStrings.stripe_fee
import typingsSlinky.stripe.stripeStrings.transfer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object balance {
  
  @js.native
  trait IBalance extends IObject {
    
    /**
      * Funds that are available to be paid out automatically by Stripe or explicitly
      * via the transfers API. The available balance for each currency and payment
      * type can be found in the source_types property.
      */
    var available: js.Array[ISourceType] = js.native
    
    var livemode: Boolean = js.native
    
    /**
      * Funds that are not available in the balance yet, due to the 7-day rolling pay
      * cycle. The pending balance for each currency and payment type can be
      * found in the source_types property
      */
    var pending: js.Array[ISourceType] = js.native
  }
  object IBalance {
    
    @scala.inline
    def apply(
      available: js.Array[ISourceType],
      livemode: Boolean,
      `object`: String,
      pending: js.Array[ISourceType]
    ): IBalance = {
      val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBalance]
    }
    
    @scala.inline
    implicit class IBalanceMutableBuilder[Self <: IBalance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailable(value: js.Array[ISourceType]): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailableVarargs(value: ISourceType*): Self = StObject.set(x, "available", js.Array(value :_*))
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPending(value: js.Array[ISourceType]): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPendingVarargs(value: ISourceType*): Self = StObject.set(x, "pending", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IBalanceListOptions extends IListOptionsCreated {
    
    var available_on: js.UndefOr[String | IDateFilter] = js.native
    
    var currency: js.UndefOr[String] = js.native
    
    /**
      * For automatic Stripe payouts only, only returns transactions that were payed out on the specified payout ID.
      */
    var payout: js.UndefOr[String] = js.native
    
    /**
      * Only returns transactions that are related to the specified Stripe object ID
      * (e.g. filtering by a charge ID will return all related charge transactions).
      */
    var source: js.UndefOr[String] = js.native
    
    /**
      * Only returns transactions of the given type.
      */
    var `type`: js.UndefOr[
        charge | refund | adjustment | application_fee | application_fee_refund | transfer | payment | payout | payout_failure | stripe_fee | network_cost
      ] = js.native
  }
  object IBalanceListOptions {
    
    @scala.inline
    def apply(): IBalanceListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBalanceListOptions]
    }
    
    @scala.inline
    implicit class IBalanceListOptionsMutableBuilder[Self <: IBalanceListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailable_on(value: String | IDateFilter): Self = StObject.set(x, "available_on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailable_onUndefined: Self = StObject.set(x, "available_on", js.undefined)
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      @scala.inline
      def setPayout(value: String): Self = StObject.set(x, "payout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayoutUndefined: Self = StObject.set(x, "payout", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setType(
        value: charge | refund | adjustment | application_fee | application_fee_refund | transfer | payment | payout | payout_failure | stripe_fee | network_cost
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait IBalanceTransaction extends IResourceObject {
    
    /**
      * Gross amount of the transaction, in cents/pence.
      */
    var amount: Double = js.native
    
    /**
      * The date the transaction's net funds will become available in the Stripe balance.
      */
    var available_on: Double = js.native
    
    var created: Double = js.native
    
    /**
      * Three-letter ISO currency code representing the currency.
      */
    var currency: String = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var exchange_rate: js.UndefOr[Double | Null] = js.native
    
    /**
      * Fee (in cents/pence) paid for this transaction
      */
    var fee: Double = js.native
    
    /**
      * Detailed breakdown of fees (in cents/pence) paid for this transaction
      */
    var fee_details: js.Array[Amount] = js.native
    
    /**
      * Net amount of the transaction, in cents.
      */
    var net: Double = js.native
    
    /**
      * The Stripe object this transaction is related to. [Expandable]
      */
    var source: String | IResourceObject = js.native
    
    /**
      * The transfers (if any) for which source is a source_transaction.
      */
    var source_transfers: js.UndefOr[IList[ITransfer]] = js.native
    
    /**
      * If the transaction's net funds are available in the Stripe balance yet. Either "available" or "pending".
      */
    var status: String = js.native
    
    /**
      * Transaction type: "adjustment", "application_fee",
      * "application_fee_refund", "charge", "payment", "payment_refund",
      * "refund", "transfer", "transfer_cancel", "transfer_failure", or
      * "transfer_refund".
      */
    var `type`: String = js.native
  }
  object IBalanceTransaction {
    
    @scala.inline
    def apply(
      amount: Double,
      available_on: Double,
      created: Double,
      currency: String,
      fee: Double,
      fee_details: js.Array[Amount],
      id: String,
      net: Double,
      `object`: String,
      source: String | IResourceObject,
      status: String,
      `type`: String
    ): IBalanceTransaction = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], available_on = available_on.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], fee_details = fee_details.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], net = net.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBalanceTransaction]
    }
    
    @scala.inline
    implicit class IBalanceTransactionMutableBuilder[Self <: IBalanceTransaction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailable_on(value: Double): Self = StObject.set(x, "available_on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setExchange_rate(value: Double): Self = StObject.set(x, "exchange_rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExchange_rateNull: Self = StObject.set(x, "exchange_rate", null)
      
      @scala.inline
      def setExchange_rateUndefined: Self = StObject.set(x, "exchange_rate", js.undefined)
      
      @scala.inline
      def setFee(value: Double): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFee_details(value: js.Array[Amount]): Self = StObject.set(x, "fee_details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFee_detailsVarargs(value: Amount*): Self = StObject.set(x, "fee_details", js.Array(value :_*))
      
      @scala.inline
      def setNet(value: Double): Self = StObject.set(x, "net", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String | IResourceObject): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource_transfers(value: IList[ITransfer]): Self = StObject.set(x, "source_transfers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource_transfersUndefined: Self = StObject.set(x, "source_transfers", js.undefined)
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISourceType extends StObject {
    
    var amount: Double = js.native
    
    var currency: String = js.native
    
    var source_types: Alipayaccount = js.native
  }
  object ISourceType {
    
    @scala.inline
    def apply(amount: Double, currency: String, source_types: Alipayaccount): ISourceType = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], source_types = source_types.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISourceType]
    }
    
    @scala.inline
    implicit class ISourceTypeMutableBuilder[Self <: ISourceType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource_types(value: Alipayaccount): Self = StObject.set(x, "source_types", value.asInstanceOf[js.Any])
    }
  }
}
