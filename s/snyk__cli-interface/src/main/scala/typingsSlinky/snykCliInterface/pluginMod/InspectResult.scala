package typingsSlinky.snykCliInterface.pluginMod

import typingsSlinky.snykCliInterface.anon.GradleProjectName
import typingsSlinky.snykCliInterface.commonMod.CallGraph
import typingsSlinky.snykCliInterface.commonMod.DepTree
import typingsSlinky.snykCliInterface.commonMod.ScannedProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.snykCliInterface.pluginMod.SinglePackageResult
  - typingsSlinky.snykCliInterface.pluginMod.MultiProjectResult
*/
trait InspectResult extends js.Object

object InspectResult {
  @scala.inline
  def SinglePackageResult(
    _package: DepTree,
    plugin: PluginMetadata,
    callGraph: CallGraph = null,
    meta: GradleProjectName = null
  ): InspectResult = {
    val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (callGraph != null) __obj.updateDynamic("callGraph")(callGraph.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectResult]
  }
  @scala.inline
  def MultiProjectResult(plugin: PluginMetadata, scannedProjects: js.Array[ScannedProject]): InspectResult = {
    val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any], scannedProjects = scannedProjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectResult]
  }
}

