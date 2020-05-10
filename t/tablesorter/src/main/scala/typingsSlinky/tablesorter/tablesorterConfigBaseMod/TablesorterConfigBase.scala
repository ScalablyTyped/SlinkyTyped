package typingsSlinky.tablesorter.tablesorterConfigBaseMod

import typingsSlinky.tablesorter.sortOrderMod.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TablesorterConfigBase extends js.Object {
  /**
    * The date-format for dates inside the table.
    */
  var dateFormat: js.UndefOr[String] = js.native
  /**
    * The order which will be applied when clicking on the heading the first time.
    */
  var sortInitialOrder: js.UndefOr[SortOrder] = js.native
}

object TablesorterConfigBase {
  @scala.inline
  def apply(): TablesorterConfigBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TablesorterConfigBase]
  }
  @scala.inline
  implicit class TablesorterConfigBaseOps[Self <: TablesorterConfigBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withSortInitialOrder(value: SortOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortInitialOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortInitialOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortInitialOrder")(js.undefined)
        ret
    }
  }
  
}

