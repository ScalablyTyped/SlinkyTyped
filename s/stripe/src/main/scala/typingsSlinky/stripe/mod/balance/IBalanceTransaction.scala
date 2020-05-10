package typingsSlinky.stripe.mod.balance

import typingsSlinky.stripe.AnonAmount
import typingsSlinky.stripe.mod.IList
import typingsSlinky.stripe.mod.IResourceObject
import typingsSlinky.stripe.mod.transfers.ITransfer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var fee_details: js.Array[AnonAmount] = js.native
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
    fee_details: js.Array[AnonAmount],
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
  implicit class IBalanceTransactionOps[Self <: IBalanceTransaction] (val x: Self) extends AnyVal {
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
    def withAvailable_on(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available_on")(value.asInstanceOf[js.Any])
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
    def withFee(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFee_details(value: js.Array[AnonAmount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fee_details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNet(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("net")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String | IResourceObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
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
    def withExchange_rate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchange_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExchange_rate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchange_rate")(js.undefined)
        ret
    }
    @scala.inline
    def withExchange_rateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchange_rate")(null)
        ret
    }
    @scala.inline
    def withSource_transfers(value: IList[ITransfer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_transfers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource_transfers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_transfers")(js.undefined)
        ret
    }
  }
  
}

