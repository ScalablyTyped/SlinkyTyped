package typingsSlinky.vscodeLanguageclient.workspaceFoldersMod

import typingsSlinky.vscode.mod.WorkspaceFoldersChangeEvent
import typingsSlinky.vscodeJsonrpc.cancellationMod.CancellationToken
import typingsSlinky.vscodeJsonrpc.mod.HandlerResult
import typingsSlinky.vscodeLanguageclient.clientMod.NextSignature
import typingsSlinky.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFolder
import typingsSlinky.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFoldersRequest.HandlerSignature
import typingsSlinky.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFoldersRequest.MiddlewareSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceFolderWorkspaceMiddleware extends js.Object {
  var didChangeWorkspaceFolders: js.UndefOr[NextSignature[WorkspaceFoldersChangeEvent, Unit]] = js.native
  var workspaceFolders: js.UndefOr[MiddlewareSignature] = js.native
}

object WorkspaceFolderWorkspaceMiddleware {
  @scala.inline
  def apply(): WorkspaceFolderWorkspaceMiddleware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceFolderWorkspaceMiddleware]
  }
  @scala.inline
  implicit class WorkspaceFolderWorkspaceMiddlewareOps[Self <: WorkspaceFolderWorkspaceMiddleware] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDidChangeWorkspaceFolders(value: NextSignature[WorkspaceFoldersChangeEvent, Unit]): Self = this.set("didChangeWorkspaceFolders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDidChangeWorkspaceFolders: Self = this.set("didChangeWorkspaceFolders", js.undefined)
    @scala.inline
    def setWorkspaceFolders(
      value: (/* token */ CancellationToken, /* next */ HandlerSignature) => HandlerResult[js.Array[WorkspaceFolder] | Null, Unit]
    ): Self = this.set("workspaceFolders", js.Any.fromFunction2(value))
    @scala.inline
    def deleteWorkspaceFolders: Self = this.set("workspaceFolders", js.undefined)
  }
  
}

