package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdidSave
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DidSaveTextDocumentParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentSaveRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidSaveTextDocumentNotification {
  
  @JSImport("vscode-languageclient", "DidSaveTextDocumentNotification.method")
  @js.native
  val method: textDocumentSlashdidSave = js.native
  
  @JSImport("vscode-languageclient", "DidSaveTextDocumentNotification.type")
  @js.native
  val `type`: ProtocolNotificationType[DidSaveTextDocumentParams, TextDocumentSaveRegistrationOptions] = js.native
}
