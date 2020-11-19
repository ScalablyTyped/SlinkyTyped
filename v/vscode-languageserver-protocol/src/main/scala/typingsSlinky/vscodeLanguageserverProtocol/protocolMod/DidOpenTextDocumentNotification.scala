package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdidOpen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol", "DidOpenTextDocumentNotification")
@js.native
object DidOpenTextDocumentNotification extends js.Object {
  
  val method: textDocumentSlashdidOpen = js.native
  
  val `type`: ProtocolNotificationType[DidOpenTextDocumentParams, TextDocumentRegistrationOptions] = js.native
}
