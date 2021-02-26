package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdidOpen
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DidOpenTextDocumentParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidOpenTextDocumentNotification {
  
  @JSImport("vscode-languageclient", "DidOpenTextDocumentNotification.method")
  @js.native
  val method: textDocumentSlashdidOpen = js.native
  
  @JSImport("vscode-languageclient", "DidOpenTextDocumentNotification.type")
  @js.native
  val `type`: ProtocolNotificationType[
    DidOpenTextDocumentParams, 
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ] = js.native
}
