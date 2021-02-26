package typingsSlinky.typedGithubApi

import typingsSlinky.typedGithubApi.githubRefMod.GitHubRef
import typingsSlinky.typedGithubApi.interfacesBranchMod.BranchRef
import typingsSlinky.typedGithubApi.repositoryRefMod.RepositoryRefClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object branchRefMod {
  
  @JSImport("typed-github-api/dist/branch-ref", "BranchRefClass")
  @js.native
  class BranchRefClass protected ()
    extends GitHubRef
       with BranchRef {
    def this(repository: RepositoryRefClass, name: String) = this()
    
    @JSName("repository")
    val repository_BranchRefClass: RepositoryRefClass = js.native
  }
}
