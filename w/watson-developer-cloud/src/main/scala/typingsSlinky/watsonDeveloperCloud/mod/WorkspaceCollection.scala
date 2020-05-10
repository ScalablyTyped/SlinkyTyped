package typingsSlinky.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** WorkspaceCollection. */
@js.native
trait WorkspaceCollection extends js.Object {
  /** The pagination data for the returned objects. */
  var pagination: Pagination = js.native
  /** An array of objects describing the workspaces associated with the service instance. */
  var workspaces: js.Array[Workspace] = js.native
}

object WorkspaceCollection {
  @scala.inline
  def apply(pagination: Pagination, workspaces: js.Array[Workspace]): WorkspaceCollection = {
    val __obj = js.Dynamic.literal(pagination = pagination.asInstanceOf[js.Any], workspaces = workspaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceCollection]
  }
  @scala.inline
  implicit class WorkspaceCollectionOps[Self <: WorkspaceCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPagination(value: Pagination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkspaces(value: js.Array[Workspace]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaces")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

