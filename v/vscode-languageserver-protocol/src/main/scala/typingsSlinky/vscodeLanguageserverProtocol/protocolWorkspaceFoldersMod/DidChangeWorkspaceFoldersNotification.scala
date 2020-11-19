package typingsSlinky.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod

import typingsSlinky.vscodeJsonrpc.mod.NotificationHandler
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol.workspaceFolders", "DidChangeWorkspaceFoldersNotification")
@js.native
object DidChangeWorkspaceFoldersNotification extends js.Object {
  
  val `type`: ProtocolNotificationType[DidChangeWorkspaceFoldersParams, Unit] = js.native
  
  type HandlerSignature = NotificationHandler[DidChangeWorkspaceFoldersParams]
  
  type MiddlewareSignature = js.Function2[/* params */ DidChangeWorkspaceFoldersParams, /* next */ HandlerSignature, Unit]
}
