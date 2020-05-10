package typingsSlinky.stripe.mod.transferReversals

import typingsSlinky.stripe.mod.IMetadata
import typingsSlinky.stripe.mod.IResourceObject
import typingsSlinky.stripe.mod.balance.IBalanceTransaction
import typingsSlinky.stripe.mod.transfers.ITransfer
import typingsSlinky.stripe.stripeStrings.transfer_reversal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IReversal extends IResourceObject {
  /**
    * Amount reversed, in cents/pence.
    */
  var amount: Double = js.native
  /**
    * Balance transaction that describes the impact of this reversal on your account balance. [Expandable]
    */
  var balance_transaction: String | IBalanceTransaction = js.native
  var created: Double = js.native
  /**
    * Three-letter ISO currency code representing the currency.
    */
  var currency: String = js.native
  var metadata: IMetadata = js.native
  /**
    * Value is 'transfer_reversal'
    */
  @JSName("object")
  var object_IReversal: transfer_reversal = js.native
  /**
    * ID of the transfer that was reversed. [Expandable]
    */
  var transfer: String | ITransfer = js.native
}

object IReversal {
  @scala.inline
  def apply(
    amount: Double,
    balance_transaction: String | IBalanceTransaction,
    created: Double,
    currency: String,
    id: String,
    metadata: IMetadata,
    `object`: transfer_reversal,
    transfer: String | ITransfer
  ): IReversal = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], balance_transaction = balance_transaction.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], transfer = transfer.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReversal]
  }
  @scala.inline
  implicit class IReversalOps[Self <: IReversal] (val x: Self) extends AnyVal {
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
    def withBalance_transaction(value: String | IBalanceTransaction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance_transaction")(value.asInstanceOf[js.Any])
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
    def withMetadata(value: IMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: transfer_reversal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransfer(value: String | ITransfer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

