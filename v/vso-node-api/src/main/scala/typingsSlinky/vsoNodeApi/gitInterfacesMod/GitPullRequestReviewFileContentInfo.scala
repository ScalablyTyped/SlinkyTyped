package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitPullRequestReviewFileContentInfo extends js.Object {
  var _links: js.Any = js.native
  /**
    * The file change path.
    */
  var path: String = js.native
  /**
    * Content hash of on-disk representation of file content. Its calculated by the client by using SHA1 hash function. Ensure that uploaded file has same encoding as in source control.
    */
  var sHA1Hash: String = js.native
}

object GitPullRequestReviewFileContentInfo {
  @scala.inline
  def apply(_links: js.Any, path: String, sHA1Hash: String): GitPullRequestReviewFileContentInfo = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sHA1Hash = sHA1Hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPullRequestReviewFileContentInfo]
  }
  @scala.inline
  implicit class GitPullRequestReviewFileContentInfoOps[Self <: GitPullRequestReviewFileContentInfo] (val x: Self) extends AnyVal {
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
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHA1Hash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sHA1Hash")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

