package typingsSlinky.snykDockerPlugin

import typingsSlinky.snykDockerPlugin.extractorTypesMod.ExtractAction
import typingsSlinky.snykDockerPlugin.extractorTypesMod.ExtractedLayers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/inputs/binaries/static", JSImport.Namespace)
@js.native
object binariesStaticMod extends js.Object {
  val getNodeBinariesFileContentAction: ExtractAction = js.native
  val getOpenJDKBinariesFileContentAction: ExtractAction = js.native
  def getBinariesHashes(extractedLayers: ExtractedLayers): js.Array[String] = js.native
}

