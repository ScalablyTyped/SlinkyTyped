package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceFolderPickOptions extends js.Object {
  /**
  		 * Set to `true` to keep the picker open when focus moves to another part of the editor or to another window.
  		 */
  var ignoreFocusOut: js.UndefOr[Boolean] = js.native
  /**
  		 * An optional string to show as placeholder in the input box to guide the user what to pick on.
  		 */
  var placeHolder: js.UndefOr[String] = js.native
}

object WorkspaceFolderPickOptions {
  @scala.inline
  def apply(): WorkspaceFolderPickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceFolderPickOptions]
  }
  @scala.inline
  implicit class WorkspaceFolderPickOptionsOps[Self <: WorkspaceFolderPickOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreFocusOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFocusOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreFocusOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFocusOut")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceHolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeHolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceHolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeHolder")(js.undefined)
        ret
    }
  }
  
}

