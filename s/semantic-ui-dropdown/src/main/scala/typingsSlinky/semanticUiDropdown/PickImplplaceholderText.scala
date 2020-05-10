package typingsSlinky.semanticUiDropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MetadataSettings._Impl, 'placeholderText'> */
@js.native
trait PickImplplaceholderText extends js.Object {
  var placeholderText: String = js.native
}

object PickImplplaceholderText {
  @scala.inline
  def apply(placeholderText: String): PickImplplaceholderText = {
    val __obj = js.Dynamic.literal(placeholderText = placeholderText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplplaceholderText]
  }
  @scala.inline
  implicit class PickImplplaceholderTextOps[Self <: PickImplplaceholderText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlaceholderText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

