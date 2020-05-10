package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeleted extends js.Object {
  var deleted: Double = js.native
  var edited: Double = js.native
  var restored: Double = js.native
  var visited: Double = js.native
}

object AnonDeleted {
  @scala.inline
  def apply(deleted: Double, edited: Double, restored: Double, visited: Double): AnonDeleted = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], edited = edited.asInstanceOf[js.Any], restored = restored.asInstanceOf[js.Any], visited = visited.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeleted]
  }
  @scala.inline
  implicit class AnonDeletedOps[Self <: AnonDeleted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdited(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestored(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisited(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visited")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

