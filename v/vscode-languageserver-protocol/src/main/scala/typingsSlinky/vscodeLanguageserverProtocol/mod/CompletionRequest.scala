package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.CompletionParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.CompletionRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashcompletion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CompletionRequest {
  
  @JSImport("vscode-languageserver-protocol", "CompletionRequest.method")
  @js.native
  val method: textDocumentSlashcompletion = js.native
  
  /** @deprecated Use CompletionRequest.type */
  @JSImport("vscode-languageserver-protocol", "CompletionRequest.resultType")
  @js.native
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.CompletionItem]] = js.native
  
  @JSImport("vscode-languageserver-protocol", "CompletionRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    CompletionParams, 
    typingsSlinky.vscodeLanguageserverTypes.mod.CompletionList | js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.CompletionItem] | Null, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.CompletionItem], 
    Unit, 
    CompletionRegistrationOptions
  ] = js.native
}
