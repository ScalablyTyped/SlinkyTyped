package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DidCloseTextDocumentParams
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdidClose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidCloseTextDocumentNotification {
  
  @JSImport("vscode-languageserver-protocol", "DidCloseTextDocumentNotification.method")
  @js.native
  val method: textDocumentSlashdidClose = js.native
  
  @JSImport("vscode-languageserver-protocol", "DidCloseTextDocumentNotification.type")
  @js.native
  val `type`: ProtocolNotificationType[
    DidCloseTextDocumentParams, 
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ] = js.native
}
