package typingsSlinky.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWorkspaceFolders extends js.Object {
  /**
    * The client has support for workspace folders
    */
  var workspaceFolders: js.UndefOr[Boolean] = js.native
}

object AnonWorkspaceFolders {
  @scala.inline
  def apply(): AnonWorkspaceFolders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonWorkspaceFolders]
  }
  @scala.inline
  implicit class AnonWorkspaceFoldersOps[Self <: AnonWorkspaceFolders] (val x: Self) extends AnyVal {
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

