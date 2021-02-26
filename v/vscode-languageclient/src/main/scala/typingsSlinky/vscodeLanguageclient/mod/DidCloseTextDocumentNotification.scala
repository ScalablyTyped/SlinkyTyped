package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdidClose
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DidCloseTextDocumentParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidCloseTextDocumentNotification {
  
  @JSImport("vscode-languageclient", "DidCloseTextDocumentNotification.method")
  @js.native
  val method: textDocumentSlashdidClose = js.native
  
  @JSImport("vscode-languageclient", "DidCloseTextDocumentNotification.type")
  @js.native
  val `type`: ProtocolNotificationType[
    DidCloseTextDocumentParams, 
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ] = js.native
}
