package typingsSlinky.vscodeDashLanguageclient.libTypeDefinitionMod

import typingsSlinky.vscodeDashLanguageclient.libClientMod.BaseLanguageClient
import typingsSlinky.vscodeDashLanguageclient.libClientMod.TextDocumentFeature
import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/typeDefinition", "TypeDefinitionFeature")
@js.native
class TypeDefinitionFeature protected () extends TextDocumentFeature[TextDocumentRegistrationOptions] {
  def this(client: BaseLanguageClient) = this()
}

