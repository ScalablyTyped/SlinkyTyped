package typingsSlinky.zui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckedAll extends js.Object {
  var checkedAll: Boolean = js.native
  var checks: js.Array[Double] = js.native
}

object CheckedAll {
  @scala.inline
  def apply(checkedAll: Boolean, checks: js.Array[Double]): CheckedAll = {
    val __obj = js.Dynamic.literal(checkedAll = checkedAll.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckedAll]
  }
  @scala.inline
  implicit class CheckedAllOps[Self <: CheckedAll] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckedAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChecks(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

