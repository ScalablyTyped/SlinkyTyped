package typingsSlinky.workboxBuild

import typingsSlinky.workboxBuild.generateSwMod.GenerateSWConfig
import typingsSlinky.workboxBuild.generateSwMod.GenerateSWResult
import typingsSlinky.workboxBuild.getManifestMod.GetManifestConfig
import typingsSlinky.workboxBuild.getManifestMod.GetManifestResult
import typingsSlinky.workboxBuild.injectManifestMod.InjectManifestConfig
import typingsSlinky.workboxBuild.injectManifestMod.InjectManifestResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-build", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def copyWorkboxLibraries(destDirectory: String): js.Promise[String] = js.native
  def generateSW(config: GenerateSWConfig): GenerateSWResult = js.native
  def getManifest(config: GetManifestConfig): GetManifestResult = js.native
  def getModuleURL(moduleName: String): String = js.native
  def getModuleURL(moduleName: String, buildType: String): String = js.native
  def injectManifest(config: InjectManifestConfig): InjectManifestResult = js.native
}

