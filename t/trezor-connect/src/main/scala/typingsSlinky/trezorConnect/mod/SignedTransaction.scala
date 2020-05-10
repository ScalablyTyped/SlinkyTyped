package typingsSlinky.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignedTransaction extends js.Object {
  var serializedTx: String = js.native
  var signatures: js.Array[String] = js.native
  var txId: js.UndefOr[String] = js.native
}

object SignedTransaction {
  @scala.inline
  def apply(serializedTx: String, signatures: js.Array[String]): SignedTransaction = {
    val __obj = js.Dynamic.literal(serializedTx = serializedTx.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedTransaction]
  }
  @scala.inline
  implicit class SignedTransactionOps[Self <: SignedTransaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSerializedTx(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializedTx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignatures(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTxId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTxId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txId")(js.undefined)
        ret
    }
  }
  
}

