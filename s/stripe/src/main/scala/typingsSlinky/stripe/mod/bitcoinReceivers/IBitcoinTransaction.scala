package typingsSlinky.stripe.mod.bitcoinReceivers

import typingsSlinky.stripe.mod.IResourceObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IBitcoinTransactionOps[Self <: IBitcoinTransaction] (val x: Self) extends AnyVal {
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
    def withBitcoin_amount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitcoin_amount")(value.asInstanceOf[js.Any])
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
    def withReceiver(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiver")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

