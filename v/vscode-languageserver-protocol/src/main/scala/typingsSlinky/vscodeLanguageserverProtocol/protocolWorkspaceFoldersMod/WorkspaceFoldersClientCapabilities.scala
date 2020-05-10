package typingsSlinky.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod

import typingsSlinky.vscodeLanguageserverProtocol.AnonWorkspaceFolders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceFoldersClientCapabilities extends js.Object {
  /**
    * The workspace client capabilities
    */
  var workspace: js.UndefOr[AnonWorkspaceFolders] = js.native
}

object WorkspaceFoldersClientCapabilities {
  @scala.inline
  def apply(): WorkspaceFoldersClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceFoldersClientCapabilities]
  }
  @scala.inline
  implicit class WorkspaceFoldersClientCapabilitiesOps[Self <: WorkspaceFoldersClientCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkspace(value: AnonWorkspaceFolders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkspace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspace")(js.undefined)
        ret
    }
  }
  
}

