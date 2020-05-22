package typingsSlinky.snykDockerPlugin

import typingsSlinky.node.streamMod.Readable
import typingsSlinky.snykDockerPlugin.extractorTypesMod.ExtractAction
import typingsSlinky.snykDockerPlugin.extractorTypesMod.FileNameAndContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/extractor/callbacks", JSImport.Namespace)
@js.native
object callbacksMod extends js.Object {
  def applyCallbacks(matchedActions: js.Array[ExtractAction], fileContentStream: Readable): js.Promise[FileNameAndContent] = js.native
}

