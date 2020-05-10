package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitPushEventData extends js.Object {
  var afterId: String = js.native
  var beforeId: String = js.native
  var branch: String = js.native
  var commits: js.Array[GitCommit] = js.native
  var repository: GitRepository = js.native
}

object GitPushEventData {
  @scala.inline
  def apply(
    afterId: String,
    beforeId: String,
    branch: String,
    commits: js.Array[GitCommit],
    repository: GitRepository
  ): GitPushEventData = {
    val __obj = js.Dynamic.literal(afterId = afterId.asInstanceOf[js.Any], beforeId = beforeId.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPushEventData]
  }
  @scala.inline
  implicit class GitPushEventDataOps[Self <: GitPushEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommits(value: js.Array[GitCommit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepository(value: GitRepository): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

