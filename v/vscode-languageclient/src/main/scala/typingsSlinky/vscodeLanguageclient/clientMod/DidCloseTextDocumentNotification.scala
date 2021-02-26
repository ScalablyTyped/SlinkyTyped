package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdidClose
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DidCloseTextDocumentParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidCloseTextDocumentNotification {
  
  @JSImport("vscode-languageclient/lib/client", "DidCloseTextDocumentNotification.method")
  @js.native
  val method: textDocumentSlashdidClose = js.native
  
  @JSImport("vscode-languageclient/lib/client", "DidCloseTextDocumentNotification.type")
  @js.native
  val `type`: ProtocolNotificationType[
    DidCloseTextDocumentParams, 
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ] = js.native
}
