package typingsSlinky.web3Core.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionReceipt extends js.Object {
  var blockHash: String = js.native
  var blockNumber: Double = js.native
  var contractAddress: js.UndefOr[String] = js.native
  var cumulativeGasUsed: Double = js.native
  var events: js.UndefOr[StringDictionary[EventLog]] = js.native
  var from: String = js.native
  var gasUsed: Double = js.native
  var logs: js.Array[Log] = js.native
  var logsBloom: String = js.native
  var status: Boolean = js.native
  var to: String = js.native
  var transactionHash: String = js.native
  var transactionIndex: Double = js.native
}

object TransactionReceipt {
  @scala.inline
  def apply(
    blockHash: String,
    blockNumber: Double,
    cumulativeGasUsed: Double,
    from: String,
    gasUsed: Double,
    logs: js.Array[Log],
    logsBloom: String,
    status: Boolean,
    to: String,
    transactionHash: String,
    transactionIndex: Double
  ): TransactionReceipt = {
    val __obj = js.Dynamic.literal(blockHash = blockHash.asInstanceOf[js.Any], blockNumber = blockNumber.asInstanceOf[js.Any], cumulativeGasUsed = cumulativeGasUsed.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any], logsBloom = logsBloom.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], transactionIndex = transactionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionReceipt]
  }
  @scala.inline
  implicit class TransactionReceiptOps[Self <: TransactionReceipt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCumulativeGasUsed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cumulativeGasUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGasUsed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gasUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogs(value: js.Array[Log]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogsBloom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logsBloom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContractAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contractAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContractAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contractAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: StringDictionary[EventLog]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
  }
  
}

