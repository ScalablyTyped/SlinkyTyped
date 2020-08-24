package typingsSlinky.typedGithubApi

import typingsSlinky.typedGithubApi.distIssueMod.IssueCommentClass
import typingsSlinky.typedGithubApi.githubRefMod.GitHubRef
import typingsSlinky.typedGithubApi.githubRefMod.OptionsOrRef
import typingsSlinky.typedGithubApi.interfacesPullRequestMod.PullRequest
import typingsSlinky.typedGithubApi.interfacesPullRequestMod.Review
import typingsSlinky.typedGithubApi.interfacesPullRequestMod.Team
import typingsSlinky.typedGithubApi.pullRequestMod.ReviewComment
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
    var issueUri: js.Any = js.native
    var reviewCommentsUri: js.Any = js.native
  }
  
  @js.native
  class ReviewClass protected ()
    extends GitHubRef
       with Review {
    def this(data: typingsSlinky.typedGithubApi.pullRequestMod.Review, options: OptionsOrRef) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.typedGithubApi.interfacesIssueMod.IssueComment because Already inherited
  - typingsSlinky.typedGithubApi.interfacesPullRequestMod.ReviewComment because var conflicts: body, createdAt, createdBy, htmlUri, id, updatedAt. Inlined diffHunk, position */ @js.native
  class ReviewCommentClass protected () extends IssueCommentClass {
    def this(data: ReviewComment, options: OptionsOrRef) = this()
    var diffHunk: String = js.native
    var position: Double = js.native
  }
  
  @js.native
  class TeamClass protected ()
    extends GitHubRef
       with Team {
    def this(data: typingsSlinky.typedGithubApi.teamMod.Team, options: OptionsOrRef) = this()
  }
  
}

