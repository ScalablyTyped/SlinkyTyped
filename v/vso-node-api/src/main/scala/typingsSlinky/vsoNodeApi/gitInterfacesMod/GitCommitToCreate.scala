package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitCommitToCreate extends js.Object {
  var baseRef: GitRef = js.native
  var comment: String = js.native
  var pathActions: js.Array[GitPathAction] = js.native
}

object GitCommitToCreate {
  @scala.inline
  def apply(baseRef: GitRef, comment: String, pathActions: js.Array[GitPathAction]): GitCommitToCreate = {
    val __obj = js.Dynamic.literal(baseRef = baseRef.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], pathActions = pathActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCommitToCreate]
  }
  @scala.inline
  implicit class GitCommitToCreateOps[Self <: GitCommitToCreate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseRef(value: GitRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathActions(value: js.Array[GitPathAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathActions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

