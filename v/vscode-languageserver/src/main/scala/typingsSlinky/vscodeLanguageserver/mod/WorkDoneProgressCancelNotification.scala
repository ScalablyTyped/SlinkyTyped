package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typingsSlinky.vscodeLanguageserverProtocol.protocolProgressMod.WorkDoneProgressCancelParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "WorkDoneProgressCancelNotification")
@js.native
object WorkDoneProgressCancelNotification extends js.Object {
  val `type`: ProtocolNotificationType[WorkDoneProgressCancelParams, Unit] = js.native
}

