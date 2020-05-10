package typingsSlinky.web3Eth.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockHeader extends js.Object {
  var extraData: String = js.native
  var gasLimit: Double = js.native
  var gasUsed: Double = js.native
  var hash: String = js.native
  var logsBloom: String = js.native
  var miner: String = js.native
  var nonce: String = js.native
  var number: Double = js.native
  var parentHash: String = js.native
  var receiptRoot: String = js.native
  var sha3Uncles: String = js.native
  var stateRoot: String = js.native
  var timestamp: Double | String = js.native
  var transactionRoot: String = js.native
}

object BlockHeader {
  @scala.inline
  def apply(
    extraData: String,
    gasLimit: Double,
    gasUsed: Double,
    hash: String,
    logsBloom: String,
    miner: String,
    nonce: String,
    number: Double,
    parentHash: String,
    receiptRoot: String,
    sha3Uncles: String,
    stateRoot: String,
    timestamp: Double | String,
    transactionRoot: String
  ): BlockHeader = {
    val __obj = js.Dynamic.literal(extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], logsBloom = logsBloom.asInstanceOf[js.Any], miner = miner.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], parentHash = parentHash.asInstanceOf[js.Any], receiptRoot = receiptRoot.asInstanceOf[js.Any], sha3Uncles = sha3Uncles.asInstanceOf[js.Any], stateRoot = stateRoot.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], transactionRoot = transactionRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockHeader]
  }
  @scala.inline
  implicit class BlockHeaderOps[Self <: BlockHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtraData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGasLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gasLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGasUsed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gasUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogsBloom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logsBloom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceiptRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiptRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSha3Uncles(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha3Uncles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionRoot")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

