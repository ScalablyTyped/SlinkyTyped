package typingsSlinky.web3EthContract.mod

import typingsSlinky.web3Core.mod.PastLogsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PastEventOptions extends PastLogsOptions {
  var filter: js.UndefOr[Filter] = js.native
}

object PastEventOptions {
  @scala.inline
  def apply(): PastEventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PastEventOptions]
  }
  @scala.inline
  implicit class PastEventOptionsOps[Self <: PastEventOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
  }
  
}

