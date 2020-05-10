package typingsSlinky.uiGrid.mod.selection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridRow extends js.Object {
  /**
    * Enable row selection for this row, only settable by internal code.
    *
    * The grouping feature, for example, might set group header rows to not be selectable.
    * Defaults to true
    * @default true
    */
  var enableSelection: js.UndefOr[Boolean] = js.native
  /**
    * Selected state of row.
    * Should be readonly.
    * Make any changes to selected state using setSelected().
    * Defaults to false
    *
    * @readonly
    * @default false
    */
  var isSelected: js.UndefOr[Boolean] = js.native
  /**
    * Sets the isSelected property and updates the selectedCount
    * Changes to isSelected state should only be made via this function
    * @param selected Value to set
    */
  def setSelected(selected: Boolean): Unit = js.native
}

object IGridRow {
  @scala.inline
  def apply(setSelected: Boolean => Unit): IGridRow = {
    val __obj = js.Dynamic.literal(setSelected = js.Any.fromFunction1(setSelected))
    __obj.asInstanceOf[IGridRow]
  }
  @scala.inline
  implicit class IGridRowOps[Self <: IGridRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetSelected(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnableSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(js.undefined)
        ret
    }
  }
  
}

