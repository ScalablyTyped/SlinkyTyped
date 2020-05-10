package typingsSlinky.semanticUiDropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, 'backspace'> */
@js.native
trait PickImplbackspace extends js.Object {
  var backspace: Double = js.native
}

object PickImplbackspace {
  @scala.inline
  def apply(backspace: Double): PickImplbackspace = {
    val __obj = js.Dynamic.literal(backspace = backspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplbackspace]
  }
  @scala.inline
  implicit class PickImplbackspaceOps[Self <: PickImplbackspace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackspace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backspace")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

