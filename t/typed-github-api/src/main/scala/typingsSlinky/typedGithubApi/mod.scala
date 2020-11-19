package typingsSlinky.typedGithubApi

import typingsSlinky.typedGithubApi.githubApiMod.GitHubApi
import typingsSlinky.typedGithubApi.githubRefMod.OptionsOrRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typed-github-api", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class IssueWebHook ()
    extends typingsSlinky.typedGithubApi.webHookMod.IssueWebHook
  
  @js.native
  class default protected () extends GitHubApi {
    def this(options: OptionsOrRef) = this()
  }
}
