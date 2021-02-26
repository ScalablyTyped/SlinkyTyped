package typingsSlinky.typedGithubApi

import typingsSlinky.typedGithubApi.githubRefMod.GitHubRef
import typingsSlinky.typedGithubApi.githubRefMod.OptionsOrRef
import typingsSlinky.typedGithubApi.interfacesIssueMod.Issue
import typingsSlinky.typedGithubApi.interfacesIssueMod.IssueComment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIssueMod {
  
  @JSImport("typed-github-api/dist/issue", "IssueClass")
  @js.native
  class IssueClass protected ()
    extends GitHubRef
       with Issue {
    def this(data: typingsSlinky.typedGithubApi.issueMod.Issue, options: OptionsOrRef) = this()
    
    var repository: js.Any = js.native
    
    var repositoryUri: js.Any = js.native
  }
  
  @JSImport("typed-github-api/dist/issue", "IssueCommentClass")
  @js.native
  class IssueCommentClass protected ()
    extends GitHubRef
       with IssueComment {
    def this(data: typingsSlinky.typedGithubApi.issueMod.IssueComment, options: OptionsOrRef) = this()
  }
}
