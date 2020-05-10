package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitTreeEntryRef extends js.Object {
  /**
    * Blob or tree
    */
  var gitObjectType: GitObjectType = js.native
  /**
    * Mode represented as octal string
    */
  var mode: String = js.native
  /**
    * SHA1 hash of git object
    */
  var objectId: String = js.native
  /**
    * Path relative to parent tree object
    */
  var relativePath: String = js.native
  /**
    * Size of content
    */
  var size: Double = js.native
  /**
    * url to retrieve tree or blob
    */
  var url: String = js.native
}

object GitTreeEntryRef {
  @scala.inline
  def apply(
    gitObjectType: GitObjectType,
    mode: String,
    objectId: String,
    relativePath: String,
    size: Double,
    url: String
  ): GitTreeEntryRef = {
    val __obj = js.Dynamic.literal(gitObjectType = gitObjectType.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any], relativePath = relativePath.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitTreeEntryRef]
  }
  @scala.inline
  implicit class GitTreeEntryRefOps[Self <: GitTreeEntryRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGitObjectType(value: GitObjectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitObjectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
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

