package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashcompletion
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.CompletionParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.CompletionRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "CompletionRequest")
@js.native
object CompletionRequest extends js.Object {
  
  val method: textDocumentSlashcompletion = js.native
  
  /** @deprecated Use CompletionRequest.type */
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.CompletionItem]] = js.native
  
  val `type`: ProtocolRequestType[
    CompletionParams, 
    typingsSlinky.vscodeLanguageserverTypes.mod.CompletionList | js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.CompletionItem] | Null, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.CompletionItem], 
    Unit, 
    CompletionRegistrationOptions
  ] = js.native
}
