package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashsymbol
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkspaceSymbolParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkspaceSymbolRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient", "WorkspaceSymbolRequest")
@js.native
object WorkspaceSymbolRequest extends js.Object {
  
  val method: workspaceSlashsymbol = js.native
  
  /** @deprecated Use WorkspaceSymbolRequest.type */
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.SymbolInformation]] = js.native
  
  val `type`: ProtocolRequestType[
    WorkspaceSymbolParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.SymbolInformation] | Null, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.SymbolInformation], 
    Unit, 
    WorkspaceSymbolRegistrationOptions
  ] = js.native
}
