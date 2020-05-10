package typingsSlinky.semanticUiDropdown

import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.both
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.text
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'match'> */
@js.native
trait PickImplmatch extends js.Object {
  var `match`: both | value | text = js.native
}

object PickImplmatch {
  @scala.inline
  def apply(`match`: both | value | text): PickImplmatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmatch]
  }
  @scala.inline
  implicit class PickImplmatchOps[Self <: PickImplmatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatch(value: both | value | text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

