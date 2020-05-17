package typingsSlinky.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceFoldersChangeNotifications extends js.Object {
  var workspaceFolders: js.UndefOr[ChangeNotifications] = js.native
}

object WorkspaceFoldersChangeNotifications {
  @scala.inline
  def apply(): WorkspaceFoldersChangeNotifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceFoldersChangeNotifications]
  }
  @scala.inline
  implicit class WorkspaceFoldersChangeNotificationsOps[Self <: WorkspaceFoldersChangeNotifications] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkspaceFolders(value: ChangeNotifications): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceFolders")(value.asInstanceOf[js.Any])
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

