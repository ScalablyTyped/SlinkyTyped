package typingsSlinky.surveyKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItem extends js.Object {
  var clearButton: String = js.native
  var column: String = js.native
  var controlLabel: String = js.native
  var item: String = js.native
  var itemChecked: String = js.native
  var itemControl: String = js.native
  var itemDecorator: String = js.native
  var itemInline: String = js.native
  var label: String = js.native
  var labelChecked: String = js.native
  var materialDecorator: String = js.native
  var other: String = js.native
  var root: String = js.native
}

object AnonItem {
  @scala.inline
  def apply(
    clearButton: String,
    column: String,
    controlLabel: String,
    item: String,
    itemChecked: String,
    itemControl: String,
    itemDecorator: String,
    itemInline: String,
    label: String,
    labelChecked: String,
    materialDecorator: String,
    other: String,
    root: String
  ): AnonItem = {
    val __obj = js.Dynamic.literal(clearButton = clearButton.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], controlLabel = controlLabel.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemChecked = itemChecked.asInstanceOf[js.Any], itemControl = itemControl.asInstanceOf[js.Any], itemDecorator = itemDecorator.asInstanceOf[js.Any], itemInline = itemInline.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelChecked = labelChecked.asInstanceOf[js.Any], materialDecorator = materialDecorator.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItem]
  }
  @scala.inline
  implicit class AnonItemOps[Self <: AnonItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControlLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemChecked(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemControl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemDecorator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDecorator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemInline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemInline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelChecked(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaterialDecorator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("materialDecorator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOther(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(value.asInstanceOf[js.Any])
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

