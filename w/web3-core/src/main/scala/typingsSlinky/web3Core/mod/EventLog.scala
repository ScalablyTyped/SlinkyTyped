package typingsSlinky.web3Core.mod

import typingsSlinky.web3Core.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventLog extends js.Object {
  var address: String = js.native
  var blockHash: String = js.native
  var blockNumber: Double = js.native
  var event: String = js.native
  var logIndex: Double = js.native
  var raw: js.UndefOr[AnonData] = js.native
  var returnValues: js.Any = js.native
  var transactionHash: String = js.native
  var transactionIndex: Double = js.native
}

object EventLog {
  @scala.inline
  def apply(
    address: String,
    blockHash: String,
    blockNumber: Double,
    event: String,
    logIndex: Double,
    returnValues: js.Any,
    transactionHash: String,
    transactionIndex: Double
  ): EventLog = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], blockHash = blockHash.asInstanceOf[js.Any], blockNumber = blockNumber.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], logIndex = logIndex.asInstanceOf[js.Any], returnValues = returnValues.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], transactionIndex = transactionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventLog]
  }
  @scala.inline
  implicit class EventLogOps[Self <: EventLog] (val x: Self) extends AnyVal {
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
    def withEvent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnValues(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValues")(value.asInstanceOf[js.Any])
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
    def withRaw(value: AnonData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
  }
  
}

