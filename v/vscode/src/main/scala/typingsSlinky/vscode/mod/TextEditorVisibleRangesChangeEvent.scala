package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEditorVisibleRangesChangeEvent extends js.Object {
  /**
  		 * The [text editor](#TextEditor) for which the visible ranges have changed.
  		 */
  val textEditor: TextEditor = js.native
  /**
  		 * The new value for the [text editor's visible ranges](#TextEditor.visibleRanges).
  		 */
  val visibleRanges: js.Array[Range] = js.native
}

object TextEditorVisibleRangesChangeEvent {
  @scala.inline
  def apply(textEditor: TextEditor, visibleRanges: js.Array[Range]): TextEditorVisibleRangesChangeEvent = {
    val __obj = js.Dynamic.literal(textEditor = textEditor.asInstanceOf[js.Any], visibleRanges = visibleRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEditorVisibleRangesChangeEvent]
  }
  @scala.inline
  implicit class TextEditorVisibleRangesChangeEventOps[Self <: TextEditorVisibleRangesChangeEvent] (val x: Self) extends AnyVal {
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
    def withVisibleRanges(value: js.Array[Range]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleRanges")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

