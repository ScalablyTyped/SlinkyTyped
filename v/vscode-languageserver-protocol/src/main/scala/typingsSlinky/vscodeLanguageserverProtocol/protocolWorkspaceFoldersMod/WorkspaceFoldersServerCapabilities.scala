package typingsSlinky.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod

import typingsSlinky.vscodeLanguageserverProtocol.AnonWorkspaceFoldersAnonChangeNotifications
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceFoldersServerCapabilities extends js.Object {
  /**
    * The workspace server capabilities
    */
  var workspace: js.UndefOr[AnonWorkspaceFoldersAnonChangeNotifications] = js.native
}

object WorkspaceFoldersServerCapabilities {
  @scala.inline
  def apply(): WorkspaceFoldersServerCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceFoldersServerCapabilities]
  }
  @scala.inline
  implicit class WorkspaceFoldersServerCapabilitiesOps[Self <: WorkspaceFoldersServerCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkspace(value: AnonWorkspaceFoldersAnonChangeNotifications): Self = {
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

