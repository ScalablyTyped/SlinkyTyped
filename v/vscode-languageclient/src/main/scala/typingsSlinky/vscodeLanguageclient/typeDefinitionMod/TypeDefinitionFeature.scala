package typingsSlinky.vscodeLanguageclient.typeDefinitionMod

import typingsSlinky.vscodeLanguageclient.clientMod.BaseLanguageClient
import typingsSlinky.vscodeLanguageclient.clientMod.TextDocumentFeature
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/typeDefinition", "TypeDefinitionFeature")
@js.native
class TypeDefinitionFeature protected () extends TextDocumentFeature[TextDocumentRegistrationOptions] {
  def this(client: BaseLanguageClient) = this()
}

