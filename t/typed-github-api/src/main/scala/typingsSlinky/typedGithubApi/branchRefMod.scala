package typingsSlinky.typedGithubApi

import typingsSlinky.typedGithubApi.githubRefMod.GitHubRef
import typingsSlinky.typedGithubApi.interfacesBranchMod.BranchRef
import typingsSlinky.typedGithubApi.repositoryRefMod.RepositoryRefClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/branch-ref", JSImport.Namespace)
@js.native
object branchRefMod extends js.Object {
  @js.native
  class BranchRefClass protected ()
    extends GitHubRef
       with BranchRef {
    def this(repository: RepositoryRefClass, name: String) = this()
    @JSName("repository")
    val repository_BranchRefClass: RepositoryRefClass = js.native
  }
  
}

