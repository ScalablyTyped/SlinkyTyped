package typingsSlinky.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'forceSelection'> */
@js.native
trait PickImplforceSelection extends js.Object {
  var forceSelection: Boolean = js.native
}

object PickImplforceSelection {
  @scala.inline
  def apply(forceSelection: Boolean): PickImplforceSelection = {
    val __obj = js.Dynamic.literal(forceSelection = forceSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplforceSelection]
  }
  @scala.inline
  implicit class PickImplforceSelectionOps[Self <: PickImplforceSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForceSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSelection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

