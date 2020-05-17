package typingsSlinky.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ClassNameSettings._Impl, 'upward'> */
@js.native
trait PickImplupward extends js.Object {
  var upward: String = js.native
}

object PickImplupward {
  @scala.inline
  def apply(upward: String): PickImplupward = {
    val __obj = js.Dynamic.literal(upward = upward.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplupward]
  }
  @scala.inline
  implicit class PickImplupwardOps[Self <: PickImplupward] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpward(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upward")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

