package typingsSlinky.typedDashGithubDashApi

import typingsSlinky.typedDashGithubDashApi.distGithubDashRefMod.GitHubRef
import typingsSlinky.typedDashGithubDashApi.distInterfacesPullDashRequestMod.PullRequest
import typingsSlinky.typedDashGithubDashApi.distInterfacesPullDashRequestMod.PullRequestRef
import typingsSlinky.typedDashGithubDashApi.distInterfacesRepositoryMod.RepositoryRef
import typingsSlinky.typedDashGithubDashApi.distRepositoryDashRefMod.RepositoryRefClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/pull-request-ref", JSImport.Namespace)
@js.native
object distPullDashRequestDashRefMod extends js.Object {
  @js.native
  class PullRequestRefClass protected ()
    extends GitHubRef
       with PullRequestRef {
    def this(repository: RepositoryRefClass, pullRequestNumber: Double) = this()
    /* CompleteClass */
    override val number: Double = js.native
    val repository: RepositoryRef = js.native
    /* CompleteClass */
    override def loadAsync(): js.Promise[PullRequest | Null] = js.native
  }
  
}

