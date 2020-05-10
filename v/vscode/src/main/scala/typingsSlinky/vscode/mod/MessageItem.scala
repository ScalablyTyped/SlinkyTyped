package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageItem extends js.Object {
  /**
  		 * A hint for modal dialogs that the item should be triggered
  		 * when the user cancels the dialog (e.g. by pressing the ESC
  		 * key).
  		 *
  		 * Note: this option is ignored for non-modal messages.
  		 */
  var isCloseAffordance: js.UndefOr[Boolean] = js.native
  /**
  		 * A short title like 'Retry', 'Open Log' etc.
  		 */
  var title: String = js.native
}

object MessageItem {
  @scala.inline
  def apply(title: String): MessageItem = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageItem]
  }
  @scala.inline
  implicit class MessageItemOps[Self <: MessageItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCloseAffordance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCloseAffordance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCloseAffordance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCloseAffordance")(js.undefined)
        ret
    }
  }
  
}

