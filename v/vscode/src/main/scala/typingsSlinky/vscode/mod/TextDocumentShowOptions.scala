package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDocumentShowOptions extends js.Object {
  /**
  		 * An optional flag that when `true` will stop the [editor](#TextEditor) from taking focus.
  		 */
  var preserveFocus: js.UndefOr[Boolean] = js.native
  /**
  		 * An optional flag that controls if an [editor](#TextEditor)-tab will be replaced
  		 * with the next editor or if it will be kept.
  		 */
  var preview: js.UndefOr[Boolean] = js.native
  /**
  		 * An optional selection to apply for the document in the [editor](#TextEditor).
  		 */
  var selection: js.UndefOr[Range] = js.native
  /**
  		 * An optional view column in which the [editor](#TextEditor) should be shown.
  		 * The default is the [active](#ViewColumn.Active), other values are adjusted to
  		 * be `Min(column, columnCount + 1)`, the [active](#ViewColumn.Active)-column is
  		 * not adjusted. Use [`ViewColumn.Beside`](#ViewColumn.Beside) to open the
  		 * editor to the side of the currently active one.
  		 */
  var viewColumn: js.UndefOr[ViewColumn] = js.native
}

object TextDocumentShowOptions {
  @scala.inline
  def apply(): TextDocumentShowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDocumentShowOptions]
  }
  @scala.inline
  implicit class TextDocumentShowOptionsOps[Self <: TextDocumentShowOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withPreview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
        ret
    }
    @scala.inline
    def withViewColumn(value: ViewColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewColumn")(js.undefined)
        ret
    }
  }
  
}

