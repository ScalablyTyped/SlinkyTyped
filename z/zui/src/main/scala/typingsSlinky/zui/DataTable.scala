package typingsSlinky.zui

import typingsSlinky.zui.anon.CheckedAll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTable extends js.Object {
  var checks: CheckedAll = js.native
}

object DataTable {
  @scala.inline
  def apply(checks: CheckedAll): DataTable = {
    val __obj = js.Dynamic.literal(checks = checks.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTable]
  }
  @scala.inline
  implicit class DataTableOps[Self <: DataTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecks(value: CheckedAll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

