package typingsSlinky.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "TextDocumentFeature")
@js.native
abstract class TextDocumentFeature[T /* <: TextDocumentRegistrationOptions */] protected ()
  extends typingsSlinky.vscodeDashLanguageclient.libClientMod.TextDocumentFeature[T] {
  def this(
    _client: typingsSlinky.vscodeDashLanguageclient.libClientMod.BaseLanguageClient,
    _message: typingsSlinky.vscodeDashJsonrpc.libMessagesMod.MessageType
  ) = this()
}

