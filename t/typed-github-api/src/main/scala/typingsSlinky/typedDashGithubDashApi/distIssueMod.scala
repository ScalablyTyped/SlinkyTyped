package typingsSlinky.typedDashGithubDashApi

import typingsSlinky.moment.momentMod.Duration
import typingsSlinky.moment.momentMod.Moment
import typingsSlinky.typedDashGithubDashApi.distGithubDashRefMod.GitHubRef
import typingsSlinky.typedDashGithubDashApi.distGithubDashRefMod.OptionsOrRef
import typingsSlinky.typedDashGithubDashApi.distInterfacesIssueMod.Issue
import typingsSlinky.typedDashGithubDashApi.distInterfacesIssueMod.IssueComment
import typingsSlinky.typedDashGithubDashApi.distInterfacesLabelMod.Label
import typingsSlinky.typedDashGithubDashApi.distInterfacesRepositoryMod.Repository
import typingsSlinky.typedDashGithubDashApi.distInterfacesUserMod.UserSummary
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.closed
import typingsSlinky.typedDashGithubDashApi.typedDashGithubDashApiStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/issue", JSImport.Namespace)
@js.native
object distIssueMod extends js.Object {
  @js.native
  class IssueClass protected ()
    extends GitHubRef
       with Issue {
    def this(
      data: typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesIssueMod.Issue,
      options: OptionsOrRef
    ) = this()
    /* CompleteClass */
    override val age: Duration = js.native
    /* CompleteClass */
    override var assignees: js.Array[UserSummary] = js.native
    /* CompleteClass */
    override var body: String = js.native
    /* CompleteClass */
    override var comments: Double = js.native
    /* CompleteClass */
    override var created: Moment = js.native
    /* CompleteClass */
    override var createdBy: UserSummary = js.native
    /* CompleteClass */
    override var htmlUri: String = js.native
    /* CompleteClass */
    override var id: Double = js.native
    /* CompleteClass */
    override val isOpen: Boolean = js.native
    /* CompleteClass */
    override var isPullRequest: Boolean = js.native
    /* CompleteClass */
    override var labels: js.Array[Label] = js.native
    /* CompleteClass */
    override var locked: Boolean = js.native
    /* CompleteClass */
    override val number: Double = js.native
    var repository: js.Any = js.native
    var repositoryUri: js.Any = js.native
    /* CompleteClass */
    override var state: open | closed = js.native
    /* CompleteClass */
    override var title: String = js.native
    /* CompleteClass */
    override var updated: Moment = js.native
    /* CompleteClass */
    override def loadAsync(): js.Promise[Issue | Null] = js.native
    /* CompleteClass */
    override def loadRepositoryAsync(): js.Promise[Repository] = js.native
    /* CompleteClass */
    override def wasOpen(when: Moment): Boolean = js.native
  }
  
  @js.native
  class IssueCommentClass protected ()
    extends GitHubRef
       with IssueComment {
    def this(
      data: typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesIssueMod.IssueComment,
      options: OptionsOrRef
    ) = this()
    /* CompleteClass */
    override var body: String = js.native
    /* CompleteClass */
    override var createdAt: Moment = js.native
    /* CompleteClass */
    override var createdBy: UserSummary = js.native
    /* CompleteClass */
    override var htmlUri: String = js.native
    /* CompleteClass */
    override var id: Double = js.native
    /* CompleteClass */
    override var updatedAt: Moment = js.native
  }
  
}

