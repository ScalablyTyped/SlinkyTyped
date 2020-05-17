package typingsSlinky.semanticUiModal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.ModalSettings._Impl, 'keyboardShortcuts'> */
@js.native
trait PickImplkeyboardShortcuts extends js.Object {
  var keyboardShortcuts: Boolean = js.native
}

object PickImplkeyboardShortcuts {
  @scala.inline
  def apply(keyboardShortcuts: Boolean): PickImplkeyboardShortcuts = {
    val __obj = js.Dynamic.literal(keyboardShortcuts = keyboardShortcuts.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplkeyboardShortcuts]
  }
  @scala.inline
  implicit class PickImplkeyboardShortcutsOps[Self <: PickImplkeyboardShortcuts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyboardShortcuts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardShortcuts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

