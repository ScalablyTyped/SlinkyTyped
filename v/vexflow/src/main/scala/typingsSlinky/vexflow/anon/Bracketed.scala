package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bracketed extends js.Object {
  var bracketed: js.UndefOr[Boolean] = js.native
  var location: js.UndefOr[Double] = js.native
  var notes_occupied: js.UndefOr[Double] = js.native
  var num_notes: js.UndefOr[Double] = js.native
  var ratioed: Boolean = js.native
  var y_offset: js.UndefOr[Double] = js.native
}

object Bracketed {
  @scala.inline
  def apply(ratioed: Boolean): Bracketed = {
    val __obj = js.Dynamic.literal(ratioed = ratioed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bracketed]
  }
  @scala.inline
  implicit class BracketedOps[Self <: Bracketed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRatioed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratioed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBracketed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bracketed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBracketed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bracketed")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withNotes_occupied(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes_occupied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotes_occupied: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes_occupied")(js.undefined)
        ret
    }
    @scala.inline
    def withNum_notes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNum_notes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_notes")(js.undefined)
        ret
    }
    @scala.inline
    def withY_offset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y_offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY_offset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y_offset")(js.undefined)
        ret
    }
  }
  
}

