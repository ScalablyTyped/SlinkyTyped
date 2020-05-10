package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncludedGitCommit extends js.Object {
  var commitId: String = js.native
  var commitTime: js.Date = js.native
  var parentCommitIds: js.Array[String] = js.native
  var repositoryId: String = js.native
}

object IncludedGitCommit {
  @scala.inline
  def apply(commitId: String, commitTime: js.Date, parentCommitIds: js.Array[String], repositoryId: String): IncludedGitCommit = {
    val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], commitTime = commitTime.asInstanceOf[js.Any], parentCommitIds = parentCommitIds.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludedGitCommit]
  }
  @scala.inline
  implicit class IncludedGitCommitOps[Self <: IncludedGitCommit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommitId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentCommitIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentCommitIds")(value.asInstanceOf[js.Any])
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

