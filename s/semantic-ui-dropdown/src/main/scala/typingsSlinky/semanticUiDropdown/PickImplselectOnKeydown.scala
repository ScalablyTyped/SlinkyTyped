package typingsSlinky.semanticUiDropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'selectOnKeydown'> */
@js.native
trait PickImplselectOnKeydown extends js.Object {
  var selectOnKeydown: Boolean = js.native
}

object PickImplselectOnKeydown {
  @scala.inline
  def apply(selectOnKeydown: Boolean): PickImplselectOnKeydown = {
    val __obj = js.Dynamic.literal(selectOnKeydown = selectOnKeydown.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplselectOnKeydown]
  }
  @scala.inline
  implicit class PickImplselectOnKeydownOps[Self <: PickImplselectOnKeydown] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectOnKeydown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnKeydown")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

