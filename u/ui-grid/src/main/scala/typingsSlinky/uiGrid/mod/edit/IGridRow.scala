package typingsSlinky.uiGrid.mod.edit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridRow extends js.Object {
  /** enable editing on row, grouping for example might disable editing on group header rows */
  var enableCellEdit: js.UndefOr[Boolean] = js.native
}

object IGridRow {
  @scala.inline
  def apply(): IGridRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGridRow]
  }
  @scala.inline
  implicit class IGridRowOps[Self <: IGridRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableCellEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCellEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellEdit")(js.undefined)
        ret
    }
  }
  
}

