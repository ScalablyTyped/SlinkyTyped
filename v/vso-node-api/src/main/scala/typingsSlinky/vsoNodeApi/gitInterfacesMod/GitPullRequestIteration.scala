package typingsSlinky.vsoNodeApi.gitInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitPullRequestIteration extends js.Object {
  /**
    * A collection of related REST reference links.
    */
  var _links: js.Any = js.native
  /**
    * Author of the pull request iteration.
    */
  var author: IdentityRef = js.native
  /**
    * Changes included with the pull request iteration.
    */
  var changeList: js.Array[GitPullRequestChange] = js.native
  /**
    * The commits included with the pull request iteration.
    */
  var commits: js.Array[GitCommitRef] = js.native
  /**
    * The first common Git commit of the source and target refs.
    */
  var commonRefCommit: GitCommitRef = js.native
  /**
    * The creation date of the pull request iteration.
    */
  var createdDate: js.Date = js.native
  /**
    * Description of the pull request iteration.
    */
  var description: String = js.native
  /**
    * Indicates if the Commits property contains a truncated list of commits in this pull request iteration.
    */
  var hasMoreCommits: Boolean = js.native
  /**
    * ID of the pull request iteration. Iterations are created as a result of creating and pushing updates to a pull request.
    */
  var id: Double = js.native
  /**
    * The Git push information associated with this pull request iteration.
    */
  var push: GitPushRef = js.native
  /**
    * The reason for which the pull request iteration was created.
    */
  var reason: IterationReason = js.native
  /**
    * The source Git commit of this iteration.
    */
  var sourceRefCommit: GitCommitRef = js.native
  /**
    * The target Git commit of this iteration.
    */
  var targetRefCommit: GitCommitRef = js.native
  /**
    * The updated date of the pull request iteration.
    */
  var updatedDate: js.Date = js.native
}

object GitPullRequestIteration {
  @scala.inline
  def apply(
    _links: js.Any,
    author: IdentityRef,
    changeList: js.Array[GitPullRequestChange],
    commits: js.Array[GitCommitRef],
    commonRefCommit: GitCommitRef,
    createdDate: js.Date,
    description: String,
    hasMoreCommits: Boolean,
    id: Double,
    push: GitPushRef,
    reason: IterationReason,
    sourceRefCommit: GitCommitRef,
    targetRefCommit: GitCommitRef,
    updatedDate: js.Date
  ): GitPullRequestIteration = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], changeList = changeList.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], commonRefCommit = commonRefCommit.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hasMoreCommits = hasMoreCommits.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceRefCommit = sourceRefCommit.asInstanceOf[js.Any], targetRefCommit = targetRefCommit.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPullRequestIteration]
  }
  @scala.inline
  implicit class GitPullRequestIterationOps[Self <: GitPullRequestIteration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_links(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeList(value: js.Array[GitPullRequestChange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommits(value: js.Array[GitCommitRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommonRefCommit(value: GitCommitRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonRefCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasMoreCommits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMoreCommits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPush(value: GitPushRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: IterationReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceRefCommit(value: GitCommitRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRefCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetRefCommit(value: GitCommitRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRefCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedDate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

