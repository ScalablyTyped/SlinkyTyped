package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DidChangeWatchedFilesParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DidChangeWatchedFilesRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "DidChangeWatchedFilesNotification")
@js.native
object DidChangeWatchedFilesNotification extends js.Object {
  val `type`: ProtocolNotificationType[DidChangeWatchedFilesParams, DidChangeWatchedFilesRegistrationOptions] = js.native
}

