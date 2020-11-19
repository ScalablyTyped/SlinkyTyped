package typingsSlinky.typedGithubApi

import typingsSlinky.typedGithubApi.githubRefMod.GitHubRef
import typingsSlinky.typedGithubApi.githubRefMod.OptionsOrRef
import typingsSlinky.typedGithubApi.interfacesMilestoneMod.Milestone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typed-github-api/dist/milestone", JSImport.Namespace)
@js.native
object distMilestoneMod extends js.Object {
  
  @js.native
  class MilestoneClass protected ()
    extends GitHubRef
       with Milestone {
    def this(data: typingsSlinky.typedGithubApi.milestoneMod.Milestone, options: OptionsOrRef) = this()
  }
}
