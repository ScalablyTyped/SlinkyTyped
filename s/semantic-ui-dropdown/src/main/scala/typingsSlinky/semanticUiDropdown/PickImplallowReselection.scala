package typingsSlinky.semanticUiDropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'allowReselection'> */
@js.native
trait PickImplallowReselection extends js.Object {
  var allowReselection: Boolean = js.native
}

object PickImplallowReselection {
  @scala.inline
  def apply(allowReselection: Boolean): PickImplallowReselection = {
    val __obj = js.Dynamic.literal(allowReselection = allowReselection.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplallowReselection]
  }
  @scala.inline
  implicit class PickImplallowReselectionOps[Self <: PickImplallowReselection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowReselection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReselection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

