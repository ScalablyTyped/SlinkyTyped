package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WillSaveTextDocumentParams
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashwillSave
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WillSaveTextDocumentNotification {
  
  @JSImport("vscode-languageserver-protocol", "WillSaveTextDocumentNotification.method")
  @js.native
  val method: textDocumentSlashwillSave = js.native
  
  @JSImport("vscode-languageserver-protocol", "WillSaveTextDocumentNotification.type")
  @js.native
  val `type`: ProtocolNotificationType[
    WillSaveTextDocumentParams, 
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ] = js.native
}
