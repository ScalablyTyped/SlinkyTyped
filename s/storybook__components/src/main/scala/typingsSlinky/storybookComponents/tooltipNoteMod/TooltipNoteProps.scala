package typingsSlinky.storybookComponents.tooltipNoteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipNoteProps extends js.Object {
  var note: String = js.native
}

object TooltipNoteProps {
  @scala.inline
  def apply(note: String): TooltipNoteProps = {
    val __obj = js.Dynamic.literal(note = note.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipNoteProps]
  }
  @scala.inline
  implicit class TooltipNotePropsOps[Self <: TooltipNoteProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

