package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceFolder extends ConfigurationScope {
  /**
  		 * The ordinal number of this workspace folder.
  		 */
  val index: Double = js.native
  /**
  		 * The name of this workspace folder. Defaults to
  		 * the basename of its [uri-path](#Uri.path)
  		 */
  val name: String = js.native
  /**
  		 * The associated uri for this workspace folder.
  		 *
  		 * *Note:* The [Uri](#Uri)-type was intentionally chosen such that future releases of the editor can support
  		 * workspace folders that are not stored on the local disk, e.g. `ftp://server/workspaces/foo`.
  		 */
  val uri: Uri = js.native
}

object WorkspaceFolder {
  @scala.inline
  def apply(index: Double, name: String, uri: Uri): WorkspaceFolder = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceFolder]
  }
  @scala.inline
  implicit class WorkspaceFolderOps[Self <: WorkspaceFolder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

