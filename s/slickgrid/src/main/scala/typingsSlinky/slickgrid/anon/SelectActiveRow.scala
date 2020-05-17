package typingsSlinky.slickgrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectActiveRow extends js.Object {
  var selectActiveRow: Boolean = js.native
}

object SelectActiveRow {
  @scala.inline
  def apply(selectActiveRow: Boolean): SelectActiveRow = {
    val __obj = js.Dynamic.literal(selectActiveRow = selectActiveRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectActiveRow]
  }
  @scala.inline
  implicit class SelectActiveRowOps[Self <: SelectActiveRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectActiveRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectActiveRow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

