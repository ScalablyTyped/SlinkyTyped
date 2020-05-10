package typingsSlinky.semanticUiDropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'preserveHTML'> */
@js.native
trait PickImplpreserveHTML extends js.Object {
  var preserveHTML: Boolean = js.native
}

object PickImplpreserveHTML {
  @scala.inline
  def apply(preserveHTML: Boolean): PickImplpreserveHTML = {
    val __obj = js.Dynamic.literal(preserveHTML = preserveHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpreserveHTML]
  }
  @scala.inline
  implicit class PickImplpreserveHTMLOps[Self <: PickImplpreserveHTML] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreserveHTML(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveHTML")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

