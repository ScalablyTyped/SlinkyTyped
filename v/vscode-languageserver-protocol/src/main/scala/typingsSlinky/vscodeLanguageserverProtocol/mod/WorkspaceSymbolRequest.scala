package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkspaceSymbolParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkspaceSymbolRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashsymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "WorkspaceSymbolRequest")
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

