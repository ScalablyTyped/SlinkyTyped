package typingsSlinky.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceFolders extends js.Object {
  /**
    * The client has support for workspace folders
    */
  var workspaceFolders: js.UndefOr[Boolean] = js.native
}

object WorkspaceFolders {
  @scala.inline
  def apply(): WorkspaceFolders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceFolders]
  }
  @scala.inline
  implicit class WorkspaceFoldersOps[Self <: WorkspaceFolders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkspaceFolders(value: Boolean): Self = {
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

