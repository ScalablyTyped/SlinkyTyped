package typingsSlinky.typedGithubApi

import typingsSlinky.typedGithubApi.githubRefMod.GitHubRef
import typingsSlinky.typedGithubApi.interfacesCommitMod.CommitRef
import typingsSlinky.typedGithubApi.repositoryRefMod.RepositoryRefClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commitRefMod {
  
  @JSImport("typed-github-api/dist/commit-ref", "CommitRefClass")
  @js.native
  class CommitRefClass protected ()
    extends GitHubRef
       with CommitRef {
    def this(repository: RepositoryRefClass, sha: String) = this()
    
    @JSName("repository")
    val repository_CommitRefClass: RepositoryRefClass = js.native
  }
}
