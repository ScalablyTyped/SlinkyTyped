package typingsSlinky.web3Eth.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProof extends js.Object {
  var accountProof: js.Array[String] = js.native
  var address: String = js.native
  var balance: String = js.native
  var codeHash: String = js.native
  var nonce: String = js.native
  var storageHash: String = js.native
  var storageProof: js.Array[StorageProof] = js.native
}

object GetProof {
  @scala.inline
  def apply(
    accountProof: js.Array[String],
    address: String,
    balance: String,
    codeHash: String,
    nonce: String,
    storageHash: String,
    storageProof: js.Array[StorageProof]
  ): GetProof = {
    val __obj = js.Dynamic.literal(accountProof = accountProof.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], codeHash = codeHash.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], storageHash = storageHash.asInstanceOf[js.Any], storageProof = storageProof.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProof]
  }
  @scala.inline
  implicit class GetProofOps[Self <: GetProof] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountProof(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountProof")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBalance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodeHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorageHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorageProof(value: js.Array[StorageProof]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageProof")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

