package typingsSlinky.workboxBuild

import typingsSlinky.workboxBuild.generateSwMod.GenerateSWConfig
import typingsSlinky.workboxBuild.generateSwMod.GenerateSWResult
import typingsSlinky.workboxBuild.getManifestMod.GetManifestConfig
import typingsSlinky.workboxBuild.getManifestMod.GetManifestResult
import typingsSlinky.workboxBuild.injectManifestMod.InjectManifestConfig
import typingsSlinky.workboxBuild.injectManifestMod.InjectManifestResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-build", "copyWorkboxLibraries")
  @js.native
  def copyWorkboxLibraries(destDirectory: String): js.Promise[String] = js.native
  
  @JSImport("workbox-build", "generateSW")
  @js.native
  def generateSW(config: GenerateSWConfig): GenerateSWResult = js.native
  
  @JSImport("workbox-build", "getManifest")
  @js.native
  def getManifest(config: GetManifestConfig): GetManifestResult = js.native
  
  @JSImport("workbox-build", "getModuleURL")
  @js.native
  def getModuleURL(moduleName: String): String = js.native
  @JSImport("workbox-build", "getModuleURL")
  @js.native
  def getModuleURL(moduleName: String, buildType: String): String = js.native
  
  @JSImport("workbox-build", "injectManifest")
  @js.native
  def injectManifest(config: InjectManifestConfig): InjectManifestResult = js.native
}
