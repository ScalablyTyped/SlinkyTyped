package typingsSlinky.vscodeLanguageclient.implementationMod

import typingsSlinky.vscodeLanguageclient.clientMod.BaseLanguageClient
import typingsSlinky.vscodeLanguageclient.clientMod.TextDocumentFeature
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/implementation", "ImplementationFeature")
@js.native
class ImplementationFeature protected () extends TextDocumentFeature[TextDocumentRegistrationOptions] {
  def this(client: BaseLanguageClient) = this()
}

