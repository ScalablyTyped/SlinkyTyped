package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.ShowMessageParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "ShowMessageNotification")
@js.native
object ShowMessageNotification extends js.Object {
  val `type`: ProtocolNotificationType[ShowMessageParams, Unit] = js.native
}

