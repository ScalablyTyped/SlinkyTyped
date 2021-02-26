package typingsSlinky.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient", "TextDocumentFeature")
@js.native
abstract class TextDocumentFeature[PO, RO /* <: typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions with PO */, PR] protected ()
  extends typingsSlinky.vscodeLanguageclient.clientMod.TextDocumentFeature[PO, RO, PR] {
  def this(
    _client: typingsSlinky.vscodeLanguageclient.clientMod.BaseLanguageClient,
    _message: typingsSlinky.vscodeJsonrpc.messagesMod.MessageType
  ) = this()
}
