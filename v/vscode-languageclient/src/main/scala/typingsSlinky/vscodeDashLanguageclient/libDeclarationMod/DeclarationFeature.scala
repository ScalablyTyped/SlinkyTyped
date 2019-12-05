package typingsSlinky.vscodeDashLanguageclient.libDeclarationMod

import typingsSlinky.vscodeDashLanguageclient.libClientMod.BaseLanguageClient
import typingsSlinky.vscodeDashLanguageclient.libClientMod.TextDocumentFeature
import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/declaration", "DeclarationFeature")
@js.native
class DeclarationFeature protected () extends TextDocumentFeature[TextDocumentRegistrationOptions] {
  def this(client: BaseLanguageClient) = this()
}

