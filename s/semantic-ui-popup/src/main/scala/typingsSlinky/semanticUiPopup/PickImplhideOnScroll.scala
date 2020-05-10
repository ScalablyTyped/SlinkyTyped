package typingsSlinky.semanticUiPopup

import typingsSlinky.semanticUiPopup.semanticUiPopupBooleans.`false`
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'hideOnScroll'> */
@js.native
trait PickImplhideOnScroll extends js.Object {
  var hideOnScroll: auto | `false` = js.native
}

object PickImplhideOnScroll {
  @scala.inline
  def apply(hideOnScroll: auto | `false`): PickImplhideOnScroll = {
    val __obj = js.Dynamic.literal(hideOnScroll = hideOnScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhideOnScroll]
  }
  @scala.inline
  implicit class PickImplhideOnScrollOps[Self <: PickImplhideOnScroll] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHideOnScroll(value: auto | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnScroll")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

