package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.LogMessageParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "LogMessageNotification")
@js.native
object LogMessageNotification extends js.Object {
  val `type`: ProtocolNotificationType[LogMessageParams, Unit] = js.native
}

