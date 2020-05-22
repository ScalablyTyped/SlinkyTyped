package typingsSlinky.typedGithubApi

import typingsSlinky.moment.mod.Moment
import typingsSlinky.typedGithubApi.distIssueMod.IssueCommentClass
import typingsSlinky.typedGithubApi.githubRefMod.GitHubRef
import typingsSlinky.typedGithubApi.githubRefMod.OptionsOrRef
import typingsSlinky.typedGithubApi.interfacesBranchMod.BranchSummary
import typingsSlinky.typedGithubApi.interfacesBranchMod.BranchSummaryWithRepository
import typingsSlinky.typedGithubApi.interfacesIssueMod.Issue
import typingsSlinky.typedGithubApi.interfacesMilestoneMod.Milestone
import typingsSlinky.typedGithubApi.interfacesPullRequestMod.PullRequest
import typingsSlinky.typedGithubApi.interfacesPullRequestMod.Review
import typingsSlinky.typedGithubApi.interfacesPullRequestMod.ReviewComment
import typingsSlinky.typedGithubApi.interfacesPullRequestMod.ReviewRequests
import typingsSlinky.typedGithubApi.interfacesPullRequestMod.Team
import typingsSlinky.typedGithubApi.interfacesUserMod.UserSummary
import typingsSlinky.typedGithubApi.typedGithubApiStrings.APPROVED
import typingsSlinky.typedGithubApi.typedGithubApiStrings.CHANGES_REQUESTED
import typingsSlinky.typedGithubApi.typedGithubApiStrings.COMMENTED
import typingsSlinky.typedGithubApi.typedGithubApiStrings.DISMISSED
import typingsSlinky.typedGithubApi.typedGithubApiStrings.admin
import typingsSlinky.typedGithubApi.typedGithubApiStrings.closed
import typingsSlinky.typedGithubApi.typedGithubApiStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/pull-request", JSImport.Namespace)
@js.native
object distPullRequestMod extends js.Object {
  @js.native
  class PullRequestClass protected ()
    extends GitHubRef
       with PullRequest {
    def this(data: typingsSlinky.typedGithubApi.pullRequestMod.PullRequest, options: OptionsOrRef) = this()
    /* CompleteClass */
    override var assignee: UserSummary | Null = js.native
    /* CompleteClass */
    override var assignees: js.Array[UserSummary] = js.native
    /* CompleteClass */
    override var base: BranchSummaryWithRepository = js.native
    /* CompleteClass */
    override var body: String = js.native
    /* CompleteClass */
    override var createdAt: Moment = js.native
    /* CompleteClass */
    override var createdBy: UserSummary = js.native
    /* CompleteClass */
    override var head: BranchSummary = js.native
    /* CompleteClass */
    override var htmlUri: String = js.native
    /* CompleteClass */
    override var id: Double = js.native
    var issueUri: js.Any = js.native
    /* CompleteClass */
    override var locked: Boolean = js.native
    /* CompleteClass */
    override var milestone: Milestone | Null = js.native
    /* CompleteClass */
    override val number: Double = js.native
    var reviewCommentsUri: js.Any = js.native
    /* CompleteClass */
    override var state: open | closed = js.native
    /* CompleteClass */
    override var title: String = js.native
    /* CompleteClass */
    override var updatedAt: Moment = js.native
    /* CompleteClass */
    override def loadAsync(): js.Promise[PullRequest | Null] = js.native
    /* CompleteClass */
    override def loadIssueAsync(): js.Promise[Issue] = js.native
    /* CompleteClass */
    override def loadReviewCommentsAsync(): js.Promise[js.Array[ReviewComment]] = js.native
    /* CompleteClass */
    override def loadReviewRequestsAsync(): js.Promise[ReviewRequests] = js.native
    /* CompleteClass */
    override def loadReviewsAsync(): js.Promise[js.Array[Review]] = js.native
  }
  
  @js.native
  class ReviewClass protected ()
    extends GitHubRef
       with Review {
    def this(data: typingsSlinky.typedGithubApi.pullRequestMod.Review, options: OptionsOrRef) = this()
    /* CompleteClass */
    override var body: String = js.native
    /* CompleteClass */
    override var commitSha: String = js.native
    /* CompleteClass */
    override var createdBy: UserSummary = js.native
    /* CompleteClass */
    override var htmlUri: String = js.native
    /* CompleteClass */
    override var id: Double = js.native
    /* CompleteClass */
    override var state: APPROVED | CHANGES_REQUESTED | COMMENTED | DISMISSED = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.typedGithubApi.interfacesIssueMod.IssueComment because Already inherited
  - typingsSlinky.typedGithubApi.interfacesPullRequestMod.ReviewComment because var conflicts: body, createdAt, createdBy, htmlUri, id, updatedAt. Inlined diffHunk, position */ @js.native
  class ReviewCommentClass protected () extends IssueCommentClass {
    def this(data: typingsSlinky.typedGithubApi.pullRequestMod.ReviewComment, options: OptionsOrRef) = this()
    var diffHunk: String = js.native
    var position: Double = js.native
  }
  
  @js.native
  class TeamClass protected ()
    extends GitHubRef
       with Team {
    def this(data: typingsSlinky.typedGithubApi.teamMod.Team, options: OptionsOrRef) = this()
    /* CompleteClass */
    override var description: String = js.native
    /* CompleteClass */
    override var id: Double = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var permission: admin = js.native
    /* CompleteClass */
    override var privacy: closed = js.native
    /* CompleteClass */
    override var slug: String = js.native
  }
  
}

