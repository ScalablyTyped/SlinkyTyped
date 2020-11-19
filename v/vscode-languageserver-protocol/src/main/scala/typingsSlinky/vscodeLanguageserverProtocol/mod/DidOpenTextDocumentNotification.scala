package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DidOpenTextDocumentParams
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdidOpen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol", "DidOpenTextDocumentNotification")
@js.native
object DidOpenTextDocumentNotification extends js.Object {
  
  val method: textDocumentSlashdidOpen = js.native
  
  val `type`: ProtocolNotificationType[
    DidOpenTextDocumentParams, 
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ] = js.native
}
