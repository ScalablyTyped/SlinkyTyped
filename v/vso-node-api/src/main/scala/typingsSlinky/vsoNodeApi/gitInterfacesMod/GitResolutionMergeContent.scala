package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitResolutionMergeContent extends GitResolution {
  var mergeType: GitResolutionMergeType = js.native
  var userMergedBlob: GitBlobRef = js.native
  var userMergedContent: js.Array[Double] = js.native
}

object GitResolutionMergeContent {
  @scala.inline
  def apply(mergeType: GitResolutionMergeType, userMergedBlob: GitBlobRef, userMergedContent: js.Array[Double]): GitResolutionMergeContent = {
    val __obj = js.Dynamic.literal(mergeType = mergeType.asInstanceOf[js.Any], userMergedBlob = userMergedBlob.asInstanceOf[js.Any], userMergedContent = userMergedContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitResolutionMergeContent]
  }
  @scala.inline
  implicit class GitResolutionMergeContentOps[Self <: GitResolutionMergeContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMergeType(value: GitResolutionMergeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserMergedBlob(value: GitBlobRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userMergedBlob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserMergedContent(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userMergedContent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

