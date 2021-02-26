package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdidChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidChangeTextDocumentNotification {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "DidChangeTextDocumentNotification.method")
  @js.native
  val method: textDocumentSlashdidChange = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "DidChangeTextDocumentNotification.type")
  @js.native
  val `type`: ProtocolNotificationType[DidChangeTextDocumentParams, TextDocumentChangeRegistrationOptions] = js.native
}
