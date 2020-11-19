package typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokensSlashrange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol.sematicTokens.proposed", "SemanticTokensRangeRequest")
@js.native
object SemanticTokensRangeRequest extends js.Object {
  
  val method: textDocumentSlashsemanticTokensSlashrange = js.native
  
  val `type`: ProtocolRequestType[
    SemanticTokensRangeParams, 
    SemanticTokens | Null, 
    SemanticTokensPartialResult, 
    Unit, 
    Unit
  ] = js.native
}
