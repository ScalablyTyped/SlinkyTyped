package typingsSlinky.vscodeLanguageserverProtocol.protocolProgressMod

import typingsSlinky.vscodeJsonrpc.mod.NotificationHandler
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol.progress", "WorkDoneProgressCancelNotification")
@js.native
object WorkDoneProgressCancelNotification extends js.Object {
  
  val `type`: ProtocolNotificationType[WorkDoneProgressCancelParams, Unit] = js.native
  
  type HandlerSignature = NotificationHandler[WorkDoneProgressCancelParams]
}
