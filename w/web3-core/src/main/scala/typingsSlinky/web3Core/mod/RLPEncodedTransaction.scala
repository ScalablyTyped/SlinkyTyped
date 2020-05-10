package typingsSlinky.web3Core.mod

import typingsSlinky.web3Core.AnonGas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RLPEncodedTransaction extends js.Object {
  var raw: String = js.native
  var tx: AnonGas = js.native
}

object RLPEncodedTransaction {
  @scala.inline
  def apply(raw: String, tx: AnonGas): RLPEncodedTransaction = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any])
    __obj.asInstanceOf[RLPEncodedTransaction]
  }
  @scala.inline
  implicit class RLPEncodedTransactionOps[Self <: RLPEncodedTransaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRaw(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTx(value: AnonGas): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tx")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

