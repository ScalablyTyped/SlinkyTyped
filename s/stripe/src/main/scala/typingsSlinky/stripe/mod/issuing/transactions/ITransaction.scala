package typingsSlinky.stripe.mod.issuing.transactions

import typingsSlinky.stripe.mod.IMetadata
import typingsSlinky.stripe.mod.IResourceObject
import typingsSlinky.stripe.mod.balance.IBalanceTransaction
import typingsSlinky.stripe.mod.issuing.authorizations.IAuthorization
import typingsSlinky.stripe.mod.issuing.authorizations.MerchantData
import typingsSlinky.stripe.mod.issuing.cardholders.ICardholder
import typingsSlinky.stripe.mod.issuing.cards.IIssuingCard
import typingsSlinky.stripe.mod.issuing.disputes.IIssuingDispute
import typingsSlinky.stripe.stripeStrings.issuingDottransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Any use of an issued card that results in funds entering or leaving your Stripe account, such as a completed purchase or refund, is represented by an Issuing Transaction object.
  */
@js.native
trait ITransaction extends IResourceObject {
  var amount: Double = js.native
  /**
    * The Authorization object that led to this transaction.
    */
  var authorization: String | IAuthorization = js.native
  var balance_transaction: String | IBalanceTransaction = js.native
  /**
    * The card used to make this transaction.
    */
  var card: String | IIssuingCard = js.native
  /**
    * The cardholder to whom this transaction belongs.
    */
  var cardholder: String | ICardholder = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String = js.native
  var dispute: String | IIssuingDispute = js.native
  /**
    * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
    */
  var livemode: Boolean = js.native
  var merchant_amount: Double = js.native
  var merchant_currency: String = js.native
  /**
    * More information about the user involved in the transaction.
    */
  var merchant_data: MerchantData = js.native
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: IMetadata = js.native
  /**
    * String representing the object’s type. Objects of the same type share the same value.
    */
  @JSName("object")
  var object_ITransaction: issuingDottransaction = js.native
  /**
    * One of capture, refund, cash_withdrawal, refund_reversal, dispute, or dispute_loss.
    */
  var `type`: TransactionType = js.native
}

object ITransaction {
  @scala.inline
  def apply(
    amount: Double,
    authorization: String | IAuthorization,
    balance_transaction: String | IBalanceTransaction,
    card: String | IIssuingCard,
    cardholder: String | ICardholder,
    created: Double,
    currency: String,
    dispute: String | IIssuingDispute,
    id: String,
    livemode: Boolean,
    merchant_amount: Double,
    merchant_currency: String,
    merchant_data: MerchantData,
    metadata: IMetadata,
    `object`: issuingDottransaction,
    `type`: TransactionType
  ): ITransaction = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], balance_transaction = balance_transaction.asInstanceOf[js.Any], card = card.asInstanceOf[js.Any], cardholder = cardholder.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], dispute = dispute.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], merchant_amount = merchant_amount.asInstanceOf[js.Any], merchant_currency = merchant_currency.asInstanceOf[js.Any], merchant_data = merchant_data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransaction]
  }
  @scala.inline
  implicit class ITransactionOps[Self <: ITransaction] (val x: Self) extends AnyVal {
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
    def withAuthorization(value: String | IAuthorization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBalance_transaction(value: String | IBalanceTransaction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance_transaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCard(value: String | IIssuingCard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardholder(value: String | ICardholder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardholder")(value.asInstanceOf[js.Any])
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
    def withDispute(value: String | IIssuingDispute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLivemode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("livemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerchant_amount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchant_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerchant_currency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchant_currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerchant_data(value: MerchantData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchant_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: IMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: issuingDottransaction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TransactionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

