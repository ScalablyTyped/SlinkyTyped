package typingsSlinky.web3Core.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PastLogsOptions extends LogsOptions {
  var toBlock: js.UndefOr[BlockNumber] = js.native
}

object PastLogsOptions {
  @scala.inline
  def apply(): PastLogsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PastLogsOptions]
  }
  @scala.inline
  implicit class PastLogsOptionsOps[Self <: PastLogsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToBlock(value: BlockNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBlock")(js.undefined)
        ret
    }
  }
  
}

