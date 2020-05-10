package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEditorSelectionChangeEvent extends js.Object {
  /**
  		 * The [change kind](#TextEditorSelectionChangeKind) which has triggered this
  		 * event. Can be `undefined`.
  		 */
  val kind: js.UndefOr[TextEditorSelectionChangeKind] = js.native
  /**
  		 * The new value for the [text editor's selections](#TextEditor.selections).
  		 */
  val selections: js.Array[Selection] = js.native
  /**
  		 * The [text editor](#TextEditor) for which the selections have changed.
  		 */
  val textEditor: TextEditor = js.native
}

object TextEditorSelectionChangeEvent {
  @scala.inline
  def apply(selections: js.Array[Selection], textEditor: TextEditor): TextEditorSelectionChangeEvent = {
    val __obj = js.Dynamic.literal(selections = selections.asInstanceOf[js.Any], textEditor = textEditor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEditorSelectionChangeEvent]
  }
  @scala.inline
  implicit class TextEditorSelectionChangeEventOps[Self <: TextEditorSelectionChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelections(value: js.Array[Selection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextEditor(value: TextEditor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: TextEditorSelectionChangeKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

