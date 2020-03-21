package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DidChangeTextDocumentParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentChangeRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "DidChangeTextDocumentNotification")
@js.native
object DidChangeTextDocumentNotification extends js.Object {
  val `type`: typingsSlinky.vscodeJsonrpc.mod.NotificationType[DidChangeTextDocumentParams, TextDocumentChangeRegistrationOptions] = js.native
}

