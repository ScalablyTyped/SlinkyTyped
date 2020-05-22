package typingsSlinky.typedGithubApi

import typingsSlinky.typedGithubApi.githubRefMod.GitHubRef
import typingsSlinky.typedGithubApi.interfacesIssueMod.Issue
import typingsSlinky.typedGithubApi.interfacesIssueMod.IssueRef
import typingsSlinky.typedGithubApi.interfacesRepositoryMod.Repository
import typingsSlinky.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import typingsSlinky.typedGithubApi.repositoryRefMod.RepositoryRefClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/issue-ref", JSImport.Namespace)
@js.native
object issueRefMod extends js.Object {
  @js.native
  class IssueRefClass protected ()
    extends GitHubRef
       with IssueRef {
    def this(repository: RepositoryRefClass, issueNumber: Double) = this()
    /* CompleteClass */
    override val number: Double = js.native
    val repository: RepositoryRef = js.native
    /* CompleteClass */
    override def loadAsync(): js.Promise[Issue | Null] = js.native
    /* CompleteClass */
    override def loadRepositoryAsync(): js.Promise[Repository] = js.native
  }
  
}

