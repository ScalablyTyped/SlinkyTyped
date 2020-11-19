package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WillSaveTextDocumentParams
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashwillSave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol", "WillSaveTextDocumentNotification")
@js.native
object WillSaveTextDocumentNotification extends js.Object {
  
  val method: textDocumentSlashwillSave = js.native
  
  val `type`: ProtocolNotificationType[
    WillSaveTextDocumentParams, 
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ] = js.native
}
