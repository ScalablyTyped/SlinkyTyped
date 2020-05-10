package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitLastChangeItem extends js.Object {
  /**
    * Gets or sets the commit Id this item was modified most recently for the provided version.
    */
  var commitId: String = js.native
  /**
    * Gets or sets the path of the item.
    */
  var path: String = js.native
}

object GitLastChangeItem {
  @scala.inline
  def apply(commitId: String, path: String): GitLastChangeItem = {
    val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitLastChangeItem]
  }
  @scala.inline
  implicit class GitLastChangeItemOps[Self <: GitLastChangeItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommitId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

