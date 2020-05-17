package typingsSlinky.textBuffer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintainHistory extends js.Object {
  var maintainHistory: js.UndefOr[Boolean] = js.native
  var persistent: js.UndefOr[Boolean] = js.native
}

object MaintainHistory {
  @scala.inline
  def apply(): MaintainHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintainHistory]
  }
  @scala.inline
  implicit class MaintainHistoryOps[Self <: MaintainHistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaintainHistory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintainHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainHistory")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistent")(js.undefined)
        ret
    }
  }
  
}

