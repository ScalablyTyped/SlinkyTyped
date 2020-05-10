package typingsSlinky.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionID extends js.Object {
  var txid: String = js.native
}

object TransactionID {
  @scala.inline
  def apply(txid: String): TransactionID = {
    val __obj = js.Dynamic.literal(txid = txid.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionID]
  }
  @scala.inline
  implicit class TransactionIDOps[Self <: TransactionID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTxid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

