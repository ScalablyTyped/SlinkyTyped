package typingsSlinky.slickgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCancelCurrentEdit extends js.Object {
  def cancelCurrentEdit(): Boolean = js.native
  def commitCurrentEdit(): Boolean = js.native
}

object AnonCancelCurrentEdit {
  @scala.inline
  def apply(cancelCurrentEdit: () => Boolean, commitCurrentEdit: () => Boolean): AnonCancelCurrentEdit = {
    val __obj = js.Dynamic.literal(cancelCurrentEdit = js.Any.fromFunction0(cancelCurrentEdit), commitCurrentEdit = js.Any.fromFunction0(commitCurrentEdit))
    __obj.asInstanceOf[AnonCancelCurrentEdit]
  }
  @scala.inline
  implicit class AnonCancelCurrentEditOps[Self <: AnonCancelCurrentEdit] (val x: Self) extends AnyVal {
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

