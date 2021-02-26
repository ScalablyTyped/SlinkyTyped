package typingsSlinky.typedGithubApi

import typingsSlinky.typedGithubApi.githubRefMod.GitHubRef
import typingsSlinky.typedGithubApi.githubRefMod.OptionsOrRef
import typingsSlinky.typedGithubApi.interfacesLabelMod.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLabelMod {
  
  @JSImport("typed-github-api/dist/label", "LabelClass")
  @js.native
  class LabelClass protected ()
    extends GitHubRef
       with Label {
    def this(data: typingsSlinky.typedGithubApi.labelMod.Label, options: OptionsOrRef) = this()
  }
}
