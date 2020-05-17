package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Firstnote extends js.Object {
  var first_note: typingsSlinky.vexflow.Vex.Flow.Note = js.native
  var last_note: typingsSlinky.vexflow.Vex.Flow.Note = js.native
}

object Firstnote {
  @scala.inline
  def apply(first_note: typingsSlinky.vexflow.Vex.Flow.Note, last_note: typingsSlinky.vexflow.Vex.Flow.Note): Firstnote = {
    val __obj = js.Dynamic.literal(first_note = first_note.asInstanceOf[js.Any], last_note = last_note.asInstanceOf[js.Any])
    __obj.asInstanceOf[Firstnote]
  }
  @scala.inline
  implicit class FirstnoteOps[Self <: Firstnote] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirst_note(value: typingsSlinky.vexflow.Vex.Flow.Note): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_note(value: typingsSlinky.vexflow.Vex.Flow.Note): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_note")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

