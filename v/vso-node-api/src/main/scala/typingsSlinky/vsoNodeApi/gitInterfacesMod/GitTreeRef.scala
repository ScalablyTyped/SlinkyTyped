package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitTreeRef extends js.Object {
  var _links: js.Any = js.native
  /**
    * SHA1 hash of git object
    */
  var objectId: String = js.native
  /**
    * Sum of sizes of all children
    */
  var size: Double = js.native
  /**
    * Blobs and trees under this tree
    */
  var treeEntries: js.Array[GitTreeEntryRef] = js.native
  /**
    * Url to tree
    */
  var url: String = js.native
}

object GitTreeRef {
  @scala.inline
  def apply(
    _links: js.Any,
    objectId: String,
    size: Double,
    treeEntries: js.Array[GitTreeEntryRef],
    url: String
  ): GitTreeRef = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], treeEntries = treeEntries.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitTreeRef]
  }
  @scala.inline
  implicit class GitTreeRefOps[Self <: GitTreeRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_links(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreeEntries(value: js.Array[GitTreeEntryRef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

