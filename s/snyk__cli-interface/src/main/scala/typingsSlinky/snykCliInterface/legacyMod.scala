package typingsSlinky.snykCliInterface

import typingsSlinky.snykCliInterface.pluginMod.InspectOptions
import typingsSlinky.snykCliInterface.pluginMod.InspectResult
import typingsSlinky.snykCliInterface.pluginMod.Plugin
import typingsSlinky.snykCliInterface.pluginMod.SingleSubprojectPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/cli-interface/legacy", JSImport.Namespace)
@js.native
object legacyMod extends js.Object {
  @js.native
  object plugin extends js.Object {
    def adaptSingleProjectPlugin(plugin: SingleSubprojectPlugin): Plugin = js.native
    def isMultiResult(res: InspectResult): /* is @snyk/cli-interface.@snyk/cli-interface/legacy/plugin.MultiProjectResult */ Boolean = js.native
    def isMultiSubProject(options: InspectOptions): /* is @snyk/cli-interface.@snyk/cli-interface/legacy/plugin.MultiSubprojectInspectOptions */ Boolean = js.native
  }
  
}

