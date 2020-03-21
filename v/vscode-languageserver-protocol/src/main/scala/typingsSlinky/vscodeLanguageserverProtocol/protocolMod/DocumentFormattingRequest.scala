package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeJsonrpc.mod.RequestType
import typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentFormattingRequest")
@js.native
object DocumentFormattingRequest extends js.Object {
  val `type`: RequestType[
    DocumentFormattingParams, 
    js.Array[TextEdit] | Null, 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

