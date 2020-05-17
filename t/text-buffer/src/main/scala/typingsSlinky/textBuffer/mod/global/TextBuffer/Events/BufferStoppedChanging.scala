package typingsSlinky.textBuffer.mod.global.TextBuffer.Events

import typingsSlinky.textBuffer.mod.global.TextBuffer.Structures.TextChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferStoppedChanging extends js.Object {
  var changes: js.Array[TextChange] = js.native
}

object BufferStoppedChanging {
  @scala.inline
  def apply(changes: js.Array[TextChange]): BufferStoppedChanging = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferStoppedChanging]
  }
  @scala.inline
  implicit class BufferStoppedChangingOps[Self <: BufferStoppedChanging] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChanges(value: js.Array[TextChange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

