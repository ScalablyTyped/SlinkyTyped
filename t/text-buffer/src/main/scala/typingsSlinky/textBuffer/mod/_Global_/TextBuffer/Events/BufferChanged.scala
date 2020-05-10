package typingsSlinky.textBuffer.mod._Global_.TextBuffer.Events

import typingsSlinky.textBuffer.mod._Global_.TextBuffer.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferChanged extends js.Object {
  /** Range of the new text. */
  var newRange: Range = js.native
  /** String containing the text that was inserted. */
  var newText: String = js.native
  /** Range of the old text. */
  var oldRange: Range = js.native
  /** String containing the text that was replaced. */
  var oldText: String = js.native
}

object BufferChanged {
  @scala.inline
  def apply(newRange: Range, newText: String, oldRange: Range, oldText: String): BufferChanged = {
    val __obj = js.Dynamic.literal(newRange = newRange.asInstanceOf[js.Any], newText = newText.asInstanceOf[js.Any], oldRange = oldRange.asInstanceOf[js.Any], oldText = oldText.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferChanged]
  }
  @scala.inline
  implicit class BufferChangedOps[Self <: BufferChanged] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

