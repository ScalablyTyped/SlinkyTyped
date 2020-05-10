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
    def withDidChangeWorkspaceFolders(value: NextSignature[WorkspaceFoldersChangeEvent, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didChangeWorkspaceFolders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDidChangeWorkspaceFolders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didChangeWorkspaceFolders")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkspaceFolders(
      value: (/* token */ CancellationToken, /* next */ HandlerSignature) => HandlerResult[js.Array[WorkspaceFolder] | Null, Unit]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceFolders")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWorkspaceFolders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceFolders")(js.undefined)
        ret
    }
  }
  
}

