package typingsSlinky.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellTextDisabled extends js.Object {
  var cell: String = js.native
  var cellText: String = js.native
  var cellTextDisabled: String = js.native
  var cellTextSelected: String = js.native
  var headerCell: String = js.native
  var itemChecked: String = js.native
  var itemDecorator: String = js.native
  var itemDisabled: String = js.native
  var itemHover: String = js.native
  var itemValue: String = js.native
  var label: String = js.native
  var materialDecorator: String = js.native
  var root: String = js.native
  var tableWrapper: String = js.native
}

object CellTextDisabled {
  @scala.inline
  def apply(
    cell: String,
    cellText: String,
    cellTextDisabled: String,
    cellTextSelected: String,
    headerCell: String,
    itemChecked: String,
    itemDecorator: String,
    itemDisabled: String,
    itemHover: String,
    itemValue: String,
    label: String,
    materialDecorator: String,
    root: String,
    tableWrapper: String
  ): CellTextDisabled = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], cellText = cellText.asInstanceOf[js.Any], cellTextDisabled = cellTextDisabled.asInstanceOf[js.Any], cellTextSelected = cellTextSelected.asInstanceOf[js.Any], headerCell = headerCell.asInstanceOf[js.Any], itemChecked = itemChecked.asInstanceOf[js.Any], itemDecorator = itemDecorator.asInstanceOf[js.Any], itemDisabled = itemDisabled.asInstanceOf[js.Any], itemHover = itemHover.asInstanceOf[js.Any], itemValue = itemValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], materialDecorator = materialDecorator.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], tableWrapper = tableWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellTextDisabled]
  }
  @scala.inline
  implicit class CellTextDisabledOps[Self <: CellTextDisabled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCell(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellTextDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTextDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellTextSelected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTextSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderCell(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemChecked(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemDecorator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDecorator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemHover(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaterialDecorator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("materialDecorator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableWrapper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableWrapper")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

