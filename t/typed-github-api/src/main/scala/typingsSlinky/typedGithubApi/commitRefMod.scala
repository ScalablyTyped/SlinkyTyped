package typingsSlinky.typedGithubApi

import typingsSlinky.typedGithubApi.githubRefMod.GitHubRef
import typingsSlinky.typedGithubApi.interfacesCommitMod.CommitRef
import typingsSlinky.typedGithubApi.repositoryRefMod.RepositoryRefClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/commit-ref", JSImport.Namespace)
@js.native
object commitRefMod extends js.Object {
  @js.native
  class CommitRefClass protected ()
    extends GitHubRef
       with CommitRef {
    def this(repository: RepositoryRefClass, sha: String) = this()
    @JSName("repository")
    val repository_CommitRefClass: RepositoryRefClass = js.native
  }
  
}

