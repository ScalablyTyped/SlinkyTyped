package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEditorViewColumnChangeEvent extends js.Object {
  /**
  		 * The [text editor](#TextEditor) for which the view column has changed.
  		 */
  val textEditor: TextEditor = js.native
  /**
  		 * The new value for the [text editor's view column](#TextEditor.viewColumn).
  		 */
  val viewColumn: ViewColumn = js.native
}

object TextEditorViewColumnChangeEvent {
  @scala.inline
  def apply(textEditor: TextEditor, viewColumn: ViewColumn): TextEditorViewColumnChangeEvent = {
    val __obj = js.Dynamic.literal(textEditor = textEditor.asInstanceOf[js.Any], viewColumn = viewColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEditorViewColumnChangeEvent]
  }
  @scala.inline
  implicit class TextEditorViewColumnChangeEventOps[Self <: TextEditorViewColumnChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTextEditor(value: TextEditor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewColumn(value: ViewColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewColumn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

