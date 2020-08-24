package typingsSlinky.vscodeLanguageclient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "TextDocumentFeature")
@js.native
abstract class TextDocumentFeature[PO, RO /* <: typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions with PO */, PR] protected ()
  extends typingsSlinky.vscodeLanguageclient.clientMod.TextDocumentFeature[PO, RO, PR] {
  def this(
    _client: typingsSlinky.vscodeLanguageclient.clientMod.BaseLanguageClient,
    _message: typingsSlinky.vscodeJsonrpc.messagesMod.MessageType
  ) = this()
}

