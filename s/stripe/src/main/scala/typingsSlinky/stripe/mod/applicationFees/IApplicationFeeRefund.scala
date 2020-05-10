package typingsSlinky.stripe.mod.applicationFees

import typingsSlinky.stripe.mod.IMetadata
import typingsSlinky.stripe.mod.IResourceObject
import typingsSlinky.stripe.mod.balance.IBalanceTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IApplicationFeeRefund extends IResourceObject {
  /**
    * Amount, in cents/pence.
    */
  var amount: Double = js.native
  /**
    * Balance transaction that describes the impact on your account balance.
    */
  var balance_transaction: String | IBalanceTransaction = js.native
  var created: Double = js.native
  /**
    * Three-letter ISO code representing the currency.
    */
  var currency: String = js.native
  /**
    * ID of the application fee that was refunded.
    */
  var fee: String | IApplicationFee = js.native
  /**
    * A set of key/value pairs that you can attach to the object. It can be useful
    * for storing additional information in a structured format.
    */
  var metadata: IMetadata = js.native
}

object IApplicationFeeRefund {
  @scala.inline
  def apply(
    amount: Double,
    balance_transaction: String | IBalanceTransaction,
    created: Double,
    currency: String,
    fee: String | IApplicationFee,
    id: String,
    metadata: IMetadata,
    `object`: String
  ): IApplicationFeeRefund = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], balance_transaction = balance_transaction.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IApplicationFeeRefund]
  }
  @scala.inline
  implicit class IApplicationFeeRefundOps[Self <: IApplicationFeeRefund] (val x: Self) extends AnyVal {
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
    def withFee(value: String | IApplicationFee): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: IMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

