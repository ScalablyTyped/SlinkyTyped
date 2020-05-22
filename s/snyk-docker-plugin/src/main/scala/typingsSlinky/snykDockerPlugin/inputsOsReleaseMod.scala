package typingsSlinky.snykDockerPlugin

import typingsSlinky.snykDockerPlugin.distDockerMod.Docker
import typingsSlinky.snykDockerPlugin.distTypesMod.OsReleaseFilePath
import typingsSlinky.snykDockerPlugin.extractorTypesMod.ExtractedLayers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/inputs/os-release", JSImport.Namespace)
@js.native
object inputsOsReleaseMod extends js.Object {
  def getOsReleaseDynamic(docker: Docker, releasePath: OsReleaseFilePath): js.Promise[String] = js.native
  def getOsReleaseStatic(extractedLayers: ExtractedLayers, releasePath: OsReleaseFilePath): String = js.native
}

