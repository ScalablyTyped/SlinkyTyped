package typingsSlinky.vscodeLanguageclient.declarationMod

import typingsSlinky.vscode.mod.DeclarationProvider
import typingsSlinky.vscodeLanguageclient.clientMod.BaseLanguageClient
import typingsSlinky.vscodeLanguageclient.clientMod.TextDocumentFeature
import typingsSlinky.vscodeLanguageserverProtocol.protocolDeclarationMod.DeclarationOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolDeclarationMod.DeclarationRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/declaration", "DeclarationFeature")
@js.native
class DeclarationFeature protected () extends TextDocumentFeature[Boolean | DeclarationOptions, DeclarationRegistrationOptions, DeclarationProvider] {
  def this(client: BaseLanguageClient) = this()
}

