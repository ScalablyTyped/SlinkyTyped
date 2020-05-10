package typingsSlinky.vscode

import typingsSlinky.vscode.mod.ViewColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPreserveFocus extends js.Object {
  var preserveFocus: js.UndefOr[Boolean] = js.native
  var viewColumn: ViewColumn = js.native
}

object AnonPreserveFocus {
  @scala.inline
  def apply(viewColumn: ViewColumn): AnonPreserveFocus = {
    val __obj = js.Dynamic.literal(viewColumn = viewColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPreserveFocus]
  }
  @scala.inline
  implicit class AnonPreserveFocusOps[Self <: AnonPreserveFocus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withViewColumn(value: ViewColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreserveFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveFocus")(js.undefined)
        ret
    }
  }
  
}

