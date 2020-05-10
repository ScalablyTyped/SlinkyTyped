package typingsSlinky.webscopeioReactTextareaAutocomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSelectionEnd extends js.Object {
  var selectionEnd: Double = js.native
  var selectionStart: Double = js.native
}

object AnonSelectionEnd {
  @scala.inline
  def apply(selectionEnd: Double, selectionStart: Double): AnonSelectionEnd = {
    val __obj = js.Dynamic.literal(selectionEnd = selectionEnd.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelectionEnd]
  }
  @scala.inline
  implicit class AnonSelectionEndOps[Self <: AnonSelectionEnd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectionEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

