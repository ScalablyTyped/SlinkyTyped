package typingsSlinky.web3Core.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogsOptions extends js.Object {
  var address: js.UndefOr[String | js.Array[String]] = js.native
  var fromBlock: js.UndefOr[BlockNumber] = js.native
  var topics: js.UndefOr[js.Array[String | js.Array[String] | Null]] = js.native
}

object LogsOptions {
  @scala.inline
  def apply(): LogsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogsOptions]
  }
  @scala.inline
  implicit class LogsOptionsOps[Self <: LogsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withFromBlock(value: BlockNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withTopics(value: js.Array[String | js.Array[String] | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topics")(js.undefined)
        ret
    }
  }
  
}

