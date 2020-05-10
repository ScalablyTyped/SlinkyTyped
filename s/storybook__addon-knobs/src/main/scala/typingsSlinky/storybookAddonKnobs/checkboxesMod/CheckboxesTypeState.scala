package typingsSlinky.storybookAddonKnobs.checkboxesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxesTypeState extends js.Object {
  var values: CheckboxesTypeKnobValue = js.native
}

object CheckboxesTypeState {
  @scala.inline
  def apply(values: CheckboxesTypeKnobValue): CheckboxesTypeState = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxesTypeState]
  }
  @scala.inline
  implicit class CheckboxesTypeStateOps[Self <: CheckboxesTypeState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValues(value: CheckboxesTypeKnobValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

