package typingsSlinky.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUndoStopAfter extends js.Object {
  var undoStopAfter: Boolean = js.native
  var undoStopBefore: Boolean = js.native
}

object AnonUndoStopAfter {
  @scala.inline
  def apply(undoStopAfter: Boolean, undoStopBefore: Boolean): AnonUndoStopAfter = {
    val __obj = js.Dynamic.literal(undoStopAfter = undoStopAfter.asInstanceOf[js.Any], undoStopBefore = undoStopBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUndoStopAfter]
  }
  @scala.inline
  implicit class AnonUndoStopAfterOps[Self <: AnonUndoStopAfter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUndoStopAfter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undoStopAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndoStopBefore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undoStopBefore")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

