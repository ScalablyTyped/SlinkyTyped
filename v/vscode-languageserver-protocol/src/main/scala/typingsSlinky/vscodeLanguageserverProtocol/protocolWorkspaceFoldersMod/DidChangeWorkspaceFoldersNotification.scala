package typingsSlinky.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod

import typingsSlinky.vscodeJsonrpc.mod.NotificationHandler
import typingsSlinky.vscodeJsonrpc.mod.NotificationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.workspaceFolders", "DidChangeWorkspaceFoldersNotification")
@js.native
object DidChangeWorkspaceFoldersNotification extends js.Object {
  val `type`: NotificationType[DidChangeWorkspaceFoldersParams, Unit] = js.native
  type HandlerSignature = NotificationHandler[DidChangeWorkspaceFoldersParams]
  type MiddlewareSignature = js.Function2[/* params */ DidChangeWorkspaceFoldersParams, /* next */ HandlerSignature, Unit]
}

