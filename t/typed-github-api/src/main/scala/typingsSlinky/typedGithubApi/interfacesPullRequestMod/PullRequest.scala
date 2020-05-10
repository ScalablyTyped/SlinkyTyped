package typingsSlinky.typedGithubApi.interfacesPullRequestMod

import typingsSlinky.moment.mod.Moment
import typingsSlinky.typedGithubApi.interfacesBranchMod.BranchSummary
import typingsSlinky.typedGithubApi.interfacesBranchMod.BranchSummaryWithRepository
import typingsSlinky.typedGithubApi.interfacesIssueMod.Issue
import typingsSlinky.typedGithubApi.interfacesMilestoneMod.Milestone
import typingsSlinky.typedGithubApi.interfacesUserMod.UserSummary
import typingsSlinky.typedGithubApi.typedGithubApiStrings.closed
import typingsSlinky.typedGithubApi.typedGithubApiStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRequest extends PullRequestRef {
  var assignee: UserSummary | Null = js.native
  var assignees: js.Array[UserSummary] = js.native
  var base: BranchSummaryWithRepository = js.native
  var body: String = js.native
  var closedAt: js.UndefOr[Moment] = js.native
  var createdAt: Moment = js.native
  var createdBy: UserSummary = js.native
  var head: BranchSummary = js.native
  var htmlUri: String = js.native
  var id: Double = js.native
  var locked: Boolean = js.native
  var mergedAt: js.UndefOr[Moment] = js.native
  var milestone: Milestone | Null = js.native
  var state: open | closed = js.native
  var title: String = js.native
  var updatedAt: Moment = js.native
  def loadIssueAsync(): js.Promise[Issue] = js.native
  def loadReviewCommentsAsync(): js.Promise[js.Array[ReviewComment]] = js.native
  def loadReviewRequestsAsync(): js.Promise[ReviewRequests] = js.native
  def loadReviewsAsync(): js.Promise[js.Array[Review]] = js.native
}

object PullRequest {
  @scala.inline
  def apply(
    assignees: js.Array[UserSummary],
    base: BranchSummaryWithRepository,
    body: String,
    createdAt: Moment,
    createdBy: UserSummary,
    head: BranchSummary,
    htmlUri: String,
    id: Double,
    loadAsync: () => js.Promise[PullRequest | Null],
    loadIssueAsync: () => js.Promise[Issue],
    loadReviewCommentsAsync: () => js.Promise[js.Array[ReviewComment]],
    loadReviewRequestsAsync: () => js.Promise[ReviewRequests],
    loadReviewsAsync: () => js.Promise[js.Array[Review]],
    locked: Boolean,
    number: Double,
    state: open | closed,
    title: String,
    updatedAt: Moment
  ): PullRequest = {
    val __obj = js.Dynamic.literal(assignees = assignees.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], htmlUri = htmlUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loadAsync = js.Any.fromFunction0(loadAsync), loadIssueAsync = js.Any.fromFunction0(loadIssueAsync), loadReviewCommentsAsync = js.Any.fromFunction0(loadReviewCommentsAsync), loadReviewRequestsAsync = js.Any.fromFunction0(loadReviewRequestsAsync), loadReviewsAsync = js.Any.fromFunction0(loadReviewsAsync), locked = locked.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequest]
  }
  @scala.inline
  implicit class PullRequestOps[Self <: PullRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignees(value: js.Array[UserSummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase(value: BranchSummaryWithRepository): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedAt(value: Moment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedBy(value: UserSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHead(value: BranchSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtmlUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadIssueAsync(value: () => js.Promise[Issue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadIssueAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoadReviewCommentsAsync(value: () => js.Promise[js.Array[ReviewComment]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadReviewCommentsAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoadReviewRequestsAsync(value: () => js.Promise[ReviewRequests]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadReviewRequestsAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoadReviewsAsync(value: () => js.Promise[js.Array[Review]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadReviewsAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: open | closed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedAt(value: Moment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssignee(value: UserSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssigneeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignee")(null)
        ret
    }
    @scala.inline
    def withClosedAt(value: Moment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withMergedAt(value: Moment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withMilestone(value: Milestone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milestone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMilestoneNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milestone")(null)
        ret
    }
  }
  
}

