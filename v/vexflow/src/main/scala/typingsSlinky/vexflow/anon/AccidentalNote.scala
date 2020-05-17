package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccidentalNote extends js.Object {
  var accidental: String = js.native
  var note: String = js.native
}

object AccidentalNote {
  @scala.inline
  def apply(accidental: String, note: String): AccidentalNote = {
    val __obj = js.Dynamic.literal(accidental = accidental.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccidentalNote]
  }
  @scala.inline
  implicit class AccidentalNoteOps[Self <: AccidentalNote] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccidental(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accidental")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

