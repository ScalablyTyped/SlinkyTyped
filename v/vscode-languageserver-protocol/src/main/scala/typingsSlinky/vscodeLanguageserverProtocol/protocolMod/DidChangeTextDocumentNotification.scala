package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdidChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol", "DidChangeTextDocumentNotification")
@js.native
object DidChangeTextDocumentNotification extends js.Object {
  
  val method: textDocumentSlashdidChange = js.native
  
  val `type`: ProtocolNotificationType[DidChangeTextDocumentParams, TextDocumentChangeRegistrationOptions] = js.native
}
