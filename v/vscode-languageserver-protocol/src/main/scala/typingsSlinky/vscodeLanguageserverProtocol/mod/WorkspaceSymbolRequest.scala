package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkspaceSymbolParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkspaceSymbolRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashsymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkspaceSymbolRequest {
  
  @JSImport("vscode-languageserver-protocol", "WorkspaceSymbolRequest.method")
  @js.native
  val method: workspaceSlashsymbol = js.native
  
  /** @deprecated Use WorkspaceSymbolRequest.type */
  @JSImport("vscode-languageserver-protocol", "WorkspaceSymbolRequest.resultType")
  @js.native
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.SymbolInformation]] = js.native
  
  @JSImport("vscode-languageserver-protocol", "WorkspaceSymbolRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    WorkspaceSymbolParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.SymbolInformation] | Null, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.SymbolInformation], 
    Unit, 
    WorkspaceSymbolRegistrationOptions
  ] = js.native
}
