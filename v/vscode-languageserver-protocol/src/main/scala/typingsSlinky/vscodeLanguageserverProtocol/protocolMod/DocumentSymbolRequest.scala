package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeJsonrpc.mod.ProgressType
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdocumentSymbol
import typingsSlinky.vscodeLanguageserverTypes.mod.DocumentSymbol
import typingsSlinky.vscodeLanguageserverTypes.mod.SymbolInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentSymbolRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentSymbolRequest.method")
  @js.native
  val method: textDocumentSlashdocumentSymbol = js.native
  
  /** @deprecated Use DocumentSymbolRequest.type */
  @JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentSymbolRequest.resultType")
  @js.native
  val resultType: ProgressType[js.Array[DocumentSymbol | SymbolInformation]] = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentSymbolRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DocumentSymbolParams, 
    (js.Array[DocumentSymbol | SymbolInformation]) | Null, 
    js.Array[DocumentSymbol | SymbolInformation], 
    Unit, 
    DocumentSymbolRegistrationOptions
  ] = js.native
}
