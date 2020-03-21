package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "TextDocumentFeature")
@js.native
abstract class TextDocumentFeature[T /* <: TextDocumentRegistrationOptions */] protected ()
  extends typingsSlinky.vscodeLanguageclient.clientMod.TextDocumentFeature[T] {
  def this(
    _client: typingsSlinky.vscodeLanguageclient.clientMod.BaseLanguageClient,
    _message: typingsSlinky.vscodeJsonrpc.messagesMod.MessageType
  ) = this()
}

