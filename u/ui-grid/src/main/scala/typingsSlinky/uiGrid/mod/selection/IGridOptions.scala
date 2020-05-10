package typingsSlinky.uiGrid.mod.selection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridOptions extends js.Object {
  /**
    * Shows the total number of selected items in footer if true.
    * Defaults to true.
    * GridOptions.showGridFooter must also be set to true.
    * @default true
    */
  var enableFooterTotalSelected: js.UndefOr[Boolean] = js.native
  /**
    * Enable selection by clicking anywhere on the row.
    * Defaults to false if enableRowHeaderSelection is true, otherwise defaults to false.
    */
  var enableFullRowSelection: js.UndefOr[Boolean] = js.native
  /**
    * Enable a row header to be used for selection
    * Defaults to true
    * @default true
    */
  var enableRowHeaderSelection: js.UndefOr[Boolean] = js.native
  /**
    * Enable row selection for entire grid.
    * Defaults to true
    */
  var enableRowSelection: js.UndefOr[Boolean] = js.native
  /**
    * Enable the select all checkbox at the top of the selectionRowHeader
    * Defaults to true
    * @default true
    */
  var enableSelectAll: js.UndefOr[Boolean] = js.native
  /**
    * If selected rows are changed in bulk, either via the API or via the selectAll checkbox,
    * then a separate event is fired.
    * Setting this option to false will cause the rowSelectionChanged event to be called multiple times instead
    * Defaults to true
    * @default true
    */
  var enableSelectionBatchEvent: js.UndefOr[Boolean] = js.native
  /**
    * Makes it possible to specify a method that evaluates for each row and sets its "enableSelection"
    * property.
    */
  var isRowSelectable: js.UndefOr[js.Function1[/* row */ IGridRow, Boolean]] = js.native
  /**
    * Enable multiple row selection only when using the ctrlKey or shiftKey. Requires multiSelect to be true.
    * Defaults to false
    * @default false
    */
  var modifierKeysToMultiSelect: js.UndefOr[Boolean] = js.native
  /**
    * Enable multiple row selection for entire grid
    * Defaults to true
    * @default true
    */
  var multiSelect: js.UndefOr[Boolean] = js.native
  /**
    * Prevent a row from being unselected.
    * Works in conjunction with multiselect = false and gridApi.selection.selectRow() to allow you to
    * create a single selection only grid -
    * a row is always selected, you can only select different rows, you can't unselect the row.
    * Defaults to false
    * @default false
    */
  var noUnselect: js.UndefOr[Boolean] = js.native
  /**
    * can be used to set a custom width for the row header selection column
    * Defaults to 30px
    * @default 30
    */
  var selectionRowHeaderWidth: js.UndefOr[Double] = js.native
}

object IGridOptions {
  @scala.inline
  def apply(): IGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGridOptions]
  }
  @scala.inline
  implicit class IGridOptionsOps[Self <: IGridOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableFooterTotalSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFooterTotalSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableFooterTotalSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFooterTotalSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableFullRowSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFullRowSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableFullRowSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFullRowSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRowHeaderSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowHeaderSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRowHeaderSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowHeaderSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRowSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRowSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSelectAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSelectAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSelectAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSelectAll")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSelectionBatchEvent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSelectionBatchEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSelectionBatchEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSelectionBatchEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRowSelectable(value: /* row */ IGridRow => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowSelectable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsRowSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowSelectable")(js.undefined)
        ret
    }
    @scala.inline
    def withModifierKeysToMultiSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierKeysToMultiSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifierKeysToMultiSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierKeysToMultiSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withNoUnselect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUnselect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoUnselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUnselect")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionRowHeaderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionRowHeaderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionRowHeaderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionRowHeaderWidth")(js.undefined)
        ret
    }
  }
  
}

