package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeJsonrpc.mod.ProgressType
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdocumentSymbol
import typingsSlinky.vscodeLanguageserverTypes.mod.DocumentSymbol
import typingsSlinky.vscodeLanguageserverTypes.mod.SymbolInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentSymbolRequest")
@js.native
object DocumentSymbolRequest extends js.Object {
  val method: textDocumentSlashdocumentSymbol = js.native
  /** @deprecated Use DocumentSymbolRequest.type */
  val resultType: ProgressType[js.Array[DocumentSymbol | SymbolInformation]] = js.native
  val `type`: ProtocolRequestType[
    DocumentSymbolParams, 
    (js.Array[DocumentSymbol | SymbolInformation]) | Null, 
    js.Array[DocumentSymbol | SymbolInformation], 
    Unit, 
    DocumentSymbolRegistrationOptions
  ] = js.native
}

