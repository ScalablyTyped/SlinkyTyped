package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.vscodeLanguageclient.clientMod.DynamicFeature
import typingsSlinky.vscodeLanguageclient.clientMod.StaticFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "ProposedFeatures")
@js.native
object ProposedFeatures extends js.Object {
  def createAll(_client: typingsSlinky.vscodeLanguageclient.clientMod.BaseLanguageClient): js.Array[StaticFeature | DynamicFeature[_]] = js.native
}

