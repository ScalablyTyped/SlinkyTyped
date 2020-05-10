package typingsSlinky.vexflow

import typingsSlinky.vexflow.Vex.Flow.Note
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLastnote extends js.Object {
  var first_indices: js.UndefOr[js.Array[Double]] = js.native
  var first_note: js.UndefOr[Note] = js.native
  var last_indices: js.UndefOr[js.Array[Double]] = js.native
  var last_note: js.UndefOr[Note] = js.native
}

object AnonLastnote {
  @scala.inline
  def apply(): AnonLastnote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLastnote]
  }
  @scala.inline
  implicit class AnonLastnoteOps[Self <: AnonLastnote] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirst_indices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_indices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirst_indices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_indices")(js.undefined)
        ret
    }
    @scala.inline
    def withFirst_note(value: Note): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirst_note: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_note")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_indices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_indices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_indices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_indices")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_note(value: Note): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_note: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_note")(js.undefined)
        ret
    }
  }
  
}

