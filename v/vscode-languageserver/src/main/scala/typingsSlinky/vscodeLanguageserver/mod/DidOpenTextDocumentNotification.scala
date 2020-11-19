package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashdidOpen
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DidOpenTextDocumentParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "DidOpenTextDocumentNotification")
@js.native
object DidOpenTextDocumentNotification extends js.Object {
  
  val method: textDocumentSlashdidOpen = js.native
  
  val `type`: ProtocolNotificationType[
    DidOpenTextDocumentParams, 
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ] = js.native
}
