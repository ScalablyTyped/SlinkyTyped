package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Firstindices extends js.Object {
  var first_indices: js.Array[Double] = js.native
  var first_note: typingsSlinky.vexflow.Vex.Flow.Note = js.native
  var last_indices: js.Array[Double] = js.native
  var last_note: typingsSlinky.vexflow.Vex.Flow.Note = js.native
}

object Firstindices {
  @scala.inline
  def apply(
    first_indices: js.Array[Double],
    first_note: typingsSlinky.vexflow.Vex.Flow.Note,
    last_indices: js.Array[Double],
    last_note: typingsSlinky.vexflow.Vex.Flow.Note
  ): Firstindices = {
    val __obj = js.Dynamic.literal(first_indices = first_indices.asInstanceOf[js.Any], first_note = first_note.asInstanceOf[js.Any], last_indices = last_indices.asInstanceOf[js.Any], last_note = last_note.asInstanceOf[js.Any])
    __obj.asInstanceOf[Firstindices]
  }
  @scala.inline
  implicit class FirstindicesOps[Self <: Firstindices] (val x: Self) extends AnyVal {
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
    def withFirst_note(value: typingsSlinky.vexflow.Vex.Flow.Note): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_indices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_indices")(value.asInstanceOf[js.Any])
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

