package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashcompletion
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.CompletionParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.CompletionRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CompletionRequest {
  
  @JSImport("vscode-languageserver", "CompletionRequest.method")
  @js.native
  val method: textDocumentSlashcompletion = js.native
  
  /** @deprecated Use CompletionRequest.type */
  @JSImport("vscode-languageserver", "CompletionRequest.resultType")
  @js.native
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.CompletionItem]] = js.native
  
  @JSImport("vscode-languageserver", "CompletionRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    CompletionParams, 
    typingsSlinky.vscodeLanguageserverTypes.mod.CompletionList | js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.CompletionItem] | Null, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.CompletionItem], 
    Unit, 
    CompletionRegistrationOptions
  ] = js.native
}
