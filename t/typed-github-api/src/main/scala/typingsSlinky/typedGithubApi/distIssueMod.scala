package typingsSlinky.typedGithubApi

import typingsSlinky.moment.mod.Duration_
import typingsSlinky.moment.mod.Moment
import typingsSlinky.typedGithubApi.githubRefMod.GitHubRef
import typingsSlinky.typedGithubApi.githubRefMod.OptionsOrRef
import typingsSlinky.typedGithubApi.interfacesIssueMod.Issue
import typingsSlinky.typedGithubApi.interfacesIssueMod.IssueComment
import typingsSlinky.typedGithubApi.interfacesLabelMod.Label
import typingsSlinky.typedGithubApi.interfacesRepositoryMod.Repository
import typingsSlinky.typedGithubApi.interfacesUserMod.UserSummary
import typingsSlinky.typedGithubApi.typedGithubApiStrings.closed
import typingsSlinky.typedGithubApi.typedGithubApiStrings.open
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
    def this(data: typingsSlinky.typedGithubApi.issueMod.Issue, options: OptionsOrRef) = this()
    /* CompleteClass */
    override val age: Duration_ = js.native
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
    def this(data: typingsSlinky.typedGithubApi.issueMod.IssueComment, options: OptionsOrRef) = this()
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

