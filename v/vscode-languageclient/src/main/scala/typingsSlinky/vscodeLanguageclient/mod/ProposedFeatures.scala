package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.vscodeLanguageclient.clientMod.DynamicFeature
import typingsSlinky.vscodeLanguageclient.clientMod.StaticFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient", "ProposedFeatures")
@js.native
object ProposedFeatures extends js.Object {
  
  def createAll(client: typingsSlinky.vscodeLanguageclient.clientMod.BaseLanguageClient): js.Array[StaticFeature | DynamicFeature[_]] = js.native
}
