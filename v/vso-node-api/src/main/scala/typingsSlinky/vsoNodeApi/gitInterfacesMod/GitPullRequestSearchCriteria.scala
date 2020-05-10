package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitPullRequestSearchCriteria extends js.Object {
  /**
    * If set, search for pull requests that were created by this identity.
    */
  var creatorId: String = js.native
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean = js.native
  /**
    * If set, search for pull requests whose target branch is in this repository.
    */
  var repositoryId: String = js.native
  /**
    * If set, search for pull requests that have this identity as a reviewer.
    */
  var reviewerId: String = js.native
  /**
    * If set, search for pull requests from this branch.
    */
  var sourceRefName: String = js.native
  /**
    * If set, search for pull requests whose source branch is in this repository.
    */
  var sourceRepositoryId: String = js.native
  /**
    * If set, search for pull requests that are in this state.
    */
  var status: PullRequestStatus = js.native
  /**
    * If set, search for pull requests into this branch.
    */
  var targetRefName: String = js.native
}

object GitPullRequestSearchCriteria {
  @scala.inline
  def apply(
    creatorId: String,
    includeLinks: Boolean,
    repositoryId: String,
    reviewerId: String,
    sourceRefName: String,
    sourceRepositoryId: String,
    status: PullRequestStatus,
    targetRefName: String
  ): GitPullRequestSearchCriteria = {
    val __obj = js.Dynamic.literal(creatorId = creatorId.asInstanceOf[js.Any], includeLinks = includeLinks.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any], reviewerId = reviewerId.asInstanceOf[js.Any], sourceRefName = sourceRefName.asInstanceOf[js.Any], sourceRepositoryId = sourceRepositoryId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], targetRefName = targetRefName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPullRequestSearchCriteria]
  }
  @scala.inline
  implicit class GitPullRequestSearchCriteriaOps[Self <: GitPullRequestSearchCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatorId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepositoryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReviewerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceRefName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRefName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceRepositoryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRepositoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: PullRequestStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetRefName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRefName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

