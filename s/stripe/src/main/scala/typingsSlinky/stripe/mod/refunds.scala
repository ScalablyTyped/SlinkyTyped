package typingsSlinky.stripe.mod

import typingsSlinky.stripe.mod.balance.IBalanceTransaction
import typingsSlinky.stripe.mod.charges.ICharge
import typingsSlinky.stripe.stripeStrings.canceled
import typingsSlinky.stripe.stripeStrings.expired_or_canceled_card
import typingsSlinky.stripe.stripeStrings.failed
import typingsSlinky.stripe.stripeStrings.lost_or_stolen_card
import typingsSlinky.stripe.stripeStrings.pending
import typingsSlinky.stripe.stripeStrings.succeeded
import typingsSlinky.stripe.stripeStrings.unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refunds {
  
  @js.native
  trait IRefund extends StObject {
    
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
    implicit class IRefundMutableBuilder[Self <: IRefund] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBalance_transaction(value: String | IBalanceTransaction): Self = StObject.set(x, "balance_transaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharge(value: String | ICharge): Self = StObject.set(x, "charge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setFailure_reason(value: lost_or_stolen_card | expired_or_canceled_card | unknown_): Self = StObject.set(x, "failure_reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailure_reasonUndefined: Self = StObject.set(x, "failure_reason", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceipt_number(value: String): Self = StObject.set(x, "receipt_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource_transfer_reversal(value: String): Self = StObject.set(x, "source_transfer_reversal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource_transfer_reversalNull: Self = StObject.set(x, "source_transfer_reversal", null)
      
      @scala.inline
      def setSource_transfer_reversalUndefined: Self = StObject.set(x, "source_transfer_reversal", js.undefined)
      
      @scala.inline
      def setStatus(value: pending | succeeded | failed | canceled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransfer_reversal(value: String): Self = StObject.set(x, "transfer_reversal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransfer_reversalNull: Self = StObject.set(x, "transfer_reversal", null)
      
      @scala.inline
      def setTransfer_reversalUndefined: Self = StObject.set(x, "transfer_reversal", js.undefined)
    }
  }
  
  @js.native
  trait IRefundCreationOptions extends IDataOptionsWithMetadata {
    
    /**
      * A positive integer in cents/pence representing how much of this charge to
      * refund. Can only refund up to the unrefunded amount remaining of the
      * charge.
      *
      * default is entire charge
      */
    var amount: js.UndefOr[Double] = js.native
    
    /**
      * String indicating the reason for the refund. If set, possible values are
      * "duplicate", "fraudulent", and "requested_by_customer". Specifying
      * "fraudulent" as the reason when you believe the charge to be fraudulent
      * will help us improve our fraud detection algorithms.
      */
    var reason: js.UndefOr[String] = js.native
    
    /**
      * Boolean indicating whether the application fee should be refunded when
      * refunding this charge. If a full charge refund is given, the full application
      * fee will be refunded. Else, the application fee will be refunded with an
      * amount proportional to the amount of the charge refunded.
      * An application fee can only be refunded by the application that created the
      * charge.
      *
      * Connect only, default is false.
      */
    var refund_application_fee: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean indicating whether the transfer should be reversed when
      * refunding this charge. The transfer will be reversed for the same amount
      * being refunded (either the entire or partial amount).
      * A transfer can only be reversed by the application that created the charge.
      *
      * Connect only, default is false.
      */
    var reverse_transfer: js.UndefOr[Boolean] = js.native
  }
  object IRefundCreationOptions {
    
    @scala.inline
    def apply(): IRefundCreationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRefundCreationOptions]
    }
    
    @scala.inline
    implicit class IRefundCreationOptionsMutableBuilder[Self <: IRefundCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      @scala.inline
      def setRefund_application_fee(value: Boolean): Self = StObject.set(x, "refund_application_fee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefund_application_feeUndefined: Self = StObject.set(x, "refund_application_fee", js.undefined)
      
      @scala.inline
      def setReverse_transfer(value: Boolean): Self = StObject.set(x, "reverse_transfer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverse_transferUndefined: Self = StObject.set(x, "reverse_transfer", js.undefined)
    }
  }
  
  @js.native
  trait IRefundCreationOptionsWithCharge extends IRefundCreationOptions {
    
    /**
      * The identifier of the charge to refund.
      */
    var charge: String = js.native
  }
  object IRefundCreationOptionsWithCharge {
    
    @scala.inline
    def apply(charge: String): IRefundCreationOptionsWithCharge = {
      val __obj = js.Dynamic.literal(charge = charge.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRefundCreationOptionsWithCharge]
    }
    
    @scala.inline
    implicit class IRefundCreationOptionsWithChargeMutableBuilder[Self <: IRefundCreationOptionsWithCharge] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharge(value: String): Self = StObject.set(x, "charge", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IRefundListOptions extends IListOptions {
    
    /**
      * Only return refunds for the charge specified by this charge ID.
      */
    var charge: js.UndefOr[String] = js.native
  }
  object IRefundListOptions {
    
    @scala.inline
    def apply(): IRefundListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRefundListOptions]
    }
    
    @scala.inline
    implicit class IRefundListOptionsMutableBuilder[Self <: IRefundListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharge(value: String): Self = StObject.set(x, "charge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChargeUndefined: Self = StObject.set(x, "charge", js.undefined)
    }
  }
}
