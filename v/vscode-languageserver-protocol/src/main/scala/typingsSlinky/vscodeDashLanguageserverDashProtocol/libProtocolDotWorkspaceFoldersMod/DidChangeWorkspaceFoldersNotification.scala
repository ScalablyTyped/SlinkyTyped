package typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolDotWorkspaceFoldersMod

import typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.NotificationHandler
import typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.NotificationType
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

