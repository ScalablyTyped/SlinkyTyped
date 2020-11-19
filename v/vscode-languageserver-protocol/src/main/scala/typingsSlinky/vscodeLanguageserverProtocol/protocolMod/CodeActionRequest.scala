package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeJsonrpc.mod.ProgressType
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashcodeAction
import typingsSlinky.vscodeLanguageserverTypes.mod.CodeAction
import typingsSlinky.vscodeLanguageserverTypes.mod.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol", "CodeActionRequest")
@js.native
object CodeActionRequest extends js.Object {
  
  val method: textDocumentSlashcodeAction = js.native
  
  /** @deprecated Use CodeActionRequest.type */
  val resultType: ProgressType[js.Array[Command | CodeAction]] = js.native
  
  val `type`: ProtocolRequestType[
    CodeActionParams, 
    (js.Array[Command | CodeAction]) | Null, 
    js.Array[Command | CodeAction], 
    Unit, 
    CodeActionRegistrationOptions
  ] = js.native
}
