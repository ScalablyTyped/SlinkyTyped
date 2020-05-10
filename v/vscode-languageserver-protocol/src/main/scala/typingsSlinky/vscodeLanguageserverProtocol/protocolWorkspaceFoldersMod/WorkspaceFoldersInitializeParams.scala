package typingsSlinky.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceFoldersInitializeParams extends js.Object {
  /**
    * The actual configured workspace folders.
    */
  var workspaceFolders: js.Array[WorkspaceFolder] | Null = js.native
}

object WorkspaceFoldersInitializeParams {
  @scala.inline
  def apply(): WorkspaceFoldersInitializeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceFoldersInitializeParams]
  }
  @scala.inline
  implicit class WorkspaceFoldersInitializeParamsOps[Self <: WorkspaceFoldersInitializeParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkspaceFolders(value: js.Array[WorkspaceFolder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceFolders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkspaceFoldersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceFolders")(null)
        ret
    }
  }
  
}

