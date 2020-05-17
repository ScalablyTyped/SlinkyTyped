package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deleted extends js.Object {
  var deleted: scala.Double = js.native
  var edited: scala.Double = js.native
  var restored: scala.Double = js.native
  var visited: scala.Double = js.native
}

object Deleted {
  @scala.inline
  def apply(deleted: scala.Double, edited: scala.Double, restored: scala.Double, visited: scala.Double): Deleted = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], edited = edited.asInstanceOf[js.Any], restored = restored.asInstanceOf[js.Any], visited = visited.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deleted]
  }
  @scala.inline
  implicit class DeletedOps[Self <: Deleted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleted(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdited(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestored(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisited(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visited")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

