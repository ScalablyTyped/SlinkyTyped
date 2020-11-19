package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeJsonrpc.mod.ProgressType
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashcompletion
import typingsSlinky.vscodeLanguageserverTypes.mod.CompletionItem
import typingsSlinky.vscodeLanguageserverTypes.mod.CompletionList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol", "CompletionRequest")
@js.native
object CompletionRequest extends js.Object {
  
  val method: textDocumentSlashcompletion = js.native
  
  /** @deprecated Use CompletionRequest.type */
  val resultType: ProgressType[js.Array[CompletionItem]] = js.native
  
  val `type`: ProtocolRequestType[
    CompletionParams, 
    CompletionList | js.Array[CompletionItem] | Null, 
    js.Array[CompletionItem], 
    Unit, 
    CompletionRegistrationOptions
  ] = js.native
}
