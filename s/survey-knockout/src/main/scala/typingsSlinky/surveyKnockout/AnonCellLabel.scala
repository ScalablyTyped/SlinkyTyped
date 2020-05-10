package typingsSlinky.surveyKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCellLabel extends js.Object {
  var cellLabel: String = js.native
  var cellText: String = js.native
  var cellTextSelected: String = js.native
  var itemChecked: String = js.native
  var itemDecorator: String = js.native
  var label: String = js.native
  var root: String = js.native
}

object AnonCellLabel {
  @scala.inline
  def apply(
    cellLabel: String,
    cellText: String,
    cellTextSelected: String,
    itemChecked: String,
    itemDecorator: String,
    label: String,
    root: String
  ): AnonCellLabel = {
    val __obj = js.Dynamic.literal(cellLabel = cellLabel.asInstanceOf[js.Any], cellText = cellText.asInstanceOf[js.Any], cellTextSelected = cellTextSelected.asInstanceOf[js.Any], itemChecked = itemChecked.asInstanceOf[js.Any], itemDecorator = itemDecorator.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCellLabel]
  }
  @scala.inline
  implicit class AnonCellLabelOps[Self <: AnonCellLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellTextSelected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTextSelected")(value.asInstanceOf[js.Any])
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
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

