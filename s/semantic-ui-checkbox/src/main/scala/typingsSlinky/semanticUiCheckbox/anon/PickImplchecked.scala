package typingsSlinky.semanticUiCheckbox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.ClassNameSettings._Impl, 'checked'> */
@js.native
trait PickImplchecked extends js.Object {
  var checked: String = js.native
}

object PickImplchecked {
  @scala.inline
  def apply(checked: String): PickImplchecked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplchecked]
  }
  @scala.inline
  implicit class PickImplcheckedOps[Self <: PickImplchecked] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecked(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

