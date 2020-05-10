package typingsSlinky.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Utxo extends js.Object {
   // how much money sent
  var addressPath: js.Tuple2[Double, Double] = js.native
   // null == unconfirmed
  var coinbase: Boolean = js.native
   // path
  var height: Double | Null = js.native
  var index: Double = js.native
   // virtual size - segwit concept - same as size in non-segwit
  var own: Boolean = js.native
   // index of output IN THE TRANSACTION
  var transactionHash: String = js.native
  var tsize: Double = js.native
   // hash of the transaction
  var value: Double = js.native
   // total size - in case of segwit, total, with segwit data
  var vsize: Double = js.native
}

object Utxo {
  @scala.inline
  def apply(
    addressPath: js.Tuple2[Double, Double],
    coinbase: Boolean,
    index: Double,
    own: Boolean,
    transactionHash: String,
    tsize: Double,
    value: Double,
    vsize: Double
  ): Utxo = {
    val __obj = js.Dynamic.literal(addressPath = addressPath.asInstanceOf[js.Any], coinbase = coinbase.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], own = own.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], tsize = tsize.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], vsize = vsize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Utxo]
  }
  @scala.inline
  implicit class UtxoOps[Self <: Utxo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressPath(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoinbase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coinbase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("own")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTsize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVsize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vsize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeightNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(null)
        ret
    }
  }
  
}

