package typingsSlinky.snykDockerPlugin.anon

import typingsSlinky.snykDockerPlugin.extractorTypesMod.DockerArchiveManifest
import typingsSlinky.snykDockerPlugin.extractorTypesMod.ExtractedLayers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Manifest extends js.Object {
  var layers: ExtractedLayers
  var manifest: DockerArchiveManifest
}

object Manifest {
  @scala.inline
  def apply(layers: ExtractedLayers, manifest: DockerArchiveManifest): Manifest = {
    val __obj = js.Dynamic.literal(layers = layers.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest]
  }
}

