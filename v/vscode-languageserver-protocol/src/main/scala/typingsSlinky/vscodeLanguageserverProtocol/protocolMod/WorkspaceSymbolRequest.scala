package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeJsonrpc.mod.ProgressType
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashsymbol
import typingsSlinky.vscodeLanguageserverTypes.mod.SymbolInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkspaceSymbolRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "WorkspaceSymbolRequest.method")
  @js.native
  val method: workspaceSlashsymbol = js.native
  
  /** @deprecated Use WorkspaceSymbolRequest.type */
  @JSImport("vscode-languageserver-protocol/lib/protocol", "WorkspaceSymbolRequest.resultType")
  @js.native
  val resultType: ProgressType[js.Array[SymbolInformation]] = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "WorkspaceSymbolRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    WorkspaceSymbolParams, 
    js.Array[SymbolInformation] | Null, 
    js.Array[SymbolInformation], 
    Unit, 
    WorkspaceSymbolRegistrationOptions
  ] = js.native
}
