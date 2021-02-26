package typingsSlinky.typedGithubApi

import typingsSlinky.typedGithubApi.githubRefMod.GitHubRef
import typingsSlinky.typedGithubApi.interfacesPullRequestMod.PullRequestRef
import typingsSlinky.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import typingsSlinky.typedGithubApi.repositoryRefMod.RepositoryRefClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pullRequestRefMod {
  
  @JSImport("typed-github-api/dist/pull-request-ref", "PullRequestRefClass")
  @js.native
  class PullRequestRefClass protected ()
    extends GitHubRef
       with PullRequestRef {
    def this(repository: RepositoryRefClass, pullRequestNumber: Double) = this()
    
    val repository: RepositoryRef = js.native
  }
}
