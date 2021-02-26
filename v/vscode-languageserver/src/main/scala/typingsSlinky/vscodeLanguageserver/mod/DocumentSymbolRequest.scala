package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashdocumentSymbol
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentSymbolParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentSymbolRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentSymbolRequest {
  
  @JSImport("vscode-languageserver", "DocumentSymbolRequest.method")
  @js.native
  val method: textDocumentSlashdocumentSymbol = js.native
  
  /** @deprecated Use DocumentSymbolRequest.type */
  @JSImport("vscode-languageserver", "DocumentSymbolRequest.resultType")
  @js.native
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[
    js.Array[
      typingsSlinky.vscodeLanguageserverTypes.mod.DocumentSymbol | typingsSlinky.vscodeLanguageserverTypes.mod.SymbolInformation
    ]
  ] = js.native
  
  @JSImport("vscode-languageserver", "DocumentSymbolRequest.type")
  @js.native
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
