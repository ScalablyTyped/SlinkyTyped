package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitRepositoryStats extends js.Object {
  var activePullRequestsCount: Double = js.native
  var branchesCount: Double = js.native
  var commitsCount: Double = js.native
  var repositoryId: String = js.native
}

object GitRepositoryStats {
  @scala.inline
  def apply(activePullRequestsCount: Double, branchesCount: Double, commitsCount: Double, repositoryId: String): GitRepositoryStats = {
    val __obj = js.Dynamic.literal(activePullRequestsCount = activePullRequestsCount.asInstanceOf[js.Any], branchesCount = branchesCount.asInstanceOf[js.Any], commitsCount = commitsCount.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitRepositoryStats]
  }
  @scala.inline
  implicit class GitRepositoryStatsOps[Self <: GitRepositoryStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivePullRequestsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activePullRequestsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranchesCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchesCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepositoryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

