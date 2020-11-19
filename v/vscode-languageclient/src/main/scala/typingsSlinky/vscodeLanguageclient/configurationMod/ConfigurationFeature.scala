package typingsSlinky.vscodeLanguageclient.configurationMod

import typingsSlinky.vscodeLanguageclient.clientMod.BaseLanguageClient
import typingsSlinky.vscodeLanguageclient.clientMod.StaticFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/configuration", "ConfigurationFeature")
@js.native
class ConfigurationFeature protected () extends StaticFeature {
  def this(_client: BaseLanguageClient) = this()
  
  var _client: js.Any = js.native
  
  var getConfiguration: js.Any = js.native
  
  def initialize(): Unit = js.native
}
