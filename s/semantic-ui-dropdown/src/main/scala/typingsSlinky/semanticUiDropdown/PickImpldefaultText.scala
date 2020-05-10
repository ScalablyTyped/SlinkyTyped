package typingsSlinky.semanticUiDropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MetadataSettings._Impl, 'defaultText'> */
@js.native
trait PickImpldefaultText extends js.Object {
  var defaultText: String = js.native
}

object PickImpldefaultText {
  @scala.inline
  def apply(defaultText: String): PickImpldefaultText = {
    val __obj = js.Dynamic.literal(defaultText = defaultText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldefaultText]
  }
  @scala.inline
  implicit class PickImpldefaultTextOps[Self <: PickImpldefaultText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

