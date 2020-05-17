package typingsSlinky.textBuffer.mod.global.TextBuffer.Events

import typingsSlinky.textBuffer.mod.global.TextBuffer.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferChanging extends js.Object {
  /** Range of the old text. */
  var oldRange: Range = js.native
}

object BufferChanging {
  @scala.inline
  def apply(oldRange: Range): BufferChanging = {
    val __obj = js.Dynamic.literal(oldRange = oldRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferChanging]
  }
  @scala.inline
  implicit class BufferChangingOps[Self <: BufferChanging] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOldRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldRange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

