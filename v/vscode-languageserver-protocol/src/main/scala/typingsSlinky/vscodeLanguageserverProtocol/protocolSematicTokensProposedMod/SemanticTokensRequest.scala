package typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokens
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol.sematicTokens.proposed", "SemanticTokensRequest")
@js.native
object SemanticTokensRequest extends js.Object {
  
  val method: textDocumentSlashsemanticTokens = js.native
  
  val `type`: ProtocolRequestType[
    SemanticTokensParams, 
    SemanticTokens | Null, 
    SemanticTokensPartialResult, 
    Unit, 
    SemanticTokensRegistrationOptions
  ] = js.native
}
