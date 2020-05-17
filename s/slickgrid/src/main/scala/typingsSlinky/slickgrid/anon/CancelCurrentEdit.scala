package typingsSlinky.slickgrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelCurrentEdit extends js.Object {
  def cancelCurrentEdit(): Boolean = js.native
  def commitCurrentEdit(): Boolean = js.native
}

object CancelCurrentEdit {
  @scala.inline
  def apply(cancelCurrentEdit: () => Boolean, commitCurrentEdit: () => Boolean): CancelCurrentEdit = {
    val __obj = js.Dynamic.literal(cancelCurrentEdit = js.Any.fromFunction0(cancelCurrentEdit), commitCurrentEdit = js.Any.fromFunction0(commitCurrentEdit))
    __obj.asInstanceOf[CancelCurrentEdit]
  }
  @scala.inline
  implicit class CancelCurrentEditOps[Self <: CancelCurrentEdit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelCurrentEdit(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelCurrentEdit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCommitCurrentEdit(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitCurrentEdit")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

