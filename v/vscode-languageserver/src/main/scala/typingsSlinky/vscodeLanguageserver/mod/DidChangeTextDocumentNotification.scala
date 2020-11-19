package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashdidChange
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DidChangeTextDocumentParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentChangeRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "DidChangeTextDocumentNotification")
@js.native
object DidChangeTextDocumentNotification extends js.Object {
  
  val method: textDocumentSlashdidChange = js.native
  
  val `type`: ProtocolNotificationType[DidChangeTextDocumentParams, TextDocumentChangeRegistrationOptions] = js.native
}
