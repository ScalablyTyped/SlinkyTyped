package typingsSlinky.vscodeLanguageclient.colorProviderMod

import typingsSlinky.vscodeLanguageclient.clientMod.BaseLanguageClient
import typingsSlinky.vscodeLanguageclient.clientMod.TextDocumentFeature
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/colorProvider", "ColorProviderFeature")
@js.native
class ColorProviderFeature protected () extends TextDocumentFeature[TextDocumentRegistrationOptions] {
  def this(client: BaseLanguageClient) = this()
  var asColor: js.Any = js.native
  var asColorInformations: js.Any = js.native
  var asColorPresentations: js.Any = js.native
}

