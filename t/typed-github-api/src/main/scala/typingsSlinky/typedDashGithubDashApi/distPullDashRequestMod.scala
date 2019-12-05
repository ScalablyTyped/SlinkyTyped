package typingsSlinky.typedDashGithubDashApi

import typingsSlinky.moment.momentMod.Moment
import typingsSlinky.typedDashGithubDashApi.distGithubDashRefMod.GitHubRef
import typingsSlinky.typedDashGithubDashApi.distGithubDashRefMod.OptionsOrRef
import typingsSlinky.typedDashGithubDashApi.distInterfacesBranchMod.BranchSummary
import typingsSlinky.typedDashGithubDashApi.distInterfacesBranchMod.BranchSummaryWithRepository
import typingsSlinky.typedDashGithubDashApi.distInterfacesIssueMod.Issue
import typingsSlinky.typedDashGithubDashApi.distInterfacesMilestoneMod.Milestone
import typingsSlinky.typedDashGithubDashApi.distInterfacesPullDashRequestMod.PullRequest
import typingsSlinky.typedDashGithubDashApi.distInterfacesPullDashRequestMod.Review
import typingsSlinky.typedDashGithubDashApi.distInterfacesPullDashRequestMod.ReviewComment
import typingsSlinky.typedDashGithubDashApi.distInterfacesPullDashRequestMod.ReviewRequests
import typingsSlinky.typedDashGithubDashApi.distInterfacesPullDashRequestMod.Team
import typingsSlinky.typedDashGithubDashApi.distInterfacesUserMod.UserSummary
import typingsSlinky.typedDashGithubDashApi.distIssueMod.IssueCommentClass
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.APPROVED
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.CHANGES_REQUESTED
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.COMMENTED
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.DISMISSED
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.admin
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.closed
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/pull-request", JSImport.Namespace)
@js.native
object distPullDashRequestMod extends js.Object {
  @js.native
  class PullRequestClass protected ()
    extends GitHubRef
       with PullRequest {
    def this(
      data: typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesPullDashRequestMod.PullRequest,
      options: OptionsOrRef
    ) = this()
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
    def this(
      data: typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesPullDashRequestMod.Review,
      options: OptionsOrRef
    ) = this()
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
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.typedDashGithubDashApi.distInterfacesIssueMod.IssueComment because Already inherited
  - typings.typedDashGithubDashApi.distInterfacesPullDashRequestMod.ReviewComment because var conflicts: body, createdAt, createdBy, htmlUri, id, updatedAt. Inlined diffHunk, position */ @js.native
  class ReviewCommentClass protected () extends IssueCommentClass {
    def this(
      data: typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesPullDashRequestMod.ReviewComment,
      options: OptionsOrRef
    ) = this()
    var diffHunk: String = js.native
    var position: Double = js.native
  }
  
  @js.native
  class TeamClass protected ()
    extends GitHubRef
       with Team {
    def this(
      data: typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesTeamMod.Team,
      options: OptionsOrRef
    ) = this()
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

