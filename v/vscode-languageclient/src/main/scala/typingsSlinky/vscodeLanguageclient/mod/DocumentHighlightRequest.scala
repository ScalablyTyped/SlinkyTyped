package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentPositionParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "DocumentHighlightRequest")
@js.native
object DocumentHighlightRequest extends js.Object {
  val `type`: typingsSlinky.vscodeJsonrpc.mod.RequestType[
    TextDocumentPositionParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.DocumentHighlight] | Null, 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

