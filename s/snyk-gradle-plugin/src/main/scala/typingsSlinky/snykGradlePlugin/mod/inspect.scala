package typingsSlinky.snykGradlePlugin.mod

import typingsSlinky.snykCliInterface.pluginMod.MultiProjectResult
import typingsSlinky.snykCliInterface.pluginMod.MultiSubprojectInspectOptions
import typingsSlinky.snykCliInterface.pluginMod.SinglePackageResult
import typingsSlinky.snykCliInterface.pluginMod.SingleSubprojectInspectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-gradle-plugin/dist", "inspect")
@js.native
object inspect extends js.Object {
  def apply(root: String, targetFile: String): js.Promise[SinglePackageResult] = js.native
  def apply(root: String, targetFile: String, options: MultiSubprojectInspectOptions with GradleInspectOptions): js.Promise[MultiProjectResult] = js.native
  def apply(
    root: String,
    targetFile: String,
    options: SingleSubprojectInspectOptions with GradleInspectOptions
  ): js.Promise[SinglePackageResult] = js.native
}

