package typingsSlinky.trezorConnect.mod

import typingsSlinky.trezorConnect.AnonAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountInfo extends js.Object {
  // These fields are returned, presumably, to save further calls when the use case requires
  // a usable address:
  var address: String = js.native
  var addressIndex: Double = js.native
  var addressPath: js.Array[Double] = js.native
  var addressSerializedPath: String = js.native
   // serialized HD public key. Despite the name, this may be `ypub` for segWit.
  var balance: Double = js.native
  var confirmed: Double = js.native
  var id: Double = js.native
  var path: js.Array[Double] = js.native
  var serializedPath: String = js.native
  var transactions: Double = js.native
  var unusedAddresses: js.Array[String] = js.native
  var usedAddresses: js.Array[AnonAddress] = js.native
  var utxo: js.Array[Utxo] = js.native
  var xpub: String = js.native
}

object AccountInfo {
  @scala.inline
  def apply(
    address: String,
    addressIndex: Double,
    addressPath: js.Array[Double],
    addressSerializedPath: String,
    balance: Double,
    confirmed: Double,
    id: Double,
    path: js.Array[Double],
    serializedPath: String,
    transactions: Double,
    unusedAddresses: js.Array[String],
    usedAddresses: js.Array[AnonAddress],
    utxo: js.Array[Utxo],
    xpub: String
  ): AccountInfo = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], addressIndex = addressIndex.asInstanceOf[js.Any], addressPath = addressPath.asInstanceOf[js.Any], addressSerializedPath = addressSerializedPath.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], confirmed = confirmed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], serializedPath = serializedPath.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any], unusedAddresses = unusedAddresses.asInstanceOf[js.Any], usedAddresses = usedAddresses.asInstanceOf[js.Any], utxo = utxo.asInstanceOf[js.Any], xpub = xpub.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfo]
  }
  @scala.inline
  implicit class AccountInfoOps[Self <: AccountInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddressIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddressPath(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddressSerializedPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressSerializedPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBalance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfirmed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerializedPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializedPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnusedAddresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unusedAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsedAddresses(value: js.Array[AnonAddress]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtxo(value: js.Array[Utxo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utxo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXpub(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpub")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

