package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitLastChangeTreeItems extends js.Object {
  /**
    * The list of commits referenced by Items, if they were requested.
    */
  var commits: js.Array[GitCommitRef] = js.native
  /**
    * The last change of items.
    */
  var items: js.Array[GitLastChangeItem] = js.native
  /**
    * The last explored time, in case the result is not comprehensive. Null otherwise.
    */
  var lastExploredTime: js.Date = js.native
}

object GitLastChangeTreeItems {
  @scala.inline
  def apply(commits: js.Array[GitCommitRef], items: js.Array[GitLastChangeItem], lastExploredTime: js.Date): GitLastChangeTreeItems = {
    val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], lastExploredTime = lastExploredTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitLastChangeTreeItems]
  }
  @scala.inline
  implicit class GitLastChangeTreeItemsOps[Self <: GitLastChangeTreeItems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommits(value: js.Array[GitCommitRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[GitLastChangeItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastExploredTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastExploredTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

