package typingsSlinky.vscodeDashLanguageclient.libConfigurationMod

import typingsSlinky.vscodeDashLanguageclient.libClientMod.BaseLanguageClient
import typingsSlinky.vscodeDashLanguageclient.libClientMod.StaticFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/configuration", "ConfigurationFeature")
@js.native
class ConfigurationFeature protected () extends StaticFeature {
  def this(_client: BaseLanguageClient) = this()
  var _client: js.Any = js.native
  var getConfiguration: js.Any = js.native
  def initialize(): Unit = js.native
}

