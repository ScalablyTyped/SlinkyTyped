package typingsSlinky.semanticUiCheckbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.ClassNameSettings._Impl, 'disabled'> */
@js.native
trait PickImpldisabled extends js.Object {
  var disabled: String = js.native
}

object PickImpldisabled {
  @scala.inline
  def apply(disabled: String): PickImpldisabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldisabled]
  }
  @scala.inline
  implicit class PickImpldisabledOps[Self <: PickImpldisabled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

