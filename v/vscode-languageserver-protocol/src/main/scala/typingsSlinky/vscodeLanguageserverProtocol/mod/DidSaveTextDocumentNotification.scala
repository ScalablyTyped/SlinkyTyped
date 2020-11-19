package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DidSaveTextDocumentParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentSaveRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdidSave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol", "DidSaveTextDocumentNotification")
@js.native
object DidSaveTextDocumentNotification extends js.Object {
  
  val method: textDocumentSlashdidSave = js.native
  
  val `type`: ProtocolNotificationType[DidSaveTextDocumentParams, TextDocumentSaveRegistrationOptions] = js.native
}
