package typingsSlinky.typedGithubApi

import typingsSlinky.typedGithubApi.githubRefMod.GitHubRef
import typingsSlinky.typedGithubApi.interfacesPullRequestMod.PullRequestRef
import typingsSlinky.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import typingsSlinky.typedGithubApi.repositoryRefMod.RepositoryRefClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typed-github-api/dist/pull-request-ref", JSImport.Namespace)
@js.native
object pullRequestRefMod extends js.Object {
  
  @js.native
  class PullRequestRefClass protected ()
    extends GitHubRef
       with PullRequestRef {
    def this(repository: RepositoryRefClass, pullRequestNumber: Double) = this()
    
    val repository: RepositoryRef = js.native
  }
}
