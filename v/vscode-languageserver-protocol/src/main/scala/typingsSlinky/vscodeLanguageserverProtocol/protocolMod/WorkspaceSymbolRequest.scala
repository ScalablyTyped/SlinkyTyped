package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeJsonrpc.mod.ProgressType
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashsymbol
import typingsSlinky.vscodeLanguageserverTypes.mod.SymbolInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol", "WorkspaceSymbolRequest")
@js.native
object WorkspaceSymbolRequest extends js.Object {
  
  val method: workspaceSlashsymbol = js.native
  
  /** @deprecated Use WorkspaceSymbolRequest.type */
  val resultType: ProgressType[js.Array[SymbolInformation]] = js.native
  
  val `type`: ProtocolRequestType[
    WorkspaceSymbolParams, 
    js.Array[SymbolInformation] | Null, 
    js.Array[SymbolInformation], 
    Unit, 
    WorkspaceSymbolRegistrationOptions
  ] = js.native
}
