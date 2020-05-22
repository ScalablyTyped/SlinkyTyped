package typingsSlinky.snykCliInterface.pluginMod

import typingsSlinky.snykCliInterface.anon.GradleProjectName
import typingsSlinky.snykCliInterface.commonMod.CallGraph
import typingsSlinky.snykCliInterface.commonMod.DepTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinglePackageResult extends InspectResult {
  @JSName("package")
  var _package: DepTree
  var callGraph: js.UndefOr[CallGraph] = js.undefined
  var meta: js.UndefOr[GradleProjectName] = js.undefined
  var plugin: PluginMetadata
}

object SinglePackageResult {
  @scala.inline
  def apply(
    _package: DepTree,
    plugin: PluginMetadata,
    callGraph: CallGraph = null,
    meta: GradleProjectName = null
  ): SinglePackageResult = {
    val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (callGraph != null) __obj.updateDynamic("callGraph")(callGraph.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[SinglePackageResult]
  }
}

