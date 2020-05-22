package typingsSlinky.snykDockerPlugin

import typingsSlinky.snykDockerPlugin.analyzerTypesMod.OSRelease
import typingsSlinky.snykDockerPlugin.extractorTypesMod.ExtractedLayers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/analyzer/os-release/static", JSImport.Namespace)
@js.native
object staticMod extends js.Object {
  def detect(extractedLayers: ExtractedLayers): js.Promise[OSRelease] = js.native
}

