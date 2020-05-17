package typingsSlinky.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Control extends js.Object {
  var control: String = js.native
  var disabledLabel: String = js.native
  var item: String = js.native
  var itemChecked: String = js.native
  var itemDisabled: String = js.native
  var itemIndeterminate: String = js.native
  var label: String = js.native
  var root: String = js.native
  var slider: String = js.native
  var switch: String = js.native
}

object Control {
  @scala.inline
  def apply(
    control: String,
    disabledLabel: String,
    item: String,
    itemChecked: String,
    itemDisabled: String,
    itemIndeterminate: String,
    label: String,
    root: String,
    slider: String,
    switch: String
  ): Control = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], disabledLabel = disabledLabel.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemChecked = itemChecked.asInstanceOf[js.Any], itemDisabled = itemDisabled.asInstanceOf[js.Any], itemIndeterminate = itemIndeterminate.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], slider = slider.asInstanceOf[js.Any], switch = switch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Control]
  }
  @scala.inline
  implicit class ControlOps[Self <: Control] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledLabel")(value.asInstanceOf[js.Any])
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
    def withItemDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemIndeterminate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemIndeterminate")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withSlider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwitch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

