package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentSymbolParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentSymbolRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdocumentSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol", "DocumentSymbolRequest")
@js.native
object DocumentSymbolRequest extends js.Object {
  
  val method: textDocumentSlashdocumentSymbol = js.native
  
  /** @deprecated Use DocumentSymbolRequest.type */
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[
    js.Array[
      typingsSlinky.vscodeLanguageserverTypes.mod.DocumentSymbol | typingsSlinky.vscodeLanguageserverTypes.mod.SymbolInformation
    ]
  ] = js.native
  
  val `type`: ProtocolRequestType[
    DocumentSymbolParams, 
    (js.Array[
      typingsSlinky.vscodeLanguageserverTypes.mod.DocumentSymbol | typingsSlinky.vscodeLanguageserverTypes.mod.SymbolInformation
    ]) | Null, 
    js.Array[
      typingsSlinky.vscodeLanguageserverTypes.mod.DocumentSymbol | typingsSlinky.vscodeLanguageserverTypes.mod.SymbolInformation
    ], 
    Unit, 
    DocumentSymbolRegistrationOptions
  ] = js.native
}
