package typingsSlinky.typedGithubApi

import typingsSlinky.typedGithubApi.githubRefMod.GitHubRef
import typingsSlinky.typedGithubApi.interfacesIssueMod.IssueRef
import typingsSlinky.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import typingsSlinky.typedGithubApi.repositoryRefMod.RepositoryRefClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issueRefMod {
  
  @JSImport("typed-github-api/dist/issue-ref", "IssueRefClass")
  @js.native
  class IssueRefClass protected ()
    extends GitHubRef
       with IssueRef {
    def this(repository: RepositoryRefClass, issueNumber: Double) = this()
    
    val repository: RepositoryRef = js.native
  }
}
