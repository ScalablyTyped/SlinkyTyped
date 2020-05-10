package typingsSlinky.typedGithubApi.interfacesPullRequestMod

import typingsSlinky.moment.mod.Moment
import typingsSlinky.typedGithubApi.interfacesIssueMod.IssueComment
import typingsSlinky.typedGithubApi.interfacesUserMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReviewComment extends IssueComment {
  var diffHunk: String = js.native
  var position: Double = js.native
}

object ReviewComment {
  @scala.inline
  def apply(
    body: String,
    createdAt: Moment,
    createdBy: UserSummary,
    diffHunk: String,
    htmlUri: String,
    id: Double,
    position: Double,
    updatedAt: Moment
  ): ReviewComment = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], diffHunk = diffHunk.asInstanceOf[js.Any], htmlUri = htmlUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewComment]
  }
  @scala.inline
  implicit class ReviewCommentOps[Self <: ReviewComment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiffHunk(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffHunk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

